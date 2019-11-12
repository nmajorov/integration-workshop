#
# Builds a PDF Based on the input file
#

# Fail on first error
set -e

echo "Bulding PDF..."

#inputFile=engagement_journal.adoc
inputFile=README.asciidoc
revNumber=2.0
#revDate=00-00-0000
revDate=$(date +%d-%m-%Y)


# Get Revision Number
revNumber=$(sed -n -e '/revnumber/ s/.*\: *//p' $inputFile)
echo "Revision Number: $revNumber"

# Get Revision Date
#revDate=$(sed -n -e '/revdate/ s/.*\: *//p' $inputFile)
#echo "Revision Date: $revDate"

# Get Folder & File
file=${inputFile##*/}

# Strip .client and .adoc
file="${file/.client/}"
file="${file/.adoc/}"
file="${file/-/_}"

# Strip - from revDate
revDate="${revDate//-/}"

# Create PDF
finalName="$file-v$revNumber-$revDate.pdf"

asciidoctor-pdf \
    -o $finalName \
    -r asciidoctor-diagram \
    $inputFile

echo "PDF Created: $finalName"
