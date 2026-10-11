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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pw;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.yc0;
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
    public final z f54570a;
    public final WindowManager f54571b;
    public final xh.m f54572c;
    public final boolean d;
    public float f54573e;
    public float f54575g;
    public float h;
    public float f54577j;
    public boolean f54578k;
    public boolean f54579l;
    public final w f54580m;
    public final ll0 f54581n;
    public final List f54582o;
    public yc0 f54583p;
    public boolean f54584q;
    public final m2 f54585r;
    public final d6 f54586s;
    public float f54587t;
    public float f54588u;
    public boolean v;
    public boolean f54589w;
    public ValueAnimator f54590x;
    public final int f54591y;
    public ch.d f54592z;
    public final RectF f54574f = new RectF();
    public final RectF f54576i = new RectF();

    public a0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, ll0 ll0Var, d6 d6Var, boolean z10) {
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
        this.f54591y = i10;
        this.f54582o = arrayList;
        this.f54585r = m2Var;
        this.f54586s = d6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = ll0Var.getContext();
        }
        Context context2 = context;
        xh.m mVar = new xh.m(this, context2);
        this.f54572c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f54570a = zVar;
        int windowType = ll0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, m2Var, context2, windowType, z12, d6Var, ll0Var, m2Var);
        this.f54580m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = ll0Var.f28471f1;
        boolean z15 = ll0Var.f28473g1;
        if (wVar.K1 != z14) {
            wVar.K1 = z14;
            wVar.L1 = z15;
            g61 g61Var = wVar.f38928h0;
            if (g61Var != null) {
                g61Var.invalidate();
            }
            w51 w51Var = wVar.f38930i0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new w3.b(ll0Var));
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
        if (i10 == 1 || (ll0Var.getDelegate() != null && ll0Var.getDelegate().v())) {
            wVar.setBackgroundDelegate(new q9.p(24, this, ll0Var));
        }
        if (z13) {
            ((ViewGroup) ll0Var.getParent()).addView(mVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f54571b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.f54581n = ll0Var;
        ll0Var.setOnSwitchedToLoopView(new u(this, 0));
        ll0Var.f28460b1 = true;
        ll0Var.invalidate();
        AndroidUtilities.runOnUIThread(new e5(7, this, ll0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        ll0 ll0Var = a0Var.f54581n;
        w wVar = a0Var.f54580m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            g61 g61Var = wVar.f38928h0;
            if (z10) {
                wVar.f38918d0.m(false);
                g61Var.invalidate();
                ArrayList arrayList = g61Var.Y2;
                g61Var.f1();
                wVar.f38924f0.b();
                wVar.sendAccessibilityEvent(32);
                ll0Var.setImportantForAccessibility(4);
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
                if (ll0Var.getPullingLeftProgress() > 0.0f) {
                    ll0Var.O0 = false;
                    ValueAnimator valueAnimator = ll0Var.f28499y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ll0Var.B0 = 0.0f;
                    m6 m6Var = ll0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    ll0Var.invalidate();
                } else {
                    ll0Var.O0 = true;
                    ValueAnimator valueAnimator2 = ll0Var.f28499y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ll0Var.B0 = 0.0f;
                    m6 m6Var2 = ll0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    ll0Var.invalidate();
                }
                w51 w51Var = wVar.f38930i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k61 k61Var = (k61) arrayList.get(i11);
                    for (int i12 = 0; i12 < k61Var.O.size(); i12++) {
                        if (((s61) k61Var.O.get(i12)).f41635b) {
                            ((s61) k61Var.O.get(i12)).f41635b = false;
                            ((s61) k61Var.O.get(i12)).invalidate();
                            k61Var.k();
                        }
                    }
                }
                g61Var.invalidate();
                for (int i13 = 0; i13 < w51Var.Y2.size(); i13++) {
                    k61 k61Var2 = (k61) w51Var.Y2.get(i13);
                    for (int i14 = 0; i14 < k61Var2.O.size(); i14++) {
                        if (((s61) k61Var2.O.get(i14)).f41635b) {
                            ((s61) k61Var2.O.get(i14)).f41635b = false;
                            ((s61) k61Var2.O.get(i14)).invalidate();
                            k61Var2.k();
                        }
                    }
                }
                w51Var.invalidate();
                a0Var.i();
                a0Var.f54570a.invalidate();
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
        int i11 = this.f54591y;
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
        w wVar = this.f54580m;
        int i11 = this.f54591y;
        xh.m mVar = this.f54572c;
        int[] iArr = this.A;
        z zVar = this.f54570a;
        RectF rectF = this.f54574f;
        ll0 ll0Var = this.f54581n;
        rectF.set(ll0Var.f28494w);
        this.f54573e = ll0Var.f28498y;
        int[] iArr2 = new int[2];
        if (z10) {
            ll0Var.getLocationOnScreen(iArr);
        }
        mVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (wVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = ll0Var.getTopOffset() + (dp - i10);
        if (ll0Var.F0) {
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
            this.f54587t = zVar.getTranslationY();
        } else {
            this.f54587t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f54575g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        ll0Var.setCustomEmojiEnterProgress(this.f54577j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f54589w = z14;
            this.f54578k = false;
        } else {
            this.f54589w = false;
        }
        if (this.f54589w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        tw twVar = wVar.f38918d0;
        if (z10 && this.f54589w) {
            z12 = true;
        } else {
            z12 = false;
        }
        twVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f54590x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f54577j;
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
            timeAnimator.f27249a = 0;
            timeAnimator.f27250b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f54590x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f54590x.addListener(new f70(17, this, z10));
        if (i11 == 4) {
            this.f54590x.setDuration(420L);
            this.f54590x.setInterpolator(is.h);
        } else if (this.f54589w) {
            this.f54590x.setDuration(450L);
            ai.l(0.5f, this.f54590x);
        } else {
            this.f54590x.setDuration(350L);
            this.f54590x.setInterpolator(is.f27500f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            ll0Var.O0 = true;
            ll0Var.invalidate();
            this.f54590x.setStartDelay(30L);
            this.f54590x.start();
        } else {
            ll0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f54590x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f54626f = this.f54589w;
            d0.f54625e = true;
            d0.f54627g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f54624c = f0Var;
        }
        HashSet hashSet = d0.f54622a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10518b == null) {
            z13 = true;
            cacheOutQueue.f10518b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f54623b = z13;
        d0.f54625e = false;
        d0.f54627g = false;
    }

    public final void d() {
        if (!this.f54584q) {
            ll0 ll0Var = this.f54581n;
            if (ll0Var != null) {
                ValueAnimator valueAnimator = ll0Var.f28499y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ll0Var.B0 = 0.0f;
                m6 m6Var = ll0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                ll0Var.invalidate();
            }
            sc.e();
            this.f54584q = true;
            AndroidUtilities.hideKeyboard(this.f54572c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f54585r;
                if (m2Var instanceof zn) {
                    ((zn) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f54584q) {
            sc.e();
            this.f54584q = true;
            xh.m mVar = this.f54572c;
            AndroidUtilities.hideKeyboard(mVar);
            mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                m2 m2Var = this.f54585r;
                if (m2Var instanceof zn) {
                    ((zn) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f54591y != 5) {
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
        w wVar = this.f54580m;
        wVar.f38928h0.setLayerType(i10, null);
        wVar.f38924f0.setLayerType(i10, null);
        if (this.f54589w) {
            for (int i11 = 0; i11 < Math.min(wVar.f38918d0.f31306b.getChildCount(), 16); i11++) {
                wVar.f38918d0.f31306b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f38921e0.setLayerType(i10, null);
        wVar.f38918d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f54580m;
            g61 g61Var = wVar.f38928h0;
            g61 g61Var2 = wVar.f38928h0;
            if (i10 < g61Var.getChildCount()) {
                if (g61Var2.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var2.getChildAt(i10);
                    if (s61Var.f41643x != null) {
                        s61Var.f41635b = false;
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
        w wVar = this.f54580m;
        float y3 = wVar.getY();
        d61 d61Var = wVar.f38910a0;
        float y10 = d61Var.getY() + y3;
        g61 g61Var = wVar.f38928h0;
        int y11 = (int) (g61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g61Var.getChildCount();
            rectF = this.f54576i;
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
        int y12 = (int) (wVar.f38918d0.getY() + d61Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f38918d0.f31306b.getChildCount(); i11++) {
            View childAt2 = wVar.f38918d0.f31306b.getChildAt(i11);
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
            wVar.f38934k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i8(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f54591y == 4) {
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
        if (!this.f54589w) {
            w wVar = this.f54580m;
            wVar.f38924f0.setAlpha(this.f54577j);
            wVar.f38928h0.setAlpha(this.f54577j);
            wVar.f38930i0.setAlpha(this.f54577j);
            wVar.f38918d0.setAlpha(this.f54577j);
            wVar.f38921e0.setAlpha(this.f54577j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f54580m;
        d61 d61Var = wVar.f38910a0;
        d61 d61Var2 = wVar.f38910a0;
        boolean z10 = this.f54589w;
        z zVar = this.f54570a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = zVar.f54810f;
        }
        d61Var.setTranslationX(f7);
        d61Var2.setTranslationY(zVar.h);
        d61Var2.setPivotX(zVar.f54812r);
        d61Var2.setPivotY(zVar.f54813s);
        d61Var2.setScaleX(zVar.f54811n);
        d61Var2.setScaleY(zVar.f54811n);
    }
}
