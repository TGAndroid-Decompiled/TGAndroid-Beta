package th;

import a8.xa;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lp;
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String f57649b;
    public final Drawable d;
    public final lp f57652f;
    public ji h;
    public TLRPC.WebPage f57653n;
    public final te.a f57654r;
    public final te.a f57655s;
    public final xa f57650c = new xa((char) 0, 18);
    public final Paint f57651e = new Paint(1);

    public e(String str) {
        lp lpVar = new lp(-1);
        this.f57652f = lpVar;
        er erVar = er.h;
        this.f57654r = new te.a(0, this, erVar, 320L, false);
        this.f57655s = new te.a(0, this, erVar, 320L, false);
        this.f57649b = str;
        this.f56857a.J0(g0.L(7.0f));
        this.d = i5.c.g(t0.f26600b, 2131231745);
        lpVar.setCallback(this);
        lpVar.b(j6.x0(null, j6.f29050o7, false));
        lpVar.f36868a = g0.L(15.0f);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ji jiVar = this.h;
        if (jiVar != null) {
            jiVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ji) view;
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
        ImageReceiver imageReceiver = this.f56857a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        lp lpVar = this.f57652f;
        lpVar.setBounds(0, 0, i7, i10);
        int x02 = j6.x0(null, j6.f28792a7, false);
        te.a aVar = this.f57655s;
        int f12 = i0.a.f(aVar.f57081e, x02, 1073741824);
        Paint paint = this.f57651e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f57081e, j6.x0(null, j6.f29050o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        xa xaVar = this.f57650c;
        xaVar.getClass();
        if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != f13 || ((PorterDuff.Mode) xaVar.d) != mode) {
            xaVar.f714c = new PorterDuffColorFilter(f13, mode);
            xaVar.f713b = f13;
            xaVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f57654r;
        s.b(canvas, drawable, 1.0f - aVar2.f57081e);
        s.b(canvas, lpVar, aVar2.f57081e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ji jiVar = this.h;
        if (jiVar != null) {
            jiVar.invalidate();
        }
    }

    @Override
    public final void E(float f10, int i7) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
