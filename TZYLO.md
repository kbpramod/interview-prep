
# Tzylo Documentation

> Auto-generated engineering memory.
> Maintained by Tzylo Synapse.

---

## 🔌 API Changes
<!-- TZYLO:API_START -->

### Pizza System

- BaseSize enum has SMALL, MEDIUM, and LARGE sizes with corresponding prices.
- Topping enum includes CHEESE, ONION, and CAPSICUM with respective prices.
- Pizza class constructor takes a Builder instance to initialize size and toppings.
- getPrice method calculates total price from base size and topping quantities.
- Main class demonstrates pizza creation and price retrieval through Builder pattern.

<!-- TZYLO:API_END -->

---

## 🗄️ Database Changes
<!-- TZYLO:DB_START -->
<!-- TZYLO:DB_END -->

---

## 🧱 Architecture
<!-- TZYLO:ARCH_START -->

### Pizza Maker System

- Introduced enum BaseSize to define pizza sizes with associated prices.
- Added Pizza class implementing Builder pattern for pizza creation.
- Pizza pricing includes base size and topping price calculations.
- Introduced enum Topping to define available toppings with prices.

<!-- TZYLO:ARCH_END -->

---

## ⚠️ Breaking Changes
<!-- TZYLO:BREAK_START -->
<!-- TZYLO:BREAK_END -->

---

## 📦 Dependencies
<!-- TZYLO:DEP_START -->
<!-- TZYLO:DEP_END -->

---

## ⚙️ Configuration
<!-- TZYLO:CONF_START -->
<!-- TZYLO:CONF_END -->

---

## 🐛 Bug Fixes
<!-- TZYLO:FIX_START -->
<!-- TZYLO:FIX_END -->

---

## 📝 General Notes
<!-- TZYLO:GEN_START -->

### Initialization and Usage

- Pizza objects are constructed using a Builder pattern to ensure immutability.

<!-- TZYLO:GEN_END -->
