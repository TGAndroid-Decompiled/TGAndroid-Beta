package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class d0 {
    public final long f52603a;
    public final TLRPC.Document f52604b;
    public final long f52605c;
    public final int d;
    public final String f52606e;
    public b8 f52607f;
    public int f52608g = -1;
    public RadialGradient h;
    public Paint f52609i;
    public org.telegram.ui.Components.s5 f52610j;
    public org.telegram.ui.Components.g6 f52611k;
    public final RectF f52612l;
    public final ad f52613m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52612l = new RectF();
        this.f52613m = new ad(e0Var);
        this.f52603a = tL_starGiftUnique.f20032id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52604b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19809id;
        }
        this.f52605c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52606e = tL_starGiftUnique.slug;
        this.f52607f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52607f.f52547c.set(f7, f7, f10, f10);
    }
}
