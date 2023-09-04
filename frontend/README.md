[*CLIQUE AQUI PRA LER O README.MD EM PORTUGUÊS*](#guia-para-habilitar-o-frontend)

# GUIDE TO ENABLE THE FRONTEND

> **Status: In Development ⚠️**

## Table of Contents

- [Steps for Setting up the Environment](#steps-for-setting-up-the-environment)
- [Versions](#versions)
- [Node.js Installation Guide](#nodejs-installation-guide)
- [Node Modules Installation Guide](#node-modules-installation-guide)
- [Ngrok Installation and Configuration Guide](#ngrok-installation-and-configuration-guide)
- [Future Enhancements](#future-enhancements-⚠️)

# Steps for Setting up the Environment

1. Install [Ngrok🔗](#ngrok-installation-and-configuration-guide) and [NodeJS🔗](#nodejs-installation-guide).
2. Install all the required [node modules🔗](#node-modules-installation-guide).
3. Generate a Ngrok link (Ngrok Configuration).
4. Paste your Ngrok link in the following location: `\frontend\api\axiosconfig.js` (baseURL: 'your.link.here.ngrok-free.app').
5. Run the backend (refer to the backend's README.MD).
6. To run the frontend, navigate to the project path: `C:\your\project\path\MovieCatalog\frontend` and use the command:
   ```bash
   PS C:\MovieCatalog\frontend> npm start
   ```

## Versions

| Tools       | Version |
| ----------- | ------- |
| Node.js     | 18.17.* |
| Ngrok       | 3.3.*   |
| HTML        | 5       |
| CSS         | 3       |

## NodeJs
### Node.js Installation Guide

Node.js is a JavaScript runtime that allows you to execute JavaScript code on the server side. It's widely used for building web applications and various other types of server-side applications. Follow these steps to install Node.js on your system:

1. **Download Node.js:**
   
   Visit the official Node.js website at [nodejs.org](https://nodejs.org/). On the homepage, you'll find two versions available for download: "LTS" (Long-Term Support) and "Current". It's recommended to choose the LTS version for stability, unless you specifically need features from the current version.

3. **Run the Installer:**

   After the download is complete, run the installer executable that you downloaded. The installation process might vary slightly based on your operating system, but generally, you can follow the on-screen instructions to proceed.


6. **Install Node.js and npm:**

   During the installation, Node.js and npm (Node Package Manager) will be installed. npm is a package manager that allows you to easily install and manage third-party packages and libraries for your Node.js applications.

7. **Verify Installation:**

   Once the installation is complete, open a terminal or command prompt and run the following commands to verify that Node.js and npm were installed successfully:

   ```bash
   node -v
   npm -v
   ```

   This will display the installed versions of Node.js and npm.


## Node Modules Installation Guide

In your project terminal, execute the following commands to install the required packages:

Make sure you're running the terminal in the directory: *MovieCatalog\frontend*
```bash
npm install axios
npm install bootstrap
npm i react-bootstrap
npm i @fortawesome/react-fontawesome
npm i @fortawesome/free-solid-svg-icons
npm i react-player
npm i react-router-dom
npm install @mui/material @emotion/react @emotion/styled
npm install react-material-ui-carousel
```
## Ngrok
### Ngrok Installation and Configuration Guide

1. **Downloading ngrok:**
Download ngrok from this [link🔗](https://ngrok.com/download).

2. **Running ngrok:**
Unzip the downloaded file and execute the "ngrok.exe" from ngrok.

3. **Logging into your ngrok account:**
After downloading, log in to your ngrok account using this [link🔗](https://dashboard.ngrok.com/login) with your preferred account.

4. **Obtaining and inserting the authentication token:**
After logging in, an authentication token will be provided. Copy the token and paste it into the ngrok terminal.
   
   The field with the auth will look something like:
    ```bash
    $ ngrok config add-authtoken 9TyfqOiMUKpGhipd8TkytrcwKlI-6sUxmt37mup2hdZp6hb1a
    ```

5. **Pasting the authtoken in the terminal:**
After copying the authtoken, paste it into the ngrok terminal.

6. **Starting the local server with ngrok:**
Execute the following command in the ngrok terminal:
   ```bash
   ngrok http 8080
   ```

7. **Copying the generated link:**
Copy the generated link and paste it into the axiosconfig file.
If you want to create a new link, you have 2 options:
+ Disable the generated link by completely stopping the application, either by pressing **Ctrl + C** or manually (go to Task Manager and end any ngrok-related applications).
+ Subscribe to a ngrok plan.

### Your final ngrok setup should look like the following image

![NgrokPage](https://github.com/SuperDeMou/MovieCatalog/assets/136927780/accd2121-e168-429e-b8a5-ecac314d8fca)

## Future Enhancements ⚠️

### Planned Future Enhancements

1. Enable the site to function without needing to be downloaded. The backend will provide the Ngrok link so that the site can be hosted on GitHub Pages, requiring only the execution of the backend on the local machine.

2. Add a generic page including an "About Us" section and other functionalities.

3. Implement Google OAuth login.

4. Develop custom login with OAuth2.

5. Create customized pages for all movies.

6. Add a comments section to movie pages using "disqus.com".

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

# GUIA PARA HABILITAR O FRONTEND

> **Status: Em Desenvolvimento ⚠️**

## Índice

- [Passos para Configuração do Ambiente](#passos-para-configuração-do-ambiente)
- [Versões](#versões)
- [Guia de instalação NodeJs](#guia-de-instalação-do-nodejs)
- [Guia de Instalação dos Node Modules](#guia-de-instalação-dos-node-modules)
- [Guia de Instalação e configuração do Ngrok](#guia-de-instalação-e-configuração-do-ngrok)
- [Recursos Futuros](#recursos-futuros-⚠️)

# Passos para Configuração do Ambiente

1. Instale o [Ngrok🔗](#guia-de-instalação-e-configuração-do-ngrok) e o [NodeJS🔗](#guia-de-instalação-do-nodejs).
2. Instale todos os [node modules🔗](#guia-de-instalação-dos-node-modules) necessários.
3. Gere um link do Ngrok (Configuração do Ngrok).
4. Cole o seu link do Ngrok no seguinte local: `\frontend\api\axiosconfig.js` (baseURL: 'seu.link.aqui.ngrok-free.app').
5. Execute o backend (consulte o README.MD do backend).
6. Para executar o frontend, navegue até o caminho do projeto: `C:\caminho\do\seu\projeto\MovieCatalog\frontend` e use o comando:
   ```bash
   PS C:\MovieCatalog\frontend> npm start
   ```

## Versões

| Ferramentas | Versão  |
| ----------- | ------- |
| Node.js     | 18.17.* |
| Ngrok       | 3.3.*   |
| HTML        | 5       |
| CSS         | 3       |

## NodeJs
### Guia de Instalação do Node.js

O Node.js é um ambiente de execução JavaScript que permite executar código JavaScript no lado do servidor. Ele é amplamente utilizado para construir aplicações web e vários outros tipos de aplicações no lado do servidor. Siga essas etapas para instalar o Node.js em seu sistema:

1. **Baixar o Node.js:**
   
   Acesse o site oficial do Node.js em [nodejs.org🔗](https://nodejs.org/). Na página inicial, você encontrará duas versões disponíveis para download: "LTS" (Suporte de Longo Prazo) e "Current" (Versão Atual). É recomendável escolher a versão LTS para obter estabilidade, a menos que você precise especificamente de recursos da versão atual.

3. **Executar o Instalador:**

   Após o download ser concluído, execute o arquivo de instalação que você baixou. O processo de instalação pode variar ligeiramente com base em seu sistema operacional, mas geralmente você pode seguir as instruções na tela para prosseguir.


6. **Instalar o Node.js e o npm:**

   Durante a instalação, o Node.js e o npm (Gerenciador de Pacotes do Node) serão instalados. O npm é um gerenciador de pacotes que permite instalar e gerenciar facilmente pacotes e bibliotecas de terceiros para suas aplicações Node.js.

7. **Verificar a Instalação:**

   Após a instalação ser concluída, abra um terminal ou prompt de comando e execute os seguintes comandos para verificar se o Node.js e o npm foram instalados com êxito:

   ```bash
   node -v
   npm -v
   ```

   Isso exibirá as versões instaladas do Node.js e do npm.

### Guia de Instalação dos Node Modules

No terminal do seu projeto, execute os seguintes comandos para instalar os pacotes necessários:

Certifique-se que você está executando o terminal no diretório: *MovieCatalog\frontend*
```bash
npm install axios
npm install bootstrap
npm i react-bootstrap
npm i @fortawesome/react-fontawesome
npm i @fortawesome/free-solid-svg-icons
npm i react-player
npm i react-router-dom
npm install @mui/material @emotion/react @emotion/styled
npm install react-material-ui-carousel
```
## Ngrok
### Guia de Instalação e configuração do Ngrok

1. **Baixando o ngrok:**
Baixe o ngrok a partir deste [link🔗](https://ngrok.com/download).

2. **Executando o ngrok:**
Descompacte o arquivo baixado e execute o "ngrok.exe" do ngrok.

3. **Login na conta do ngrok:**
Após o download, faça login na sua conta do ngrok usando este [link🔗](https://dashboard.ngrok.com/login) com a sua conta preferida.

4. **Obtendo e inserindo o token de autenticação:**
Após fazer login, um token de autenticação será fornecido. Copie o token e cole-o no terminal do ngrok.
   
   O campo com o auth ficará algo como:
    ```bash
    $ ngrok config add-authtoken 9TyfqOiMUKpGhipd8TkytrcwKlI-6sUxmt37mup2hdZp6hb1a
    ```

5. **Colando o authtoken no terminal:**
Após copiar o authtoken cole ele no terminal do ngrok.

6. **Iniciando o servidor local com ngrok:**
Execute o seguinte comando no terminal ngrok:
   ```bash
   ngrok http 8080
   ```

7. **Copiando o link gerado:**
Copie o link gerado e cole-o no arquivo axiosconfig.

Caso você queira criar um novo link, você tem 2 opções:
+ Desabilite o link gerado finalizando a aplicação totalmente,seja dando **Ctrl + C** ou manualmente (vá no Gerenciador de Tarefas e finalize qualquer aplicação relacionada ao ngrok).
+ Assine algum plano da ngrok.

### Ao final seu ngrok ficará como na imagem a seguir

![NgrokPage](https://github.com/SuperDeMou/MovieCatalog/assets/136927780/accd2121-e168-429e-b8a5-ecac314d8fca)

## Recursos Futuros ⚠️

### Recursos Futuros Planejados

1. Habilitar o site para funcionar sem precisar ser baixado. O backend enviará o link do Ngrok para que o site possa permanecer no GitHub Pages, exigindo apenas a execução do backend na máquina local.

2. Adicionar uma página genérica incluindo uma seção "Sobre Nós" e outras funcionalidades.

3. Implementar o login do Google OAuth.

4. Desenvolver login personalizado com OAuth2.

5. Criar páginas personalizadas para todos os filmes.

6. Adicionar uma seção de comentários nas páginas dos filmes usando "disqus.com".
