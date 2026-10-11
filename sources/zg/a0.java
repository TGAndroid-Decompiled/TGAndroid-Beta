package zg;

import ai.cb;
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
import org.telegram.messenger.ai;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pw;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tw;
import org.telegram.ui.d61;
import org.telegram.ui.f70;
import org.telegram.ui.g61;
import org.telegram.ui.k61;
import org.telegram.ui.s61;
import org.telegram.ui.w51;
import org.telegram.ui.zn;
import w7.x5;
import yh.e5;
import yh.i8;
public final class a0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z f54536a;
    public final WindowManager f54537b;
    public final xh.m f54538c;
    public final boolean d;
    public float f54539e;
    public float f54541g;
    public float h;
    public float f54543j;
    public boolean f54544k;
    public boolean f54545l;
    public final w f54546m;
    public final ml0 f54547n;
    public final List f54548o;
    public cd0 f54549p;
    public boolean f54550q;
    public final m2 f54551r;
    public final d6 f54552s;
    public float f54553t;
    public float f54554u;
    public boolean v;
    public boolean f54555w;
    public ValueAnimator f54556x;
    public final int f54557y;
    public ch.d f54558z;
    public final RectF f54540f = new RectF();
    public final RectF f54542i = new RectF();

    public a0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, ml0 ml0Var, d6 d6Var, boolean z10) {
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
        this.f54557y = i10;
        this.f54548o = arrayList;
        this.f54551r = m2Var;
        this.f54552s = d6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = ml0Var.getContext();
        }
        Context context2 = context;
        xh.m mVar = new xh.m(this, context2);
        this.f54538c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f54536a = zVar;
        int windowType = ml0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, m2Var, context2, windowType, z12, d6Var, ml0Var, m2Var);
        this.f54546m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = ml0Var.f28766f1;
        boolean z15 = ml0Var.f28768g1;
        if (wVar.K1 != z14) {
            wVar.K1 = z14;
            wVar.L1 = z15;
            g61 g61Var = wVar.f38894h0;
            if (g61Var != null) {
                g61Var.invalidate();
            }
            w51 w51Var = wVar.f38896i0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new w3.b(ml0Var));
        wVar.setOnRecentClearedListener(new na.d(29));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions(hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        zVar.addView(wVar, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            zVar.setClipChildren(false);
            zVar.setClipToPadding(false);
            mVar.setClipChildren(false);
            mVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        mVar.addView(zVar, x5.a(-1.0f, f7, f7, f7, 16.0f, -1, i12));
        mVar.setClipChildren(false);
        if (i10 == 1 || (ml0Var.getDelegate() != null && ml0Var.getDelegate().v())) {
            wVar.setBackgroundDelegate(new q9.p(24, this, ml0Var));
        }
        if (z13) {
            ((ViewGroup) ml0Var.getParent()).addView(mVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f54537b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.f54547n = ml0Var;
        ml0Var.setOnSwitchedToLoopView(new u(this, 0));
        ml0Var.f28755b1 = true;
        ml0Var.invalidate();
        AndroidUtilities.runOnUIThread(new e5(7, this, ml0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        ml0 ml0Var = a0Var.f54547n;
        w wVar = a0Var.f54546m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            g61 g61Var = wVar.f38894h0;
            if (z10) {
                wVar.f38884d0.m(false);
                g61Var.invalidate();
                ArrayList arrayList = g61Var.Y2;
                g61Var.f1();
                wVar.f38890f0.b();
                wVar.sendAccessibilityEvent(32);
                ml0Var.setImportantForAccessibility(4);
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
                    wVar.performAccessibilityAction(64, null);
                }
                if (ml0Var.getPullingLeftProgress() > 0.0f) {
                    ml0Var.O0 = false;
                    ValueAnimator valueAnimator = ml0Var.f28794y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ml0Var.B0 = 0.0f;
                    m6 m6Var = ml0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    ml0Var.invalidate();
                } else {
                    ml0Var.O0 = true;
                    ValueAnimator valueAnimator2 = ml0Var.f28794y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ml0Var.B0 = 0.0f;
                    m6 m6Var2 = ml0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    ml0Var.invalidate();
                }
                w51 w51Var = wVar.f38896i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k61 k61Var = (k61) arrayList.get(i11);
                    for (int i12 = 0; i12 < k61Var.O.size(); i12++) {
                        if (((s61) k61Var.O.get(i12)).f41601b) {
                            ((s61) k61Var.O.get(i12)).f41601b = false;
                            ((s61) k61Var.O.get(i12)).invalidate();
                            k61Var.k();
                        }
                    }
                }
                g61Var.invalidate();
                for (int i13 = 0; i13 < w51Var.Y2.size(); i13++) {
                    k61 k61Var2 = (k61) w51Var.Y2.get(i13);
                    for (int i14 = 0; i14 < k61Var2.O.size(); i14++) {
                        if (((s61) k61Var2.O.get(i14)).f41601b) {
                            ((s61) k61Var2.O.get(i14)).f41601b = false;
                            ((s61) k61Var2.O.get(i14)).invalidate();
                            k61Var2.k();
                        }
                    }
                }
                w51Var.invalidate();
                a0Var.i();
                a0Var.f54536a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof s61) {
            ((s61) view).setAnimatedScale(f7);
        } else if (view instanceof pw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f54557y;
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
        ?? r18;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        w wVar = this.f54546m;
        int i11 = this.f54557y;
        xh.m mVar = this.f54538c;
        int[] iArr = this.A;
        z zVar = this.f54536a;
        RectF rectF = this.f54540f;
        ml0 ml0Var = this.f54547n;
        rectF.set(ml0Var.f28789w);
        this.f54539e = ml0Var.f28793y;
        int[] iArr2 = new int[2];
        if (z10) {
            ml0Var.getLocationOnScreen(iArr);
        }
        mVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (wVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = ml0Var.getTopOffset() + (dp - i10);
        if (ml0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (zVar.getMeasuredHeight() + topOffset > mVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (mVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - zVar.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f7 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            r18 = 1;
            zVar.setTranslationX(((mVar.getMeasuredWidth() - zVar.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z15 = true;
            if (i11 != 2 && i11 != 4) {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z15;
            } else {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f54553t = zVar.getTranslationY();
        } else {
            this.f54553t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f54541g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        ml0Var.setCustomEmojiEnterProgress(this.f54543j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f54555w = z14;
            this.f54544k = false;
        } else {
            this.f54555w = false;
        }
        if (this.f54555w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        tw twVar = wVar.f38884d0;
        if (z10 && this.f54555w) {
            z12 = true;
        } else {
            z12 = false;
        }
        twVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f54556x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f54543j;
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
            timeAnimator.f27475a = 0;
            timeAnimator.f27476b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f54556x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f54556x.addListener(new f70(17, this, z10));
        if (i11 == 4) {
            this.f54556x.setDuration(420L);
            this.f54556x.setInterpolator(is.h);
        } else if (this.f54555w) {
            this.f54556x.setDuration(450L);
            ai.l(0.5f, this.f54556x);
        } else {
            this.f54556x.setDuration(350L);
            this.f54556x.setInterpolator(is.f27451f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            ml0Var.O0 = true;
            ml0Var.invalidate();
            this.f54556x.setStartDelay(30L);
            this.f54556x.start();
        } else {
            ml0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f54556x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f54592f = this.f54555w;
            d0.f54591e = true;
            d0.f54593g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f54590c = f0Var;
        }
        HashSet hashSet = d0.f54588a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10518b == null) {
            z13 = true;
            cacheOutQueue.f10518b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f54589b = z13;
        d0.f54591e = false;
        d0.f54593g = false;
    }

    public final void d() {
        if (!this.f54550q) {
            ml0 ml0Var = this.f54547n;
            if (ml0Var != null) {
                ValueAnimator valueAnimator = ml0Var.f28794y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ml0Var.B0 = 0.0f;
                m6 m6Var = ml0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                ml0Var.invalidate();
            }
            sc.e();
            this.f54550q = true;
            AndroidUtilities.hideKeyboard(this.f54538c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f54551r;
                if (m2Var instanceof zn) {
                    ((zn) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f54550q) {
            sc.e();
            this.f54550q = true;
            xh.m mVar = this.f54538c;
            AndroidUtilities.hideKeyboard(mVar);
            mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                m2 m2Var = this.f54551r;
                if (m2Var instanceof zn) {
                    ((zn) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f54557y != 5) {
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
        w wVar = this.f54546m;
        wVar.f38894h0.setLayerType(i10, null);
        wVar.f38890f0.setLayerType(i10, null);
        if (this.f54555w) {
            for (int i11 = 0; i11 < Math.min(wVar.f38884d0.f31503b.getChildCount(), 16); i11++) {
                wVar.f38884d0.f31503b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f38887e0.setLayerType(i10, null);
        wVar.f38884d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f54546m;
            g61 g61Var = wVar.f38894h0;
            g61 g61Var2 = wVar.f38894h0;
            if (i10 < g61Var.getChildCount()) {
                if (g61Var2.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var2.getChildAt(i10);
                    if (s61Var.f41609x != null) {
                        s61Var.f41601b = false;
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
        w wVar = this.f54546m;
        float y3 = wVar.getY();
        d61 d61Var = wVar.f38876a0;
        float y10 = d61Var.getY() + y3;
        g61 g61Var = wVar.f38894h0;
        int y11 = (int) (g61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g61Var.getChildCount();
            rectF = this.f54542i;
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
        int y12 = (int) (wVar.f38884d0.getY() + d61Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f38884d0.f31503b.getChildCount(); i11++) {
            View childAt2 = wVar.f38884d0.f31503b.getChildAt(i11);
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
            wVar.f38900k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i8(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f54557y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(is.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f54555w) {
            w wVar = this.f54546m;
            wVar.f38890f0.setAlpha(this.f54543j);
            wVar.f38894h0.setAlpha(this.f54543j);
            wVar.f38896i0.setAlpha(this.f54543j);
            wVar.f38884d0.setAlpha(this.f54543j);
            wVar.f38887e0.setAlpha(this.f54543j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f54546m;
        d61 d61Var = wVar.f38876a0;
        d61 d61Var2 = wVar.f38876a0;
        boolean z10 = this.f54555w;
        z zVar = this.f54536a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = zVar.f54776f;
        }
        d61Var.setTranslationX(f7);
        d61Var2.setTranslationY(zVar.h);
        d61Var2.setPivotX(zVar.f54778r);
        d61Var2.setPivotY(zVar.f54779s);
        d61Var2.setScaleX(zVar.f54777n);
        d61Var2.setScaleY(zVar.f54777n);
    }
}
