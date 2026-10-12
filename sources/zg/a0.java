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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vw;
import org.telegram.ui.a61;
import org.telegram.ui.eo;
import org.telegram.ui.h61;
import org.telegram.ui.h70;
import org.telegram.ui.k61;
import org.telegram.ui.o61;
import org.telegram.ui.w61;
import qg.x1;
import w7.w5;
import yh.i8;
import yh.v4;
public final class a0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z f54681a;
    public final WindowManager f54682b;
    public final xh.m f54683c;
    public final boolean d;
    public float f54684e;
    public float f54686g;
    public float h;
    public float f54688j;
    public boolean f54689k;
    public boolean f54690l;
    public final w f54691m;
    public final nl0 f54692n;
    public final List f54693o;
    public cd0 f54694p;
    public boolean f54695q;
    public final m2 f54696r;
    public final c6 f54697s;
    public float f54698t;
    public float f54699u;
    public boolean v;
    public boolean f54700w;
    public ValueAnimator f54701x;
    public final int f54702y;
    public ch.d f54703z;
    public final RectF f54685f = new RectF();
    public final RectF f54687i = new RectF();

    public a0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, nl0 nl0Var, c6 c6Var, boolean z10) {
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
        this.f54702y = i10;
        this.f54693o = arrayList;
        this.f54696r = m2Var;
        this.f54697s = c6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = nl0Var.getContext();
        }
        Context context2 = context;
        xh.m mVar = new xh.m(this, context2);
        this.f54683c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f54681a = zVar;
        int windowType = nl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, m2Var, context2, windowType, z12, c6Var, nl0Var, m2Var);
        this.f54691m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = nl0Var.f28840f1;
        boolean z15 = nl0Var.f28842g1;
        if (wVar.K1 != z14) {
            wVar.K1 = z14;
            wVar.L1 = z15;
            k61 k61Var = wVar.f40275h0;
            if (k61Var != null) {
                k61Var.invalidate();
            }
            a61 a61Var = wVar.f40277i0;
            if (a61Var != null) {
                a61Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new w9.k(nl0Var));
        wVar.setOnRecentClearedListener(new ob.a(29));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions(hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        zVar.addView(wVar, w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
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
        mVar.addView(zVar, w5.a(-1.0f, f7, f7, f7, 16.0f, -1, i12));
        mVar.setClipChildren(false);
        if (i10 == 1 || (nl0Var.getDelegate() != null && nl0Var.getDelegate().q())) {
            wVar.setBackgroundDelegate(new x1(24, this, nl0Var));
        }
        if (z13) {
            ((ViewGroup) nl0Var.getParent()).addView(mVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f54682b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.f54692n = nl0Var;
        nl0Var.setOnSwitchedToLoopView(new u(this, 0));
        nl0Var.f28829b1 = true;
        nl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v4(9, this, nl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        nl0 nl0Var = a0Var.f54692n;
        w wVar = a0Var.f54691m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            k61 k61Var = wVar.f40275h0;
            if (z10) {
                wVar.f40265d0.m(false);
                k61Var.invalidate();
                ArrayList arrayList = k61Var.Y2;
                k61Var.f1();
                wVar.f40271f0.b();
                wVar.sendAccessibilityEvent(32);
                nl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < k61Var.getChildCount()) {
                        if (k61Var.getChildAt(i10) instanceof w61) {
                            view = k61Var.getChildAt(i10);
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
                if (nl0Var.getPullingLeftProgress() > 0.0f) {
                    nl0Var.O0 = false;
                    ValueAnimator valueAnimator = nl0Var.f28868y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    nl0Var.B0 = 0.0f;
                    m6 m6Var = nl0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    nl0Var.invalidate();
                } else {
                    nl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = nl0Var.f28868y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nl0Var.B0 = 0.0f;
                    m6 m6Var2 = nl0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    nl0Var.invalidate();
                }
                a61 a61Var = wVar.f40277i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o61 o61Var = (o61) arrayList.get(i11);
                    for (int i12 = 0; i12 < o61Var.O.size(); i12++) {
                        if (((w61) o61Var.O.get(i12)).f43055b) {
                            ((w61) o61Var.O.get(i12)).f43055b = false;
                            ((w61) o61Var.O.get(i12)).invalidate();
                            o61Var.k();
                        }
                    }
                }
                k61Var.invalidate();
                for (int i13 = 0; i13 < a61Var.Y2.size(); i13++) {
                    o61 o61Var2 = (o61) a61Var.Y2.get(i13);
                    for (int i14 = 0; i14 < o61Var2.O.size(); i14++) {
                        if (((w61) o61Var2.O.get(i14)).f43055b) {
                            ((w61) o61Var2.O.get(i14)).f43055b = false;
                            ((w61) o61Var2.O.get(i14)).invalidate();
                            o61Var2.k();
                        }
                    }
                }
                a61Var.invalidate();
                a0Var.i();
                a0Var.f54681a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof w61) {
            ((w61) view).setAnimatedScale(f7);
        } else if (view instanceof rw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f54702y;
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
        w wVar = this.f54691m;
        int i11 = this.f54702y;
        xh.m mVar = this.f54683c;
        int[] iArr = this.A;
        z zVar = this.f54681a;
        RectF rectF = this.f54685f;
        nl0 nl0Var = this.f54692n;
        rectF.set(nl0Var.f28863w);
        this.f54684e = nl0Var.f28867y;
        int[] iArr2 = new int[2];
        if (z10) {
            nl0Var.getLocationOnScreen(iArr);
        }
        mVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (wVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = nl0Var.getTopOffset() + (dp - i10);
        if (nl0Var.F0) {
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
            this.f54698t = zVar.getTranslationY();
        } else {
            this.f54698t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f54686g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        nl0Var.setCustomEmojiEnterProgress(this.f54688j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f54700w = z14;
            this.f54689k = false;
        } else {
            this.f54700w = false;
        }
        if (this.f54700w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        vw vwVar = wVar.f40265d0;
        if (z10 && this.f54700w) {
            z12 = true;
        } else {
            z12 = false;
        }
        vwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f54701x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f54688j;
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
            timeAnimator.f28661a = 0;
            timeAnimator.f28662b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f54701x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f54701x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f54701x.setDuration(420L);
            this.f54701x.setInterpolator(js.h);
        } else if (this.f54700w) {
            this.f54701x.setDuration(450L);
            am.l(0.5f, this.f54701x);
        } else {
            this.f54701x.setDuration(350L);
            this.f54701x.setInterpolator(js.f27634f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            nl0Var.O0 = true;
            nl0Var.invalidate();
            this.f54701x.setStartDelay(30L);
            this.f54701x.start();
        } else {
            nl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f54701x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f54737f = this.f54700w;
            d0.f54736e = true;
            d0.f54738g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f54735c = f0Var;
        }
        HashSet hashSet = d0.f54733a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10517b == null) {
            z13 = true;
            cacheOutQueue.f10517b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f54734b = z13;
        d0.f54736e = false;
        d0.f54738g = false;
    }

    public final void d() {
        if (!this.f54695q) {
            nl0 nl0Var = this.f54692n;
            if (nl0Var != null) {
                ValueAnimator valueAnimator = nl0Var.f28868y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nl0Var.B0 = 0.0f;
                m6 m6Var = nl0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                nl0Var.invalidate();
            }
            sc.e();
            this.f54695q = true;
            AndroidUtilities.hideKeyboard(this.f54683c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f54696r;
                if (m2Var instanceof eo) {
                    ((eo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f54695q) {
            sc.e();
            this.f54695q = true;
            xh.m mVar = this.f54683c;
            AndroidUtilities.hideKeyboard(mVar);
            mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                m2 m2Var = this.f54696r;
                if (m2Var instanceof eo) {
                    ((eo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f54702y != 5) {
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
        w wVar = this.f54691m;
        wVar.f40275h0.setLayerType(i10, null);
        wVar.f40271f0.setLayerType(i10, null);
        if (this.f54700w) {
            for (int i11 = 0; i11 < Math.min(wVar.f40265d0.f33147b.getChildCount(), 16); i11++) {
                wVar.f40265d0.f33147b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f40268e0.setLayerType(i10, null);
        wVar.f40265d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f54691m;
            k61 k61Var = wVar.f40275h0;
            k61 k61Var2 = wVar.f40275h0;
            if (i10 < k61Var.getChildCount()) {
                if (k61Var2.getChildAt(i10) instanceof w61) {
                    w61 w61Var = (w61) k61Var2.getChildAt(i10);
                    if (w61Var.f43063x != null) {
                        w61Var.f43055b = false;
                        w61Var.invalidate();
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
        w wVar = this.f54691m;
        float y3 = wVar.getY();
        h61 h61Var = wVar.f40257a0;
        float y10 = h61Var.getY() + y3;
        k61 k61Var = wVar.f40275h0;
        int y11 = (int) (k61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = k61Var.getChildCount();
            rectF = this.f54687i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = k61Var.getChildAt(i10);
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
        int y12 = (int) (wVar.f40265d0.getY() + h61Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f40265d0.f33147b.getChildCount(); i11++) {
            View childAt2 = wVar.f40265d0.f33147b.getChildAt(i11);
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
            wVar.f40281k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i8(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f54702y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(js.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f54700w) {
            w wVar = this.f54691m;
            wVar.f40271f0.setAlpha(this.f54688j);
            wVar.f40275h0.setAlpha(this.f54688j);
            wVar.f40277i0.setAlpha(this.f54688j);
            wVar.f40265d0.setAlpha(this.f54688j);
            wVar.f40268e0.setAlpha(this.f54688j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f54691m;
        h61 h61Var = wVar.f40257a0;
        h61 h61Var2 = wVar.f40257a0;
        boolean z10 = this.f54700w;
        z zVar = this.f54681a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = zVar.f54921f;
        }
        h61Var.setTranslationX(f7);
        h61Var2.setTranslationY(zVar.h);
        h61Var2.setPivotX(zVar.f54923r);
        h61Var2.setPivotY(zVar.f54924s);
        h61Var2.setScaleX(zVar.f54922n);
        h61Var2.setScaleY(zVar.f54922n);
    }
}
