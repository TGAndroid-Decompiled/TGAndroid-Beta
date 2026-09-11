package zh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zc;
public final class f0 {
    public final long f51842a;
    public final TLRPC.Document f51843b;
    public final long f51844c;
    public final int d;
    public final String f51845e;
    public h8 f51846f;
    public int f51847g = -1;
    public RadialGradient h;
    public Paint f51848i;
    public org.telegram.ui.Components.q5 f51849j;
    public org.telegram.ui.Components.e6 f51850k;
    public final RectF f51851l;
    public final zc f51852m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51851l = new RectF();
        this.f51852m = new zc(g0Var);
        this.f51842a = tL_starGiftUnique.f20097id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51843b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19875id;
        }
        this.f51844c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51845e = tL_starGiftUnique.slug;
        this.f51846f = new h8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51846f.f51993c.set(f7, f7, f10, f10);
    }
}
