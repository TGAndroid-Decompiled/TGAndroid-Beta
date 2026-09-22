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
    public final long f47413a;
    public final TLRPC.Document f47414b;
    public final long f47415c;
    public final int d;
    public final String e;
    public i8 f47416f;
    public int f47417g = -1;
    public RadialGradient h;
    public Paint f47418i;
    public org.telegram.ui.Components.p5 f47419j;
    public org.telegram.ui.Components.d6 f47420k;
    public final RectF f47421l;
    public final yc f47422m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47421l = new RectF();
        this.f47422m = new yc(g0Var);
        this.f47413a = tL_starGiftUnique.f18568id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47414b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18349id;
        }
        this.f47415c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47416f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47416f.f47590c.set(f7, f7, f10, f10);
    }
}
