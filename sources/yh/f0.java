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
    public final long f47340a;
    public final TLRPC.Document f47341b;
    public final long f47342c;
    public final int d;
    public final String e;
    public i8 f47343f;
    public int f47344g = -1;
    public RadialGradient h;
    public Paint f47345i;
    public org.telegram.ui.Components.q5 f47346j;
    public org.telegram.ui.Components.e6 f47347k;
    public final RectF f47348l;
    public final zc f47349m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47348l = new RectF();
        this.f47349m = new zc(g0Var);
        this.f47340a = tL_starGiftUnique.f18546id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47341b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18327id;
        }
        this.f47342c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47343f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47343f.f47516c.set(f7, f7, f10, f10);
    }
}
