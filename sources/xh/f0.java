package xh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xc;
public final class f0 {
    public final long f45384a;
    public final TLRPC.Document f45385b;
    public final long f45386c;
    public final int d;
    public final String e;
    public l8 f45387f;
    public int f45388g = -1;
    public RadialGradient h;
    public Paint f45389i;
    public org.telegram.ui.Components.p5 f45390j;
    public org.telegram.ui.Components.d6 f45391k;
    public final RectF f45392l;
    public final xc f45393m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f45392l = new RectF();
        this.f45393m = new xc(g0Var);
        this.f45384a = tL_starGiftUnique.f17425id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f45385b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f17201id;
        }
        this.f45386c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f45387f = new l8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f45387f.f45677c.set(f7, f7, f10, f10);
    }
}
