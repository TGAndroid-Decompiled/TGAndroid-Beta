package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ud {
    public String f50052b;
    public CharSequence f50053c;
    public long d;
    public long f50054e;
    public String f50055f;
    public boolean f50056g;
    public String h;
    public long f50058j;
    public boolean f50051a = true;
    public TL_stars.StarsAmount f50057i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.f50052b = str;
        udVar.f50053c = str2;
        return udVar;
    }
}
