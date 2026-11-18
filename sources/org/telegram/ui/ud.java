package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f52530b;
    public CharSequence f52531c;
    public long d;
    public long f52532e;
    public String f52533f;
    public boolean f52534g;
    public String h;
    public long f52536j;
    public boolean f52529a = true;
    public TL_stars.StarsAmount f52535i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f52530b = str;
        udVar.f52531c = str2;
        return udVar;
    }
}
