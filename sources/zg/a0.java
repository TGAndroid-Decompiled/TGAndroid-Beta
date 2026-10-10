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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pw;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tw;
import org.telegram.ui.e61;
import org.telegram.ui.f70;
import org.telegram.ui.h61;
import org.telegram.ui.l61;
import org.telegram.ui.t61;
import org.telegram.ui.x51;
import org.telegram.ui.zn;
import qg.x1;
import w7.x5;
import yh.i8;
import yh.t5;
public final class a0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z f54493a;
    public final WindowManager f54494b;
    public final xh.m f54495c;
    public final boolean d;
    public float f54496e;
    public float f54498g;
    public float h;
    public float f54500j;
    public boolean f54501k;
    public boolean f54502l;
    public final w f54503m;
    public final ll0 f54504n;
    public final List f54505o;
    public cd0 f54506p;
    public boolean f54507q;
    public final n2 f54508r;
    public final e6 f54509s;
    public float f54510t;
    public float f54511u;
    public boolean v;
    public boolean f54512w;
    public ValueAnimator f54513x;
    public final int f54514y;
    public ch.d f54515z;
    public final RectF f54497f = new RectF();
    public final RectF f54499i = new RectF();

    public a0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, ll0 ll0Var, e6 e6Var, boolean z10) {
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
        this.f54514y = i10;
        this.f54505o = arrayList;
        this.f54508r = n2Var;
        this.f54509s = e6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = ll0Var.getContext();
        }
        Context context2 = context;
        xh.m mVar = new xh.m(this, context2);
        this.f54495c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f54493a = zVar;
        int windowType = ll0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, n2Var, context2, windowType, z12, e6Var, ll0Var, n2Var);
        this.f54503m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = ll0Var.f28395f1;
        boolean z15 = ll0Var.f28397g1;
        if (wVar.K1 != z14) {
            wVar.K1 = z14;
            wVar.L1 = z15;
            h61 h61Var = wVar.f39176h0;
            if (h61Var != null) {
                h61Var.invalidate();
            }
            x51 x51Var = wVar.f39178i0;
            if (x51Var != null) {
                x51Var.invalidate();
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
            wVar.setBackgroundDelegate(new x1(23, this, ll0Var));
        }
        if (z13) {
            ((ViewGroup) ll0Var.getParent()).addView(mVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f54494b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.f54504n = ll0Var;
        ll0Var.setOnSwitchedToLoopView(new u(this, 0));
        ll0Var.f28384b1 = true;
        ll0Var.invalidate();
        AndroidUtilities.runOnUIThread(new t5(5, this, ll0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        ll0 ll0Var = a0Var.f54504n;
        w wVar = a0Var.f54503m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            h61 h61Var = wVar.f39176h0;
            if (z10) {
                wVar.f39166d0.m(false);
                h61Var.invalidate();
                ArrayList arrayList = h61Var.Y2;
                h61Var.f1();
                wVar.f39172f0.b();
                wVar.sendAccessibilityEvent(32);
                ll0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < h61Var.getChildCount()) {
                        if (h61Var.getChildAt(i10) instanceof t61) {
                            view = h61Var.getChildAt(i10);
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
                    ValueAnimator valueAnimator = ll0Var.f28423y0;
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
                    ValueAnimator valueAnimator2 = ll0Var.f28423y0;
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
                x51 x51Var = wVar.f39178i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    l61 l61Var = (l61) arrayList.get(i11);
                    for (int i12 = 0; i12 < l61Var.O.size(); i12++) {
                        if (((t61) l61Var.O.get(i12)).f41915b) {
                            ((t61) l61Var.O.get(i12)).f41915b = false;
                            ((t61) l61Var.O.get(i12)).invalidate();
                            l61Var.k();
                        }
                    }
                }
                h61Var.invalidate();
                for (int i13 = 0; i13 < x51Var.Y2.size(); i13++) {
                    l61 l61Var2 = (l61) x51Var.Y2.get(i13);
                    for (int i14 = 0; i14 < l61Var2.O.size(); i14++) {
                        if (((t61) l61Var2.O.get(i14)).f41915b) {
                            ((t61) l61Var2.O.get(i14)).f41915b = false;
                            ((t61) l61Var2.O.get(i14)).invalidate();
                            l61Var2.k();
                        }
                    }
                }
                x51Var.invalidate();
                a0Var.i();
                a0Var.f54493a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof t61) {
            ((t61) view).setAnimatedScale(f7);
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
        int i11 = this.f54514y;
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
        w wVar = this.f54503m;
        int i11 = this.f54514y;
        xh.m mVar = this.f54495c;
        int[] iArr = this.A;
        z zVar = this.f54493a;
        RectF rectF = this.f54497f;
        ll0 ll0Var = this.f54504n;
        rectF.set(ll0Var.f28418w);
        this.f54496e = ll0Var.f28422y;
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
            this.f54510t = zVar.getTranslationY();
        } else {
            this.f54510t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f54498g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        ll0Var.setCustomEmojiEnterProgress(this.f54500j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f54512w = z14;
            this.f54501k = false;
        } else {
            this.f54512w = false;
        }
        if (this.f54512w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        tw twVar = wVar.f39166d0;
        if (z10 && this.f54512w) {
            z12 = true;
        } else {
            z12 = false;
        }
        twVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f54513x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f54500j;
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
            timeAnimator.f27159a = 0;
            timeAnimator.f27160b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f54513x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f54513x.addListener(new f70(17, this, z10));
        if (i11 == 4) {
            this.f54513x.setDuration(420L);
            this.f54513x.setInterpolator(is.h);
        } else if (this.f54512w) {
            this.f54513x.setDuration(450L);
            bi.l(0.5f, this.f54513x);
        } else {
            this.f54513x.setDuration(350L);
            this.f54513x.setInterpolator(is.f27443f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            ll0Var.O0 = true;
            ll0Var.invalidate();
            this.f54513x.setStartDelay(30L);
            this.f54513x.start();
        } else {
            ll0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f54513x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f54549f = this.f54512w;
            d0.f54548e = true;
            d0.f54550g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f54547c = f0Var;
        }
        HashSet hashSet = d0.f54545a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10519b == null) {
            z13 = true;
            cacheOutQueue.f10519b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f54546b = z13;
        d0.f54548e = false;
        d0.f54550g = false;
    }

    public final void d() {
        if (!this.f54507q) {
            ll0 ll0Var = this.f54504n;
            if (ll0Var != null) {
                ValueAnimator valueAnimator = ll0Var.f28423y0;
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
            tc.e();
            this.f54507q = true;
            AndroidUtilities.hideKeyboard(this.f54495c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f54508r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f54507q) {
            tc.e();
            this.f54507q = true;
            xh.m mVar = this.f54495c;
            AndroidUtilities.hideKeyboard(mVar);
            mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                n2 n2Var = this.f54508r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f54514y != 5) {
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
        w wVar = this.f54503m;
        wVar.f39176h0.setLayerType(i10, null);
        wVar.f39172f0.setLayerType(i10, null);
        if (this.f54512w) {
            for (int i11 = 0; i11 < Math.min(wVar.f39166d0.f31187b.getChildCount(), 16); i11++) {
                wVar.f39166d0.f31187b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f39169e0.setLayerType(i10, null);
        wVar.f39166d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f54503m;
            h61 h61Var = wVar.f39176h0;
            h61 h61Var2 = wVar.f39176h0;
            if (i10 < h61Var.getChildCount()) {
                if (h61Var2.getChildAt(i10) instanceof t61) {
                    t61 t61Var = (t61) h61Var2.getChildAt(i10);
                    if (t61Var.f41923x != null) {
                        t61Var.f41915b = false;
                        t61Var.invalidate();
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
        w wVar = this.f54503m;
        float y3 = wVar.getY();
        e61 e61Var = wVar.f39158a0;
        float y10 = e61Var.getY() + y3;
        h61 h61Var = wVar.f39176h0;
        int y11 = (int) (h61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = h61Var.getChildCount();
            rectF = this.f54499i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = h61Var.getChildAt(i10);
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
        int y12 = (int) (wVar.f39166d0.getY() + e61Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f39166d0.f31187b.getChildCount(); i11++) {
            View childAt2 = wVar.f39166d0.f31187b.getChildAt(i11);
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
            wVar.f39182k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i8(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f54514y == 4) {
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
        if (!this.f54512w) {
            w wVar = this.f54503m;
            wVar.f39172f0.setAlpha(this.f54500j);
            wVar.f39176h0.setAlpha(this.f54500j);
            wVar.f39178i0.setAlpha(this.f54500j);
            wVar.f39166d0.setAlpha(this.f54500j);
            wVar.f39169e0.setAlpha(this.f54500j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f54503m;
        e61 e61Var = wVar.f39158a0;
        e61 e61Var2 = wVar.f39158a0;
        boolean z10 = this.f54512w;
        z zVar = this.f54493a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = zVar.f54733f;
        }
        e61Var.setTranslationX(f7);
        e61Var2.setTranslationY(zVar.h);
        e61Var2.setPivotX(zVar.f54735r);
        e61Var2.setPivotY(zVar.f54736s);
        e61Var2.setScaleX(zVar.f54734n);
        e61Var2.setScaleY(zVar.f54734n);
    }
}
