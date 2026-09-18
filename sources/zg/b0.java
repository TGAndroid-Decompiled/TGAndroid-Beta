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
import ci.n6;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yv;
import org.telegram.ui.a61;
import org.telegram.ui.d61;
import org.telegram.ui.h61;
import org.telegram.ui.h70;
import org.telegram.ui.p61;
import org.telegram.ui.t51;
import org.telegram.ui.zn;
import w7.y5;
import yh.u3;
import yh.w2;
import yh.x7;
public final class b0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f49226a;
    public final WindowManager f49227b;
    public final u3 f49228c;
    public final boolean d;
    public float e;
    public float f49230g;
    public float h;
    public float f49232j;
    public boolean f49233k;
    public boolean f49234l;
    public final x f49235m;
    public final qk0 f49236n;
    public final List f49237o;
    public kc0 f49238p;
    public boolean f49239q;
    public final n2 f49240r;
    public final e6 f49241s;
    public float f49242t;
    public float f49243u;
    public boolean v;
    public boolean f49244w;
    public ValueAnimator f49245x;
    public final int f49246y;
    public ch.d f49247z;
    public final RectF f49229f = new RectF();
    public final RectF f49231i = new RectF();

    public b0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, qk0 qk0Var, e6 e6Var, boolean z10) {
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
        this.f49246y = i10;
        this.f49237o = arrayList;
        this.f49240r = n2Var;
        this.f49241s = e6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = qk0Var.getContext();
        }
        Context context2 = context;
        u3 u3Var = new u3(this, context2);
        this.f49228c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f49226a = a0Var;
        boolean z13 = z11;
        int windowType = qk0Var.getWindowType();
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, n2Var, context2, windowType, z12, e6Var, qk0Var, n2Var);
        this.f49235m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = qk0Var.f27649f1;
        boolean z15 = qk0Var.f27651g1;
        if (xVar.K1 != z14) {
            xVar.K1 = z14;
            xVar.L1 = z15;
            d61 d61Var = xVar.f33728h0;
            if (d61Var != null) {
                d61Var.invalidate();
            }
            t51 t51Var = xVar.f33730i0;
            if (t51Var != null) {
                t51Var.invalidate();
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
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        u3Var.addView(a0Var, y5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (qk0Var.getDelegate() != null && qk0Var.getDelegate().r())) {
            xVar.setBackgroundDelegate(new s5.e(18, this, qk0Var));
        }
        if (z13) {
            ((ViewGroup) qk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49227b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.f49236n = qk0Var;
        qk0Var.setOnSwitchedToLoopView(new u(this, 0));
        qk0Var.f27639b1 = true;
        qk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new x7(4, this, qk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        qk0 qk0Var = b0Var.f49236n;
        x xVar = b0Var.f49235m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            d61 d61Var = xVar.f33728h0;
            if (z10) {
                xVar.f33719d0.m(false);
                d61Var.invalidate();
                ArrayList arrayList = d61Var.f34436a3;
                d61Var.g1();
                xVar.f33724f0.b();
                xVar.sendAccessibilityEvent(32);
                qk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < d61Var.getChildCount()) {
                        if (d61Var.getChildAt(i10) instanceof p61) {
                            view = d61Var.getChildAt(i10);
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
                    ValueAnimator valueAnimator = qk0Var.f27677y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qk0Var.B0 = 0.0f;
                    n6 n6Var = qk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    qk0Var.invalidate();
                } else {
                    qk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = qk0Var.f27677y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    qk0Var.B0 = 0.0f;
                    n6 n6Var2 = qk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    qk0Var.invalidate();
                }
                t51 t51Var = xVar.f33730i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    h61 h61Var = (h61) arrayList.get(i11);
                    for (int i12 = 0; i12 < h61Var.O.size(); i12++) {
                        if (((p61) h61Var.O.get(i12)).f36352b) {
                            ((p61) h61Var.O.get(i12)).f36352b = false;
                            ((p61) h61Var.O.get(i12)).invalidate();
                            h61Var.k();
                        }
                    }
                }
                d61Var.invalidate();
                for (int i13 = 0; i13 < t51Var.f34436a3.size(); i13++) {
                    h61 h61Var2 = (h61) t51Var.f34436a3.get(i13);
                    for (int i14 = 0; i14 < h61Var2.O.size(); i14++) {
                        if (((p61) h61Var2.O.get(i14)).f36352b) {
                            ((p61) h61Var2.O.get(i14)).f36352b = false;
                            ((p61) h61Var2.O.get(i14)).invalidate();
                            h61Var2.k();
                        }
                    }
                }
                t51Var.invalidate();
                b0Var.i();
                b0Var.f49226a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof p61) {
            ((p61) view).setAnimatedScale(f7);
        } else if (view instanceof yv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f49246y;
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
        x xVar = this.f49235m;
        int i11 = this.f49246y;
        u3 u3Var = this.f49228c;
        int[] iArr = this.A;
        a0 a0Var = this.f49226a;
        RectF rectF = this.f49229f;
        qk0 qk0Var = this.f49236n;
        rectF.set(qk0Var.f27672w);
        this.e = qk0Var.f27676y;
        int[] iArr2 = new int[2];
        if (z10) {
            qk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
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
        if (a0Var.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - a0Var.getMeasuredHeight();
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
            a0Var.setTranslationX(((u3Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f49242t = a0Var.getTranslationY();
        } else {
            this.f49242t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f49230g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        qk0Var.setCustomEmojiEnterProgress(this.f49232j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49244w = z14;
            this.f49233k = false;
        } else {
            this.f49244w = false;
        }
        if (this.f49244w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        cw cwVar = xVar.f33719d0;
        if (z10 && this.f49244w) {
            z12 = true;
        } else {
            z12 = false;
        }
        cwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49245x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49232j;
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
            timeAnimator.f27330a = 0;
            timeAnimator.f27331b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49245x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49245x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f49245x.setDuration(420L);
            this.f49245x.setInterpolator(qr.h);
        } else if (this.f49244w) {
            this.f49245x.setDuration(450L);
            this.f49245x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49245x.setDuration(350L);
            this.f49245x.setInterpolator(qr.f27715f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            qk0Var.O0 = true;
            qk0Var.invalidate();
            this.f49245x.setStartDelay(30L);
            this.f49245x.start();
        } else {
            qk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49245x;
            Objects.requireNonNull(valueAnimator3);
            w2 w2Var = new w2(valueAnimator3, 9);
            e0.f49274f = this.f49244w;
            e0.e = true;
            e0.f49275g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f49273c = w2Var;
        }
        HashSet hashSet = e0.f49271a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9064b == null) {
            z13 = true;
            cacheOutQueue.f9064b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f49272b = z13;
        e0.e = false;
        e0.f49275g = false;
    }

    public final void d() {
        if (!this.f49239q) {
            qk0 qk0Var = this.f49236n;
            if (qk0Var != null) {
                ValueAnimator valueAnimator = qk0Var.f27677y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qk0Var.B0 = 0.0f;
                n6 n6Var = qk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                qk0Var.invalidate();
            }
            qc.e();
            this.f49239q = true;
            AndroidUtilities.hideKeyboard(this.f49228c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f49240r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49239q) {
            qc.e();
            this.f49239q = true;
            u3 u3Var = this.f49228c;
            AndroidUtilities.hideKeyboard(u3Var);
            u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                n2 n2Var = this.f49240r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49246y != 5) {
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
        x xVar = this.f49235m;
        xVar.f33728h0.setLayerType(i10, null);
        xVar.f33724f0.setLayerType(i10, null);
        if (this.f49244w) {
            for (int i11 = 0; i11 < Math.min(xVar.f33719d0.f30846b.getChildCount(), 16); i11++) {
                xVar.f33719d0.f30846b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        xVar.f33721e0.setLayerType(i10, null);
        xVar.f33719d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.f49235m;
            d61 d61Var = xVar.f33728h0;
            d61 d61Var2 = xVar.f33728h0;
            if (i10 < d61Var.getChildCount()) {
                if (d61Var2.getChildAt(i10) instanceof p61) {
                    p61 p61Var = (p61) d61Var2.getChildAt(i10);
                    if (p61Var.f36359x != null) {
                        p61Var.f36352b = false;
                        p61Var.invalidate();
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
        x xVar = this.f49235m;
        float y3 = xVar.getY();
        a61 a61Var = xVar.f33711a0;
        float y10 = a61Var.getY() + y3;
        d61 d61Var = xVar.f33728h0;
        int y11 = (int) (d61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = d61Var.getChildCount();
            rectF = this.f49231i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = d61Var.getChildAt(i10);
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
        int y12 = (int) (xVar.f33719d0.getY() + a61Var.getY() + xVar.getY());
        for (int i11 = 0; i11 < xVar.f33719d0.f30846b.getChildCount(); i11++) {
            View childAt2 = xVar.f33719d0.f30846b.getChildAt(i11);
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
            xVar.f33734k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49246y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f49244w) {
            x xVar = this.f49235m;
            xVar.f33724f0.setAlpha(this.f49232j);
            xVar.f33728h0.setAlpha(this.f49232j);
            xVar.f33730i0.setAlpha(this.f49232j);
            xVar.f33719d0.setAlpha(this.f49232j);
            xVar.f33721e0.setAlpha(this.f49232j);
        }
    }

    public final void l() {
        float f7;
        x xVar = this.f49235m;
        a61 a61Var = xVar.f33711a0;
        a61 a61Var2 = xVar.f33711a0;
        boolean z10 = this.f49244w;
        a0 a0Var = this.f49226a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f49217f;
        }
        a61Var.setTranslationX(f7);
        a61Var2.setTranslationY(a0Var.h);
        a61Var2.setPivotX(a0Var.f49219r);
        a61Var2.setPivotY(a0Var.f49220s);
        a61Var2.setScaleX(a0Var.f49218n);
        a61Var2.setScaleY(a0Var.f49218n);
    }
}
