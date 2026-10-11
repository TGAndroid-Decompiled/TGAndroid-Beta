package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bd;
public final class d0 {
    public final long f52454a;
    public final TLRPC.Document f52455b;
    public final long f52456c;
    public final int d;
    public final String f52457e;
    public b8 f52458f;
    public int f52459g = -1;
    public RadialGradient h;
    public Paint f52460i;
    public org.telegram.ui.Components.s5 f52461j;
    public org.telegram.ui.Components.g6 f52462k;
    public final RectF f52463l;
    public final bd f52464m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52463l = new RectF();
        this.f52464m = new bd(e0Var);
        this.f52454a = tL_starGiftUnique.f20259id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52455b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20038id;
        }
        this.f52456c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52457e = tL_starGiftUnique.slug;
        this.f52458f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52458f.f52397c.set(f7, f7, f10, f10);
    }
}
