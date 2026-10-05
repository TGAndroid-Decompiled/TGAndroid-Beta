package uc;

import w7.u8;
public final class a {
    public static final String[] f47600o = {"34", "37"};
    public static final String[] f47601p = {"60", "62", "64", "65"};
    public static final String[] f47602q = {"35"};
    public static final String[] f47603r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47604s = {"4"};
    public static final String[] f47605t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47606a;
    public final String f47607b;
    public final Integer f47608c;
    public final Integer d;
    public final String f47609e;
    public final String f47610f;
    public final String f47611g;
    public final String h;
    public final String f47612i;
    public final String f47613j;
    public final String f47614k;
    public String f47615l;
    public String f47616m;
    public final String f47617n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47606a = u8.e(replaceAll);
        this.f47608c = num;
        this.d = num2;
        this.f47607b = u8.e(str2);
        this.f47609e = u8.e(str3);
        this.f47610f = u8.e(str4);
        this.f47611g = u8.e(str5);
        this.h = u8.e(str6);
        this.f47612i = u8.e(str7);
        this.f47613j = u8.e(str8);
        this.f47614k = u8.e(str9);
        this.f47616m = u8.a(str10) == null ? a() : str10;
        if (u8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47615l = str16;
        u8.e(str12);
        u8.b(str13);
        u8.e(str14);
        this.f47617n = u8.e(str15);
    }

    public final String a() {
        String str;
        if (u8.d(this.f47616m)) {
            String str2 = this.f47606a;
            if (!u8.d(str2)) {
                if (u8.c(str2, f47600o)) {
                    str = "American Express";
                } else if (u8.c(str2, f47601p)) {
                    str = "Discover";
                } else if (u8.c(str2, f47602q)) {
                    str = "JCB";
                } else if (u8.c(str2, f47603r)) {
                    str = "Diners Club";
                } else if (u8.c(str2, f47604s)) {
                    str = "Visa";
                } else if (u8.c(str2, f47605t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47616m = str;
            }
        }
        return this.f47616m;
    }

    public final String b() {
        if (!u8.d(this.f47615l)) {
            return this.f47615l;
        }
        String str = this.f47606a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47615l = substring;
            return substring;
        }
        return null;
    }
}
