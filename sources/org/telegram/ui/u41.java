package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class u41 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f51743a;
    public String f51744b;
    public String f51745c;
    public boolean d;
    public String f51746e;
    public String f51747f;
    public String f51748g;
    public boolean h;
    public String f51749i;
    public String f51750j;
    public String f51751k;
    public boolean f51752l;
    public String f51753m;
    public String f51754n;
    public String f51755o;
    public String f51756p;
    public String f51757q;
    public boolean f51758r;
    public boolean f51759s;
    public String f51760t;
    public String f51761u;
    public String v;
    public boolean f51762w;
    public boolean f51763x;
    public String f51764y;
    public String f51765z;

    public static xi.e a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i7 = (int) (d - d2);
        if (d2 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i7 / ((float) d2)) * 100.0f);
        }
        boolean z11 = false;
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        String str = "";
        if (i7 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.g0.o0(i7, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.g0.o0(i7, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != 0 || tL_statsAbsValueAndPrev.current != 0.0d) {
            z11 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        ?? obj = new Object();
        obj.f60055a = o02;
        obj.f60056b = str;
        obj.f60057c = valueOf;
        obj.d = valueOf2;
        return obj;
    }
}
