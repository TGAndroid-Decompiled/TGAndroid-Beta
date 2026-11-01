package th;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ci0;
public final class x2 {
    public final Paint f49611a;
    public final Paint f49612b;
    public final Paint f49613c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f49614f;
    public final j2.f f49615g = new j2.f(5);
    public final RectF h = new RectF();
    public final RectF f49616i = new RectF();
    public final RectF f49617j = new RectF();
    public final RectF f49618k;
    public final Paint f49619l;
    public final Drawable f49620m;
    public final Drawable f49621n;
    public final Drawable f49622o;
    public final Drawable f49623p;
    public final Drawable f49624q;
    public final Drawable f49625r;
    public final Drawable f49626s;
    public final ci0 f49627t;
    public final ci0 f49628u;

    public x2(Context context) {
        new RectF();
        this.f49618k = new RectF();
        this.f49619l = new Paint();
        this.f49620m = context.getDrawable(2131231756);
        this.f49622o = context.getDrawable(2131231742);
        this.f49621n = context.getDrawable(2131231753);
        Drawable drawable = context.getDrawable(2131231743);
        this.f49623p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f49624q = context.getDrawable(2131231748);
        this.f49625r = context.getDrawable(2131231895);
        this.f49626s = context.getDrawable(2131232107);
        this.f49628u = new ci0(2131624086, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        ci0 ci0Var = new ci0(2131624086, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f49627t = ci0Var;
        ci0Var.N(20, false, true);
        ci0Var.stop();
        Paint paint = new Paint(1);
        this.f49611a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f49612b = paint2;
        paint2.setColor(-1);
        int o10 = i0.b.o(-16777216, 102);
        this.d = context.getDrawable(2131232719);
        this.e = context.getDrawable(2131232718);
        Paint paint3 = new Paint();
        this.f49613c = paint3;
        paint3.setColor(o10);
        this.f49614f = new ColorDrawable(i0.b.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        ci0 ci0Var = this.f49628u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            ci0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            ci0Var.P(i11);
        } else if (z10) {
            if (ci0Var.f25131a0 > 20) {
                ci0Var.N(0, false, false);
            }
            ci0Var.P(20);
            ci0Var.start();
        } else {
            int i12 = ci0Var.f25131a0;
            if (i12 != 0 && i12 < 43) {
                ci0Var.P(43);
                ci0Var.start();
            }
        }
    }
}
