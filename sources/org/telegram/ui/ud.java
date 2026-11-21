package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f52544b;
    public CharSequence f52545c;
    public long d;
    public long f52546e;
    public String f52547f;
    public boolean f52548g;
    public String h;
    public long f52550j;
    public boolean f52543a = true;
    public TL_stars.StarsAmount f52549i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f52544b = str;
        udVar.f52545c = str2;
        return udVar;
    }
}
