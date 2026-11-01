package rh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dc;
public final class f0 {
    public final long f46894a;
    public final TLRPC.Document f46895b;
    public final long f46896c;
    public final int d;
    public final String e;
    public s8 f46897f;
    public int f46898g = -1;
    public RadialGradient h;
    public Paint f46899i;
    public org.telegram.ui.Components.f5 f46900j;
    public org.telegram.ui.Components.t5 f46901k;
    public final RectF f46902l;
    public final dc f46903m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f46902l = new RectF();
        this.f46903m = new dc(g0Var);
        this.f46894a = tL_starGiftUnique.f20022id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f46895b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19800id;
        }
        this.f46896c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f46897f = new s8(1, 6);
        float L = org.telegram.messenger.i0.L(36.0f);
        float f7 = (-L) / 2.0f;
        float f10 = L / 2.0f;
        this.f46897f.f47472c.set(f7, f7, f10, f10);
    }
}
