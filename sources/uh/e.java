package uh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.kg;
import cg.r;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class e extends th.c implements Drawable.Callback, qe.b {
    public final String f56357b;
    public final Drawable d;
    public final cp f56360f;
    public ai h;
    public TLRPC.WebPage f56361n;
    public final qe.a f56362r;
    public final qe.a f56363s;
    public final kg f56358c = new kg((char) 0, 19);
    public final Paint f56359e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f56360f = cpVar;
        xq xqVar = xq.h;
        this.f56362r = new qe.a(0, this, xqVar, 320L, false);
        this.f56363s = new qe.a(0, this, xqVar, 320L, false);
        this.f56357b = str;
        this.f55398a.J0(g0.L(7.0f));
        this.d = p1.g(t0.f25457b, 2131231745);
        cpVar.setCallback(this);
        cpVar.b(k6.x0(null, k6.f28082o7, false));
        cpVar.f32786a = g0.L(15.0f);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        ai aiVar = this.h;
        if (aiVar != null) {
            aiVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ai) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i3, int i10) {
        float f10 = i3;
        float f11 = i10;
        ImageReceiver imageReceiver = this.f55398a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f56360f;
        cpVar.setBounds(0, 0, i3, i10);
        int x02 = k6.x0(null, k6.f27824a7, false);
        qe.a aVar = this.f56363s;
        int f12 = i0.a.f(aVar.f53840e, x02, 1073741824);
        Paint paint = this.f56359e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f53840e, k6.x0(null, k6.f28082o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        kg kgVar = this.f56358c;
        kgVar.getClass();
        if (((PorterDuffColorFilter) kgVar.f2723c) == null || kgVar.f2722b != f13 || ((PorterDuff.Mode) kgVar.d) != mode) {
            kgVar.f2723c = new PorterDuffColorFilter(f13, mode);
            kgVar.f2722b = f13;
            kgVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) kgVar.f2723c);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        qe.a aVar2 = this.f56362r;
        r.b(canvas, drawable, 1.0f - aVar2.f53840e);
        r.b(canvas, cpVar, aVar2.f53840e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ai aiVar = this.h;
        if (aiVar != null) {
            aiVar.invalidate();
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
