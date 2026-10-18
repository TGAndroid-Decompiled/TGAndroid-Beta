package wc;

import w7.p9;
public final class a {
    public static final String[] f48947o = {"34", "37"};
    public static final String[] f48948p = {"60", "62", "64", "65"};
    public static final String[] f48949q = {"35"};
    public static final String[] f48950r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f48951s = {"4"};
    public static final String[] f48952t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f48953a;
    public final String f48954b;
    public final Integer f48955c;
    public final Integer d;
    public final String e;
    public final String f48956f;
    public final String f48957g;
    public final String h;
    public final String f48958i;
    public final String f48959j;
    public final String f48960k;
    public String f48961l;
    public String f48962m;
    public final String f48963n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f48953a = p9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f48955c = num;
        this.d = num2;
        this.f48954b = p9.e(str2);
        this.e = p9.e(str3);
        this.f48956f = p9.e(str4);
        this.f48957g = p9.e(str5);
        this.h = p9.e(str6);
        this.f48958i = p9.e(str7);
        this.f48959j = p9.e(str8);
        this.f48960k = p9.e(str9);
        this.f48962m = p9.a(str10) == null ? a() : str10;
        this.f48961l = p9.e(str11) == null ? b() : str11;
        p9.e(str12);
        p9.b(str13);
        p9.e(str14);
        this.f48963n = p9.e(str15);
    }

    public final String a() {
        String str;
        if (p9.d(this.f48962m)) {
            String str2 = this.f48953a;
            if (!p9.d(str2)) {
                if (p9.c(str2, f48947o)) {
                    str = "American Express";
                } else if (p9.c(str2, f48948p)) {
                    str = "Discover";
                } else if (p9.c(str2, f48949q)) {
                    str = "JCB";
                } else if (p9.c(str2, f48950r)) {
                    str = "Diners Club";
                } else if (p9.c(str2, f48951s)) {
                    str = "Visa";
                } else if (p9.c(str2, f48952t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f48962m = str;
            }
        }
        return this.f48962m;
    }

    public final String b() {
        if (!p9.d(this.f48961l)) {
            return this.f48961l;
        }
        String str = this.f48953a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f48961l = substring;
            return substring;
        }
        return null;
    }
}
