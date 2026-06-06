# Taxi Booking Application 🚖

A simple **Taxi Booking System** developed in **Java** using the **MVC (Model-View-Controller)** architecture.

This project simulates:

* Taxi booking
* Taxi allocation
* Earnings calculation
* Booking history tracking

---

# 📁 Project Structure

```bash id="ojq2tv"
src/
│
├── Controller/
│   └── TaxiController.java
│
├── Model/
│   ├── Taxi.java
│   └── TaxiBooking.java
│
├── View/
│   └── TaxiView.java
```

---

# 🏗️ MVC Architecture

## 1. Model Layer

Handles:

* Taxi details
* Booking logic
* Earnings calculation
* Taxi history management

### Classes

* `Taxi`
* `TaxiBooking`

---

## 2. View Layer

Handles:

* User interaction
* Input collection
* Displaying outputs

### Class

* `TaxiView`

---

## 3. Controller Layer

Acts as a bridge between Model and View.

### Class

* `TaxiController`

---

# ✨ Features

## ✅ Taxi Booking

* Book nearest available taxi
* Automatic taxi assignment
* Dynamic taxi creation

## ✅ Smart Taxi Allocation

Taxi selection is based on:

1. Nearest taxi
2. Taxi availability
3. Lowest earnings (if distance is same)

## ✅ Earnings Calculation

Fare is automatically calculated based on:

* Distance travelled
* Base fare

## ✅ Booking History

Displays:

* Customer ID
* Pickup location
* Drop location
* Pickup time
* Drop time
* Earnings

---

# 🚖 Taxi Allocation Logic

* Initially taxis are at location `A`
* Maximum taxis allowed: `4`
* Taxi must be free before pickup time
* Closest taxi is allocated

If multiple taxis are equally near:

* Taxi with lower earnings is selected

---

# 💰 Fare Calculation

```java id="ddjjlwm"
(Math.abs(dropLocation-pickupLocation)*15-5)*10 + 100
```

### Example

If distance = 2 points:

```text id="o35l0g"
(2*15 - 5) * 10 + 100
= 350
```

---

# 📦 Collections Used

| Collection        | Purpose               |
| ----------------- | --------------------- |
| `ArrayList<Taxi>` | Store active taxis    |
| `ArrayList<Taxi>` | Store booking history |

---

# 🖥️ Menu

```text id="lrpoh2"
1.Book Taxi
2.Display Details
3.Exit
```

---

# 📌 Sample Output

```text id="h5kxy0"
Choose any one
1.Book Taxi
2.Display Details
3.Exit

Enter Pickup Location
A

Enter Drop Location
D

Enter Pickup Time
2

Taxi number 1 is booked!
```

---

# 📌 Display Details Output

```text id="9p2p4z"
-----------------
Taxi 1
currentLocation=D
customerId=1
pickupLocation=A
dropLocation=D
pickupTime=2
dropTime=5
earnings=500
-----------------
```

---

# 🚀 How to Run

## Step 1

Clone the repository

```bash id="i4cw1v"
git clone <repository-url>
```

---

## Step 2

Open project in:

* Eclipse
* IntelliJ IDEA

---

## Step 3

Create `Main.java`

```java id="0e0v3g"
import Controller.TaxiController;
import View.TaxiView;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        TaxiView tv = new TaxiView();
        TaxiController tc = new TaxiController(tv);

        tc.start();
    }
}
```

---

## Step 4

Run `Main.java`

---

# 🛠️ Technologies Used

* Java
* OOP Concepts
* MVC Architecture
* Java Collections Framework

---

# 📚 OOP Concepts Used

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Cloning (`Cloneable` Interface)

---

# 🔮 Future Enhancements

* GUI using JavaFX/Swing
* Database Integration
* Real-time taxi tracking
* Customer login system
* Online payment integration
* Dynamic pricing system

---

# 👨‍💻 Author

Developed for practicing:

* Java Programming
* MVC Design Pattern
* Taxi Allocation Logic
* Collections Framework
