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
import yh.e5;
import yh.i8;
public final class a0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z f54673a;
    public final WindowManager f54674b;
    public final xh.m f54675c;
    public final boolean d;
    public float f54676e;
    public float f54678g;
    public float h;
    public float f54680j;
    public boolean f54681k;
    public boolean f54682l;
    public final w f54683m;
    public final nl0 f54684n;
    public final List f54685o;
    public cd0 f54686p;
    public boolean f54687q;
    public final m2 f54688r;
    public final c6 f54689s;
    public float f54690t;
    public float f54691u;
    public boolean v;
    public boolean f54692w;
    public ValueAnimator f54693x;
    public final int f54694y;
    public ch.d f54695z;
    public final RectF f54677f = new RectF();
    public final RectF f54679i = new RectF();

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
        this.f54694y = i10;
        this.f54685o = arrayList;
        this.f54688r = m2Var;
        this.f54689s = c6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = nl0Var.getContext();
        }
        Context context2 = context;
        xh.m mVar = new xh.m(this, context2);
        this.f54675c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f54673a = zVar;
        int windowType = nl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, m2Var, context2, windowType, z12, c6Var, nl0Var, m2Var);
        this.f54683m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = nl0Var.f28836f1;
        boolean z15 = nl0Var.f28838g1;
        if (wVar.K1 != z14) {
            wVar.K1 = z14;
            wVar.L1 = z15;
            k61 k61Var = wVar.f40272h0;
            if (k61Var != null) {
                k61Var.invalidate();
            }
            a61 a61Var = wVar.f40274i0;
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
            this.f54674b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.f54684n = nl0Var;
        nl0Var.setOnSwitchedToLoopView(new u(this, 0));
        nl0Var.f28825b1 = true;
        nl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new e5(7, this, nl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        nl0 nl0Var = a0Var.f54684n;
        w wVar = a0Var.f54683m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            k61 k61Var = wVar.f40272h0;
            if (z10) {
                wVar.f40262d0.m(false);
                k61Var.invalidate();
                ArrayList arrayList = k61Var.Y2;
                k61Var.f1();
                wVar.f40268f0.b();
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
                    ValueAnimator valueAnimator = nl0Var.f28864y0;
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
                    ValueAnimator valueAnimator2 = nl0Var.f28864y0;
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
                a61 a61Var = wVar.f40274i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o61 o61Var = (o61) arrayList.get(i11);
                    for (int i12 = 0; i12 < o61Var.O.size(); i12++) {
                        if (((w61) o61Var.O.get(i12)).f43053b) {
                            ((w61) o61Var.O.get(i12)).f43053b = false;
                            ((w61) o61Var.O.get(i12)).invalidate();
                            o61Var.k();
                        }
                    }
                }
                k61Var.invalidate();
                for (int i13 = 0; i13 < a61Var.Y2.size(); i13++) {
                    o61 o61Var2 = (o61) a61Var.Y2.get(i13);
                    for (int i14 = 0; i14 < o61Var2.O.size(); i14++) {
                        if (((w61) o61Var2.O.get(i14)).f43053b) {
                            ((w61) o61Var2.O.get(i14)).f43053b = false;
                            ((w61) o61Var2.O.get(i14)).invalidate();
                            o61Var2.k();
                        }
                    }
                }
                a61Var.invalidate();
                a0Var.i();
                a0Var.f54673a.invalidate();
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
        int i11 = this.f54694y;
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
        w wVar = this.f54683m;
        int i11 = this.f54694y;
        xh.m mVar = this.f54675c;
        int[] iArr = this.A;
        z zVar = this.f54673a;
        RectF rectF = this.f54677f;
        nl0 nl0Var = this.f54684n;
        rectF.set(nl0Var.f28859w);
        this.f54676e = nl0Var.f28863y;
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
            this.f54690t = zVar.getTranslationY();
        } else {
            this.f54690t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f54678g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        nl0Var.setCustomEmojiEnterProgress(this.f54680j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f54692w = z14;
            this.f54681k = false;
        } else {
            this.f54692w = false;
        }
        if (this.f54692w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        vw vwVar = wVar.f40262d0;
        if (z10 && this.f54692w) {
            z12 = true;
        } else {
            z12 = false;
        }
        vwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f54693x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f54680j;
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
            timeAnimator.f28672a = 0;
            timeAnimator.f28673b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f54693x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f54693x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f54693x.setDuration(420L);
            this.f54693x.setInterpolator(js.h);
        } else if (this.f54692w) {
            this.f54693x.setDuration(450L);
            am.l(0.5f, this.f54693x);
        } else {
            this.f54693x.setDuration(350L);
            this.f54693x.setInterpolator(js.f27627f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            nl0Var.O0 = true;
            nl0Var.invalidate();
            this.f54693x.setStartDelay(30L);
            this.f54693x.start();
        } else {
            nl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f54693x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f54729f = this.f54692w;
            d0.f54728e = true;
            d0.f54730g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f54727c = f0Var;
        }
        HashSet hashSet = d0.f54725a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10517b == null) {
            z13 = true;
            cacheOutQueue.f10517b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f54726b = z13;
        d0.f54728e = false;
        d0.f54730g = false;
    }

    public final void d() {
        if (!this.f54687q) {
            nl0 nl0Var = this.f54684n;
            if (nl0Var != null) {
                ValueAnimator valueAnimator = nl0Var.f28864y0;
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
            this.f54687q = true;
            AndroidUtilities.hideKeyboard(this.f54675c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f54688r;
                if (m2Var instanceof eo) {
                    ((eo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f54687q) {
            sc.e();
            this.f54687q = true;
            xh.m mVar = this.f54675c;
            AndroidUtilities.hideKeyboard(mVar);
            mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                m2 m2Var = this.f54688r;
                if (m2Var instanceof eo) {
                    ((eo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f54694y != 5) {
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
        w wVar = this.f54683m;
        wVar.f40272h0.setLayerType(i10, null);
        wVar.f40268f0.setLayerType(i10, null);
        if (this.f54692w) {
            for (int i11 = 0; i11 < Math.min(wVar.f40262d0.f33139b.getChildCount(), 16); i11++) {
                wVar.f40262d0.f33139b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f40265e0.setLayerType(i10, null);
        wVar.f40262d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f54683m;
            k61 k61Var = wVar.f40272h0;
            k61 k61Var2 = wVar.f40272h0;
            if (i10 < k61Var.getChildCount()) {
                if (k61Var2.getChildAt(i10) instanceof w61) {
                    w61 w61Var = (w61) k61Var2.getChildAt(i10);
                    if (w61Var.f43061x != null) {
                        w61Var.f43053b = false;
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
        w wVar = this.f54683m;
        float y3 = wVar.getY();
        h61 h61Var = wVar.f40254a0;
        float y10 = h61Var.getY() + y3;
        k61 k61Var = wVar.f40272h0;
        int y11 = (int) (k61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = k61Var.getChildCount();
            rectF = this.f54679i;
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
        int y12 = (int) (wVar.f40262d0.getY() + h61Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f40262d0.f33139b.getChildCount(); i11++) {
            View childAt2 = wVar.f40262d0.f33139b.getChildAt(i11);
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
            wVar.f40278k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i8(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f54694y == 4) {
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
        if (!this.f54692w) {
            w wVar = this.f54683m;
            wVar.f40268f0.setAlpha(this.f54680j);
            wVar.f40272h0.setAlpha(this.f54680j);
            wVar.f40274i0.setAlpha(this.f54680j);
            wVar.f40262d0.setAlpha(this.f54680j);
            wVar.f40265e0.setAlpha(this.f54680j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f54683m;
        h61 h61Var = wVar.f40254a0;
        h61 h61Var2 = wVar.f40254a0;
        boolean z10 = this.f54692w;
        z zVar = this.f54673a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = zVar.f54913f;
        }
        h61Var.setTranslationX(f7);
        h61Var2.setTranslationY(zVar.h);
        h61Var2.setPivotX(zVar.f54915r);
        h61Var2.setPivotY(zVar.f54916s);
        h61Var2.setScaleX(zVar.f54914n);
        h61Var2.setScaleY(zVar.f54914n);
    }
}
