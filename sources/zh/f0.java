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
    public final long f51843a;
    public final TLRPC.Document f51844b;
    public final long f51845c;
    public final int d;
    public final String f51846e;
    public h8 f51847f;
    public int f51848g = -1;
    public RadialGradient h;
    public Paint f51849i;
    public org.telegram.ui.Components.q5 f51850j;
    public org.telegram.ui.Components.e6 f51851k;
    public final RectF f51852l;
    public final zc f51853m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51852l = new RectF();
        this.f51853m = new zc(g0Var);
        this.f51843a = tL_starGiftUnique.f20096id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51844b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19875id;
        }
        this.f51845c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51846e = tL_starGiftUnique.slug;
        this.f51847f = new h8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51847f.f51994c.set(f7, f7, f10, f10);
    }
}
