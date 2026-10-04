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
    public final long f51250a;
    public final TLRPC.Document f51251b;
    public final long f51252c;
    public final int d;
    public final String f51253e;
    public j8 f51254f;
    public int f51255g = -1;
    public RadialGradient h;
    public Paint f51256i;
    public org.telegram.ui.Components.q5 f51257j;
    public org.telegram.ui.Components.e6 f51258k;
    public final RectF f51259l;
    public final zc f51260m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51259l = new RectF();
        this.f51260m = new zc(g0Var);
        this.f51250a = tL_starGiftUnique.f20265id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51251b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20044id;
        }
        this.f51252c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51253e = tL_starGiftUnique.slug;
        this.f51254f = new j8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51254f.f51488c.set(f7, f7, f10, f10);
    }
}
