import java.text.SimpleDateFormat;
import java.util.*;
public class Java_Locale_List {
    public  static class Java_Locale {
        public String languageTag;
        public String language;
        public String country;
        public String script;
        public String variant;
        public Java_Locale_List.Java_Locale_Extension extension;
        public String iso3Language;
        public String iso3Country;
    }
    public  static class Java_Locale_Extension {
        public String xExtension;
        public String uExtension;
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (this.uExtension != null) {
                sb.append(String.format("\"u\": \"%s\"", this.uExtension));
                if (this.xExtension != null) {
                    sb.append(", ");
                }
            }
            if (this.xExtension != null) {
                sb.append(String.format("\"u\": \"%s\"", this.uExtension));
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
		
		//returns array of all locales
        List<Locale> locales = Arrays.asList(SimpleDateFormat.getAvailableLocales());
		Comparator<Locale> compare = Comparator.comparing(Locale::toLanguageTag);
        locales.sort(compare);
		//iterate through each locale and print 
		// locale code, display name and country
        System.out.printf("{\n\"languages\": [");
        Iterator<Locale> li = locales.iterator();
        while (li.hasNext()) {
            Locale locale = li.next();
            Java_Locale ld = new Java_Locale_List.Java_Locale();
            ld.languageTag = locale.toLanguageTag();
            ld.language = locale.getLanguage();
            ld.country = locale.getCountry();
            try {
                ld.script = locale.getScript();
            } catch (java.util.MissingResourceException e){
                ld.script = "";
            }
            try {
                ld.variant = locale.getVariant();
            } catch (java.util.MissingResourceException e){
                ld.variant = "";
            }
            ld.extension = new Java_Locale_List.Java_Locale_Extension();
            if (locale.getExtension('u') != null) {
                ld.extension.uExtension = locale.getExtension('u');
            }
            if (locale.getExtension('x') != null) {
                ld.extension.uExtension = locale.getExtension('x');
            } 
            try {
                ld.iso3Language = locale.getISO3Language();
            } catch (java.util.MissingResourceException e){
                ld.iso3Language = "";
            }
            try {
                ld.iso3Country = locale.getISO3Country();
            } catch (java.util.MissingResourceException e){
                ld.iso3Country = "";
            }


            System.out.printf("  {\"name\": \"%s\", \"language\": \"%s\", \"region\": \"%s\", \"script\": \"%s\", \"variant\":\"%s\", \"extension\":%s, \"iso3Language\": \"%s\", \"iso3region\": \"%s\"}" ,ld.languageTag, ld.language, ld.country, ld.script, ld.variant, ld.extension, ld.iso3Language, ld.iso3Country);
            if (li.hasNext()){
                System.out.printf(",\n");
            } else {
                System.out.printf("\n");
            }
        
		}
        System.out.printf("  ]\n}\n");

    }    
}
