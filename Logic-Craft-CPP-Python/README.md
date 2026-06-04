# 🧠 Logic-Craft: CPP & Python

![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=flat-square&logo=c%2B%2B&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)
![Level](https://img.shields.io/badge/Level-Beginner%20→%20Growing-orange?style=flat-square)
![Year](https://img.shields.io/badge/Year-1st%20Year-purple?style=flat-square)

> A dual-language repository where the same logic problems are solved in both **C++** and **Python** — built to strengthen programming fundamentals and explore how different languages approach the same challenges.

---

## 📌 About This Repository

This repo is part of my first-year CS journey. The idea is simple: take a programming concept, implement it in C++, then implement the same idea in Python — and see how each language handles it differently.

Each project lives in its own folder with two versions:
- `CPP_Version/` — the original C++ implementation
- `Python_Version/` — the Python reimagining with improvements

---

## 📂 Repository Structure

```
📁 Logic-Craft-CPP-Python/
│
└── 📁 GenericConditionCounter/
    ├── 📁 CPP_Version/
    │   └── 📄 GenericConditionCounter.cpp
    └── 📁 Python_Version/
        └── 📄 GenericConditionCounter.py
```

---

## 🚀 Projects

### 🔢 Generic Condition Counter

> Count elements in a collection based on any condition — using function pointers in C++ and first-class functions in Python.

| | C++ Version | Python Version |
|---|---|---|
| **Input** | Random array (1–100 elements) | User fills list manually until "stop" |
| **Logic** | `bool (*condition)(int)` function pointer | Lambda / function passed directly |
| **Output** | Count of even numbers | Even & odd lists printed separately |
| **Extra** | `rand()` + `srand()` for randomness | Full input validation with error handling |

**C++ — How to run:**
```bash
g++ CPP_Version/GenericConditionCounter.cpp -o counter
./counter
```

**Python — How to run:**
```bash
python Python_Version/GenericConditionCounter.py
```

---

## 💡 Key Concepts Covered

| Concept | C++ | Python |
|---|---|---|
| Arrays / Collections | Fixed-size arrays | Dynamic lists |
| Higher-order functions | Function pointers | First-class functions |
| Input validation | `do-while` loop | `try/except` + loop |
| Random generation | `rand()` / `srand()` | *(user input instead)* |
| Error handling | Basic range check | Catches non-integer input |

---

## 🧠 What I'm Learning

- How the **same logic** can be expressed differently across languages
- The power of **higher-order functions** (function pointers in C++, callables in Python)
- Writing **clean, reusable functions** instead of monolithic code
- **Input validation** and **error handling** in both languages
- Thinking in **data structures**: arrays vs. lists

---

## 🌱 What's Coming Next

- [ ] Add more problems (sorting, searching, string manipulation)
- [ ] Add `README.md` inside each project folder with deeper explanation
- [ ] Use `std::vector` in C++ versions
- [ ] Explore `std::mt19937` for better randomness in C++
- [ ] Write unit tests for the Python versions

---

## 👨‍💻 Author

**Mohammad Al-Sabbagh**
🎓 First-Year CS Student — Al-Balqa Applied University, Ajloun College

---

*Every problem solved in two languages is twice the understanding. Still learning, always building. 💪*
