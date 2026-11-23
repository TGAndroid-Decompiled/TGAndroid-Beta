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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.si;
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String f58342b;
    public final Drawable d;
    public final rp f58345f;
    public si h;
    public TLRPC.WebPage f58346n;
    public final te.a f58347r;
    public final te.a f58348s;
    public final xa f58343c = new xa((char) 0, 18);
    public final Paint f58344e = new Paint(1);

    public e(String str) {
        rp rpVar = new rp(-1);
        this.f58345f = rpVar;
        kr krVar = kr.h;
        this.f58347r = new te.a(0, this, krVar, 320L, false);
        this.f58348s = new te.a(0, this, krVar, 320L, false);
        this.f58342b = str;
        this.f57552a.K0(g0.L(7.0f));
        this.d = i5.c.g(t0.f27013b, 2131231749);
        rpVar.setCallback(this);
        rpVar.b(n6.x0(null, n6.f29652o7, false));
        rpVar.f39371a = g0.L(15.0f);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        si siVar = this.h;
        if (siVar != null) {
            siVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (si) view;
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
        ImageReceiver imageReceiver = this.f57552a;
        imageReceiver.z0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        rp rpVar = this.f58345f;
        rpVar.setBounds(0, 0, i7, i10);
        int x02 = n6.x0(null, n6.f29394a7, false);
        te.a aVar = this.f58348s;
        int f12 = i0.a.f(aVar.f57779e, x02, 1073741824);
        Paint paint = this.f58344e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.f57779e, n6.x0(null, n6.f29652o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        xa xaVar = this.f58343c;
        xaVar.getClass();
        if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != f13 || ((PorterDuff.Mode) xaVar.d) != mode) {
            xaVar.f714c = new PorterDuffColorFilter(f13, mode);
            xaVar.f713b = f13;
            xaVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
        t.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.f58347r;
        t.b(canvas, drawable, 1.0f - aVar2.f57779e);
        t.b(canvas, rpVar, aVar2.f57779e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        si siVar = this.h;
        if (siVar != null) {
            siVar.invalidate();
        }
    }

    @Override
    public final void G(float f10, int i7) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
