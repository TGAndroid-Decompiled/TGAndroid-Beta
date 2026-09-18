package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wc;
public final class f0 {
    public final long f47159a;
    public final TLRPC.Document f47160b;
    public final long f47161c;
    public final int d;
    public final String e;
    public k8 f47162f;
    public int f47163g = -1;
    public RadialGradient h;
    public Paint f47164i;
    public org.telegram.ui.Components.o5 f47165j;
    public org.telegram.ui.Components.c6 f47166k;
    public final RectF f47167l;
    public final wc f47168m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47167l = new RectF();
        this.f47168m = new wc(g0Var);
        this.f47159a = tL_starGiftUnique.f18346id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47160b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18127id;
        }
        this.f47161c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47162f = new k8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47162f.f47408c.set(f7, f7, f10, f10);
    }
}
