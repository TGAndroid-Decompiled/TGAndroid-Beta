package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bd;
public final class d0 {
    public final long f52411a;
    public final TLRPC.Document f52412b;
    public final long f52413c;
    public final int d;
    public final String f52414e;
    public b8 f52415f;
    public int f52416g = -1;
    public RadialGradient h;
    public Paint f52417i;
    public org.telegram.ui.Components.s5 f52418j;
    public org.telegram.ui.Components.g6 f52419k;
    public final RectF f52420l;
    public final bd f52421m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52420l = new RectF();
        this.f52421m = new bd(e0Var);
        this.f52411a = tL_starGiftUnique.f20269id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52412b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20048id;
        }
        this.f52413c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52414e = tL_starGiftUnique.slug;
        this.f52415f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52415f.f52354c.set(f7, f7, f10, f10);
    }
}
