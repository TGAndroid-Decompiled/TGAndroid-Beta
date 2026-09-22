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
    public final long f47075a;
    public final TLRPC.Document f47076b;
    public final long f47077c;
    public final int d;
    public final String e;
    public j8 f47078f;
    public int f47079g = -1;
    public RadialGradient h;
    public Paint f47080i;
    public org.telegram.ui.Components.o5 f47081j;
    public org.telegram.ui.Components.c6 f47082k;
    public final RectF f47083l;
    public final wc f47084m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47083l = new RectF();
        this.f47084m = new wc(g0Var);
        this.f47075a = tL_starGiftUnique.f18334id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47076b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18115id;
        }
        this.f47077c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47078f = new j8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47078f.f47286c.set(f7, f7, f10, f10);
    }
}
