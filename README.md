# get-locales-json-java
Get a list of locale settings supported by openjdk

## compile
```shell-session
$ javac Java_Locale_List.java 
```

## execute
```shell-session
$ java Java_Locale_List
{
  "languages": [  {"name": "af", "language": "af", "region": "", "script": "", "variant":"", "extension":{}, "iso3Language": "afr", "iso3region": ""},
    {"name": "af-Latn-ZA", "language": "af", "region": "ZA", "script": "Latn", "variant":"", "extension":{}, "iso3Language": "afr", "iso3region": "ZAF"},
    {"name": "af-NA", "language": "af", "region": "NA", "script": "", "variant":"", "extension":{}, "iso3Language": "afr", "iso3region": "NAM"},
    {"name": "af-ZA", "language": "af", "region": "ZA", "script": "", "variant":"", "extension":{}, "iso3Language": "afr", "iso3region": "ZAF"},
    {"name": "agq", "language": "agq", "region": "", "script": "", "variant":"", "extension":{}, "iso3Language": "agq", "iso3region": ""},
    {"name": "agq-CM", "language": "agq", "region": "CM", "script": "", "variant":"", "extension":{}, "iso3Language": "agq", "iso3region": "CMR"},
......
    {"name": "zh-SG", "language": "zh", "region": "SG", "script": "", "variant":"", "extension":{}, "iso3Language": "zho", "iso3region": "SGP"},
    {"name": "zh-TW", "language": "zh", "region": "TW", "script": "", "variant":"", "extension":{}, "iso3Language": "zho", "iso3region": "TWN"},
    {"name": "zu", "language": "zu", "region": "", "script": "", "variant":"", "extension":{}, "iso3Language": "zul", "iso3region": ""},
    {"name": "zu-Latn-ZA", "language": "zu", "region": "ZA", "script": "Latn", "variant":"", "extension":{}, "iso3Language": "zul", "iso3region": "ZAF"},
    {"name": "zu-ZA", "language": "zu", "region": "ZA", "script": "", "variant":"", "extension":{}, "iso3Language": "zul", "iso3region": "ZAF"}
  ]
}
```
