package qe;

import java.util.Locale;
import org.telegram.messenger.R;

public abstract class a {
    public static int a(Locale locale) {
        if (locale == null) {
            return 0;
        }
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        switch (languageTag) {
            case "ar":
                return R.raw.localization_ar;
            case "de":
                return R.raw.localization_de;
            case "en":
                return R.raw.localization_en;
            case "es":
                return R.raw.localization_es;
            case "it":
                return R.raw.localization_it;
            case "ko":
                return R.raw.localization_ko;
            case "nl":
                return R.raw.localization_nl;
            case "ru":
                return R.raw.localization_ru;
            case "uk":
                return R.raw.localization_uk;
            case "pt-BR":
                return R.raw.localization_pt_br;
            default:
                String language = locale.getLanguage();
                language.getClass();
                switch (language) {
                    case "ar":
                        return R.raw.localization_ar;
                    case "de":
                        return R.raw.localization_de;
                    case "en":
                        return R.raw.localization_en;
                    case "es":
                        return R.raw.localization_es;
                    case "it":
                        return R.raw.localization_it;
                    case "ko":
                        return R.raw.localization_ko;
                    case "nl":
                        return R.raw.localization_nl;
                    case "ru":
                        return R.raw.localization_ru;
                    case "uk":
                        return R.raw.localization_uk;
                    default:
                        return 0;
                }
        }
    }
}
