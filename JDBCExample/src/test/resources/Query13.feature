Feature:Database üzerinden online_admissions tablosundaki
  firstname bilgisinin içinde 'al' kelimesi gecen kayıtların email adreslerini listeleyınız.

  Scenario:
    * Database baglantisi kurulur.
    * DB_US013 Query calistirilir ve sonuclari alinir.
    * DB_US013 Query sonuclari dogrulanir.
    * Database baglantisi kapatilir.