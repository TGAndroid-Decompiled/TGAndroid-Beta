package rh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dc;
public final class f0 {
    public final long f46880a;
    public final TLRPC.Document f46881b;
    public final long f46882c;
    public final int d;
    public final String e;
    public s8 f46883f;
    public int f46884g = -1;
    public RadialGradient h;
    public Paint f46885i;
    public org.telegram.ui.Components.f5 f46886j;
    public org.telegram.ui.Components.t5 f46887k;
    public final RectF f46888l;
    public final dc f46889m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f46888l = new RectF();
        this.f46889m = new dc(g0Var);
        this.f46880a = tL_starGiftUnique.f20021id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f46881b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19799id;
        }
        this.f46882c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f46883f = new s8(1, 6);
        float L = org.telegram.messenger.i0.L(36.0f);
        float f7 = (-L) / 2.0f;
        float f10 = L / 2.0f;
        this.f46883f.f47460c.set(f7, f7, f10, f10);
    }
}
