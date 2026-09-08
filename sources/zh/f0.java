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
    public final long f51873a;
    public final TLRPC.Document f51874b;
    public final long f51875c;
    public final int d;
    public final String f51876e;
    public h8 f51877f;
    public int f51878g = -1;
    public RadialGradient h;
    public Paint f51879i;
    public org.telegram.ui.Components.q5 f51880j;
    public org.telegram.ui.Components.e6 f51881k;
    public final RectF f51882l;
    public final zc f51883m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51882l = new RectF();
        this.f51883m = new zc(g0Var);
        this.f51873a = tL_starGiftUnique.f20124id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51874b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19902id;
        }
        this.f51875c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51876e = tL_starGiftUnique.slug;
        this.f51877f = new h8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51877f.f52024c.set(f7, f7, f10, f10);
    }
}
