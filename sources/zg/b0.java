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
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zv;
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
    public final a0 f49246a;
    public final WindowManager f49247b;
    public final t3 f49248c;
    public final boolean d;
    public float e;
    public float f49250g;
    public float h;
    public float f49252j;
    public boolean f49253k;
    public boolean f49254l;
    public final x f49255m;
    public final qk0 f49256n;
    public final List f49257o;
    public ic0 f49258p;
    public boolean f49259q;
    public final m2 f49260r;
    public final d6 f49261s;
    public float f49262t;
    public float f49263u;
    public boolean v;
    public boolean f49264w;
    public ValueAnimator f49265x;
    public final int f49266y;
    public ch.d f49267z;
    public final RectF f49249f = new RectF();
    public final RectF f49251i = new RectF();

    public b0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, qk0 qk0Var, d6 d6Var, boolean z10) {
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
        this.f49266y = i10;
        this.f49257o = arrayList;
        this.f49260r = m2Var;
        this.f49261s = d6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = qk0Var.getContext();
        }
        Context context2 = context;
        t3 t3Var = new t3(this, context2);
        this.f49248c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f49246a = a0Var;
        int windowType = qk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, m2Var, context2, windowType, z12, d6Var, qk0Var, m2Var);
        this.f49255m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = qk0Var.f27668f1;
        boolean z15 = qk0Var.f27670g1;
        if (xVar.K1 != z14) {
            xVar.K1 = z14;
            xVar.L1 = z15;
            x51 x51Var = xVar.f32028h0;
            if (x51Var != null) {
                x51Var.invalidate();
            }
            n51 n51Var = xVar.f32030i0;
            if (n51Var != null) {
                n51Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new z2.b(qk0Var));
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
        if (i10 == 1 || (qk0Var.getDelegate() != null && qk0Var.getDelegate().p())) {
            xVar.setBackgroundDelegate(new s5.e(19, this, qk0Var));
        }
        if (z13) {
            ((ViewGroup) qk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49247b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.f49256n = qk0Var;
        qk0Var.setOnSwitchedToLoopView(new u(this, 0));
        qk0Var.f27658b1 = true;
        qk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new z5(5, this, qk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        qk0 qk0Var = b0Var.f49256n;
        x xVar = b0Var.f49255m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            x51 x51Var = xVar.f32028h0;
            if (z10) {
                xVar.f32019d0.m(false);
                x51Var.invalidate();
                ArrayList arrayList = x51Var.f32582a3;
                x51Var.f1();
                xVar.f32024f0.b();
                xVar.sendAccessibilityEvent(32);
                qk0Var.setImportantForAccessibility(4);
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
                if (qk0Var.getPullingLeftProgress() > 0.0f) {
                    qk0Var.O0 = false;
                    ValueAnimator valueAnimator = qk0Var.f27696y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qk0Var.B0 = 0.0f;
                    m6 m6Var = qk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    qk0Var.invalidate();
                } else {
                    qk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = qk0Var.f27696y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    qk0Var.B0 = 0.0f;
                    m6 m6Var2 = qk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    qk0Var.invalidate();
                }
                n51 n51Var = xVar.f32030i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b61 b61Var = (b61) arrayList.get(i11);
                    for (int i12 = 0; i12 < b61Var.O.size(); i12++) {
                        if (((j61) b61Var.O.get(i12)).f34664b) {
                            ((j61) b61Var.O.get(i12)).f34664b = false;
                            ((j61) b61Var.O.get(i12)).invalidate();
                            b61Var.k();
                        }
                    }
                }
                x51Var.invalidate();
                for (int i13 = 0; i13 < n51Var.f32582a3.size(); i13++) {
                    b61 b61Var2 = (b61) n51Var.f32582a3.get(i13);
                    for (int i14 = 0; i14 < b61Var2.O.size(); i14++) {
                        if (((j61) b61Var2.O.get(i14)).f34664b) {
                            ((j61) b61Var2.O.get(i14)).f34664b = false;
                            ((j61) b61Var2.O.get(i14)).invalidate();
                            b61Var2.k();
                        }
                    }
                }
                n51Var.invalidate();
                b0Var.i();
                b0Var.f49246a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof j61) {
            ((j61) view).setAnimatedScale(f7);
        } else if (view instanceof zv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f49266y;
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
        x xVar = this.f49255m;
        int i11 = this.f49266y;
        t3 t3Var = this.f49248c;
        int[] iArr = this.A;
        a0 a0Var = this.f49246a;
        RectF rectF = this.f49249f;
        qk0 qk0Var = this.f49256n;
        rectF.set(qk0Var.f27691w);
        this.e = qk0Var.f27695y;
        int[] iArr2 = new int[2];
        if (z10) {
            qk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (xVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = qk0Var.getTopOffset() + (dp - i10);
        if (qk0Var.F0) {
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
            this.f49262t = a0Var.getTranslationY();
        } else {
            this.f49262t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f49250g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        qk0Var.setCustomEmojiEnterProgress(this.f49252j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49264w = z14;
            this.f49253k = false;
        } else {
            this.f49264w = false;
        }
        if (this.f49264w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        dw dwVar = xVar.f32019d0;
        if (z10 && this.f49264w) {
            z12 = true;
        } else {
            z12 = false;
        }
        dwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49265x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49252j;
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
            timeAnimator.f27208a = 0;
            timeAnimator.f27209b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49265x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49265x.addListener(new c70(17, this, z10));
        if (i11 == 4) {
            this.f49265x.setDuration(420L);
            this.f49265x.setInterpolator(rr.h);
        } else if (this.f49264w) {
            this.f49265x.setDuration(450L);
            this.f49265x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49265x.setDuration(350L);
            this.f49265x.setInterpolator(rr.f28031f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            qk0Var.O0 = true;
            qk0Var.invalidate();
            this.f49265x.setStartDelay(30L);
            this.f49265x.start();
        } else {
            qk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49265x;
            Objects.requireNonNull(valueAnimator3);
            r2 r2Var = new r2(valueAnimator3, 10);
            e0.f49294f = this.f49264w;
            e0.e = true;
            e0.f49295g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f49293c = r2Var;
        }
        HashSet hashSet = e0.f49291a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9047b == null) {
            z13 = true;
            cacheOutQueue.f9047b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f49292b = z13;
        e0.e = false;
        e0.f49295g = false;
    }

    public final void d() {
        if (!this.f49259q) {
            qk0 qk0Var = this.f49256n;
            if (qk0Var != null) {
                ValueAnimator valueAnimator = qk0Var.f27696y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qk0Var.B0 = 0.0f;
                m6 m6Var = qk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                qk0Var.invalidate();
            }
            qc.e();
            this.f49259q = true;
            AndroidUtilities.hideKeyboard(this.f49248c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f49260r;
                if (m2Var instanceof wn) {
                    ((wn) m2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49259q) {
            qc.e();
            this.f49259q = true;
            t3 t3Var = this.f49248c;
            AndroidUtilities.hideKeyboard(t3Var);
            t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                m2 m2Var = this.f49260r;
                if (m2Var instanceof wn) {
                    ((wn) m2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49266y != 5) {
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
        x xVar = this.f49255m;
        xVar.f32028h0.setLayerType(i10, null);
        xVar.f32024f0.setLayerType(i10, null);
        if (this.f49264w) {
            for (int i11 = 0; i11 < Math.min(xVar.f32019d0.f30651b.getChildCount(), 16); i11++) {
                xVar.f32019d0.f30651b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        xVar.f32021e0.setLayerType(i10, null);
        xVar.f32019d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.f49255m;
            x51 x51Var = xVar.f32028h0;
            x51 x51Var2 = xVar.f32028h0;
            if (i10 < x51Var.getChildCount()) {
                if (x51Var2.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var2.getChildAt(i10);
                    if (j61Var.f34671x != null) {
                        j61Var.f34664b = false;
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
        x xVar = this.f49255m;
        float y3 = xVar.getY();
        u51 u51Var = xVar.f32011a0;
        float y10 = u51Var.getY() + y3;
        x51 x51Var = xVar.f32028h0;
        int y11 = (int) (x51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x51Var.getChildCount();
            rectF = this.f49251i;
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
        int y12 = (int) (xVar.f32019d0.getY() + u51Var.getY() + xVar.getY());
        for (int i11 = 0; i11 < xVar.f32019d0.f30651b.getChildCount(); i11++) {
            View childAt2 = xVar.f32019d0.f30651b.getChildAt(i11);
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
            xVar.f32034k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49266y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(rr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f49264w) {
            x xVar = this.f49255m;
            xVar.f32024f0.setAlpha(this.f49252j);
            xVar.f32028h0.setAlpha(this.f49252j);
            xVar.f32030i0.setAlpha(this.f49252j);
            xVar.f32019d0.setAlpha(this.f49252j);
            xVar.f32021e0.setAlpha(this.f49252j);
        }
    }

    public final void l() {
        float f7;
        x xVar = this.f49255m;
        u51 u51Var = xVar.f32011a0;
        u51 u51Var2 = xVar.f32011a0;
        boolean z10 = this.f49264w;
        a0 a0Var = this.f49246a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f49237f;
        }
        u51Var.setTranslationX(f7);
        u51Var2.setTranslationY(a0Var.h);
        u51Var2.setPivotX(a0Var.f49239r);
        u51Var2.setPivotY(a0Var.f49240s);
        u51Var2.setScaleX(a0Var.f49238n);
        u51Var2.setScaleY(a0Var.f49238n);
    }
}
