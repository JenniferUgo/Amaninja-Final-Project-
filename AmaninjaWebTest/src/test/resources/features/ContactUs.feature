Feature: Contact Us validation
  Scenario: Validate Input form
      Given User is logged in and on Contact us page with url "https://amaninja.co.uk/pages/contact"
      Then Details should be filled in contact us form
        |Abdul          |salam@gmail.com         |07023456789       |This is a comment |
        |nick           |nick@gmail.com          |07053456789       |This is a comment |
        |bread          |bread@gmail.com         |07026456789       |This is a comment |
        |horse          |horse@gmail.com         |07023756789       |This is a comment |
        |cat            |cat@gmail.com           |07023458789       |This is a comment |
        |dog            |dog@gmail.com           |07023486789       |This is a comment |