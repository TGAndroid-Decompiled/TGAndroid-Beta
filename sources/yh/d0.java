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
    public final long f52367a;
    public final TLRPC.Document f52368b;
    public final long f52369c;
    public final int d;
    public final String f52370e;
    public b8 f52371f;
    public int f52372g = -1;
    public RadialGradient h;
    public Paint f52373i;
    public org.telegram.ui.Components.s5 f52374j;
    public org.telegram.ui.Components.g6 f52375k;
    public final RectF f52376l;
    public final bd f52377m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52376l = new RectF();
        this.f52377m = new bd(e0Var);
        this.f52367a = tL_starGiftUnique.f20265id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52368b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20044id;
        }
        this.f52369c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52370e = tL_starGiftUnique.slug;
        this.f52371f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52371f.f52310c.set(f7, f7, f10, f10);
    }
}
