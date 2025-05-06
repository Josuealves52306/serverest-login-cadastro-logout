# 🧪 Testes Automatizados com Selenium WebDriver + JUnit

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![JUnit](https://img.shields.io/badge/JUnit-5.10-green)
![Selenium](https://img.shields.io/badge/Selenium-4.28.1-brightgreen)
![WebDriverManager](https://img.shields.io/badge/WebDriverManager-6.0.0-orange)
![Status](https://img.shields.io/badge/build-passing-brightgreen)

Este projeto demonstra a automação dos fluxos de **cadastro**, **login** e **logout** da aplicação [Serverest - Frontend](https://front.serverest.dev/login), utilizando:

- ✅ Selenium WebDriver  
- ✅ Java 17  
- ✅ JUnit 5  
- ✅ WebDriverManager  

---

## ✨ Funcionalidades Testadas

- ✅ Cadastro de novo usuário com dados válidos  
- ✅ Login com credenciais válidas  
- ✅ Logout após login  

---

## 🔧 Tecnologias Utilizadas

| Tecnologia         | Versão       |
|--------------------|--------------|
| Java               | 17           |
| Selenium WebDriver | 4.28.1       |
| WebDriverManager   | 6.0.0        |
| JUnit Jupiter      | 5.10.0       |
| Maven              | Build Tool   |

---

## 📂 Estrutura do Projeto

src/
└── test/
└── java/
└── CadastroLogin.java # Classe contendo todos os testes

yaml
Copiar
Editar

---

## ▶️ Como Executar Localmente

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/webdriver-manager.git
cd webdriver-manager

mvn clean test

📌 Observações
O projeto utiliza @TestMethodOrder para garantir a ordem de execução dos testes.

Os testes simulam interações reais de usuário na interface web.

O WebDriverManager cuida automaticamente da configuração do driver, sem precisar baixar manualmente.

Timeout configurado com Duration.ofSeconds(12) para espera implícita.
