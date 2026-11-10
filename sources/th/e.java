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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.wq;
public final class e extends sh.d implements Drawable.Callback, te.b {
    public final String f56064b;
    public final Drawable d;
    public final cp f56067f;
    public bi h;
    public TLRPC.WebPage f56068n;
    public final te.a f56069r;
    public final te.a f56070s;
    public final wa f56065c = new wa((char) 0, 18);
    public final Paint f56066e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f56067f = cpVar;
        wq wqVar = wq.h;
        this.f56069r = new te.a(0, this, wqVar, 320L, false);
        this.f56070s = new te.a(0, this, wqVar, 320L, false);
        this.f56064b = str;
        this.f55305a.J0(g0.L(7.0f));
        this.d = jg.g.h(t0.f25570b, 2131231745);
        cpVar.setCallback(this);
        cpVar.b(m6.x0(null, m6.f28091o7, false));
        cpVar.f32725a = g0.L(15.0f);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        bi biVar = this.h;
        if (biVar != null) {
            biVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (bi) view;
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
        ImageReceiver imageReceiver = this.f55305a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f56067f;
        cpVar.setBounds(0, 0, i7, i10);
        int x02 = m6.x0(null, m6.f27834a7, false);
        te.a aVar = this.f56070s;
        int f12 = i0.a.f(aVar.f55498e, x02, 1073741824);
        Paint paint = this.f56066e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f55498e, m6.x0(null, m6.f28091o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        wa waVar = this.f56065c;
        waVar.getClass();
        if (((PorterDuffColorFilter) waVar.f701c) == null || waVar.f700b != f13 || ((PorterDuff.Mode) waVar.d) != mode) {
            waVar.f701c = new PorterDuffColorFilter(f13, mode);
            waVar.f700b = f13;
            waVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) waVar.f701c);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f56069r;
        s.b(canvas, drawable, 1.0f - aVar2.f55498e);
        s.b(canvas, cpVar, aVar2.f55498e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        bi biVar = this.h;
        if (biVar != null) {
            biVar.invalidate();
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
