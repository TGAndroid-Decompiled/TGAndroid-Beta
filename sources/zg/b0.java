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
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.d61;
import org.telegram.ui.g70;
import org.telegram.ui.l61;
import org.telegram.ui.p51;
import org.telegram.ui.w51;
import org.telegram.ui.yn;
import org.telegram.ui.z51;
import w7.z5;
import yh.r2;
import yh.r5;
import yh.t3;
public final class b0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f53317a;
    public final WindowManager f53318b;
    public final t3 f53319c;
    public final boolean d;
    public float f53320e;
    public float f53322g;
    public float h;
    public float f53324j;
    public boolean f53325k;
    public boolean f53326l;
    public final x f53327m;
    public final sk0 f53328n;
    public final List f53329o;
    public lc0 f53330p;
    public boolean f53331q;
    public final n2 f53332r;
    public final d6 f53333s;
    public float f53334t;
    public float f53335u;
    public boolean v;
    public boolean f53336w;
    public ValueAnimator f53337x;
    public final int f53338y;
    public ch.d f53339z;
    public final RectF f53321f = new RectF();
    public final RectF f53323i = new RectF();

    public b0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, d6 d6Var, boolean z10) {
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
        this.f53338y = i10;
        this.f53329o = arrayList;
        this.f53332r = n2Var;
        this.f53333s = d6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = sk0Var.getContext();
        }
        Context context2 = context;
        t3 t3Var = new t3(this, context2);
        this.f53319c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f53317a = a0Var;
        boolean z13 = z11;
        int windowType = sk0Var.getWindowType();
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, n2Var, context2, windowType, z12, d6Var, sk0Var, n2Var);
        this.f53327m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = sk0Var.f30770f1;
        boolean z15 = sk0Var.f30772g1;
        if (xVar.K1 != z14) {
            xVar.K1 = z14;
            xVar.L1 = z15;
            z51 z51Var = xVar.f35315h0;
            if (z51Var != null) {
                z51Var.invalidate();
            }
            p51 p51Var = xVar.f35317i0;
            if (p51Var != null) {
                p51Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new n2.c(sk0Var, 28));
        xVar.setOnRecentClearedListener(new Object());
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions(hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
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
        t3Var.addView(a0Var, z5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().p())) {
            xVar.setBackgroundDelegate(new rg.x(20, this, sk0Var));
        }
        if (z13) {
            ((ViewGroup) sk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f53318b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.f53328n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new u(this, 0));
        sk0Var.f30759b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new r5(6, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        sk0 sk0Var = b0Var.f53328n;
        x xVar = b0Var.f53327m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            z51 z51Var = xVar.f35315h0;
            if (z10) {
                xVar.f35305d0.m(false);
                z51Var.invalidate();
                ArrayList arrayList = z51Var.f35946h3;
                z51Var.h1();
                xVar.f35311f0.b();
                xVar.sendAccessibilityEvent(32);
                sk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < z51Var.getChildCount()) {
                        if (z51Var.getChildAt(i10) instanceof l61) {
                            view = z51Var.getChildAt(i10);
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
                if (sk0Var.getPullingLeftProgress() > 0.0f) {
                    sk0Var.O0 = false;
                    ValueAnimator valueAnimator = sk0Var.f30798y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    m6 m6Var = sk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    sk0Var.invalidate();
                } else {
                    sk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = sk0Var.f30798y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    m6 m6Var2 = sk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    sk0Var.invalidate();
                }
                p51 p51Var = xVar.f35317i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d61 d61Var = (d61) arrayList.get(i11);
                    for (int i12 = 0; i12 < d61Var.O.size(); i12++) {
                        if (((l61) d61Var.O.get(i12)).f38172b) {
                            ((l61) d61Var.O.get(i12)).f38172b = false;
                            ((l61) d61Var.O.get(i12)).invalidate();
                            d61Var.k();
                        }
                    }
                }
                z51Var.invalidate();
                for (int i13 = 0; i13 < p51Var.f35946h3.size(); i13++) {
                    d61 d61Var2 = (d61) p51Var.f35946h3.get(i13);
                    for (int i14 = 0; i14 < d61Var2.O.size(); i14++) {
                        if (((l61) d61Var2.O.get(i14)).f38172b) {
                            ((l61) d61Var2.O.get(i14)).f38172b = false;
                            ((l61) d61Var2.O.get(i14)).invalidate();
                            d61Var2.k();
                        }
                    }
                }
                p51Var.invalidate();
                b0Var.i();
                b0Var.f53317a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof l61) {
            ((l61) view).setAnimatedScale(f7);
        } else if (view instanceof cw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f53338y;
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
        x xVar = this.f53327m;
        int i11 = this.f53338y;
        t3 t3Var = this.f53319c;
        int[] iArr = this.A;
        a0 a0Var = this.f53317a;
        RectF rectF = this.f53321f;
        sk0 sk0Var = this.f53328n;
        rectF.set(sk0Var.f30793w);
        this.f53320e = sk0Var.f30797y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (xVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = sk0Var.getTopOffset() + (dp - i10);
        if (sk0Var.F0) {
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
            this.f53334t = a0Var.getTranslationY();
        } else {
            this.f53334t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f53322g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        sk0Var.setCustomEmojiEnterProgress(this.f53324j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f53336w = z14;
            this.f53325k = false;
        } else {
            this.f53336w = false;
        }
        if (this.f53336w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        gw gwVar = xVar.f35305d0;
        if (z10 && this.f53336w) {
            z12 = true;
        } else {
            z12 = false;
        }
        gwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f53337x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f53324j;
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
            timeAnimator.f33663a = 0;
            timeAnimator.f33664b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f53337x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f53337x.addListener(new g70(17, this, z10));
        if (i11 == 4) {
            this.f53337x.setDuration(420L);
            this.f53337x.setInterpolator(tr.h);
        } else if (this.f53336w) {
            this.f53337x.setDuration(450L);
            this.f53337x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f53337x.setDuration(350L);
            this.f53337x.setInterpolator(tr.f31141f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.f53337x.setStartDelay(30L);
            this.f53337x.start();
        } else {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f53337x;
            Objects.requireNonNull(valueAnimator3);
            r2 r2Var = new r2(valueAnimator3, 10);
            e0.f53370f = this.f53336w;
            e0.f53369e = true;
            e0.f53371g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f53368c = r2Var;
        }
        HashSet hashSet = e0.f53366a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9847b == null) {
            z13 = true;
            cacheOutQueue.f9847b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f53367b = z13;
        e0.f53369e = false;
        e0.f53371g = false;
    }

    public final void d() {
        if (!this.f53331q) {
            sk0 sk0Var = this.f53328n;
            if (sk0Var != null) {
                ValueAnimator valueAnimator = sk0Var.f30798y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sk0Var.B0 = 0.0f;
                m6 m6Var = sk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                sk0Var.invalidate();
            }
            rc.e();
            this.f53331q = true;
            AndroidUtilities.hideKeyboard(this.f53319c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f53332r;
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f53331q) {
            rc.e();
            this.f53331q = true;
            t3 t3Var = this.f53319c;
            AndroidUtilities.hideKeyboard(t3Var);
            t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                n2 n2Var = this.f53332r;
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f53338y != 5) {
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
        x xVar = this.f53327m;
        xVar.f35315h0.setLayerType(i10, null);
        xVar.f35311f0.setLayerType(i10, null);
        if (this.f53336w) {
            for (int i11 = 0; i11 < Math.min(xVar.f35305d0.f26090b.getChildCount(), 16); i11++) {
                xVar.f35305d0.f26090b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        xVar.f35308e0.setLayerType(i10, null);
        xVar.f35305d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.f53327m;
            z51 z51Var = xVar.f35315h0;
            z51 z51Var2 = xVar.f35315h0;
            if (i10 < z51Var.getChildCount()) {
                if (z51Var2.getChildAt(i10) instanceof l61) {
                    l61 l61Var = (l61) z51Var2.getChildAt(i10);
                    if (l61Var.f38180x != null) {
                        l61Var.f38172b = false;
                        l61Var.invalidate();
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
        x xVar = this.f53327m;
        float y3 = xVar.getY();
        w51 w51Var = xVar.f35297a0;
        float y10 = w51Var.getY() + y3;
        z51 z51Var = xVar.f35315h0;
        int y11 = (int) (z51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = z51Var.getChildCount();
            rectF = this.f53323i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = z51Var.getChildAt(i10);
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
        int y12 = (int) (xVar.f35305d0.getY() + w51Var.getY() + xVar.getY());
        for (int i11 = 0; i11 < xVar.f35305d0.f26090b.getChildCount(); i11++) {
            View childAt2 = xVar.f35305d0.f26090b.getChildAt(i11);
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
            xVar.f35321k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f53338y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(tr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f53336w) {
            x xVar = this.f53327m;
            xVar.f35311f0.setAlpha(this.f53324j);
            xVar.f35315h0.setAlpha(this.f53324j);
            xVar.f35317i0.setAlpha(this.f53324j);
            xVar.f35305d0.setAlpha(this.f53324j);
            xVar.f35308e0.setAlpha(this.f53324j);
        }
    }

    public final void l() {
        float f7;
        x xVar = this.f53327m;
        w51 w51Var = xVar.f35297a0;
        w51 w51Var2 = xVar.f35297a0;
        boolean z10 = this.f53336w;
        a0 a0Var = this.f53317a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f53307f;
        }
        w51Var.setTranslationX(f7);
        w51Var2.setTranslationY(a0Var.h);
        w51Var2.setPivotX(a0Var.f53309r);
        w51Var2.setPivotY(a0Var.f53310s);
        w51Var2.setScaleX(a0Var.f53308n);
        w51Var2.setScaleY(a0Var.f53308n);
    }
}
