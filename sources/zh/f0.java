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
    public final long f51874a;
    public final TLRPC.Document f51875b;
    public final long f51876c;
    public final int d;
    public final String f51877e;
    public h8 f51878f;
    public int f51879g = -1;
    public RadialGradient h;
    public Paint f51880i;
    public org.telegram.ui.Components.q5 f51881j;
    public org.telegram.ui.Components.e6 f51882k;
    public final RectF f51883l;
    public final zc f51884m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51883l = new RectF();
        this.f51884m = new zc(g0Var);
        this.f51874a = tL_starGiftUnique.f20123id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51875b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19902id;
        }
        this.f51876c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51877e = tL_starGiftUnique.slug;
        this.f51878f = new h8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51878f.f52025c.set(f7, f7, f10, f10);
    }
}
