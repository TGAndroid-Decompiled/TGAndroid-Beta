package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class r91 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f43058a;
    public String f43059b;
    public String f43060c;
    public boolean d;
    public String e;
    public String f43061f;
    public String f43062g;
    public boolean h;
    public String f43063i;
    public String f43064j;
    public String f43065k;
    public boolean f43066l;
    public String f43067m;
    public String f43068n;
    public String f43069o;
    public String f43070p;
    public String f43071q;
    public boolean f43072r;
    public boolean f43073s;
    public String f43074t;
    public String f43075u;
    public String v;
    public boolean f43076w;
    public boolean f43077x;
    public String f43078y;
    public String f43079z;

    public static ti.e a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        if (d10 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i10 / ((float) d10)) * 100.0f);
        }
        String formatWholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z11 = true;
        String str = "";
        if (i10 != 0 && abs != 0.0f) {
            int i11 = (int) abs;
            if (abs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = sb2.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z11 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        ti.e eVar = new ti.e(9, false);
        eVar.f49181b = formatWholeNumber;
        eVar.f49182c = str;
        eVar.d = valueOf;
        eVar.e = valueOf2;
        return eVar;
    }
}
