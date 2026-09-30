package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zc;
public final class f0 {
    public final long f47353a;
    public final TLRPC.Document f47354b;
    public final long f47355c;
    public final int d;
    public final String e;
    public i8 f47356f;
    public int f47357g = -1;
    public RadialGradient h;
    public Paint f47358i;
    public org.telegram.ui.Components.q5 f47359j;
    public org.telegram.ui.Components.e6 f47360k;
    public final RectF f47361l;
    public final zc f47362m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47361l = new RectF();
        this.f47362m = new zc(g0Var);
        this.f47353a = tL_starGiftUnique.f18562id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47354b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18343id;
        }
        this.f47355c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47356f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47356f.f47529c.set(f7, f7, f10, f10);
    }
}
