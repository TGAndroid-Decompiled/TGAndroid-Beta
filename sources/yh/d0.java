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
    public final long f52365a;
    public final TLRPC.Document f52366b;
    public final long f52367c;
    public final int d;
    public final String f52368e;
    public b8 f52369f;
    public int f52370g = -1;
    public RadialGradient h;
    public Paint f52371i;
    public org.telegram.ui.Components.s5 f52372j;
    public org.telegram.ui.Components.g6 f52373k;
    public final RectF f52374l;
    public final bd f52375m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52374l = new RectF();
        this.f52375m = new bd(e0Var);
        this.f52365a = tL_starGiftUnique.f20265id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52366b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20044id;
        }
        this.f52367c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52368e = tL_starGiftUnique.slug;
        this.f52369f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52369f.f52308c.set(f7, f7, f10, f10);
    }
}
