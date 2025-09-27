# Banco Digital

Projeto em **Java** desenvolvido para praticar os conceitos de **POO (Programação Orientada a Objetos)**, como:

- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

## 📌 Finalidade
Simular o funcionamento básico de um banco digital, que oferece aos clientes dois tipos de conta:

- **Conta Corrente** (com limite de cheque especial)  
- **Conta Poupança** (com possibilidade de aplicar rendimento)

O sistema permite:

- Abertura de contas  
- Depósito de valores  
- Saque  
- Transferência entre contas do mesmo banco  

## 📂 Estrutura do Projeto
- `banco.conta` → Interface `IConta`  
- `banco.model` → Classes de domínio (`Conta`, `ContaCorrente`, `ContaPoupanca`, `Cliente`)  
- `banco.service` → Classe `Banco` (regras de negócio)  
- `banco.app` → Classe `Main` (exemplo de uso)  

## 🚀 Como executar
1. Importar o projeto no **Eclipse** (ou outra IDE Java).  
2. Rodar a classe `banco.app.Main`.  
3. Acompanhar no console as operações de depósito, saque, transferência e rendimento.  

---
