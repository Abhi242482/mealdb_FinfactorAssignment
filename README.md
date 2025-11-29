# TheMealDB Explorer
 Abhishek Shivaji Khadsare  
**Repo:** [GitHub Link](https://github.com/Abhi242482/mealdb_FinfactorAssignment)

---

## Project Overview

TheMealDB Explorer is a web application that allows users to:

- Search meals by name
- Browse meals by category (Chicken, Vegan, etc.)
- Get a random meal
- View full recipe details including ingredients, instructions, and YouTube video
- Responsive design for mobile and desktop

**UI ScreenShot**
<img width="1901" height="981" alt="Screenshot 2025-11-29 101430" src="https://github.com/user-attachments/assets/49ff2fcd-ca4d-4922-a690-45a116c852f3" />


The project consists of two parts:

1. **Backend (Spring Boot + REST API)**
   - Fetches data from [TheMealDB API](https://www.themealdb.com/api.php)
   - Implements caching with in-memory cache (Caffeine)
   - Provides simplified REST endpoints for frontend

2. **Frontend (ReactJS + Axios )**
   - Fetches data from backend API
   - Displays meals, categories, search functionality
   - Responsive and user-friendly UI

---

## Backend

- **Technology:** Java, Spring Boot, RestTemplate, Caffeine Cache
- **Port:** 9909
- **Endpoints:**
  - `/api/meals/search?name=<meal_name>` - Search meals
  - `/api/meals/categories` - List categories
  - `/api/meals/by-category?category=<category_name>` - Meals by category
  - `/api/meals/random` - Random meal
  - `/api/meals/details?id=<meal_id>` - Meal details

**Cache:**  
- In-memory caching with **Caffeine**
- Max 100 entries, expires after 10 minutes

---

## Frontend

- **Technology:** ReactJS, Axios
- **Port:** 3000
- **Features:**
  - Search meals by name
  - Browse categories
  - Random meal button
  - Display meal details
  - Mobile responsive design
 
**PostmanTesting**

<img width="1835" height="959" alt="Screenshot 2025-11-29 094801" src="https://github.com/user-attachments/assets/374f20a4-bdc7-47ba-bfaa-ea7f7351292b" />

<img width="1892" height="1026" alt="Screenshot 2025-11-29 094733" src="https://github.com/user-attachments/assets/35b39497-87f8-4944-9152-2f68d2a1127b" />

<img width="1872" height="1009" alt="Screenshot 2025-11-29 094710" src="https://github.com/user-attachments/assets/6fbaeb7c-db14-4831-b806-162aa0b0b532" />


