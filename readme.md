# Flagz Android Library


# Flagz

Flagz is a lightweight Android library designed for simplicity and efficiency, allowing you to easily retrieve country flag icons as bitmaps based on country codes. With a size of less than 60 KB, Flagz provides a straightforward solution for integrating country flags into your Android applications. Seamlessly operate as an Android library, fetching flag images in the form of bitmaps, simplifying the process of incorporating visually appealing country flag icons.

## Key Features:

- Lightweight Android library (less than 60 KB)
- Retrieve country flag icon bitmaps by country code
- Straightforward and easy to use


## Usage

## Integration
To integrate the Flagz library into your project, add the following dependency to your app module's build.gradle file:

```groovy
    dependencies {
        implementation 'com.essoapps:flagz:1.0.2'
    }
```
Make sure to replace 1.0.2 with the latest version available.

Now, you can use the library in your Android project to easily display country flag images based on country codes.

### Initialization

To use the **Flagz** library, create an instance of the `Flagz` class by passing a `Context` to its constructor. This initializes the library with the necessary resources.

```java
    // java code
    Flagz flagz =  Flagz.getInstance(context);
```


### Get Flag Bitmap

You can obtain the 64px x 64px flag bitmap for a specific country code using the `getFlag` method.


```
Bitmap flagBitmap = flagz.getFlag("eg"); // Replace "eg" with the desired country code
```
If the country code is not found or invalid, the method returns `null`.

### Example

Here's an example of how to use the library in an Android activity:

```java
    // java example
    Flagz flagz =  Flagz.getInstance(context);
    
    Bitmap egFlag = flagz.getFlag("eg");
    
    ImageView flagImageView = findViewById(R.id.flagImageView);
    flagImageView.setImageBitmap(egFlag);

```

```kotlin
    // kotlin example
    val flagz = Flagz.getInstance(context)

    val flagImageView: ImageView = findViewById(R.id.flagImageView)
    flagImageView.setImageBitmap(egFlag)

```


### Country Codes Table

