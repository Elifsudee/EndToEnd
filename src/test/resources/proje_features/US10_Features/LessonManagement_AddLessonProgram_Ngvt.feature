

Feature:Vice Dean Add Lesson Program
  Background: ManagementonSchool_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici vice dean hesabi login icin User Name alanina kullanici adi girer
    And kullanici vice dean hesabi icin Password alanina password girer
    Then kullanici login butonuna tiklar
    And kullanici menu secenegine tiklar
    And kullanici Lesson Management secenegine tiklar
    And kullanici Lesson Program secenegine tiklar


#  Scenario: Vice Dean gerekli alanlardan birini bos birakir
#
#    And kullanici Choose Lessons listesinde ders secer
#    And kullanici Choose Education Term bolumunden donem secer
#    And kullanici Start Time secebilmelidir
#    And kullanici Stop Time secebilmelidir
#    And Lesson Program bolumundeki submit butonuna tiklar
#    And kullanici uyari yazini gorur
#    And kullanici sayfayi kapatir


    Scenario Outline:
      And kullanici cikan bolumdeki bilgileri doldurur "<chooseLesson>","<EducationTerm>","<day>","<startTime>","<stopTime>"

      And kullanici sayfayi kapatir

      Examples:
        | chooseLesson | EducationTerm | day    | startTime | stopTime |
        |              | FALL_SEMESTER | FRIDAY | 1100A     | 1200P    |
        | Java         |               | FRIDAY | 1100A     | 1200P    |
        | Java         | FALL_SEMESTER |        | 1100A     | 1200P    |
        | Java         | FALL_SEMESTER | FRIDAY |           | 1200P    |
        | Java         | FALL_SEMESTER | FRIDAY | 1100A     |          |

