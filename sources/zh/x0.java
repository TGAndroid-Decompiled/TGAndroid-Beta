package zh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;
public final class x0 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final sv0 X = new sv0(new z9.a(9), new z9.a(10));
    public static final sv0 Y = new sv0(new z9.a(11), new z9.a(12));
    public static final x0 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public pf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public xh.x U;
    public bi.f5 V;
    public boolean W;
    public float f49025a;
    public WindowManager f49026b;
    public WindowManager.LayoutParams f49027c;
    public w0 d;
    public xh.a7 e;
    public bi.f5 f49028f;
    public FrameLayout h;
    public w9 f49029n;
    public vh.h f49030r;
    public boolean f49031s;
    public t0 v;
    public int f49032w;
    public ScaleGestureDetector f49033x;
    public l2.h f49034y;

    static {
        ?? obj = new Object();
        obj.f49025a = 1.4f;
        obj.f49031s = true;
        obj.M = 1.0f;
        obj.U = new xh.x(obj, 21);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    public static void o(Activity activity, t0 t0Var) {
        Context context;
        x0 x0Var = Z;
        if (t0Var != null && !x0Var.S) {
            x0Var.S = true;
            x0Var.v = t0Var;
            int i10 = t0Var.e;
            x0Var.f49032w = i10;
            NotificationCenter.getInstance(i10).addObserver(x0Var, NotificationCenter.liveStoryUpdated);
            x0Var.J = x0Var.n();
            x0Var.K = x0Var.m();
            x0Var.M = 1.0f;
            x0Var.H = false;
            o1.k kVar = new o1.k(x0Var, X);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f14134u = lVar;
            x0Var.P = kVar;
            o1.k kVar2 = new o1.k(x0Var, Y);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f14134u = lVar2;
            x0Var.Q = kVar2;
            if (activity != null) {
                context = activity;
            } else {
                context = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
            x0Var.f49033x = scaleGestureDetector;
            int i11 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i11 >= 23) {
                x0Var.f49033x.setStylusScaleEnabled(false);
            }
            x0Var.f49034y = new l2.h(context, new v0(scaledTouchSlop));
            xh.a7 a7Var = new xh.a7(context);
            a7Var.f45251b = new Path();
            x0Var.e = a7Var;
            ?? viewGroup = new ViewGroup(context);
            x0Var.d = viewGroup;
            viewGroup.addView(x0Var.e, w7.a6.c(-1.0f, -1));
            x0Var.e.setOutlineProvider(new bi.g(22));
            x0Var.e.setClipToOutline(true);
            x0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17990gg, false));
            w9 w9Var = new w9(context);
            x0Var.f49029n = w9Var;
            x0Var.e.addView(w9Var, w7.a6.c(-1.0f, -1));
            bi.f5 f5Var = new bi.f5(context, x0Var.f49032w);
            x0Var.f49028f = f5Var;
            f5Var.setAlpha(0.0f);
            x0Var.e.addView(x0Var.f49028f, w7.a6.c(-1.0f, -1));
            vh.h hVar = new vh.h(context, 1);
            x0Var.f49030r = hVar;
            x0Var.e.addView(hVar, w7.a6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            x0Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            x0Var.h.addView(view, w7.a6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i12 = org.telegram.ui.ActionBar.j6.f18007hg;
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            int i13 = org.telegram.ui.ActionBar.j6.f18017i6;
            imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new bi.d5(28));
            float f7 = 38;
            float f10 = 4;
            x0Var.h.addView(imageView, w7.a6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new xh.s1(4, t0Var, context));
            x0Var.h.addView(imageView2, w7.a6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            x0Var.e.addView(x0Var.h, w7.a6.c(-1.0f, -1));
            x0Var.f49026b = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(context, false);
            x0Var.f49027c = b10;
            int i14 = x0Var.J;
            b10.width = i14;
            b10.height = x0Var.K;
            float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
            x0Var.N = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = x0Var.f49027c;
            float dp3 = (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f);
            x0Var.O = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = x0Var.f49027c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            x0Var.d.setAlpha(0.0f);
            x0Var.d.setScaleX(0.1f);
            x0Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(x0Var.f49026b, x0Var.d, x0Var.f49027c);
            x0Var.f49026b.addView(x0Var.d, x0Var.f49027c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f28819f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(x0Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(x0Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(x0Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new f10(2));
            animatorSet.start();
            x0Var.i();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = x0Var.L;
            if (eVar != null) {
                eVar.c();
                x0Var.L = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, x0Var);
                dVar.f39911c = "pip-live-story";
                dVar.e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f39915j = x0Var.d;
                dVar.f39916k = x0Var.f49028f.getPlaceholderView();
                x0Var.L = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.f49026b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.L;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f49027c;
            int width = this.L.h.f41839a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f49027c;
            int height = this.L.h.f41839a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f49026b.addView(this.d, this.f49027c);
        this.d.invalidate();
        bi.f5 f5Var = this.V;
        if (f5Var != null) {
            f5Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        bi.f5 f5Var = this.V;
        if (f5Var != null && f5Var.a()) {
            return this.V.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override
    public final Bitmap e() {
        bi.f5 f5Var = this.f49028f;
        if (f5Var != null && f5Var.a()) {
            return this.f49028f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        bi.f5 f5Var = new bi.f5(this.f49028f.getContext(), this.f49032w);
        this.V = f5Var;
        return f5Var;
    }

    public final void i() {
        float dp;
        float f7;
        t0 t0Var = this.v;
        if (t0Var != null) {
            t0Var.v(1.0f);
            bi.f5 f5Var = this.V;
            if (f5Var != null) {
                this.v.s(f5Var.getSink());
            } else {
                this.v.s(this.f49028f.getSink());
            }
        }
        if (this.f49031s) {
            this.f49030r.animate().cancel();
            ViewPropertyAnimator duration = this.f49030r.animate().alpha(0.0f).setDuration(150L);
            wr wrVar = wr.f28819f;
            duration.setInterpolator(wrVar).start();
            this.f49029n.animate().cancel();
            this.f49029n.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.f49028f.animate().cancel();
            this.f49028f.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.f49031s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f49027c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f49027c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f49026b, this.d, this.f49027c);
        o1.k kVar = this.P;
        float f10 = this.N;
        kVar.f14125b = f10;
        kVar.f14126c = true;
        o1.l lVar = kVar.f14134u;
        float A = a4.a.A(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (A >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f14140i = dp;
        this.P.f();
        o1.k kVar2 = this.Q;
        kVar2.f14125b = this.O;
        kVar2.f14126c = true;
        kVar2.f14134u.f14140i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(16), 100L);
            NotificationCenter.getInstance(this.f49032w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                AndroidUtilities.cancelRunOnUIThread(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f28819f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new iw0(16, this, z10));
            animatorSet.start();
            pf.e eVar = this.L;
            if (eVar != null) {
                eVar.c();
                this.L = null;
            }
        }
    }

    public final float l() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f49025a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.R.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f7;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void p(boolean z10) {
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
        duration.setInterpolator(wr.f28819f);
        this.I.addUpdateListener(new qg.o(this, 20));
        this.I.addListener(new yg.b(this, 6));
        this.I.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
