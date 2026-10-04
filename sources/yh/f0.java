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
    public final long f51249a;
    public final TLRPC.Document f51250b;
    public final long f51251c;
    public final int d;
    public final String f51252e;
    public j8 f51253f;
    public int f51254g = -1;
    public RadialGradient h;
    public Paint f51255i;
    public org.telegram.ui.Components.q5 f51256j;
    public org.telegram.ui.Components.e6 f51257k;
    public final RectF f51258l;
    public final zc f51259m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51258l = new RectF();
        this.f51259m = new zc(g0Var);
        this.f51249a = tL_starGiftUnique.f20264id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51250b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20043id;
        }
        this.f51251c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51252e = tL_starGiftUnique.slug;
        this.f51253f = new j8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51253f.f51487c.set(f7, f7, f10, f10);
    }
}
