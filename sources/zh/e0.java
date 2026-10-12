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
    public final long f50398a;
    public final TLRPC.Document f50399b;
    public final long f50400c;
    public final int d;
    public final String e;
    public b8 f50401f;
    public int f50402g = -1;
    public RadialGradient h;
    public Paint f50403i;
    public org.telegram.ui.Components.s5 f50404j;
    public org.telegram.ui.Components.g6 f50405k;
    public final RectF f50406l;
    public final ad f50407m;

    public e0(f0 f0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f50406l = new RectF();
        this.f50407m = new ad(f0Var);
        this.f50398a = tL_starGiftUnique.f19441id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f50399b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19222id;
        }
        this.f50400c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f50401f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f50401f.f50324c.set(f7, f7, f10, f10);
    }
}
