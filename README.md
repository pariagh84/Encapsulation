# سیستم مدیریت حساب بانکی

این پروژه یک سیستم مدیریت حساب بانکی ساده با استفاده از زبان برنامه‌نویسی جاوا است. این سیستم شامل چند نوع حساب بانکی (حساب جاری و حساب پس‌انداز) می‌باشد که هر کدام رفتارهای متفاوتی در عملیات واریز، برداشت و محاسبه سود دارند. همچنین یک کلاس مدیریت مشتریان بانک وجود دارد که امکان اضافه کردن حساب‌ها، جستجوی حساب‌ها و نمایش موجودی نهایی آن‌ها را فراهم می‌کند.

## ویژگی‌ها

- **حساب جاری (Bank.TransactionAccount):**
  - امکان برداشت تا سقف اضافه‌برداشت مشخص (۵۰۰ دلار).
  - عدم محاسبه سود برای حساب‌های جاری.

- **حساب پس‌انداز (Bank.SavingsAccount):**
  - محاسبه سود با نرخ ثابت (۳٪) و واریز سود به حساب.

- **مدیریت مشتریان بانک (Bank.BankCustomers):**
  - ذخیره و مدیریت لیست حساب‌ها.
  - امکان جستجو و نمایش اطلاعات حساب‌ها بر اساس شماره حساب.

- **اجرای نمونه برنامه (Main):**
  - ایجاد نمونه‌هایی از حساب‌های جاری و پس‌انداز.
  - انجام عملیات واریز، برداشت، محاسبه سود و نمایش موجودی حساب‌ها.

## ساختار فایل‌ها

- **Bank.BankAccount.java:**  
  کلاس انتزاعی شامل متدهای اصلی مانند واریز، برداشت، دریافت موجودی و اطلاعات حساب.

- **Bank.TransactionAccount.java:**  
  کلاس مشتق از Bank.BankAccount که قابلیت برداشت با در نظر گرفتن سقف اضافه‌برداشت را پیاده‌سازی می‌کند.

- **Bank.SavingsAccount.java:**  
  کلاس مشتق از Bank.BankAccount که متد محاسبه سود را با استفاده از نرخ ثابت (۳٪) تعریف می‌کند.

- **Bank.BankCustomers.java:**  
  کلاس مدیریت مشتریان که امکان افزودن حساب، جستجو بر اساس شماره حساب و نمایش اطلاعات موجودی را فراهم می‌کند.

- **Main.java:**  
  نقطه شروع برنامه که در آن نمونه‌هایی از حساب‌های جاری و پس‌انداز ساخته شده و عملیات‌های مختلف روی آن‌ها انجام می‌شود.

## نکات تکمیلی

- در کلاس‌های مربوط به حساب‌های بانکی، بررسی ورودی‌های منفی برای واریز و برداشت انجام شده تا از بروز خطا جلوگیری شود.
- عملیات‌های مختلف مانند واریز، برداشت، محاسبه سود و جستجو در حساب‌ها، پیام‌های مناسبی در کنسول چاپ می‌کنند تا کاربر از جریان اجرای برنامه مطلع شود.
- این پروژه می‌تواند مبنایی برای توسعه سیستم‌های پیچیده‌تر مدیریت حساب بانکی باشد.
