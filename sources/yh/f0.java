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
    public final long f47459a;
    public final TLRPC.Document f47460b;
    public final long f47461c;
    public final int d;
    public final String e;
    public i8 f47462f;
    public int f47463g = -1;
    public RadialGradient h;
    public Paint f47464i;
    public org.telegram.ui.Components.q5 f47465j;
    public org.telegram.ui.Components.e6 f47466k;
    public final RectF f47467l;
    public final zc f47468m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f47467l = new RectF();
        this.f47468m = new zc(g0Var);
        this.f47459a = tL_starGiftUnique.f18577id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f47460b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18358id;
        }
        this.f47461c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f47462f = new i8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f47462f.f47635c.set(f7, f7, f10, f10);
    }
}
