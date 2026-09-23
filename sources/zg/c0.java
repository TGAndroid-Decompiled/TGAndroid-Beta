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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zv;
import org.telegram.ui.a61;
import org.telegram.ui.e70;
import org.telegram.ui.i61;
import org.telegram.ui.m51;
import org.telegram.ui.t51;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import w7.x5;
import yh.u3;
import yh.w2;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f48927a;
    public final WindowManager f48928b;
    public final u3 f48929c;
    public final boolean d;
    public float e;
    public float f48931g;
    public float h;
    public float f48933j;
    public boolean f48934k;
    public boolean f48935l;
    public final y f48936m;
    public final gk0 f48937n;
    public final List f48938o;
    public ac0 f48939p;
    public boolean f48940q;
    public final n2 f48941r;
    public final d6 f48942s;
    public float f48943t;
    public float f48944u;
    public boolean v;
    public boolean f48945w;
    public ValueAnimator f48946x;
    public final int f48947y;
    public ch.d f48948z;
    public final RectF f48930f = new RectF();
    public final RectF f48932i = new RectF();

    public c0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, gk0 gk0Var, d6 d6Var, boolean z10) {
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
        this.f48947y = i10;
        this.f48938o = arrayList;
        this.f48941r = n2Var;
        this.f48942s = d6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = gk0Var.getContext();
        }
        Context context2 = context;
        u3 u3Var = new u3(this, context2);
        this.f48929c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f48927a = b0Var;
        int windowType = gk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, n2Var, context2, windowType, z12, d6Var, gk0Var, n2Var);
        this.f48936m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = gk0Var.f24333f1;
        boolean z15 = gk0Var.f24335g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            w51 w51Var = yVar.f40021h0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
            m51 m51Var = yVar.f40023i0;
            if (m51Var != null) {
                m51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new v8.s(gk0Var));
        yVar.setOnRecentClearedListener(new Object());
        yVar.setRecentReactions(arrayList);
        yVar.setSelectedReactions(hashSet);
        yVar.setDrawBackground(false);
        yVar.s(null);
        b0Var.addView(yVar, x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            b0Var.setClipChildren(false);
            b0Var.setClipToPadding(false);
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        u3Var.addView(b0Var, x5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (gk0Var.getDelegate() != null && gk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(18, this, gk0Var));
        }
        if (z13) {
            ((ViewGroup) gk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f48928b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.f48937n = gk0Var;
        gk0Var.setOnSwitchedToLoopView(new u(this, 0));
        gk0Var.f24323b1 = true;
        gk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(0, this, gk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        gk0 gk0Var = c0Var.f48937n;
        y yVar = c0Var.f48936m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            w51 w51Var = yVar.f40021h0;
            if (z10) {
                yVar.f40012d0.m(false);
                w51Var.invalidate();
                ArrayList arrayList = w51Var.f31975a3;
                w51Var.f1();
                yVar.f40017f0.b();
                yVar.sendAccessibilityEvent(32);
                gk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < w51Var.getChildCount()) {
                        if (w51Var.getChildAt(i10) instanceof i61) {
                            view = w51Var.getChildAt(i10);
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
                    yVar.performAccessibilityAction(64, null);
                }
                if (gk0Var.getPullingLeftProgress() > 0.0f) {
                    gk0Var.O0 = false;
                    ValueAnimator valueAnimator = gk0Var.f24361y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    m6 m6Var = gk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    gk0Var.invalidate();
                } else {
                    gk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gk0Var.f24361y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    m6 m6Var2 = gk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    gk0Var.invalidate();
                }
                m51 m51Var = yVar.f40023i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a61 a61Var = (a61) arrayList.get(i11);
                    for (int i12 = 0; i12 < a61Var.O.size(); i12++) {
                        if (((i61) a61Var.O.get(i12)).f34034b) {
                            ((i61) a61Var.O.get(i12)).f34034b = false;
                            ((i61) a61Var.O.get(i12)).invalidate();
                            a61Var.k();
                        }
                    }
                }
                w51Var.invalidate();
                for (int i13 = 0; i13 < m51Var.f31975a3.size(); i13++) {
                    a61 a61Var2 = (a61) m51Var.f31975a3.get(i13);
                    for (int i14 = 0; i14 < a61Var2.O.size(); i14++) {
                        if (((i61) a61Var2.O.get(i14)).f34034b) {
                            ((i61) a61Var2.O.get(i14)).f34034b = false;
                            ((i61) a61Var2.O.get(i14)).invalidate();
                            a61Var2.k();
                        }
                    }
                }
                m51Var.invalidate();
                c0Var.i();
                c0Var.f48927a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof i61) {
            ((i61) view).setAnimatedScale(f7);
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
        int i11 = this.f48947y;
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
        y yVar = this.f48936m;
        int i11 = this.f48947y;
        u3 u3Var = this.f48929c;
        int[] iArr = this.A;
        b0 b0Var = this.f48927a;
        RectF rectF = this.f48930f;
        gk0 gk0Var = this.f48937n;
        rectF.set(gk0Var.f24356w);
        this.e = gk0Var.f24360y;
        int[] iArr2 = new int[2];
        if (z10) {
            gk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (yVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = gk0Var.getTopOffset() + (dp - i10);
        if (gk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
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
            b0Var.setTranslationX(((u3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f48943t = b0Var.getTranslationY();
        } else {
            this.f48943t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f48931g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        gk0Var.setCustomEmojiEnterProgress(this.f48933j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f48945w = z14;
            this.f48934k = false;
        } else {
            this.f48945w = false;
        }
        if (this.f48945w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        dw dwVar = yVar.f40012d0;
        if (z10 && this.f48945w) {
            z12 = true;
        } else {
            z12 = false;
        }
        dwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f48946x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f48933j;
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
            timeAnimator.f23479a = 0;
            timeAnimator.f23480b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f48946x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f48946x.addListener(new e70(17, this, z10));
        if (i11 == 4) {
            this.f48946x.setDuration(420L);
            this.f48946x.setInterpolator(rr.h);
        } else if (this.f48945w) {
            this.f48946x.setDuration(450L);
            this.f48946x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f48946x.setDuration(350L);
            this.f48946x.setInterpolator(rr.f27701f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            gk0Var.O0 = true;
            gk0Var.invalidate();
            this.f48946x.setStartDelay(30L);
            this.f48946x.start();
        } else {
            gk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f48946x;
            Objects.requireNonNull(valueAnimator3);
            w2 w2Var = new w2(valueAnimator3, 9);
            f0.f48969f = this.f48945w;
            f0.e = true;
            f0.f48970g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f48968c = w2Var;
        }
        HashSet hashSet = f0.f48966a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9048b == null) {
            z13 = true;
            cacheOutQueue.f9048b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f48967b = z13;
        f0.e = false;
        f0.f48970g = false;
    }

    public final void d() {
        if (!this.f48940q) {
            gk0 gk0Var = this.f48937n;
            if (gk0Var != null) {
                ValueAnimator valueAnimator = gk0Var.f24361y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                gk0Var.B0 = 0.0f;
                m6 m6Var = gk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                gk0Var.invalidate();
            }
            qc.e();
            this.f48940q = true;
            AndroidUtilities.hideKeyboard(this.f48929c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f48941r;
                if (n2Var instanceof xn) {
                    ((xn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f48940q) {
            qc.e();
            this.f48940q = true;
            u3 u3Var = this.f48929c;
            AndroidUtilities.hideKeyboard(u3Var);
            u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                n2 n2Var = this.f48941r;
                if (n2Var instanceof xn) {
                    ((xn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f48947y != 5) {
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
        y yVar = this.f48936m;
        yVar.f40021h0.setLayerType(i10, null);
        yVar.f40017f0.setLayerType(i10, null);
        if (this.f48945w) {
            for (int i11 = 0; i11 < Math.min(yVar.f40012d0.f26443b.getChildCount(), 16); i11++) {
                yVar.f40012d0.f26443b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f40014e0.setLayerType(i10, null);
        yVar.f40012d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f48936m;
            w51 w51Var = yVar.f40021h0;
            w51 w51Var2 = yVar.f40021h0;
            if (i10 < w51Var.getChildCount()) {
                if (w51Var2.getChildAt(i10) instanceof i61) {
                    i61 i61Var = (i61) w51Var2.getChildAt(i10);
                    if (i61Var.f34041x != null) {
                        i61Var.f34034b = false;
                        i61Var.invalidate();
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
        y yVar = this.f48936m;
        float y3 = yVar.getY();
        t51 t51Var = yVar.f40004a0;
        float y10 = t51Var.getY() + y3;
        w51 w51Var = yVar.f40021h0;
        int y11 = (int) (w51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = w51Var.getChildCount();
            rectF = this.f48932i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = w51Var.getChildAt(i10);
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
        int y12 = (int) (yVar.f40012d0.getY() + t51Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f40012d0.f26443b.getChildCount(); i11++) {
            View childAt2 = yVar.f40012d0.f26443b.getChildAt(i11);
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
            yVar.f40027k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f48947y == 4) {
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
        if (!this.f48945w) {
            y yVar = this.f48936m;
            yVar.f40017f0.setAlpha(this.f48933j);
            yVar.f40021h0.setAlpha(this.f48933j);
            yVar.f40023i0.setAlpha(this.f48933j);
            yVar.f40012d0.setAlpha(this.f48933j);
            yVar.f40014e0.setAlpha(this.f48933j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f48936m;
        t51 t51Var = yVar.f40004a0;
        t51 t51Var2 = yVar.f40004a0;
        boolean z10 = this.f48945w;
        b0 b0Var = this.f48927a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f48913f;
        }
        t51Var.setTranslationX(f7);
        t51Var2.setTranslationY(b0Var.h);
        t51Var2.setPivotX(b0Var.f48915r);
        t51Var2.setPivotY(b0Var.f48916s);
        t51Var2.setScaleX(b0Var.f48914n);
        t51Var2.setScaleY(b0Var.f48914n);
    }
}
