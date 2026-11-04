package rc;

import x7.d5;
public final class a {
    public static final String[] f54472o = {"34", "37"};
    public static final String[] f54473p = {"60", "62", "64", "65"};
    public static final String[] f54474q = {"35"};
    public static final String[] f54475r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f54476s = {"4"};
    public static final String[] f54477t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f54478a;
    public final String f54479b;
    public final Integer f54480c;
    public final Integer d;
    public final String f54481e;
    public final String f54482f;
    public final String f54483g;
    public final String h;
    public final String f54484i;
    public final String f54485j;
    public final String f54486k;
    public String f54487l;
    public String f54488m;
    public final String f54489n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f54478a = d5.e(replaceAll);
        this.f54480c = num;
        this.d = num2;
        this.f54479b = d5.e(str2);
        this.f54481e = d5.e(str3);
        this.f54482f = d5.e(str4);
        this.f54483g = d5.e(str5);
        this.h = d5.e(str6);
        this.f54484i = d5.e(str7);
        this.f54485j = d5.e(str8);
        this.f54486k = d5.e(str9);
        this.f54488m = d5.a(str10) == null ? a() : str10;
        if (d5.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f54487l = str16;
        d5.e(str12);
        d5.b(str13);
        d5.e(str14);
        this.f54489n = d5.e(str15);
    }

    public final String a() {
        String str;
        if (d5.d(this.f54488m)) {
            String str2 = this.f54478a;
            if (!d5.d(str2)) {
                if (d5.c(str2, f54472o)) {
                    str = "American Express";
                } else if (d5.c(str2, f54473p)) {
                    str = "Discover";
                } else if (d5.c(str2, f54474q)) {
                    str = "JCB";
                } else if (d5.c(str2, f54475r)) {
                    str = "Diners Club";
                } else if (d5.c(str2, f54476s)) {
                    str = "Visa";
                } else if (d5.c(str2, f54477t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f54488m = str;
            }
        }
        return this.f54488m;
    }

    public final String b() {
        if (!d5.d(this.f54487l)) {
            return this.f54487l;
        }
        String str = this.f54478a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f54487l = substring;
            return substring;
        }
        return null;
    }
}
