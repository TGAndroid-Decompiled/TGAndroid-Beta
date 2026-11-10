package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class wd {
    public String f51001b;
    public CharSequence f51002c;
    public long d;
    public long f51003e;
    public String f51004f;
    public boolean f51005g;
    public String h;
    public long f51007j;
    public boolean f51000a = true;
    public TL_stars.StarsAmount f51006i = TL_stars.StarsAmount.ofStars(0);

    public static wd a(String str, String str2) {
        wd wdVar = new wd();
        wdVar.f51001b = str;
        wdVar.f51002c = str2;
        return wdVar;
    }
}
