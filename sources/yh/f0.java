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
    public final long f47351a;
    public final TLRPC.Document f47352b;
    public final long f47353c;
    public final int d;
    public final String e;
    public i8 f47354f;
    public int f47355g = -1;
    public RadialGradient h;
    public Paint f47356i;
    public org.telegram.ui.Components.q5 f47357j;
    public org.telegram.ui.Components.e6 f47358k;
    public final RectF f47359l;
    public final yc f47360m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47359l = new RectF();
        this.f47360m = new yc(g0Var);
        this.f47351a = tL_starGiftUnique.f18560id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47352b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18341id;
        }
        this.f47353c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47354f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47354f.f47527c.set(f7, f7, f10, f10);
    }
}
