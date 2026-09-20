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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.zv;
import org.telegram.ui.d61;
import org.telegram.ui.g61;
import org.telegram.ui.h70;
import org.telegram.ui.k61;
import org.telegram.ui.s61;
import org.telegram.ui.w51;
import org.telegram.ui.zn;
import w7.y5;
import yh.s2;
import yh.s5;
import yh.u3;
public final class b0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f49272a;
    public final WindowManager f49273b;
    public final u3 f49274c;
    public final boolean d;
    public float e;
    public float f49276g;
    public float h;
    public float f49278j;
    public boolean f49279k;
    public boolean f49280l;
    public final x f49281m;
    public final pk0 f49282n;
    public final List f49283o;
    public jc0 f49284p;
    public boolean f49285q;
    public final n2 f49286r;
    public final f6 f49287s;
    public float f49288t;
    public float f49289u;
    public boolean v;
    public boolean f49290w;
    public ValueAnimator f49291x;
    public final int f49292y;
    public ch.d f49293z;
    public final RectF f49275f = new RectF();
    public final RectF f49277i = new RectF();

    public b0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, pk0 pk0Var, f6 f6Var, boolean z10) {
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
        this.f49292y = i10;
        this.f49283o = arrayList;
        this.f49286r = n2Var;
        this.f49287s = f6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = pk0Var.getContext();
        }
        Context context2 = context;
        u3 u3Var = new u3(this, context2);
        this.f49274c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f49272a = a0Var;
        int windowType = pk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, n2Var, context2, windowType, z12, f6Var, pk0Var, n2Var);
        this.f49281m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = pk0Var.f27350f1;
        boolean z15 = pk0Var.f27352g1;
        if (xVar.K1 != z14) {
            xVar.K1 = z14;
            xVar.L1 = z15;
            g61 g61Var = xVar.f34792h0;
            if (g61Var != null) {
                g61Var.invalidate();
            }
            w51 w51Var = xVar.f34794i0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new z2.b(pk0Var));
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
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().r())) {
            xVar.setBackgroundDelegate(new s5.e(18, this, pk0Var));
        }
        if (z13) {
            ((ViewGroup) pk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49273b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.f49282n = pk0Var;
        pk0Var.setOnSwitchedToLoopView(new u(this, 0));
        pk0Var.f27340b1 = true;
        pk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new s5(6, this, pk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        pk0 pk0Var = b0Var.f49282n;
        x xVar = b0Var.f49281m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            g61 g61Var = xVar.f34792h0;
            if (z10) {
                xVar.f34783d0.m(false);
                g61Var.invalidate();
                ArrayList arrayList = g61Var.f35325a3;
                g61Var.g1();
                xVar.f34788f0.b();
                xVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < g61Var.getChildCount()) {
                        if (g61Var.getChildAt(i10) instanceof s61) {
                            view = g61Var.getChildAt(i10);
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
                if (pk0Var.getPullingLeftProgress() > 0.0f) {
                    pk0Var.O0 = false;
                    ValueAnimator valueAnimator = pk0Var.f27378y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n6 n6Var = pk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.f27378y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n6 n6Var2 = pk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                w51 w51Var = xVar.f34794i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k61 k61Var = (k61) arrayList.get(i11);
                    for (int i12 = 0; i12 < k61Var.O.size(); i12++) {
                        if (((s61) k61Var.O.get(i12)).f37307b) {
                            ((s61) k61Var.O.get(i12)).f37307b = false;
                            ((s61) k61Var.O.get(i12)).invalidate();
                            k61Var.k();
                        }
                    }
                }
                g61Var.invalidate();
                for (int i13 = 0; i13 < w51Var.f35325a3.size(); i13++) {
                    k61 k61Var2 = (k61) w51Var.f35325a3.get(i13);
                    for (int i14 = 0; i14 < k61Var2.O.size(); i14++) {
                        if (((s61) k61Var2.O.get(i14)).f37307b) {
                            ((s61) k61Var2.O.get(i14)).f37307b = false;
                            ((s61) k61Var2.O.get(i14)).invalidate();
                            k61Var2.k();
                        }
                    }
                }
                w51Var.invalidate();
                b0Var.i();
                b0Var.f49272a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof s61) {
            ((s61) view).setAnimatedScale(f7);
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
        int i11 = this.f49292y;
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
        x xVar = this.f49281m;
        int i11 = this.f49292y;
        u3 u3Var = this.f49274c;
        int[] iArr = this.A;
        a0 a0Var = this.f49272a;
        RectF rectF = this.f49275f;
        pk0 pk0Var = this.f49282n;
        rectF.set(pk0Var.f27373w);
        this.e = pk0Var.f27377y;
        int[] iArr2 = new int[2];
        if (z10) {
            pk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (xVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = pk0Var.getTopOffset() + (dp - i10);
        if (pk0Var.F0) {
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
            this.f49288t = a0Var.getTranslationY();
        } else {
            this.f49288t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f49276g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        pk0Var.setCustomEmojiEnterProgress(this.f49278j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49290w = z14;
            this.f49279k = false;
        } else {
            this.f49290w = false;
        }
        if (this.f49290w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        dw dwVar = xVar.f34783d0;
        if (z10 && this.f49290w) {
            z12 = true;
        } else {
            z12 = false;
        }
        dwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49291x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49278j;
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
            timeAnimator.f27055a = 0;
            timeAnimator.f27056b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49291x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49291x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f49291x.setDuration(420L);
            this.f49291x.setInterpolator(qr.h);
        } else if (this.f49290w) {
            this.f49291x.setDuration(450L);
            this.f49291x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49291x.setDuration(350L);
            this.f49291x.setInterpolator(qr.f27642f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            pk0Var.O0 = true;
            pk0Var.invalidate();
            this.f49291x.setStartDelay(30L);
            this.f49291x.start();
        } else {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49291x;
            Objects.requireNonNull(valueAnimator3);
            s2 s2Var = new s2(valueAnimator3, 10);
            e0.f49320f = this.f49290w;
            e0.e = true;
            e0.f49321g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f49319c = s2Var;
        }
        HashSet hashSet = e0.f49317a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9065b == null) {
            z13 = true;
            cacheOutQueue.f9065b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f49318b = z13;
        e0.e = false;
        e0.f49321g = false;
    }

    public final void d() {
        if (!this.f49285q) {
            pk0 pk0Var = this.f49282n;
            if (pk0Var != null) {
                ValueAnimator valueAnimator = pk0Var.f27378y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pk0Var.B0 = 0.0f;
                n6 n6Var = pk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                pk0Var.invalidate();
            }
            pc.e();
            this.f49285q = true;
            AndroidUtilities.hideKeyboard(this.f49274c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f49286r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49285q) {
            pc.e();
            this.f49285q = true;
            u3 u3Var = this.f49274c;
            AndroidUtilities.hideKeyboard(u3Var);
            u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                n2 n2Var = this.f49286r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49292y != 5) {
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
        x xVar = this.f49281m;
        xVar.f34792h0.setLayerType(i10, null);
        xVar.f34788f0.setLayerType(i10, null);
        if (this.f49290w) {
            for (int i11 = 0; i11 < Math.min(xVar.f34783d0.f30584b.getChildCount(), 16); i11++) {
                xVar.f34783d0.f30584b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        xVar.f34785e0.setLayerType(i10, null);
        xVar.f34783d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.f49281m;
            g61 g61Var = xVar.f34792h0;
            g61 g61Var2 = xVar.f34792h0;
            if (i10 < g61Var.getChildCount()) {
                if (g61Var2.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var2.getChildAt(i10);
                    if (s61Var.f37314x != null) {
                        s61Var.f37307b = false;
                        s61Var.invalidate();
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
        x xVar = this.f49281m;
        float y3 = xVar.getY();
        d61 d61Var = xVar.f34775a0;
        float y10 = d61Var.getY() + y3;
        g61 g61Var = xVar.f34792h0;
        int y11 = (int) (g61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g61Var.getChildCount();
            rectF = this.f49277i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = g61Var.getChildAt(i10);
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
        int y12 = (int) (xVar.f34783d0.getY() + d61Var.getY() + xVar.getY());
        for (int i11 = 0; i11 < xVar.f34783d0.f30584b.getChildCount(); i11++) {
            View childAt2 = xVar.f34783d0.f30584b.getChildAt(i11);
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
            xVar.f34798k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49292y == 4) {
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
        if (!this.f49290w) {
            x xVar = this.f49281m;
            xVar.f34788f0.setAlpha(this.f49278j);
            xVar.f34792h0.setAlpha(this.f49278j);
            xVar.f34794i0.setAlpha(this.f49278j);
            xVar.f34783d0.setAlpha(this.f49278j);
            xVar.f34785e0.setAlpha(this.f49278j);
        }
    }

    public final void l() {
        float f7;
        x xVar = this.f49281m;
        d61 d61Var = xVar.f34775a0;
        d61 d61Var2 = xVar.f34775a0;
        boolean z10 = this.f49290w;
        a0 a0Var = this.f49272a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f49263f;
        }
        d61Var.setTranslationX(f7);
        d61Var2.setTranslationY(a0Var.h);
        d61Var2.setPivotX(a0Var.f49265r);
        d61Var2.setPivotY(a0Var.f49266s);
        d61Var2.setScaleX(a0Var.f49264n);
        d61Var2.setScaleY(a0Var.f49264n);
    }
}
