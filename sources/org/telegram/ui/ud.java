package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f52640b;
    public CharSequence f52641c;
    public long d;
    public long f52642e;
    public String f52643f;
    public boolean f52644g;
    public String h;
    public long f52646j;
    public boolean f52639a = true;
    public TL_stars.StarsAmount f52645i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f52640b = str;
        udVar.f52641c = str2;
        return udVar;
    }
}
