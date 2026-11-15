package wi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.i9;
import c8.kd;
import fi.w2;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.g71;
import tg.y1;
import ug.x;
public final class h {
    public static final mt0 Q = new mt0(new x(21), new x(22));
    public static final mt0 R = new mt0(new x(23), new x(24));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public um0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final n f59381a;
    public final l f59382b;
    public final Activity f59383c;
    public WindowManager d;
    public boolean f59385f;
    public boolean f59386g;
    public org.telegram.ui.e h;
    public d f59387i;
    public o f59388j;
    public View f59389k;
    public ImageView f59390l;
    public d f59391m;
    public ImageView f59392n;
    public w2 f59393o;
    public ScaleGestureDetector f59394p;
    public ff f59395q;
    public boolean f59396r;
    public boolean f59397s;
    public View f59398t;
    public boolean f59399u;
    public ValueAnimator v;
    public boolean f59400w;
    public int f59401x;
    public int f59402y;
    public final WindowManager.LayoutParams f59384e = new WindowManager.LayoutParams();
    public float f59403z = 1.0f;
    public float A = 1.4f;
    public final m51 F = new m51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final e O = new e(this, 0);
    public final e P = new e(this, 1);

    public h(n nVar, Activity activity) {
        this.f59381a = nVar;
        this.f59382b = nVar.f59422a;
        this.f59383c = activity;
    }

    public static float e(float f10, float f11) {
        return i9.a(f10, m(), (g0.f23609q.y - f11) - m());
    }

    public static int i(float f10) {
        float f11;
        Point point = g0.f23609q;
        float min = Math.min(point.x, point.y);
        if (f10 >= 1.0f) {
            f11 = 0.35f;
        } else {
            f11 = 0.6f;
        }
        return (int) (min * f11);
    }

    public static void j(RectF rectF, int i7, int i10) {
        float f10;
        float m10;
        float m11;
        if (i7 > 0 && i10 > 0) {
            f10 = i10 / i7;
        } else {
            f10 = 0.5625f;
        }
        u7.i b10 = u7.i.b();
        float f11 = ((SharedPreferences) b10.f57880a).getFloat("scale_factor", 1.0f);
        float i11 = i(f10) * f11;
        float i12 = ((int) (i(f10) * f10)) * f11;
        SharedPreferences sharedPreferences = (SharedPreferences) b10.f57880a;
        float f12 = sharedPreferences.getFloat("x", -1.0f);
        float f13 = sharedPreferences.getFloat("y", -1.0f);
        if (f12 != -1.0f) {
            m10 = n(f12, i11);
        } else {
            m10 = (g0.f23609q.x - i11) - m();
        }
        if (f13 != -1.0f) {
            m11 = e(f13, i12);
        } else {
            m11 = m();
        }
        float f14 = m11 + g0.f23603m;
        rectF.set(m10, f14, i11 + m10, i12 + f14);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.f23609q.x;
        if (f12 >= i7 / 2.0f) {
            return (i7 - f11) - m();
        }
        return m();
    }

    public final void a() {
        boolean z10;
        Context context;
        int i7;
        if (this.f59386g) {
            return;
        }
        if (this.f59382b.p() && kd.a(this.f59383c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59385f = z10;
        if (z10) {
            context = t0.f26600b;
        } else {
            context = this.f59383c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.f59384e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f59385f) {
            if (Build.VERSION.SDK_INT >= 26) {
                i7 = 2038;
            } else {
                i7 = 2002;
            }
            layoutParams.type = i7;
        } else {
            layoutParams.type = 2;
        }
        layoutParams.flags = 520;
        layoutParams.dimAmount = 0.0f;
        layoutParams.width = this.f59401x;
        layoutParams.height = this.f59402y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            g0.x3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.f59384e);
            this.f59386g = true;
            l2.i.g("floating window added, overlay=" + this.f59385f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.f59396r && !this.f59394p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        l lVar = this.f59382b;
        if (!lVar.t0()) {
            return false;
        }
        long l10 = lVar.l();
        long duration = lVar.getDuration();
        if (l10 == -9223372036854775807L || duration < 15000) {
            return false;
        }
        return true;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f59400w) {
            g0.r(this.P);
            this.f59400w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.f59396r = false;
        this.f59398t = null;
        this.f59382b.G();
    }

    public final void f(vg.o oVar) {
        l();
        o oVar2 = this.f59388j;
        this.f59388j = null;
        if (oVar2 != null) {
            g0.E2(oVar2);
        }
        View view = this.f59389k;
        if (view != null) {
            g0.E2(view);
            this.f59389k = null;
        }
        oVar.run();
        if (oVar2 != null) {
            SurfaceTexture surfaceTexture = oVar2.f59428a;
            oVar2.f59428a = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public final void g(RectF rectF) {
        org.telegram.ui.e eVar = this.h;
        if (eVar != null && eVar.isAttachedToWindow()) {
            int[] iArr = new int[2];
            this.h.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            int i10 = iArr[1];
            rectF.set(i7, i10, i7 + this.f59401x, i10 + this.f59402y);
            return;
        }
        float f10 = this.B;
        float f11 = this.C + g0.f23603m;
        rectF.set(f10, f11, this.f59401x + f10, this.f59402y + f11);
    }

    public final int h() {
        float f10;
        l lVar = this.f59382b;
        int L = lVar.L();
        int b02 = lVar.b0();
        if (L > 0 && b02 > 0) {
            f10 = b02 / L;
        } else {
            f10 = 0.5625f;
        }
        return i(f10);
    }

    public final void k() {
        if (this.f59382b.h()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.f59386g) {
            return;
        }
        this.f59386g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o(boolean z10) {
        float f10;
        if (this.f59391m == null) {
            return;
        }
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.v = duration;
        duration.setInterpolator(er.f34420f);
        this.v.addUpdateListener(new y1(this, 7));
        this.v.addListener(new g71(this, 25));
        this.v.start();
    }

    public final void p() {
        if (this.f59392n == null) {
            return;
        }
        e eVar = this.O;
        g0.r(eVar);
        if (this.f59382b.h()) {
            this.f59392n.setImageResource(2131232545);
            g0.i3(eVar, 500L);
        } else if (this.H) {
            this.f59392n.setImageResource(2131232547);
        } else {
            this.f59392n.setImageResource(2131232546);
        }
    }

    public final void q() {
        if (this.f59393o != null && !this.H) {
            l lVar = this.f59382b;
            long duration = lVar.getDuration();
            if (duration > 0) {
                this.I = ((float) lVar.l()) / ((float) duration);
            }
            this.J = Math.max(this.J, lVar.c0());
            this.f59393o.invalidate();
        }
    }

    public final void r() {
        if (this.f59386g) {
            try {
                this.d.updateViewLayout(this.h, this.f59384e);
            } catch (IllegalArgumentException unused) {
                r1.g gVar = this.D;
                if (gVar != null) {
                    gVar.d();
                    this.E.d();
                }
            }
        }
    }
}
