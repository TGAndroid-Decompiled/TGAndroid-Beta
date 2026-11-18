package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f52532b;
    public CharSequence f52533c;
    public long d;
    public long f52534e;
    public String f52535f;
    public boolean f52536g;
    public String h;
    public long f52538j;
    public boolean f52531a = true;
    public TL_stars.StarsAmount f52537i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f52532b = str;
        udVar.f52533c = str2;
        return udVar;
    }
}
