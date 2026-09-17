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
    public final long f47154a;
    public final TLRPC.Document f47155b;
    public final long f47156c;
    public final int d;
    public final String e;
    public k8 f47157f;
    public int f47158g = -1;
    public RadialGradient h;
    public Paint f47159i;
    public org.telegram.ui.Components.o5 f47160j;
    public org.telegram.ui.Components.c6 f47161k;
    public final RectF f47162l;
    public final wc f47163m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47162l = new RectF();
        this.f47163m = new wc(g0Var);
        this.f47154a = tL_starGiftUnique.f18347id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47155b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18127id;
        }
        this.f47156c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47157f = new k8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47157f.f47403c.set(f7, f7, f10, f10);
    }
}
