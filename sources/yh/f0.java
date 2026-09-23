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
    public final long f47039a;
    public final TLRPC.Document f47040b;
    public final long f47041c;
    public final int d;
    public final String e;
    public i8 f47042f;
    public int f47043g = -1;
    public RadialGradient h;
    public Paint f47044i;
    public org.telegram.ui.Components.q5 f47045j;
    public org.telegram.ui.Components.e6 f47046k;
    public final RectF f47047l;
    public final yc f47048m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47047l = new RectF();
        this.f47048m = new yc(g0Var);
        this.f47039a = tL_starGiftUnique.f18308id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47040b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18089id;
        }
        this.f47041c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47042f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47042f.f47216c.set(f7, f7, f10, f10);
    }
}
