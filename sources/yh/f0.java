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
    public final long f47349a;
    public final TLRPC.Document f47350b;
    public final long f47351c;
    public final int d;
    public final String e;
    public i8 f47352f;
    public int f47353g = -1;
    public RadialGradient h;
    public Paint f47354i;
    public org.telegram.ui.Components.q5 f47355j;
    public org.telegram.ui.Components.e6 f47356k;
    public final RectF f47357l;
    public final yc f47358m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47357l = new RectF();
        this.f47358m = new yc(g0Var);
        this.f47349a = tL_starGiftUnique.f18521id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47350b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18302id;
        }
        this.f47351c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47352f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47352f.f47529c.set(f7, f7, f10, f10);
    }
}
