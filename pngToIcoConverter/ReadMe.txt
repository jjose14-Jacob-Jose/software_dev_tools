Steps converting the PNG files to ICO files.
1. Paste the PNG files inside 'input' folder.
2. Open terminal in the directory 'pngToIcoConverter' and build the Docker image.
    docker build -t ico_converter_image:latest .
3. Run the docker container:
    docker run -d --name tools_container ico_converter_image:latest
4. Copy files from the Docker container to the host.
    docker cp tools_container:/output .\imageMagic\output

ICO files will be available inside the folder 'output'


