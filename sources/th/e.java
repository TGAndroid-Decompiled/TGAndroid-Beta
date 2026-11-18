package th;

import a8.xa;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import bg.t;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sp;
public final class e extends sh.d implements Drawable.Callback, te.b {
    public final String f58216b;
    public final Drawable d;
    public final sp f58219f;
    public ri h;
    public TLRPC.WebPage f58220n;
    public final te.a f58221r;
    public final te.a f58222s;
    public final xa f58217c = new xa((char) 0, 18);
    public final Paint f58218e = new Paint(1);

    public e(String str) {
        sp spVar = new sp(-1);
        this.f58219f = spVar;
        lr lrVar = lr.h;
        this.f58221r = new te.a(0, this, lrVar, 320L, false);
        this.f58222s = new te.a(0, this, lrVar, 320L, false);
        this.f58216b = str;
        this.f57433a.J0(g0.L(7.0f));
        this.d = i5.c.g(t0.f26915b, 2131231746);
        spVar.setCallback(this);
        spVar.b(n6.x0(null, n6.f29597o7, false));
        spVar.f39806a = g0.L(15.0f);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ri riVar = this.h;
        if (riVar != null) {
            riVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ri) view;
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
        ImageReceiver imageReceiver = this.f57433a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        sp spVar = this.f58219f;
        spVar.setBounds(0, 0, i7, i10);
        int x02 = n6.x0(null, n6.f29339a7, false);
        te.a aVar = this.f58222s;
        int f12 = i0.a.f(aVar.f57657e, x02, 1073741824);
        Paint paint = this.f58218e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f57657e, n6.x0(null, n6.f29597o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        xa xaVar = this.f58217c;
        xaVar.getClass();
        if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != f13 || ((PorterDuff.Mode) xaVar.d) != mode) {
            xaVar.f714c = new PorterDuffColorFilter(f13, mode);
            xaVar.f713b = f13;
            xaVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
        t.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f58221r;
        t.b(canvas, drawable, 1.0f - aVar2.f57657e);
        t.b(canvas, spVar, aVar2.f57657e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ri riVar = this.h;
        if (riVar != null) {
            riVar.invalidate();
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
