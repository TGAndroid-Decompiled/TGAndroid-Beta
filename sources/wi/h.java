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
import c8.l9;
import c8.nd;
import fi.u2;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.k71;
import tg.x1;
import ug.x;
public final class h {
    public static final ut0 Q = new ut0(new x(22), new x(23));
    public static final ut0 R = new ut0(new x(24), new x(25));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public cn0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final n f59946a;
    public final l f59947b;
    public final Activity f59948c;
    public WindowManager d;
    public boolean f59950f;
    public boolean f59951g;
    public org.telegram.ui.e h;
    public d f59952i;
    public o f59953j;
    public View f59954k;
    public ImageView f59955l;
    public d f59956m;
    public ImageView f59957n;
    public u2 f59958o;
    public ScaleGestureDetector f59959p;
    public of f59960q;
    public boolean f59961r;
    public boolean f59962s;
    public View f59963t;
    public boolean f59964u;
    public ValueAnimator v;
    public boolean f59965w;
    public int f59966x;
    public int f59967y;
    public final WindowManager.LayoutParams f59949e = new WindowManager.LayoutParams();
    public float f59968z = 1.0f;
    public float A = 1.4f;
    public final x51 F = new x51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final e O = new e(this, 0);
    public final e P = new e(this, 1);

    public h(n nVar, Activity activity) {
        this.f59946a = nVar;
        this.f59947b = nVar.f59987a;
        this.f59948c = activity;
    }

    public static float e(float f10, float f11) {
        return l9.a(f10, m(), (g0.f24118q.y - f11) - m());
    }

    public static int i(float f10) {
        float f11;
        Point point = g0.f24118q;
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
        hn m12 = hn.m();
        float f11 = ((SharedPreferences) m12.f35933b).getFloat("scale_factor", 1.0f);
        float i11 = i(f10) * f11;
        float i12 = ((int) (i(f10) * f10)) * f11;
        SharedPreferences sharedPreferences = (SharedPreferences) m12.f35933b;
        float f12 = sharedPreferences.getFloat("x", -1.0f);
        float f13 = sharedPreferences.getFloat("y", -1.0f);
        if (f12 != -1.0f) {
            m10 = n(f12, i11);
        } else {
            m10 = (g0.f24118q.x - i11) - m();
        }
        if (f13 != -1.0f) {
            m11 = e(f13, i12);
        } else {
            m11 = m();
        }
        float f14 = m11 + g0.f24112m;
        rectF.set(m10, f14, i11 + m10, i12 + f14);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.f24118q.x;
        if (f12 >= i7 / 2.0f) {
            return (i7 - f11) - m();
        }
        return m();
    }

    public final void a() {
        boolean z10;
        Context context;
        int i7;
        if (this.f59951g) {
            return;
        }
        if (this.f59947b.p() && nd.a(this.f59948c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59950f = z10;
        if (z10) {
            context = t0.f26913b;
        } else {
            context = this.f59948c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.f59949e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f59950f) {
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
        layoutParams.width = this.f59966x;
        layoutParams.height = this.f59967y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            g0.w3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.f59949e);
            this.f59951g = true;
            l2.i.g("floating window added, overlay=" + this.f59950f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.f59961r && !this.f59959p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        l lVar = this.f59947b;
        if (!lVar.o0()) {
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
        if (this.f59965w) {
            g0.r(this.P);
            this.f59965w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.f59961r = false;
        this.f59963t = null;
        this.f59947b.H();
    }

    public final void f(v4.p pVar) {
        l();
        o oVar = this.f59953j;
        this.f59953j = null;
        if (oVar != null) {
            g0.E2(oVar);
        }
        View view = this.f59954k;
        if (view != null) {
            g0.E2(view);
            this.f59954k = null;
        }
        pVar.run();
        if (oVar != null) {
            SurfaceTexture surfaceTexture = oVar.f59993a;
            oVar.f59993a = null;
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
            rectF.set(i7, i10, i7 + this.f59966x, i10 + this.f59967y);
            return;
        }
        float f10 = this.B;
        float f11 = this.C + g0.f24112m;
        rectF.set(f10, f11, this.f59966x + f10, this.f59967y + f11);
    }

    public final int h() {
        float f10;
        l lVar = this.f59947b;
        int J = lVar.J();
        int a02 = lVar.a0();
        if (J > 0 && a02 > 0) {
            f10 = a02 / J;
        } else {
            f10 = 0.5625f;
        }
        return i(f10);
    }

    public final void k() {
        if (this.f59947b.h()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.f59951g) {
            return;
        }
        this.f59951g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o(boolean z10) {
        float f10;
        if (this.f59956m == null) {
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
        duration.setInterpolator(lr.f37208f);
        this.v.addUpdateListener(new x1(this, 7));
        this.v.addListener(new k71(this, 25));
        this.v.start();
    }

    public final void p() {
        if (this.f59957n == null) {
            return;
        }
        e eVar = this.O;
        g0.r(eVar);
        if (this.f59947b.h()) {
            this.f59957n.setImageResource(2131232546);
            g0.h3(eVar, 500L);
        } else if (this.H) {
            this.f59957n.setImageResource(2131232548);
        } else {
            this.f59957n.setImageResource(2131232547);
        }
    }

    public final void q() {
        if (this.f59958o != null && !this.H) {
            l lVar = this.f59947b;
            long duration = lVar.getDuration();
            if (duration > 0) {
                this.I = ((float) lVar.l()) / ((float) duration);
            }
            this.J = Math.max(this.J, lVar.b0());
            this.f59958o.invalidate();
        }
    }

    public final void r() {
        if (this.f59951g) {
            try {
                this.d.updateViewLayout(this.h, this.f59949e);
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
