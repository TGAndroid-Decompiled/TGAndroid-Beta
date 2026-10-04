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
    public final long f51256a;
    public final TLRPC.Document f51257b;
    public final long f51258c;
    public final int d;
    public final String f51259e;
    public j8 f51260f;
    public int f51261g = -1;
    public RadialGradient h;
    public Paint f51262i;
    public org.telegram.ui.Components.q5 f51263j;
    public org.telegram.ui.Components.e6 f51264k;
    public final RectF f51265l;
    public final zc f51266m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51265l = new RectF();
        this.f51266m = new zc(g0Var);
        this.f51256a = tL_starGiftUnique.f20269id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51257b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20048id;
        }
        this.f51258c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51259e = tL_starGiftUnique.slug;
        this.f51260f = new j8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51260f.f51494c.set(f7, f7, f10, f10);
    }
}
