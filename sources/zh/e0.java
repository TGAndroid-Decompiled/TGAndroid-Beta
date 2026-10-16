package zh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class e0 {
    public final long f50399a;
    public final TLRPC.Document f50400b;
    public final long f50401c;
    public final int d;
    public final String e;
    public b8 f50402f;
    public int f50403g = -1;
    public RadialGradient h;
    public Paint f50404i;
    public org.telegram.ui.Components.s5 f50405j;
    public org.telegram.ui.Components.g6 f50406k;
    public final RectF f50407l;
    public final ad f50408m;

    public e0(f0 f0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f50407l = new RectF();
        this.f50408m = new ad(f0Var);
        this.f50399a = tL_starGiftUnique.f19141id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f50400b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f18922id;
        }
        this.f50401c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f50402f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f50402f.f50325c.set(f7, f7, f10, f10);
    }
}
