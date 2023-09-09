[*CLIQUE AQUI PRA LER O README.MD EM PORTUGUÊS*](#guia-para-executar-o-backend-da-aplicação)

# GUIDE TO RUNNING THE APPLICATION BACKEND
## Table of Contents

- [Explaining the variables in the JSON file](#explaining-what-each-variable-does)
- [Versions](#versions)
- [Downloads](#downloads)
  - [MongoDB](#mongodb)
  - [Java](#java)
  - [Postman](#postman)
- [Java](#java)
  - [Java 17 Installation Guide](#java-17-installation-guide)
    - [Windows](#windows)
    - [macOS](#macos)
    - [Linux](#linux)
- [MongoDB](#mongodb)
  - [MongoDB Atlas](#mongodb-atlas)
    - [MongoDB Atlas Configuration](#mongodb-atlas-configuration)
    - [Authentication and Security](#authentication-and-security)
- [Explaining what each variable in the JSON document does](#explaining-what-each-variable-does)

> **Status: In Development ⚠️**

## Introduction

In this project, I used Swagger for documentation, Spring Boot for URL management, and Postman for testing requests, sending new JSONs, and performing CRUD operations. The project was developed using Java 17 (LTS), along with the mentioned tools, as well as MongoDB, MongoDB Compass, and MongoDB Atlas.

### Limitations of MongoDB Atlas 
Although the project is fully functional, using the free version of MongoDB Atlas restricts direct database access to only the administrator. I recommend that if you want to run it locally, create a free cluster on MongoDB Atlas. If you need a JSON reference for uploading, [click here](movies.json).

## Versions 

| Tools          | Version |
|----------------|---------|
| Java           | 17.*    |
| Spring Boot    | 3.1.*   |
| Swagger        | 3.*     |
| MongoDB        | 6.*     | 
| MongoDB Atlas  | ******* |

## Downloads
### Download links for everything you'll need to run the application
* [MongoDB](https://www.mongodb.com/try/download/community-kubernetes-operator)
* [Java](https://www.azul.com/downloads/?package=jdk#zulu)
* [Postman](https://www.postman.com/downloads/)

## Java
### Java 17 Installation Guide
Here are the commands to install the latest stable version of Java on Linux, macOS, and Windows if needed.

### Windows:

1. **Download Java 17:**
   - Visit the official [Azul](https://www.azul.com/downloads/?package=jdk#zulu) website or another trusted provider that offers the Java Development Kit (JDK) 17 for Windows.
   - Download the appropriate installer for your system (usually a .exe file).

2. **Run the installer:**
   - Double-click the downloaded installation file.

3. **Follow the installation wizard:**
   - The installation wizard will guide you through the process.
   - Accept the license terms, choose the default installation options, and complete the installation.

4. **Verify the installation:**
   - Open Command Prompt (CMD) or PowerShell.
   - Type `java -version` and press Enter. You should see the installed Java version, which should be Java 17.

### macOS:

1. **Check the current Java version (optional):**
   - Open Terminal.
   - Type `java -version` and press Enter to check the current Java version.

2. **Install Java 17 with Homebrew (recommended):**
   - If you don't have Homebrew installed, follow the installation instructions on the official [Homebrew](https://brew.sh/) website.
   - After installing Homebrew, run the following command in Terminal:
     ```
     brew install openjdk@17
     ```

3. **Verify the installation:**
   - Type `java -version` again in Terminal to ensure that Java 17 has been installed correctly.

### Linux:

1. **Open Terminal:**
   - Press `Ctrl + Alt + T` to open the Terminal on Ubuntu/Debian.

2. **Update the package index:**
   ```
   sudo apt update
   ```

3. **Install OpenJDK 17:**
   ```
   sudo apt install openjdk-17-jdk
   ```

4. **Verify the installation:**
   - To check if Java 17 has been installed correctly, type the following command in the Terminal:
     ```
     java -version
     ```

This should display the Java version as Java 17.

## MongoDB 
### MongoDB Atlas 

#### MongoDB Atlas Configuration

To install MongoDB Atlas, follow the official instructions by clicking [here](https://www.mongodb.com/basics/mongodb-atlas-tutorial).

#### Authentication and Security

I used certificate-based authentication for its programmatic nature. Additionally, all connection logic is handled in the MongoDB package. The password to open my encrypted certificate 'keystore.jks' and the cluster link are imported from the 'configuration.properties' file, which, in turn, imports from the '.env' file. The .env file is not pushed to the GitHub repository and remains only on my machine, providing an extra layer of security. Furthermore, the data contained in the '.env' file is locally encrypted and decrypted at runtime, adding another layer of security.

## Explaining what each variable in the JSON document does

* **_id**:

    Responsible for identifying which movie the JSON should be inserted into.

* **imdbId**:

    The exposed ID for the user to access the movie represented by this imdbId.
 
* **title**:

    The movie's title.
 
* **releaseDate**:

   Release date.
 
* **trailerLink**: 

    Link to the trailer hosted on YouTube.
 
* **genres**: 

    The genres to which this movie belongs, such as Action, Romance, etc.
  
* **poster**:

    The movie's poster.
 
* **backdrops**: 

    Images of different sizes for different screen types.
 
* **reviewIds**: 

    The IDs of each review.
 
* **reviews**: 

    User reviews.

<br>
<br>
<br>
<br>
<br>
<br>
<br>

---

&nbsp;


<br>
<br>
<br>
<br>
<br>
<br>
<br>

# GUIA PARA EXECUTAR O BACKEND DA APLICAÇÃO
## Índice

- [Explicação das variáveis no arquivo JSON](#explicando-o-que-cada-variavel-faz)
- [Versões](#versoes)
- [Downloads](#downloads)
  - [MongoDB](#mongodb)
  - [Java](#java)
  - [Postman](#postman)
- [Java](#java)
  - [Guia de Instalação do Java 17](#guia-de-instalacao-do-java-17)
    - [Windows](#windows)
    - [macOS](#macos)
    - [Linux](#linux)
- [MongoDB](#mongodb)
  - [MongoDB Atlas](#mongodb-atlas)
    - [Configuração do MongoDB Atlas](#configuracao-do-mongodb-atlas)
    - [Autenticação e Segurança](#autenticacao-e-seguranca)
- [Explicando o que cada variável no documento JSON faz](#explicando-o-que-cada-variavel-faz)

> **Status: Em Desenvolvimento ⚠️**

## Introdução

Neste projeto, utilizei o Swagger para documentação, o Spring Boot para o gerenciamento de URLs e o Postman para testar solicitações, enviar novos JSONs e realizar operações CRUD. O projeto foi desenvolvido utilizando Java 17 (LTS), juntamente com as ferramentas mencionadas, bem como o MongoDB, o MongoDB Compass e o MongoDB Atlas.

### Limitações do MongoDB Atlas
Embora o projeto seja totalmente funcional, o uso da versão gratuita do MongoDB Atlas restringe o acesso direto ao banco de dados apenas ao administrador. Recomendo que, se você deseja executá-lo localmente, crie um cluster gratuito no MongoDB Atlas. Se você precisar de uma referência JSON para fazer o upload, [clique aqui](movies.json).

## Versões

| Ferramentas    | Versão  |
|----------------|---------|
| Java           | 17.*    |
| Spring Boot    | 3.1.*   |
| Swagger        | 3.*     |
| MongoDB        | 6.*     | 
| MongoDB Atlas  | ******* |

## Downloads
### Links de download para tudo o que você precisará para executar a aplicação
* [MongoDB](https://www.mongodb.com/try/download/community-kubernetes-operator)
* [Java](https://www.azul.com/downloads/?package=jdk#zulu)
* [Postman](https://www.postman.com/downloads/)

## Java
### Guia de Instalação do Java 17
Aqui estão os comandos para instalar a versão estável mais recente do Java no Linux, macOS e Windows, se necessário.

### Windows:

1. **Baixe o Java 17:**
   - Visite o site oficial da [Azul](https://www.azul.com/downloads/?package=jdk#zulu) ou outro provedor confiável que ofereça o Kit de Desenvolvimento Java (JDK) 17 para Windows.
   - Baixe o instalador apropriado para o seu sistema (geralmente um arquivo .exe).

2. **Execute o instalador:**
   - Dê um duplo clique no arquivo de instalação baixado.

3. **Siga o assistente de instalação:**
   - O assistente de instalação o guiará pelo processo.
   - Aceite os termos da licença, escolha as opções de instalação padrão e conclua a instalação.

4. **Verifique a instalação:**
   - Abra o Prompt de Comando (CMD) ou o PowerShell.
   - Digite `java -version` e pressione Enter. Você deverá ver a versão do Java instalada, que deve ser a Java 17.

### macOS:

1. **Verifique a versão atual do Java (opcional):**
   - Abra o Terminal.
   - Digite `java -version` e pressione Enter para verificar a versão atual do Java.

2. **Instale o Java 17 com o Homebrew (recomendado):**
   - Se você não tiver o Homebrew instalado, siga as instruções de instalação no site oficial do [Homebrew](https://brew.sh/).
   - Após instalar o Homebrew, execute o seguinte comando no Terminal:
     ```
     brew install openjdk@17
     ```

3. **Verifique a instalação:**
   - Digite `java -version` novamente no Terminal para garantir que o Java 17 tenha sido instalado corretamente.

### Linux:

1. **Abra o Terminal:**
   - Pressione `Ctrl + Alt + T` para abrir o Terminal no Ubuntu/Debian.

2. **Atualize o índice de pacotes:**
   ```
   sudo apt update
   ```

3. **Instale o OpenJDK 17:**
   ```
   sudo apt install openjdk-17-jdk
   ```

4. **Verifique a instalação:**
   - Para verificar se o Java 17 foi instalado corretamente, digite o seguinte comando no Terminal:
     ```
     java -version
     ```

Isso deve exibir a versão do Java como Java 17.

## MongoDB 
### MongoDB Atlas 

#### Configuração do MongoDB Atlas

Para instalar o MongoDB Atlas, siga as instruções oficiais clicando [aqui](https://www.mongodb.com/basics/mongodb-atlas-tutorial).

#### Autenticação e Segurança

Utilizei a autenticação baseada em certificados devido à sua natureza programática. Além disso, toda a lógica de conexão é tratada no pacote MongoDB. A senha para abrir meu certificado criptografado 'keystore.jks' e o link do cluster são importados do arquivo 'configuration.properties', que, por sua vez, importa do arquivo '.env'. O arquivo .env não é enviado para o repositório do GitHub e permanece apenas em minha máquina, fornecendo uma camada extra de segurança. Além disso, os dados contidos no arquivo '.env' são criptografados localmente e descriptografados durante a execução, adicionando outra camada de segurança.

## Explicando o que cada variável no documento JSON faz

* **_id**:

    Responsável por identificar em qual filme o JSON deve ser inserido.

* **imdbId**:

    O ID exposto para o usuário acessar o filme representado por este imdbId.

* **title**:

    Título do filme.

* **releaseDate**:

   Data de lançamento.
 
* **trailerLink**: 

    Link para o trailer hospedado no YouTube.

* **genres**: 

    Os gêneros aos quais este filme pertence, como Ação, Romance, etc.
  
* **poster**:

    Pôster

 do filme.
 
* **backdrops**: 

    Imagens de tamanhos diferentes para diferentes tipos de tela.
 
* **reviewIds**: 

    Os IDs de cada análise.
 
* **reviews**: 

    Avaliações dos usuários.