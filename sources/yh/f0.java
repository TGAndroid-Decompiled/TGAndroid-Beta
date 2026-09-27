package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yc;
public final class f0 {
    public final long f47398a;
    public final TLRPC.Document f47399b;
    public final long f47400c;
    public final int d;
    public final String e;
    public h8 f47401f;
    public int f47402g = -1;
    public RadialGradient h;
    public Paint f47403i;
    public org.telegram.ui.Components.q5 f47404j;
    public org.telegram.ui.Components.e6 f47405k;
    public final RectF f47406l;
    public final yc f47407m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47406l = new RectF();
        this.f47407m = new yc(g0Var);
        this.f47398a = tL_starGiftUnique.f18554id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47399b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18335id;
        }
        this.f47400c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47401f = new h8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47401f.f47539c.set(f7, f7, f10, f10);
    }
}
