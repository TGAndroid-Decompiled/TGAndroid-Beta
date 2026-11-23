package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f52548b;
    public CharSequence f52549c;
    public long d;
    public long f52550e;
    public String f52551f;
    public boolean f52552g;
    public String h;
    public long f52554j;
    public boolean f52547a = true;
    public TL_stars.StarsAmount f52553i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f52548b = str;
        udVar.f52549c = str2;
        return udVar;
    }
}
