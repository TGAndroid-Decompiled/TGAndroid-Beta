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
import c8.jc;
import di.b3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;
public final class i {
    public static final lt0 Q = new lt0(new s0.b(19), new s0.b(20));
    public static final lt0 R = new lt0(new s0.b(21), new s0.b(22));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public qm0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final o f55990a;
    public final m f55991b;
    public final Activity f55992c;
    public WindowManager d;
    public boolean f55994f;
    public boolean f55995g;
    public org.telegram.ui.e h;
    public e f55996i;
    public q f55997j;
    public View f55998k;
    public ImageView f55999l;
    public e f56000m;
    public ImageView f56001n;
    public b3 f56002o;
    public ScaleGestureDetector f56003p;
    public qt f56004q;
    public boolean f56005r;
    public boolean f56006s;
    public View f56007t;
    public boolean f56008u;
    public ValueAnimator v;
    public boolean f56009w;
    public int f56010x;
    public int f56011y;
    public final WindowManager.LayoutParams f55993e = new WindowManager.LayoutParams();
    public float f56012z = 1.0f;
    public float A = 1.4f;
    public final i51 F = new i51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final f O = new f(this, 0);
    public final f P = new f(this, 1);

    public i(o oVar, Activity activity) {
        this.f55990a = oVar;
        this.f55991b = oVar.f56031a;
        this.f55992c = activity;
    }

    public static float e(float f10, float f11) {
        return j9.a(f10, m(), (g0.f22537q.y - f11) - m());
    }

    public static int i(float f10) {
        float f11;
        Point point = g0.f22537q;
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
            m10 = (g0.f22537q.x - i11) - m();
        }
        if (f13 != -1.0f) {
            m11 = e(f13, i12);
        } else {
            m11 = m();
        }
        float f14 = m11 + g0.f22531m;
        rectF.set(m10, f14, i11 + m10, i12 + f14);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.f22537q.x;
        if (f12 >= i7 / 2.0f) {
            return (i7 - f11) - m();
        }
        return m();
    }

    public final void a() {
        boolean z9;
        Context context;
        int i7;
        if (this.f55995g) {
            return;
        }
        if (this.f55991b.r() && jc.a(this.f55992c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f55994f = z9;
        if (z9) {
            context = t0.f25555b;
        } else {
            context = this.f55992c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.f55993e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f55994f) {
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
        layoutParams.width = this.f56010x;
        layoutParams.height = this.f56011y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            g0.y3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.f55993e);
            this.f55995g = true;
            l2.i.g("floating window added, overlay=" + this.f55994f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.f56005r && !this.f56003p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        m mVar = this.f55991b;
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
        if (this.f56009w) {
            g0.r(this.P);
            this.f56009w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.f56005r = false;
        this.f56007t = null;
        this.f55991b.F();
    }

    public final void f(sg.t0 t0Var) {
        l();
        q qVar = this.f55997j;
        this.f55997j = null;
        if (qVar != null) {
            g0.E2(qVar);
        }
        View view = this.f55998k;
        if (view != null) {
            g0.E2(view);
            this.f55998k = null;
        }
        t0Var.run();
        if (qVar != null) {
            SurfaceTexture surfaceTexture = qVar.f56040a;
            qVar.f56040a = null;
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
            rectF.set(i7, i10, i7 + this.f56010x, i10 + this.f56011y);
            return;
        }
        float f10 = this.B;
        float f11 = this.C + g0.f22531m;
        rectF.set(f10, f11, this.f56010x + f10, this.f56011y + f11);
    }

    public final int h() {
        float f10;
        m mVar = this.f55991b;
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
        if (this.f55991b.h()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.f55995g) {
            return;
        }
        this.f55995g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o(boolean z9) {
        float f10;
        if (this.f56000m == null) {
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
        duration.setInterpolator(xq.f40329f);
        this.v.addUpdateListener(new d(this, 0));
        this.v.addListener(new r81(this, 17));
        this.v.start();
    }

    public final void p() {
        if (this.f56001n == null) {
            return;
        }
        f fVar = this.O;
        g0.r(fVar);
        if (this.f55991b.h()) {
            this.f56001n.setImageResource(2131232544);
            g0.i3(fVar, 500L);
        } else if (this.H) {
            this.f56001n.setImageResource(2131232546);
        } else {
            this.f56001n.setImageResource(2131232545);
        }
    }

    public final void q() {
        if (this.f56002o != null && !this.H) {
            m mVar = this.f55991b;
            long duration = mVar.getDuration();
            if (duration > 0) {
                this.I = ((float) mVar.l()) / ((float) duration);
            }
            this.J = Math.max(this.J, mVar.V());
            this.f56002o.invalidate();
        }
    }

    public final void r() {
        if (this.f55995g) {
            try {
                this.d.updateViewLayout(this.h, this.f55993e);
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
