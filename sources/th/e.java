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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.up;
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String f58227b;
    public final Drawable d;
    public final up f58230f;
    public ti h;
    public TLRPC.WebPage f58231n;
    public final te.a f58232r;
    public final te.a f58233s;
    public final xa f58228c = new xa((char) 0, 18);
    public final Paint f58229e = new Paint(1);

    public e(String str) {
        up upVar = new up(-1);
        this.f58230f = upVar;
        nr nrVar = nr.h;
        this.f58232r = new te.a(0, this, nrVar, 320L, false);
        this.f58233s = new te.a(0, this, nrVar, 320L, false);
        this.f58227b = str;
        this.f57441a.J0(g0.L(7.0f));
        this.d = i5.c.g(t0.f26895b, 2131231746);
        upVar.setCallback(this);
        upVar.b(m6.x0(null, m6.f29548o7, false));
        upVar.f40499a = g0.L(15.0f);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ti tiVar = this.h;
        if (tiVar != null) {
            tiVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ti) view;
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
        ImageReceiver imageReceiver = this.f57441a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        up upVar = this.f58230f;
        upVar.setBounds(0, 0, i7, i10);
        int x02 = m6.x0(null, m6.f29290a7, false);
        te.a aVar = this.f58233s;
        int f12 = i0.a.f(aVar.f57665e, x02, 1073741824);
        Paint paint = this.f58229e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f57665e, m6.x0(null, m6.f29548o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        xa xaVar = this.f58228c;
        xaVar.getClass();
        if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != f13 || ((PorterDuff.Mode) xaVar.d) != mode) {
            xaVar.f714c = new PorterDuffColorFilter(f13, mode);
            xaVar.f713b = f13;
            xaVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
        t.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f58232r;
        t.b(canvas, drawable, 1.0f - aVar2.f57665e);
        t.b(canvas, upVar, aVar2.f57665e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ti tiVar = this.h;
        if (tiVar != null) {
            tiVar.invalidate();
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
