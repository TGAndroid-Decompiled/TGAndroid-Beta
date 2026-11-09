package ti;

import ab.d0;
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
import c8.j9;
import c8.kc;
import di.b3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;
public final class i {
    public static final nt0 Q = new nt0(new s0.b(20), new s0.b(21));
    public static final nt0 R = new nt0(new s0.b(22), new s0.b(23));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public rm0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final o f56094a;
    public final m f56095b;
    public final Activity f56096c;
    public WindowManager d;
    public boolean f56098f;
    public boolean f56099g;
    public org.telegram.ui.e h;
    public e f56100i;
    public p f56101j;
    public View f56102k;
    public ImageView f56103l;
    public e f56104m;
    public ImageView f56105n;
    public b3 f56106o;
    public ScaleGestureDetector f56107p;
    public rt f56108q;
    public boolean f56109r;
    public boolean f56110s;
    public View f56111t;
    public boolean f56112u;
    public ValueAnimator v;
    public boolean f56113w;
    public int f56114x;
    public int f56115y;
    public final WindowManager.LayoutParams f56097e = new WindowManager.LayoutParams();
    public float f56116z = 1.0f;
    public float A = 1.4f;
    public final k51 F = new k51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final f O = new f(this, 0);
    public final f P = new f(this, 1);

    public i(o oVar, Activity activity) {
        this.f56094a = oVar;
        this.f56095b = oVar.f56135a;
        this.f56096c = activity;
    }

    public static float e(float f10, float f11) {
        return j9.a(f10, m(), (g0.f22563q.y - f11) - m());
    }

    public static int i(float f10) {
        float f11;
        Point point = g0.f22563q;
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
        d0 b10 = d0.b();
        float f11 = b10.f918a.getFloat("scale_factor", 1.0f);
        float i11 = i(f10) * f11;
        float i12 = ((int) (i(f10) * f10)) * f11;
        SharedPreferences sharedPreferences = b10.f918a;
        float f12 = sharedPreferences.getFloat("x", -1.0f);
        float f13 = sharedPreferences.getFloat("y", -1.0f);
        if (f12 != -1.0f) {
            m10 = n(f12, i11);
        } else {
            m10 = (g0.f22563q.x - i11) - m();
        }
        if (f13 != -1.0f) {
            m11 = e(f13, i12);
        } else {
            m11 = m();
        }
        float f14 = m11 + g0.f22557m;
        rectF.set(m10, f14, i11 + m10, i12 + f14);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.f22563q.x;
        if (f12 >= i7 / 2.0f) {
            return (i7 - f11) - m();
        }
        return m();
    }

    public final void a() {
        boolean z9;
        Context context;
        int i7;
        if (this.f56099g) {
            return;
        }
        if (this.f56095b.r() && kc.a(this.f56096c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f56098f = z9;
        if (z9) {
            context = t0.f25566b;
        } else {
            context = this.f56096c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.f56097e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f56098f) {
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
        layoutParams.width = this.f56114x;
        layoutParams.height = this.f56115y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            g0.y3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.f56097e);
            this.f56099g = true;
            l2.i.g("floating window added, overlay=" + this.f56098f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.f56109r && !this.f56107p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        m mVar = this.f56095b;
        if (!mVar.e0()) {
            return false;
        }
        long l10 = mVar.l();
        long duration = mVar.getDuration();
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
        if (this.f56113w) {
            g0.r(this.P);
            this.f56113w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.f56109r = false;
        this.f56111t = null;
        this.f56095b.F();
    }

    public final void f(sh.b bVar) {
        l();
        p pVar = this.f56101j;
        this.f56101j = null;
        if (pVar != null) {
            g0.E2(pVar);
        }
        View view = this.f56102k;
        if (view != null) {
            g0.E2(view);
            this.f56102k = null;
        }
        bVar.run();
        if (pVar != null) {
            SurfaceTexture surfaceTexture = pVar.f56141a;
            pVar.f56141a = null;
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
            rectF.set(i7, i10, i7 + this.f56114x, i10 + this.f56115y);
            return;
        }
        float f10 = this.B;
        float f11 = this.C + g0.f22557m;
        rectF.set(f10, f11, this.f56114x + f10, this.f56115y + f11);
    }

    public final int h() {
        float f10;
        m mVar = this.f56095b;
        int I = mVar.I();
        int U = mVar.U();
        if (I > 0 && U > 0) {
            f10 = U / I;
        } else {
            f10 = 0.5625f;
        }
        return i(f10);
    }

    public final void k() {
        if (this.f56095b.h()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.f56099g) {
            return;
        }
        this.f56099g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o(boolean z9) {
        float f10;
        if (this.f56104m == null) {
            return;
        }
        float f11 = 1.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.v = duration;
        duration.setInterpolator(xq.f40458f);
        this.v.addUpdateListener(new d(this, 0));
        this.v.addListener(new t81(this, 17));
        this.v.start();
    }

    public final void p() {
        if (this.f56105n == null) {
            return;
        }
        f fVar = this.O;
        g0.r(fVar);
        if (this.f56095b.h()) {
            this.f56105n.setImageResource(2131232544);
            g0.i3(fVar, 500L);
        } else if (this.H) {
            this.f56105n.setImageResource(2131232546);
        } else {
            this.f56105n.setImageResource(2131232545);
        }
    }

    public final void q() {
        if (this.f56106o != null && !this.H) {
            m mVar = this.f56095b;
            long duration = mVar.getDuration();
            if (duration > 0) {
                this.I = ((float) mVar.l()) / ((float) duration);
            }
            this.J = Math.max(this.J, mVar.V());
            this.f56106o.invalidate();
        }
    }

    public final void r() {
        if (this.f56099g) {
            try {
                this.d.updateViewLayout(this.h, this.f56097e);
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
