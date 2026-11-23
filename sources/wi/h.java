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
import c8.m9;
import c8.od;
import fi.u2;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.i71;
import tg.c2;
import ug.u1;
import ug.x;
public final class h {
    public static final wt0 Q = new wt0(new x(22), new x(23));
    public static final wt0 R = new wt0(new x(24), new x(25));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public en0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final n f60074a;
    public final l f60075b;
    public final Activity f60076c;
    public WindowManager d;
    public boolean f60078f;
    public boolean f60079g;
    public org.telegram.ui.e h;
    public d f60080i;
    public o f60081j;
    public View f60082k;
    public ImageView f60083l;
    public d f60084m;
    public ImageView f60085n;
    public u2 f60086o;
    public ScaleGestureDetector f60087p;
    public aa f60088q;
    public boolean f60089r;
    public boolean f60090s;
    public View f60091t;
    public boolean f60092u;
    public ValueAnimator v;
    public boolean f60093w;
    public int f60094x;
    public int f60095y;
    public final WindowManager.LayoutParams f60077e = new WindowManager.LayoutParams();
    public float f60096z = 1.0f;
    public float A = 1.4f;
    public final z51 F = new z51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final e O = new e(this, 0);
    public final e P = new e(this, 1);

    public h(n nVar, Activity activity) {
        this.f60074a = nVar;
        this.f60075b = nVar.f60115a;
        this.f60076c = activity;
    }

    public static float e(float f10, float f11) {
        return m9.a(f10, m(), (g0.f24226q.y - f11) - m());
    }

    public static int i(float f10) {
        float f11;
        Point point = g0.f24226q;
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
        aa F2 = aa.F2();
        float f11 = ((SharedPreferences) F2.f30491b).getFloat("scale_factor", 1.0f);
        float i11 = i(f10) * f11;
        float i12 = ((int) (i(f10) * f10)) * f11;
        SharedPreferences sharedPreferences = (SharedPreferences) F2.f30491b;
        float f12 = sharedPreferences.getFloat("x", -1.0f);
        float f13 = sharedPreferences.getFloat("y", -1.0f);
        if (f12 != -1.0f) {
            m10 = n(f12, i11);
        } else {
            m10 = (g0.f24226q.x - i11) - m();
        }
        if (f13 != -1.0f) {
            m11 = e(f13, i12);
        } else {
            m11 = m();
        }
        float f14 = m11 + g0.f24220m;
        rectF.set(m10, f14, i11 + m10, i12 + f14);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.f24226q.x;
        if (f12 >= i7 / 2.0f) {
            return (i7 - f11) - m();
        }
        return m();
    }

    public final void a() {
        boolean z10;
        Context context;
        int i7;
        if (this.f60079g) {
            return;
        }
        if (this.f60075b.f0() && od.a(this.f60076c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f60078f = z10;
        if (z10) {
            context = t0.f27013b;
        } else {
            context = this.f60076c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.f60077e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f60078f) {
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
        layoutParams.width = this.f60094x;
        layoutParams.height = this.f60095y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            g0.w3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.f60077e);
            this.f60079g = true;
            l2.j.g("floating window added, overlay=" + this.f60078f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.f60089r && !this.f60087p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        l lVar = this.f60075b;
        if (!lVar.C2()) {
            return false;
        }
        long n10 = lVar.n();
        long duration = lVar.getDuration();
        if (n10 == -9223372036854775807L || duration < 15000) {
            return false;
        }
        return true;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f60093w) {
            g0.r(this.P);
            this.f60093w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.f60089r = false;
        this.f60091t = null;
        this.f60075b.T0();
    }

    public final void f(u1 u1Var) {
        l();
        o oVar = this.f60081j;
        this.f60081j = null;
        if (oVar != null) {
            g0.E2(oVar);
        }
        View view = this.f60082k;
        if (view != null) {
            g0.E2(view);
            this.f60082k = null;
        }
        u1Var.run();
        if (oVar != null) {
            SurfaceTexture surfaceTexture = oVar.f60121a;
            oVar.f60121a = null;
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
            rectF.set(i7, i10, i7 + this.f60094x, i10 + this.f60095y);
            return;
        }
        float f10 = this.B;
        float f11 = this.C + g0.f24220m;
        rectF.set(f10, f11, this.f60094x + f10, this.f60095y + f11);
    }

    public final int h() {
        float f10;
        l lVar = this.f60075b;
        int b12 = lVar.b1();
        int V1 = lVar.V1();
        if (b12 > 0 && V1 > 0) {
            f10 = V1 / b12;
        } else {
            f10 = 0.5625f;
        }
        return i(f10);
    }

    public final void k() {
        if (this.f60075b.j()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.f60079g) {
            return;
        }
        this.f60079g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o(boolean z10) {
        float f10;
        if (this.f60084m == null) {
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
        duration.setInterpolator(kr.f36858f);
        this.v.addUpdateListener(new c2(this, 7));
        this.v.addListener(new i71(this, 25));
        this.v.start();
    }

    public final void p() {
        if (this.f60085n == null) {
            return;
        }
        e eVar = this.O;
        g0.r(eVar);
        if (this.f60075b.j()) {
            this.f60085n.setImageResource(2131232549);
            g0.h3(eVar, 500L);
        } else if (this.H) {
            this.f60085n.setImageResource(2131232551);
        } else {
            this.f60085n.setImageResource(2131232550);
        }
    }

    public final void q() {
        if (this.f60086o != null && !this.H) {
            l lVar = this.f60075b;
            long duration = lVar.getDuration();
            if (duration > 0) {
                this.I = ((float) lVar.n()) / ((float) duration);
            }
            this.J = Math.max(this.J, lVar.d2());
            this.f60086o.invalidate();
        }
    }

    public final void r() {
        if (this.f60079g) {
            try {
                this.d.updateViewLayout(this.h, this.f60077e);
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
