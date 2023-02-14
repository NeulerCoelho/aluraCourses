# NVM - Node Version Manager >
    Instalação no MacOS usando Homebrew
    Caso queira instalar usando o Homebrew, basta executar o comando $ brew install nvm.

    Depois precisamos criar um diretório para o NVM, lugar onde ele fará as instalações das várias versões do Node.js. Para isso basta executar o comando $ mkdir ~/.nvm/.

    Por último é só configurar as variáveis de ambiente. Abra o arquivo .bash_profile com o comando vim ~/.bash_profile e cole o seguinte conteúdo

    Copiar
        export NVM_DIR=~/.nvm
        source $(brew --prefix nvm)/nvm.sh
    E então basta executar source ~/.bash_profile 

    Referência: https://www.treinaweb.com.br/blog/instalando-e-gerenciando-varias-versoes-do-node-js-com-nvm#:~:text=Instala%C3%A7%C3%A3o%20no%20MacOS%20usando%20Homebrew,executar%20o%20comando%20%24%20mkdir%20~%2F.

# Criando uma Aplicativo de React>
    https://create-react-app.dev/docs/getting-started

# NPM_commands
  npm start
    Starts the development server.

  npm run build
    Bundles the app into static files for production.

  npm test
    Starts the test runner.

  npm run eject
    Removes this tool and copies build dependencies, configuration files
    and scripts into the app directory. If you do this, you can’t go back!
