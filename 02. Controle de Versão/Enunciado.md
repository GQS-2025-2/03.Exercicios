# 🚀 Exercício — Sistema com Herança em Java (Trio)

**Tema livre**, implementado por **trio**. O foco é projetar uma hierarquia simples com herança e colaborar usando **GitHub Flow**.

- **Pontuação:** 2,0 pts  
- **Entrega:** 📅 **21/09**, até 🕔 **23:59**  
- **Como entregar no Ulife:** enviar o **link do repositório** + **nome e RA** dos integrantes  
  - Obs.: repositório **público** ou, se privado, adicionar **@rafapcmor**  
  - Apenas **1 integrante** faz a postagem no Ulife

---

## 🎯 Objetivos de Aprendizagem
- Modelar e implementar **herança** em Java.
- Praticar **sobrescrita** (`@Override`) e **polimorfismo**.
- Colaborar com **GitHub Flow** (branches, PRs e revisão).

---

## ✅ Requisitos Mínimos
1. **Hierarquia OO**
   - **1 superclasse** com atributos e métodos comuns.
   - **2 subclasses** com:
     - atributos próprios;
     - **pelo menos 1 método sobrescrito** (`@Override`).
   - **Polimorfismo**: no `Main`, usar a superclasse para referenciar objetos das subclasses (ex.: `List<Superclasse>`).

2. **Qualidade do Código**
   - Java 17+ (ideal 21), pacote em minúsculas (ex.: `br.edu.seuprojeto`).
   - Encapsulamento (getters/setters), construtores, `toString()`.
   - Mensagens de commit claras.

3. **Execução**
   - Arquivo **`Main.java`** que demonstre:
     - criação de objetos;
     - chamada de métodos comuns e sobrescritos;
     - impressão de resultados no console.

---

## 🏗️ Sugerido (não obrigatório)
- **Estrutura de pastas**
  ```
  projeto-heranca/
  ├─ README.md
  └─ src/main/java/br/edu/seuprojeto/
     ├─ Main.java
     ├─ modelo/
     │  ├─ Superclasse.java
     │  └─ SubclasseA.java
     │  └─ SubclasseB.java
     └─ util/ (se necessário)
  ```
- **Temas exemplo**
  - **Animais**: `Animal` ← `Cachorro`, `Gato`
  - **Personagens**: `Personagem` ← `Guerreiro`, `Mago`
  - **Eletrodomésticos**: `Eletrodomestico` ← `Geladeira`, `Microondas`
  - **Instrumentos**: `Instrumento` ← `Violão`, `Piano`

---

## 🔧 Fluxo de Trabalho (GitHub Flow)
1. Um integrante **cria o repositório** e adiciona os demais como colaboradores.  
2. Criar branch de integração: **`dev`** (além da `main`).  
3. Cada integrante cria **sua branch de feature**:
   - `feature/superclasse`  
   - `feature/subclasse-a`  
   - `feature/subclasse-b`
4. Desenvolver, **commit/push** na sua branch e abrir **PR → `dev`**.
5. Fazer **code review** (pelo menos 1 colega), ajustar e **mergear** na `dev`.
6. Quando tudo estiver validado, abrir **PR final `dev` → `main`**.
7. Tag opcional de release: `git tag -a v1.0 -m "Entrega"` e `git push --tags`.

> Regra de ouro: **não commitar direto na `main`**.

---

## 🧪 O que deve aparecer no `Main.java`
- Instanciar as duas subclasses.
- Armazená-las em uma coleção do tipo da **superclasse**.
- Invocar métodos com comportamento **polimórfico** (sobrescritos).
- Exibir saídas claras no console.

---

## 📦 Entregáveis (no repositório)
- Código fonte em `src/main/java/...`
- **README.md** com:
  - Nomes e **RA** do trio;
  - Breve descrição do tema e da hierarquia (1–2 parágrafos).

---

## 🧮 Critérios de Avaliação (2,0 pts)
- **Modelagem OO (herança, override, polimorfismo)** — **0,4 pt**  
- **Funcionamento (Main, execução e saídas corretas)** — **0,3 pt**  
- **Qualidade de código (organização, encapsulamento, nomes, pacotes)** — **0,3 pt**  
- **Colaboração Git (branches, PRs, review, histórico limpo)** — **1,0 pt**

> Penalizações: falta de `@Override`, ausência de `Main`, PRs sem review, commits na `main`.

