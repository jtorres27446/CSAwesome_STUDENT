# Setting Up VS Code for Java (AP Computer Science A)

Welcome to AP CSA!  
Follow these steps to set up your **Mac** to write and run Java programs using **Visual Studio Code**.

---

## 🧩 Step 1: Install the Java Development Kit (JDK)

1. Go to [https://adoptium.net](https://adoptium.net)
2. Download **Temurin JDK 17 (LTS)** for macOS  
   – Choose the Intel or Apple Silicon version that matches your Mac.  
3. Open the `.pkg` installer and follow the default steps.  
4. After installation, open **Terminal** and type:
   ```bash
   java -version
   ```
   You should see something like:
   ```
   openjdk version "17.0.x"
   ```

> 💡 **Why Java 17?**  
> Java 17 is the Long-Term Support (LTS) version used by the AP College Board and CSAwesome curriculum.  
> It’s stable, fully compatible with all AP CSA material, and supported until 2029.  
> You may use **Java 21** or **Java 25** if already installed, but features beyond 17 are **not required** for this course.

---

## 💻 Step 2: Install Visual Studio Code

1. Visit [https://code.visualstudio.com/](https://code.visualstudio.com/)  
2. Download **VS Code for macOS**.  
3. Drag the app into your **Applications** folder.  
4. Open VS Code once installation is complete.

---

## ⚙️ Step 3: Install the Java Extension Pack

1. In VS Code, click the **Extensions** icon on the left sidebar or press `⌘ + ⇧ + X`.  
2. Search for **“Extension Pack for Java”** by Microsoft.  
3. Click **Install**.

This pack includes everything needed for AP CSA:
- Language Support for Java (by Red Hat)
- Debugger for Java
- Test Runner for Java
- Project Manager for Java

---

## 🧪 Step 4: Test Your Setup

1. Create a new file named `HelloWorld.java`.
2. Paste in the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, AP CSA!");
    }
}
```

3. Click the **Run Java** button (▶️) in the top-right corner or press `⌘ + F5`.

If you see the message below in the terminal, your setup is complete ✅

```
Hello, AP CSA!
```

---

🎉 **You’re now ready to begin coding in Java for AP Computer Science A!**
