package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f51910b;
    public CharSequence f51911c;
    public long d;
    public long f51912e;
    public String f51913f;
    public boolean f51914g;
    public String h;
    public long f51916j;
    public boolean f51909a = true;
    public TL_stars.StarsAmount f51915i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f51910b = str;
        udVar.f51911c = str2;
        return udVar;
    }
}
