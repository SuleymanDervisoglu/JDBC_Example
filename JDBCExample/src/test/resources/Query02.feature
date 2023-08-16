Feature: Database üzerinden topic tablosunda update testi.
@query02
  Scenario: Topic tablosundaki istenen id'nin name bilgisi update edilebilmeli.

    * Database baglantisi kurulur.
    * DB_US08 Query calistirilir ve sonuclari alinir.
    * DB_US08 Query sonuclari dogrulanir.
    * Database baglantisi kapatilir.