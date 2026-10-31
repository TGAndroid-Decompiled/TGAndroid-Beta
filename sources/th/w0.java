package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ou0;
public final class w0 implements us, lf.a {
    public static final ou0 X = new ou0(new rh.x6(25), new rh.x6(26));
    public static final ou0 Y = new ou0(new rh.x6(27), new rh.x6(28));
    public static final w0 Z;
    public m2.t D;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public jf.f L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public sg.v U;
    public vh.s2 V;
    public boolean W;
    public float f49549a;
    public WindowManager f49550b;
    public WindowManager.LayoutParams f49551c;
    public v0 d;
    public org.telegram.ui.Wallet.f6 e;
    public vh.s2 f49552f;
    public FrameLayout h;
    public g9 f49553n;
    public bn f49554r;
    public boolean f49555s;
    public s0 f49556w;
    public int f49557x;
    public ScaleGestureDetector f49558y;

    static {
        ?? obj = new Object();
        obj.f49549a = 1.4f;
        obj.f49555s = true;
        obj.M = 1.0f;
        obj.U = new sg.v(obj, 5);
        Z = obj;
    }

    public static void b() {
        Z.d(true);
    }

    public final void a() {
        Point point;
        float L;
        float f7;
        s0 s0Var = this.f49556w;
        if (s0Var != null) {
            s0Var.v(1.0f);
            vh.s2 s2Var = this.V;
            if (s2Var != null) {
                this.f49556w.s(s2Var.getSink());
            } else {
                this.f49556w.s(this.f49552f.getSink());
            }
        }
        if (this.f49555s) {
            this.f49554r.animate().cancel();
            ViewPropertyAnimator duration = this.f49554r.animate().alpha(0.0f).setDuration(150L);
            gr grVar = gr.f26495f;
            duration.setInterpolator(grVar).start();
            this.f49553n.animate().cancel();
            this.f49553n.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f49552f.animate().cancel();
            this.f49552f.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f49555s = false;
        }
        if (this.J == h() * this.M && this.K == f() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f49551c;
        int h = (int) (h() * this.M);
        this.J = h;
        layoutParams.width = h;
        WindowManager.LayoutParams layoutParams2 = this.f49551c;
        int f10 = (int) (f() * this.M);
        this.K = f10;
        layoutParams2.height = f10;
        org.telegram.messenger.i0.S3(this.f49550b, this.d, this.f49551c);
        o1.j jVar = this.P;
        float f11 = this.N;
        jVar.f13949b = f11;
        jVar.f13950c = true;
        o1.k kVar = jVar.f13957m;
        float A = a1.g.A(h(), this.M, 2.0f, f11);
        float f12 = org.telegram.messenger.i0.f16026q.x;
        if (A >= f12 / 2.0f) {
            L = (f12 - (h() * this.M)) - org.telegram.messenger.i0.L(16.0f);
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        kVar.f13964i = L;
        this.P.h();
        o1.j jVar2 = this.Q;
        jVar2.f13949b = this.O;
        jVar2.f13950c = true;
        jVar2.f13957m.f13964i = w7.u.a(f7, org.telegram.messenger.i0.L(16.0f), (point.y - (f() * this.M)) - org.telegram.messenger.i0.L(16.0f));
        this.Q.h();
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        a();
        this.W = true;
        this.f49550b.removeView(this.d);
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        if (this.S) {
            this.S = false;
            org.telegram.messenger.i0.h3(new r5.a(8), 100L);
            zs.f(this.f49557x).n(this, zs.G2);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                org.telegram.messenger.i0.r(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f26495f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new sg.y(3, this, z10));
            animatorSet.start();
            jf.f fVar = this.L;
            if (fVar != null) {
                fVar.c();
                this.L = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.D2) {
            b();
        } else if (i10 == zs.f19713w2) {
            a();
        }
    }

    public final float e() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = org.telegram.messenger.i0.f16026q;
            this.f49549a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / h();
        }
        return this.R.floatValue();
    }

    public final int f() {
        return (int) (e() * h());
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        jf.f fVar = this.L;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f49551c;
            int width = ((Rect) this.L.h.f10752a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f49551c;
            int height = ((Rect) this.L.h.f10752a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f49550b.addView(this.d, this.f49551c);
        this.d.invalidate();
        vh.s2 s2Var = this.V;
        if (s2Var != null) {
            s2Var.b();
            this.V = null;
        }
        a();
    }

    public final int h() {
        float min;
        float f7;
        if (e() >= 1.0f) {
            Point point = org.telegram.messenger.i0.f16026q;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.f16026q;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    @Override
    public final Bitmap i() {
        vh.s2 s2Var = this.V;
        if (s2Var != null && s2Var.a()) {
            return this.V.getBitmap();
        }
        return null;
    }

    public final void j(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(gr.f26495f);
        this.I.addUpdateListener(new qh.e0(this, 15));
        this.I.addListener(new sg.r(this, 5));
        this.I.start();
    }

    @Override
    public final Bitmap m() {
        vh.s2 s2Var = this.f49552f;
        if (s2Var != null && s2Var.a()) {
            return this.f49552f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final View r() {
        vh.s2 s2Var = new vh.s2(this.f49552f.getContext(), this.f49557x);
        this.V = s2Var;
        return s2Var;
    }

    @Override
    public final void l(Canvas canvas) {
    }

    @Override
    public final void n(Canvas canvas) {
    }
}
