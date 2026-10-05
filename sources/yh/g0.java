package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zc;
public final class g0 {
    public final long f51317a;
    public final TLRPC.Document f51318b;
    public final long f51319c;
    public final int d;
    public final String f51320e;
    public l8 f51321f;
    public int f51322g = -1;
    public RadialGradient h;
    public Paint f51323i;
    public org.telegram.ui.Components.q5 f51324j;
    public org.telegram.ui.Components.e6 f51325k;
    public final RectF f51326l;
    public final zc f51327m;

    public g0(h0 h0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f51326l = new RectF();
        this.f51327m = new zc(h0Var);
        this.f51317a = tL_starGiftUnique.f20274id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f51318b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20053id;
        }
        this.f51319c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f51320e = tL_starGiftUnique.slug;
        this.f51321f = new l8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f51321f.f51607c.set(f7, f7, f10, f10);
    }
}
