package wc;

import w7.o9;
public final class a {
    public static final String[] f49348o = {"34", "37"};
    public static final String[] f49349p = {"60", "62", "64", "65"};
    public static final String[] f49350q = {"35"};
    public static final String[] f49351r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49352s = {"4"};
    public static final String[] f49353t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49354a;
    public final String f49355b;
    public final Integer f49356c;
    public final Integer d;
    public final String e;
    public final String f49357f;
    public final String f49358g;
    public final String h;
    public final String f49359i;
    public final String f49360j;
    public final String f49361k;
    public String f49362l;
    public String f49363m;
    public final String f49364n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f49354a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f49356c = num;
        this.d = num2;
        this.f49355b = o9.e(str2);
        this.e = o9.e(str3);
        this.f49357f = o9.e(str4);
        this.f49358g = o9.e(str5);
        this.h = o9.e(str6);
        this.f49359i = o9.e(str7);
        this.f49360j = o9.e(str8);
        this.f49361k = o9.e(str9);
        this.f49363m = o9.a(str10) == null ? a() : str10;
        this.f49362l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f49364n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f49363m)) {
            String str2 = this.f49354a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f49348o)) {
                    str = "American Express";
                } else if (o9.c(str2, f49349p)) {
                    str = "Discover";
                } else if (o9.c(str2, f49350q)) {
                    str = "JCB";
                } else if (o9.c(str2, f49351r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f49352s)) {
                    str = "Visa";
                } else if (o9.c(str2, f49353t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49363m = str;
            }
        }
        return this.f49363m;
    }

    public final String b() {
        if (!o9.d(this.f49362l)) {
            return this.f49362l;
        }
        String str = this.f49354a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49362l = substring;
            return substring;
        }
        return null;
    }
}
