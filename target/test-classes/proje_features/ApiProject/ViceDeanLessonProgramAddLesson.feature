
Feature: ViceDean Lesson Program olusturabilmelidir
  Scenario: US10_ViceDeanAddLessonProgram

    Given kullanici add lesson  program icin base url olusturur
    And kullanici add lesson program icin expected data yi olusturur
    And kullanici post request yaparak ders programi  olusturur
    And kullanici olusturdugu ders programini dogrular