package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f51909b;
    public CharSequence f51910c;
    public long d;
    public long f51911e;
    public String f51912f;
    public boolean f51913g;
    public String h;
    public long f51915j;
    public boolean f51908a = true;
    public TL_stars.StarsAmount f51914i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f51909b = str;
        udVar.f51910c = str2;
        return udVar;
    }
}
