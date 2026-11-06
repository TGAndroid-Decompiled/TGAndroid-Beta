package uc;

import c8.pd;
public final class a {
    public static final String[] f56402o = {"34", "37"};
    public static final String[] f56403p = {"60", "62", "64", "65"};
    public static final String[] f56404q = {"35"};
    public static final String[] f56405r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56406s = {"4"};
    public static final String[] f56407t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56408a;
    public final String f56409b;
    public final Integer f56410c;
    public final Integer d;
    public final String f56411e;
    public final String f56412f;
    public final String f56413g;
    public final String h;
    public final String f56414i;
    public final String f56415j;
    public final String f56416k;
    public String f56417l;
    public String f56418m;
    public final String f56419n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56408a = pd.e(replaceAll);
        this.f56410c = num;
        this.d = num2;
        this.f56409b = pd.e(str2);
        this.f56411e = pd.e(str3);
        this.f56412f = pd.e(str4);
        this.f56413g = pd.e(str5);
        this.h = pd.e(str6);
        this.f56414i = pd.e(str7);
        this.f56415j = pd.e(str8);
        this.f56416k = pd.e(str9);
        this.f56418m = pd.a(str10) == null ? a() : str10;
        if (pd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56417l = str16;
        pd.e(str12);
        pd.b(str13);
        pd.e(str14);
        this.f56419n = pd.e(str15);
    }

    public final String a() {
        String str;
        if (pd.d(this.f56418m)) {
            String str2 = this.f56408a;
            if (!pd.d(str2)) {
                if (pd.c(str2, f56402o)) {
                    str = "American Express";
                } else if (pd.c(str2, f56403p)) {
                    str = "Discover";
                } else if (pd.c(str2, f56404q)) {
                    str = "JCB";
                } else if (pd.c(str2, f56405r)) {
                    str = "Diners Club";
                } else if (pd.c(str2, f56406s)) {
                    str = "Visa";
                } else if (pd.c(str2, f56407t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56418m = str;
            }
        }
        return this.f56418m;
    }

    public final String b() {
        if (!pd.d(this.f56417l)) {
            return this.f56417l;
        }
        String str = this.f56408a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56417l = substring;
            return substring;
        }
        return null;
    }
}
