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
    public final long f47392a;
    public final TLRPC.Document f47393b;
    public final long f47394c;
    public final int d;
    public final String e;
    public i8 f47395f;
    public int f47396g = -1;
    public RadialGradient h;
    public Paint f47397i;
    public org.telegram.ui.Components.p5 f47398j;
    public org.telegram.ui.Components.d6 f47399k;
    public final RectF f47400l;
    public final yc f47401m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47400l = new RectF();
        this.f47401m = new yc(g0Var);
        this.f47392a = tL_starGiftUnique.f18553id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47393b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18334id;
        }
        this.f47394c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47395f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47395f.f47569c.set(f7, f7, f10, f10);
    }
}
