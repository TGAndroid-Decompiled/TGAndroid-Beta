package pe;

import java.util.Locale;
import org.telegram.messenger.R;
public abstract class a {
    public static int a(Locale locale) {
        char c10;
        char c11;
        if (locale == null) {
            return 0;
        }
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        switch (languageTag.hashCode()) {
            case 3121:
                if (languageTag.equals("ar")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3201:
                if (languageTag.equals("de")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3241:
                if (languageTag.equals("en")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3246:
                if (languageTag.equals("es")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3371:
                if (languageTag.equals("it")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3428:
                if (languageTag.equals("ko")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3518:
                if (languageTag.equals("nl")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3651:
                if (languageTag.equals("ru")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3734:
                if (languageTag.equals("uk")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 106935481:
                if (languageTag.equals("pt-BR")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return R.raw.localization_ar;
            case 1:
                return R.raw.localization_de;
            case 2:
                return R.raw.localization_en;
            case 3:
                return R.raw.localization_es;
            case 4:
                return R.raw.localization_it;
            case 5:
                return R.raw.localization_ko;
            case 6:
                return R.raw.localization_nl;
            case 7:
                return R.raw.localization_ru;
            case '\b':
                return R.raw.localization_uk;
            case '\t':
                return R.raw.localization_pt_br;
            default:
                String language = locale.getLanguage();
                language.getClass();
                switch (language.hashCode()) {
                    case 3121:
                        if (language.equals("ar")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3201:
                        if (language.equals("de")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3241:
                        if (language.equals("en")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3246:
                        if (language.equals("es")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3371:
                        if (language.equals("it")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3428:
                        if (language.equals("ko")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3518:
                        if (language.equals("nl")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3651:
                        if (language.equals("ru")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3734:
                        if (language.equals("uk")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        return R.raw.localization_ar;
                    case 1:
                        return R.raw.localization_de;
                    case 2:
                        return R.raw.localization_en;
                    case 3:
                        return R.raw.localization_es;
                    case 4:
                        return R.raw.localization_it;
                    case 5:
                        return R.raw.localization_ko;
                    case 6:
                        return R.raw.localization_nl;
                    case 7:
                        return R.raw.localization_ru;
                    case '\b':
                        return R.raw.localization_uk;
                    default:
                        return 0;
                }
        }
    }
}
