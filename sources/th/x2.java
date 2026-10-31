package th;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;
public final class x2 {
    public final Paint f49597a;
    public final Paint f49598b;
    public final Paint f49599c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f49600f;
    public final j2.f f49601g = new j2.f(5);
    public final RectF h = new RectF();
    public final RectF f49602i = new RectF();
    public final RectF f49603j = new RectF();
    public final RectF f49604k;
    public final Paint f49605l;
    public final Drawable f49606m;
    public final Drawable f49607n;
    public final Drawable f49608o;
    public final Drawable f49609p;
    public final Drawable f49610q;
    public final Drawable f49611r;
    public final Drawable f49612s;
    public final bi0 f49613t;
    public final bi0 f49614u;

    public x2(Context context) {
        new RectF();
        this.f49604k = new RectF();
        this.f49605l = new Paint();
        this.f49606m = context.getDrawable(2131231756);
        this.f49608o = context.getDrawable(2131231742);
        this.f49607n = context.getDrawable(2131231753);
        Drawable drawable = context.getDrawable(2131231743);
        this.f49609p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f49610q = context.getDrawable(2131231748);
        this.f49611r = context.getDrawable(2131231895);
        this.f49612s = context.getDrawable(2131232107);
        this.f49614u = new bi0(2131624086, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        bi0 bi0Var = new bi0(2131624086, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f49613t = bi0Var;
        bi0Var.N(20, false, true);
        bi0Var.stop();
        Paint paint = new Paint(1);
        this.f49597a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f49598b = paint2;
        paint2.setColor(-1);
        int o10 = i0.b.o(-16777216, 102);
        this.d = context.getDrawable(2131232719);
        this.e = context.getDrawable(2131232718);
        Paint paint3 = new Paint();
        this.f49599c = paint3;
        paint3.setColor(o10);
        this.f49600f = new ColorDrawable(i0.b.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        bi0 bi0Var = this.f49614u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            bi0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            bi0Var.P(i11);
        } else if (z10) {
            if (bi0Var.f24752a0 > 20) {
                bi0Var.N(0, false, false);
            }
            bi0Var.P(20);
            bi0Var.start();
        } else {
            int i12 = bi0Var.f24752a0;
            if (i12 != 0 && i12 < 43) {
                bi0Var.P(43);
                bi0Var.start();
            }
        }
    }
}
