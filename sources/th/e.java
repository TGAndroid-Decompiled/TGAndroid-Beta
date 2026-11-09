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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class e extends sh.d implements Drawable.Callback, te.b {
    public final String f56065b;
    public final Drawable d;
    public final cp f56068f;
    public ci h;
    public TLRPC.WebPage f56069n;
    public final te.a f56070r;
    public final te.a f56071s;
    public final wa f56066c = new wa((char) 0, 18);
    public final Paint f56067e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f56068f = cpVar;
        xq xqVar = xq.h;
        this.f56070r = new te.a(0, this, xqVar, 320L, false);
        this.f56071s = new te.a(0, this, xqVar, 320L, false);
        this.f56065b = str;
        this.f55306a.J0(g0.L(7.0f));
        this.d = jg.g.h(t0.f25566b, 2131231745);
        cpVar.setCallback(this);
        cpVar.b(l6.x0(null, l6.f28066o7, false));
        cpVar.f32734a = g0.L(15.0f);
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
        ImageReceiver imageReceiver = this.f55306a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f56068f;
        cpVar.setBounds(0, 0, i7, i10);
        int x02 = l6.x0(null, l6.f27809a7, false);
        te.a aVar = this.f56071s;
        int f12 = i0.a.f(aVar.f55499e, x02, 1073741824);
        Paint paint = this.f56067e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f55499e, l6.x0(null, l6.f28066o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        wa waVar = this.f56066c;
        waVar.getClass();
        if (((PorterDuffColorFilter) waVar.f701c) == null || waVar.f700b != f13 || ((PorterDuff.Mode) waVar.d) != mode) {
            waVar.f701c = new PorterDuffColorFilter(f13, mode);
            waVar.f700b = f13;
            waVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) waVar.f701c);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f56070r;
        s.b(canvas, drawable, 1.0f - aVar2.f55499e);
        s.b(canvas, cpVar, aVar2.f55499e);
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
