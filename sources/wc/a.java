package wc;

import w7.o9;
public final class a {
    public static final String[] f49347o = {"34", "37"};
    public static final String[] f49348p = {"60", "62", "64", "65"};
    public static final String[] f49349q = {"35"};
    public static final String[] f49350r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49351s = {"4"};
    public static final String[] f49352t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49353a;
    public final String f49354b;
    public final Integer f49355c;
    public final Integer d;
    public final String e;
    public final String f49356f;
    public final String f49357g;
    public final String h;
    public final String f49358i;
    public final String f49359j;
    public final String f49360k;
    public String f49361l;
    public String f49362m;
    public final String f49363n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f49353a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f49355c = num;
        this.d = num2;
        this.f49354b = o9.e(str2);
        this.e = o9.e(str3);
        this.f49356f = o9.e(str4);
        this.f49357g = o9.e(str5);
        this.h = o9.e(str6);
        this.f49358i = o9.e(str7);
        this.f49359j = o9.e(str8);
        this.f49360k = o9.e(str9);
        this.f49362m = o9.a(str10) == null ? a() : str10;
        this.f49361l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f49363n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f49362m)) {
            String str2 = this.f49353a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f49347o)) {
                    str = "American Express";
                } else if (o9.c(str2, f49348p)) {
                    str = "Discover";
                } else if (o9.c(str2, f49349q)) {
                    str = "JCB";
                } else if (o9.c(str2, f49350r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f49351s)) {
                    str = "Visa";
                } else if (o9.c(str2, f49352t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49362m = str;
            }
        }
        return this.f49362m;
    }

    public final String b() {
        if (!o9.d(this.f49361l)) {
            return this.f49361l;
        }
        String str = this.f49353a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49361l = substring;
            return substring;
        }
        return null;
    }
}
