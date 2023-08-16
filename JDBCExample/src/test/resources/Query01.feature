Feature: Database üzerinden students tablosundaki mother_name ve mother:occupation testi.
  @query01
  Scenario:
    * Database baglantisi kurulur.
    * DB_US05 Query calistirilir ve sonuclari alinir.
    * DB_US05 Query sonuclari dogrulanir.
    * Database baglantisi kapatilir.