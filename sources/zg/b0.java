package zg;

import ai.bb;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import ci.m6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.b61;
import org.telegram.ui.c70;
import org.telegram.ui.j61;
import org.telegram.ui.n51;
import org.telegram.ui.u51;
import org.telegram.ui.wn;
import org.telegram.ui.x51;
import w7.y5;
import yh.r2;
import yh.t3;
import yh.z5;
public final class b0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f49244a;
    public final WindowManager f49245b;
    public final t3 f49246c;
    public final boolean d;
    public float e;
    public float f49248g;
    public float h;
    public float f49250j;
    public boolean f49251k;
    public boolean f49252l;
    public final x f49253m;
    public final rk0 f49254n;
    public final List f49255o;
    public jc0 f49256p;
    public boolean f49257q;
    public final m2 f49258r;
    public final d6 f49259s;
    public float f49260t;
    public float f49261u;
    public boolean v;
    public boolean f49262w;
    public ValueAnimator f49263x;
    public final int f49264y;
    public ch.d f49265z;
    public final RectF f49247f = new RectF();
    public final RectF f49249i = new RectF();

    public b0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, rk0 rk0Var, d6 d6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f49264y = i10;
        this.f49255o = arrayList;
        this.f49258r = m2Var;
        this.f49259s = d6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = rk0Var.getContext();
        }
        Context context2 = context;
        t3 t3Var = new t3(this, context2);
        this.f49246c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f49244a = a0Var;
        int windowType = rk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, m2Var, context2, windowType, z12, d6Var, rk0Var, m2Var);
        this.f49253m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = rk0Var.f27963f1;
        boolean z15 = rk0Var.f27965g1;
        if (xVar.K1 != z14) {
            xVar.K1 = z14;
            xVar.L1 = z15;
            x51 x51Var = xVar.f32026h0;
            if (x51Var != null) {
                x51Var.invalidate();
            }
            n51 n51Var = xVar.f32028i0;
            if (n51Var != null) {
                n51Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new z2.b(rk0Var));
        xVar.setOnRecentClearedListener(new Object());
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions(hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            t3Var.setClipChildren(false);
            t3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        t3Var.addView(a0Var, y5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (rk0Var.getDelegate() != null && rk0Var.getDelegate().p())) {
            xVar.setBackgroundDelegate(new s5.e(19, this, rk0Var));
        }
        if (z13) {
            ((ViewGroup) rk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49245b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.f49254n = rk0Var;
        rk0Var.setOnSwitchedToLoopView(new u(this, 0));
        rk0Var.f27953b1 = true;
        rk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new z5(5, this, rk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        rk0 rk0Var = b0Var.f49254n;
        x xVar = b0Var.f49253m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            x51 x51Var = xVar.f32026h0;
            if (z10) {
                xVar.f32017d0.m(false);
                x51Var.invalidate();
                ArrayList arrayList = x51Var.f32580a3;
                x51Var.f1();
                xVar.f32022f0.b();
                xVar.sendAccessibilityEvent(32);
                rk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < x51Var.getChildCount()) {
                        if (x51Var.getChildAt(i10) instanceof j61) {
                            view = x51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    xVar.performAccessibilityAction(64, null);
                }
                if (rk0Var.getPullingLeftProgress() > 0.0f) {
                    rk0Var.O0 = false;
                    ValueAnimator valueAnimator = rk0Var.f27991y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    rk0Var.B0 = 0.0f;
                    m6 m6Var = rk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    rk0Var.invalidate();
                } else {
                    rk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = rk0Var.f27991y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    rk0Var.B0 = 0.0f;
                    m6 m6Var2 = rk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    rk0Var.invalidate();
                }
                n51 n51Var = xVar.f32028i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b61 b61Var = (b61) arrayList.get(i11);
                    for (int i12 = 0; i12 < b61Var.O.size(); i12++) {
                        if (((j61) b61Var.O.get(i12)).f34662b) {
                            ((j61) b61Var.O.get(i12)).f34662b = false;
                            ((j61) b61Var.O.get(i12)).invalidate();
                            b61Var.k();
                        }
                    }
                }
                x51Var.invalidate();
                for (int i13 = 0; i13 < n51Var.f32580a3.size(); i13++) {
                    b61 b61Var2 = (b61) n51Var.f32580a3.get(i13);
                    for (int i14 = 0; i14 < b61Var2.O.size(); i14++) {
                        if (((j61) b61Var2.O.get(i14)).f34662b) {
                            ((j61) b61Var2.O.get(i14)).f34662b = false;
                            ((j61) b61Var2.O.get(i14)).invalidate();
                            b61Var2.k();
                        }
                    }
                }
                n51Var.invalidate();
                b0Var.i();
                b0Var.f49244a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof j61) {
            ((j61) view).setAnimatedScale(f7);
        } else if (view instanceof aw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f49264y;
        if (i11 != 0 && i11 != 3) {
            i10 = 99;
        } else {
            i10 = 1000;
        }
        layoutParams.type = i10;
        layoutParams.softInputMode = 16;
        if (z10) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z10) {
        int i10;
        char c10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        x xVar = this.f49253m;
        int i11 = this.f49264y;
        t3 t3Var = this.f49246c;
        int[] iArr = this.A;
        a0 a0Var = this.f49244a;
        RectF rectF = this.f49247f;
        rk0 rk0Var = this.f49254n;
        rectF.set(rk0Var.f27986w);
        this.e = rk0Var.f27990y;
        int[] iArr2 = new int[2];
        if (z10) {
            rk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (xVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = rk0Var.getTopOffset() + (dp - i10);
        if (rk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f7 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            c10 = 1;
            a0Var.setTranslationX(((t3Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f49260t = a0Var.getTranslationY();
        } else {
            this.f49260t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f49248g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        rk0Var.setCustomEmojiEnterProgress(this.f49250j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49262w = z14;
            this.f49251k = false;
        } else {
            this.f49262w = false;
        }
        if (this.f49262w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        ew ewVar = xVar.f32017d0;
        if (z10 && this.f49262w) {
            z12 = true;
        } else {
            z12 = false;
        }
        ewVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49263x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49250j;
        if (i11 == 4) {
            if (z10) {
                f7 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f10, f7);
        } else {
            if (z10) {
                f7 = 1.0f;
            }
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f27512a = 0;
            timeAnimator.f27513b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49263x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49263x.addListener(new c70(17, this, z10));
        if (i11 == 4) {
            this.f49263x.setDuration(420L);
            this.f49263x.setInterpolator(sr.h);
        } else if (this.f49262w) {
            this.f49263x.setDuration(450L);
            this.f49263x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49263x.setDuration(350L);
            this.f49263x.setInterpolator(sr.f28339f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            rk0Var.O0 = true;
            rk0Var.invalidate();
            this.f49263x.setStartDelay(30L);
            this.f49263x.start();
        } else {
            rk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49263x;
            Objects.requireNonNull(valueAnimator3);
            r2 r2Var = new r2(valueAnimator3, 10);
            e0.f49292f = this.f49262w;
            e0.e = true;
            e0.f49293g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f49291c = r2Var;
        }
        HashSet hashSet = e0.f49289a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9047b == null) {
            z13 = true;
            cacheOutQueue.f9047b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f49290b = z13;
        e0.e = false;
        e0.f49293g = false;
    }

    public final void d() {
        if (!this.f49257q) {
            rk0 rk0Var = this.f49254n;
            if (rk0Var != null) {
                ValueAnimator valueAnimator = rk0Var.f27991y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                rk0Var.B0 = 0.0f;
                m6 m6Var = rk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                rk0Var.invalidate();
            }
            qc.e();
            this.f49257q = true;
            AndroidUtilities.hideKeyboard(this.f49246c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f49258r;
                if (m2Var instanceof wn) {
                    ((wn) m2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49257q) {
            qc.e();
            this.f49257q = true;
            t3 t3Var = this.f49246c;
            AndroidUtilities.hideKeyboard(t3Var);
            t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                m2 m2Var = this.f49258r;
                if (m2Var instanceof wn) {
                    ((wn) m2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49264y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new u(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        x xVar = this.f49253m;
        xVar.f32026h0.setLayerType(i10, null);
        xVar.f32022f0.setLayerType(i10, null);
        if (this.f49262w) {
            for (int i11 = 0; i11 < Math.min(xVar.f32017d0.f30927b.getChildCount(), 16); i11++) {
                xVar.f32017d0.f30927b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        xVar.f32019e0.setLayerType(i10, null);
        xVar.f32017d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.f49253m;
            x51 x51Var = xVar.f32026h0;
            x51 x51Var2 = xVar.f32026h0;
            if (i10 < x51Var.getChildCount()) {
                if (x51Var2.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var2.getChildAt(i10);
                    if (j61Var.f34669x != null) {
                        j61Var.f34662b = false;
                        j61Var.invalidate();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        x xVar = this.f49253m;
        float y3 = xVar.getY();
        u51 u51Var = xVar.f32009a0;
        float y10 = u51Var.getY() + y3;
        x51 x51Var = xVar.f32026h0;
        int y11 = (int) (x51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x51Var.getChildCount();
            rectF = this.f49249i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = x51Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight < rectF.bottom && measuredHeight > rectF.top && f7 != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                } else {
                    g(childAt, 0.0f);
                    z11 = true;
                }
            }
            i10++;
        }
        int y12 = (int) (xVar.f32017d0.getY() + u51Var.getY() + xVar.getY());
        for (int i11 = 0; i11 < xVar.f32017d0.f30927b.getChildCount(); i11++) {
            View childAt2 = xVar.f32017d0.f30927b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 < rectF.bottom && measuredHeight2 > rectF.top && f7 != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                } else {
                    g(childAt2, 0.0f);
                    z11 = true;
                }
            }
        }
        if (z11) {
            xVar.f32032k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49264y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(sr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f49262w) {
            x xVar = this.f49253m;
            xVar.f32022f0.setAlpha(this.f49250j);
            xVar.f32026h0.setAlpha(this.f49250j);
            xVar.f32028i0.setAlpha(this.f49250j);
            xVar.f32017d0.setAlpha(this.f49250j);
            xVar.f32019e0.setAlpha(this.f49250j);
        }
    }

    public final void l() {
        float f7;
        x xVar = this.f49253m;
        u51 u51Var = xVar.f32009a0;
        u51 u51Var2 = xVar.f32009a0;
        boolean z10 = this.f49262w;
        a0 a0Var = this.f49244a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f49235f;
        }
        u51Var.setTranslationX(f7);
        u51Var2.setTranslationY(a0Var.h);
        u51Var2.setPivotX(a0Var.f49237r);
        u51Var2.setPivotY(a0Var.f49238s);
        u51Var2.setScaleX(a0Var.f49236n);
        u51Var2.setScaleY(a0Var.f49236n);
    }
}
