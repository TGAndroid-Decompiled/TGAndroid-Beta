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
    public final long f52488a;
    public final TLRPC.Document f52489b;
    public final long f52490c;
    public final int d;
    public final String f52491e;
    public b8 f52492f;
    public int f52493g = -1;
    public RadialGradient h;
    public Paint f52494i;
    public org.telegram.ui.Components.s5 f52495j;
    public org.telegram.ui.Components.g6 f52496k;
    public final RectF f52497l;
    public final bd f52498m;

    public d0(e0 e0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f52497l = new RectF();
        this.f52498m = new bd(e0Var);
        this.f52488a = tL_starGiftUnique.f20295id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f52489b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20074id;
        }
        this.f52490c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f52491e = tL_starGiftUnique.slug;
        this.f52492f = new b8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f52492f.f52431c.set(f7, f7, f10, f10);
    }
}
