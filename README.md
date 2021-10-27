<div id="top"></div>

[![LinkedIn][linkedin-shield]][linkedin-url]


<!-- PROJECT LOGO -->
<br />

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
</ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Project created as a submission for task from EPAM advanced Java global mentorship

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

* [Java](https://java.com/en/)
* [Maven](https://mvnrepository.com)
* [Gradle](https://docs.gradle.org)
* [Junit](https://junit.org/junit5/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To build maven project follow these simple steps.

### Prerequisites

First you should have java and maven installed

### Build

1. Use this script in the root folder of project
   ```sh
   mvn clean
   ```
2. Use this script in the root folder of project
   ```sh
   mvn package
   ```
3. Go to target folder of admin project
   ```sh
   cd admin/target
   ```
4. run jar file
   ```sh
   java -jar {jar_file_naming}
   ```
   In our case it is admin-1.0-SNAPSHOT.jar
5. Go to build folder of web project
   ```sh
   cd web/target
   ```
   In our case it is web-1.0-SNAPSHOT.war


<p align="right">(<a href="#top">back to top</a>)</p>

To build gradle project follow these simple steps.

### Prerequisites

First you should have java and gradle installed

### Build

1. Use this script in shell in the root folder of project
   ```sh
   gradle clean
   ```
2. Use this script in the root folder of project for creating jar files
   ```sh
   gradle jar
   ```
3. Use this script in the root folder of project for creating war file
   ```sh
   gradle war
   ```
4. Go to build folder of admin project
   ```sh
   cd admin/build/libs
   ```
5. run jar file
   ```sh
   java -jar {jar_file_naming}
   ```
   In our case it is admin-1.0-SNAPSHOT.jar
6. Go to build folder of web project
   ```sh
   cd web/build/libs
   ```
   In our case it is web-1.0-SNAPSHOT.war


<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Bobur Zokirov - [@zokirovbobur](https://t.me/zokirovbobur) - bobur_zokirov@epam.com

Project Link: [https://github.com/zokirovbobur/epm_mentorship_multimodule](https://github.com/zokirovbobur/epm_mentorship_multimodule)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/zokirovbobur
[product-screenshot]: images/screenshot.png