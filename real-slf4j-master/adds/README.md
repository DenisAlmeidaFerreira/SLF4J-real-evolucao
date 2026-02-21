## SLF4J – Evolução e Refatoração

Este repositório contém uma versão refatorada do projeto SLF4J, desenvolvida como parte de um trabalho acadêmico da disciplina de Engenharia de Software.

O objetivo foi aplicar técnicas de refatoração baseadas no catálogo de Martin Fowler, guiadas por diagnósticos de ferramentas de análise estática, mantendo a preservação do comportamento externo da biblioteca.

## 🎯 Objetivos do Trabalho
 - Identificar code smells e defeitos potenciais
 - Aplicar diferentes técnicas de refatoração
 - Comparar métricas antes e depois das modificações
 - Avaliar impacto estrutural por meio de análise de LOC
 - Preservar comportamento via execução da suíte de testes

## 🛠 Ferramentas Utilizadas
 - Java 11
 - Maven
 - PMD
 - SpotBugs
 - Visual Studio Code

Os relatórios completos estão disponíveis na pasta: /reports 

## 📂 Estrutura do Repositório

**[diff.txt](./diff.txt)** → comparação entre versão original e refatorada

**[reports/](./reports/)** → relatórios PMD e SpotBugs


## Projeto base:
https://github.com/qos-ch/slf4j