| Code | Country|
| :---: | ------ |
| AD   | Andorra                 |
| AE   | United Arab Emirates     |
| AF   | Afghanistan             |
| AG   | Antigua & Barbuda       |
| AI   | Anguilla                |
| AL   | Albania                 |
| AM   | Armenia                 |
| AO   | Angola                  |
| AR   | Argentina               |
| AS   | American Samoa          |
| AT   | Austria                 |
| AU   | Australia               |
| AW   | Aruba                   |
| AX   | Åland Islands           |
| AZ   | Azerbaijan              |
| BA   | Bosnia & Herzegovina    |
| BB   | Barbados                |
| BD   | Bangladesh              |
| BE   | Belgium                 |
| BF   | Burkina Faso            |
| BG   | Bulgaria                |
| BH   | Bahrain                 |
| BI   | Burundi                 |
| BJ   | Benin                   |
| BL   | St. Barthélemy          |
| BM   | Bermuda                 |
| BN   | Brunei                  |
| BO   | Bolivia                 |
| BR   | Brazil                  |
| BS   | Bahamas                 |
| BT   | Bhutan                  |
| BV   | Bouvet Island           |
| BW   | Botswana                |
| BY   | Belarus                 |
| BZ   | Belize                  |
| CA   | Canada                  |
| CC   | Cocos (Keeling) Islands |
| CD   | Congo - Kinshasa        |
| CF   | Central African Republic|
| CG   | Congo - Brazzaville     |
| CH   | Switzerland             |
| CI   | Côte d’Ivoire           |
| CK   | Cook Islands            |
| CL   | Chile                   |
| CM   | Cameroon                |
| CN   | China                   |
| CO   | Colombia                |
| CR   | Costa Rica              |
| CU   | Cuba                    |
| CV   | Cape Verde              |
| CW   | Curaçao                 |
| CX   | Christmas Island        |
| CY   | Cyprus                  |
| CZ   | Czech Republic          |
| DE   | Germany                 |
| DJ   | Djibouti                |
| DK   | Denmark                 |
| DM   | Dominica                |
| DO   | Dominican Republic      |
| DZ   | Algeria                 |
| EC   | Ecuador                 |
| EE   | Estonia                 |
| EG   | Egypt                   |
| ER   | Eritrea                 |
| ES   | Spain                   |
| ET   | Ethiopia                |
| EU   | European Union           |
| FI   | Finland                 |
| FJ   | Fiji                    |
| FK   | Falkland Islands        |
| FM   | Micronesia              |
| FO   | Faroe Islands           |
| FR   | France                  |
| GA   | Gabon                   |
| GB   | United Kingdom           |
| GD   | Grenada                 |
| GE   | Georgia                 |
| GF   | French Guiana           |
| GG   | Guernsey                |
| GH   | Ghana                   |
| GI   | Gibraltar               |
| GL   | Greenland               |
| GM   | Gambia                  |
| GN   | Guinea                  |
| GP   | Guadeloupe              |
| GQ   | Equatorial Guinea       |
| GR   | Greece                  |
| GS   | So. Georgia & So. Sandwich Isl.|
| GT   | Guatemala               |
| GU   | Guam                    |
| GW   | Guinea-Bissau           |
| GY   | Guyana                  |
| HK   | Hong Kong (China)       |
| HM   | Heard & McDonald Islands |
| HN   | Honduras                |
| HR   | Croatia                 |
| HT   | Haiti                   |
| HU   | Hungary                 |
| ID   | Indonesia               |
| IE   | Ireland                 |
| IM   | Isle of Man             |
| IN   | India                   |
| IO   | British Indian Ocean Territory|
| IQ   | Iraq                    |
| IR   | Iran                    |
| IS   | Iceland                 |
| IT   | Italy                   |
| JE   | Jersey                  |
| JM   | Jamaica                 |
| JO   | Jordan                  |
| JP   | Japan                   |
| KE   | Kenya                   |
| KG   | Kyrgyzstan              |
| KH   | Cambodia                |
| KI   | Kiribati                |
| KM   | Comoros                 |
| KN   | St. Kitts & Nevis       |
| KP   | North Korea             |
| KR   | South Korea             |
| KW   | Kuwait                  |
| KY   | Cayman Islands          |
| KZ   | Kazakhstan              |
| LA   | Laos                    |
| LB   | Lebanon                 |
| LC   | St. Lucia               |
| LI   | Liechtenstein           |
| LK   | Sri Lanka               |
| LR   | Liberia                 |
| LS   | Lesotho                 |
| LT   | Lithuania              |
| LU   | Luxembourg              |
| LV   | Latvia                  |
| LY   | Libya                   |
| MA   | Morocco                 |
| MC   | Monaco                  |
| MD   | Moldova                 |
| ME   | Montenegro              |
| MF   | St. Martin              |
| MG   | Madagascar              |
| MH   | Marshall Islands        |
| MK   | Macedonia               |
| ML   | Mali                    |
| MM   | Myanmar (Burma)         |
| MN   | Mongolia                |
| MO   | Macau (China)           |
| MP   | Northern Mariana Islands|
| MQ   | Martinique              |
| MR   | Mauritania              |
| MS   | Montserrat              |
| MT   | Malta                   |
| MU   | Mauritius               |
| MV   | Maldives                |
| MW   | Malawi                  |
| MX   | Mexico                  |
| MY   | Malaysia                |
| MZ   | Mozambique              |
| NA   | Namibia                 |
| NC   | New Caledonia           |
| NE   | Niger                   |
| NF   | Norfolk Island          |
| NG   | Nigeria                 |
| NI   | Nicaragua               |
| NL   | Netherlands             |
| NO   | Norway                  |
| NP   | Nepal                   |
| NR   | Nauru                   |
| NU   | Niue                    |
| NZ   | New Zealand             |
| OM   | Oman                    |
| PA   | Panama                  |
| PE   | Peru                    |
| PF   | French Polynesia        |
| PG   | Papua New Guinea        |
| PH   | Philippines             |
| PK   | Pakistan                |
| PL   | Poland                  |
| PM   | St. Pierre & Miquelon   |
| PN   | Pitcairn Islands        |
| PR   | Puerto Rico             |
| PS   | Palestine               |
| PT   | Portugal                |
| PW   | Palau                   |
| PY   | Paraguay                |
| QA   | Qatar                   |
| RE   | Réunion                 |
| RO   | Romania                 |
| RS   | Serbia                  |
| RU   | Russia                  |
| RW   | Rwanda                  |
| SA   | Saudi Arabia            |
| SB   | Solomon Islands         |
| SC   | Seychelles              |
| SD   | Sudan                   |
| SE   | Sweden                  |
| SG   | Singapore               |
| SH   | St. Helena              |
| SI   | Slovenia                |
| SJ   | Svalbard & Jan Mayen    |
| SK   | Slovakia                |
| SL   | Sierra Leone            |
| SM   | San Marino              |
| SN   | Senegal                 |
| SO   | Somalia                 |
| SR   | Suriname                |
| SS   | South Sudan             |
| ST   | São Tomé & Príncipe     |
| SV   | El Salvador             |
| SX   | Sint Maarten            |
| SY   | Syria                   |
| SZ   | Eswatini                |
| TC   | Turks & Caicos Islands  |
| TD   | Chad                    |
| TF   | French Southern Territories|
| TG   | Togo                    |
| TH   | Thailand                |
| TJ   | Tajikistan              |
| TK   | Tokelau                 |
| TL   | Timor-Leste             |
| TM   | Turkmenistan            |
| TN   | Tunisia                 |
| TO   | Tonga                   |
| TR   | Turkey                  |
| TT   | Trinidad & Tobago       |
| TV   | Tuvalu                  |
| TW   | Taiwan                  |
| TZ   | Tanzania                |
| UA   | Ukraine                 |
| UG   | Uganda                  |
| UM   | U.S. Outlying Islands   |
| UN   | United Nations           |
| US   | United States           |
| UY   | Uruguay                 |
| UZ   | Uzbekistan              |
| VA   | Vatican City            |
| VC   | St. Vincent & Grenadines|
| VE   | Venezuela               |
| VG   | British Virgin Islands  |
| VI   | U.S. Virgin Islands      |
| VN   | Vietnam                 |
| VU   | Vanuatu                 |
| WF   | Wallis & Futuna         |
| WS   | Samoa                   |
| XK   | Kosovo                  |
| YE   | Yemen                   |
| YT   | Mayotte                 |
| ZA   | South Africa            |
| ZM   | Zambia                  |
| ZW   | Zimbabwe                |


## License

Copyright 2023 Eslam M. Mohamed

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.