[![Github Actions Status for richardunisul/calculadora](https://github.com/richardunisul/calculadora/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/richardunisul/calculadora/actions) 
![image](https://user-images.githubusercontent.com/103585524/169100982-0b902c67-04f4-4bf5-9a5d-efb955caf5db.png)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=richardunisul_calculadora&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=richardunisul_calculadora)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=richardunisul_calculadora&metric=coverage)](https://sonarcloud.io/component_measures?id=richardunisul_calculadora&metric=coverage)

# Calculara com CI.
Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação 
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento

<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 4.<br>
- A cobertura do código é realizada através do JaCoCo.<br>
![image](https://user-images.githubusercontent.com/103585524/169097221-d3cfa6a4-6263-4e31-8489-5e4720c0d59f.png)
