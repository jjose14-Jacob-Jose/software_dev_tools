# Software Tools
This repository has software tools for different purposes. 

## Tools Available:
1. [PNG to ICO Converter](#png-to-ico-converter)


### PNG to ICO Converter
- Use this tool to convert PNG files to ICO files for your website. 

##### Steps for converting the PNG files to ICO files:
1. Paste the PNG files inside **_input_ folder**.
2. Open terminal in the directory 'pngToIcoConverter' and run the following commands:


    docker build -t ico_converter_image:latest Dockerfile
    docker run -d --name tools_container ico_converter_image:latest
    docker run -d --name tools_container ico_converter_image:latest
    docker cp tools_container:/output .\imageMagic\output


3. ICO files will be available inside **_output_ folder**