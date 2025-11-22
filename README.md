# 📌 Sistema para Análise de Performance de Algoritmos de Ordenação
### *Comparação de Bubble Sort, Insertion Sort e QuickSort utilizando imagens reais do Cerrado Goiano*

## 📝 Descrição do Projeto
Este projeto foi desenvolvido como parte da Atividade Prática Supervisionada (APS) do 2º semestre de 2025, na disciplina de Estrutura de Dados.  
O objetivo principal é criar um sistema em Java capaz de:

- Ler imagens reais do Cerrado Goiano armazenadas em um banco de dados MySQL (campo BLOB);
- Executar diferentes algoritmos de ordenação sobre esses registros;
- Medir e comparar o desempenho de cada algoritmo com base no tempo total de execução;
- Exibir as imagens armazenadas e permitir navegação entre elas via interface gráfica.

O projeto une conceitos de análise de algoritmos, banco de dados, programação orientada a objetos e processamento de dados em larga escala.

---

## 🎯 Objetivo Geral
Desenvolver um sistema computacional capaz de realizar a análise comparativa do desempenho de algoritmos de ordenação aplicados a dados reais — imagens do Cerrado Goiano — armazenados em banco de dados MySQL.  
O sistema mede o tempo de execução de Bubble Sort, Insertion Sort e QuickSort, avaliando sua eficiência prática em um cenário de grande volume de dados.

---

## 🧠 Algoritmos de Ordenação Utilizados

### 🔹 1. Bubble Sort
- Implementação simples  
- Complexidade: **O(n²)**  
- Utilizado como baseline comparativo  

### 🔹 2. Insertion Sort
- Bom desempenho em listas parcialmente ordenadas  
- Complexidade: **O(n²)**  
- Performance superior ao Bubble Sort na prática  

### 🔹 3. QuickSort
- Baseado em divisão e conquista  
- Complexidade média: **O(n log n)**  
- Melhor desempenho entre os métodos utilizados  

---

## 🗂️ Estrutura do Banco de Dados
```sql
CREATE TABLE imagens (
    id VARCHAR(50) PRIMARY KEY,
    nome VARCHAR(255),
    arquivo BLOB
);
````

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Swing / AWT**
- **MySQL**
- **JDBC**
- **Maven**
- **Git / GitHub**

## 🖼️ Funcionalidades

- Carregamento das imagens armazenadas no banco  
- Exibição individual das imagens
- CRUD completo com botões de Inserir, Alterar e Excluir ligados diretamente no banco de dados 
- Execução individual dos algoritmos de ordenação  
- Exibição do tempo total de execução após cada ordenação

## 👨‍💻 Autor

**Luiz Fellipe Silva Medeiros**  
LinkedIn: [www.linkedin.com/in/luiz-fellipe-medeiros](https://www.linkedin.com/in/luiz-fellipe-medeiros)



