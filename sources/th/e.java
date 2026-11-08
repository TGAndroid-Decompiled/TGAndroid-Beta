package th;

import a8.wa;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import bg.s;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String f56053b;
    public final Drawable d;
    public final cp f56056f;
    public ci h;
    public TLRPC.WebPage f56057n;
    public final te.a f56058r;
    public final te.a f56059s;
    public final wa f56054c = new wa((char) 0, 18);
    public final Paint f56055e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f56056f = cpVar;
        xq xqVar = xq.h;
        this.f56058r = new te.a(0, this, xqVar, 320L, false);
        this.f56059s = new te.a(0, this, xqVar, 320L, false);
        this.f56053b = str;
        this.f55294a.J0(g0.L(7.0f));
        this.d = jg.g.h(t0.f25566b, 2131231745);
        cpVar.setCallback(this);
        cpVar.b(k6.x0(null, k6.f28053o7, false));
        cpVar.f32653a = g0.L(15.0f);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ci) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        float f10 = i7;
        float f11 = i10;
        ImageReceiver imageReceiver = this.f55294a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f56056f;
        cpVar.setBounds(0, 0, i7, i10);
        int x02 = k6.x0(null, k6.f27796a7, false);
        te.a aVar = this.f56059s;
        int f12 = i0.a.f(aVar.f55487e, x02, 1073741824);
        Paint paint = this.f56055e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f55487e, k6.x0(null, k6.f28053o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        wa waVar = this.f56054c;
        waVar.getClass();
        if (((PorterDuffColorFilter) waVar.f701c) == null || waVar.f700b != f13 || ((PorterDuff.Mode) waVar.d) != mode) {
            waVar.f701c = new PorterDuffColorFilter(f13, mode);
            waVar.f700b = f13;
            waVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) waVar.f701c);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f56058r;
        s.b(canvas, drawable, 1.0f - aVar2.f55487e);
        s.b(canvas, cpVar, aVar2.f55487e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.invalidate();
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
