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
import org.telegram.ui.b61;
import org.telegram.ui.g70;
import org.telegram.ui.j61;
import org.telegram.ui.n51;
import org.telegram.ui.u51;
import org.telegram.ui.x51;
import org.telegram.ui.yn;
import w7.z5;
import yh.o2;
import yh.s5;
import yh.u3;
public final class z {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final y f53550a;
    public final WindowManager f53551b;
    public final u3 f53552c;
    public final boolean d;
    public float f53553e;
    public float f53555g;
    public float h;
    public float f53557j;
    public boolean f53558k;
    public boolean f53559l;
    public final v f53560m;
    public final sk0 f53561n;
    public final List f53562o;
    public lc0 f53563p;
    public boolean f53564q;
    public final n2 f53565r;
    public final d6 f53566s;
    public float f53567t;
    public float f53568u;
    public boolean v;
    public boolean f53569w;
    public ValueAnimator f53570x;
    public final int f53571y;
    public ch.d f53572z;
    public final RectF f53554f = new RectF();
    public final RectF f53556i = new RectF();

    public z(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, d6 d6Var, boolean z10) {
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
        this.f53571y = i10;
        this.f53562o = arrayList;
        this.f53565r = n2Var;
        this.f53566s = d6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = sk0Var.getContext();
        }
        Context context2 = context;
        u3 u3Var = new u3(this, context2);
        this.f53552c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        y yVar = new y(this, context2);
        this.f53550a = yVar;
        boolean z13 = z11;
        int windowType = sk0Var.getWindowType();
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        v vVar = new v(this, n2Var, context2, windowType, z12, d6Var, sk0Var, n2Var);
        this.f53560m = vVar;
        vVar.setOutlineProvider(new w(this));
        vVar.setClipToOutline(true);
        boolean z14 = sk0Var.f30832f1;
        boolean z15 = sk0Var.f30834g1;
        if (vVar.K1 != z14) {
            vVar.K1 = z14;
            vVar.L1 = z15;
            x51 x51Var = vVar.f34739h0;
            if (x51Var != null) {
                x51Var.invalidate();
            }
            n51 n51Var = vVar.f34741i0;
            if (n51Var != null) {
                n51Var.invalidate();
            }
        }
        vVar.setOnLongPressedListener(new k2.e(sk0Var, 28));
        vVar.setOnRecentClearedListener(new Object());
        vVar.setRecentReactions(arrayList);
        vVar.setSelectedReactions(hashSet);
        vVar.setDrawBackground(false);
        vVar.s(null);
        yVar.addView(vVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            yVar.setClipChildren(false);
            yVar.setClipToPadding(false);
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        u3Var.addView(yVar, z5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().K())) {
            vVar.setBackgroundDelegate(new rg.x(20, this, sk0Var));
        }
        if (z13) {
            ((ViewGroup) sk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f53551b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.f53561n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new s(this, 0));
        sk0Var.f30821b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new s5(6, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(z zVar, boolean z10) {
        View view;
        sk0 sk0Var = zVar.f53561n;
        v vVar = zVar.f53560m;
        if (zVar.E.isEmpty()) {
            zVar.h(false);
            c0.a();
            zVar.B.unlock();
            vVar.setEnterAnimationInProgress(false);
            x51 x51Var = vVar.f34739h0;
            if (z10) {
                vVar.f34729d0.m(false);
                x51Var.invalidate();
                ArrayList arrayList = x51Var.f35337h3;
                x51Var.g1();
                vVar.f34735f0.b();
                vVar.sendAccessibilityEvent(32);
                sk0Var.setImportantForAccessibility(4);
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
                    vVar.performAccessibilityAction(64, null);
                }
                if (sk0Var.getPullingLeftProgress() > 0.0f) {
                    sk0Var.O0 = false;
                    ValueAnimator valueAnimator = sk0Var.f30860y0;
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
                    ValueAnimator valueAnimator2 = sk0Var.f30860y0;
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
                n51 n51Var = vVar.f34741i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b61 b61Var = (b61) arrayList.get(i11);
                    for (int i12 = 0; i12 < b61Var.O.size(); i12++) {
                        if (((j61) b61Var.O.get(i12)).f37582b) {
                            ((j61) b61Var.O.get(i12)).f37582b = false;
                            ((j61) b61Var.O.get(i12)).invalidate();
                            b61Var.k();
                        }
                    }
                }
                x51Var.invalidate();
                for (int i13 = 0; i13 < n51Var.f35337h3.size(); i13++) {
                    b61 b61Var2 = (b61) n51Var.f35337h3.get(i13);
                    for (int i14 = 0; i14 < b61Var2.O.size(); i14++) {
                        if (((j61) b61Var2.O.get(i14)).f37582b) {
                            ((j61) b61Var2.O.get(i14)).f37582b = false;
                            ((j61) b61Var2.O.get(i14)).invalidate();
                            b61Var2.k();
                        }
                    }
                }
                n51Var.invalidate();
                zVar.i();
                zVar.f53550a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof j61) {
            ((j61) view).setAnimatedScale(f7);
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
        int i11 = this.f53571y;
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
        v vVar = this.f53560m;
        int i11 = this.f53571y;
        u3 u3Var = this.f53552c;
        int[] iArr = this.A;
        y yVar = this.f53550a;
        RectF rectF = this.f53554f;
        sk0 sk0Var = this.f53561n;
        rectF.set(sk0Var.f30855w);
        this.f53553e = sk0Var.f30859y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (vVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = sk0Var.getTopOffset() + (dp - i10);
        if (sk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (yVar.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - yVar.getMeasuredHeight();
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
            yVar.setTranslationX(((u3Var.getMeasuredWidth() - yVar.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                yVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                yVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f53567t = yVar.getTranslationY();
        } else {
            this.f53567t = topOffset;
            yVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - yVar.getX();
        this.f53555g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - yVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        sk0Var.setCustomEmojiEnterProgress(this.f53557j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f53569w = z14;
            this.f53558k = false;
        } else {
            this.f53569w = false;
        }
        if (this.f53569w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        vVar.setEnterAnimationInProgress(z11);
        gw gwVar = vVar.f34729d0;
        if (z10 && this.f53569w) {
            z12 = true;
        } else {
            z12 = false;
        }
        gwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f53570x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f53557j;
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
            timeAnimator.f24755a = 0;
            timeAnimator.f24756b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f53570x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f53570x.addListener(new g70(17, this, z10));
        if (i11 == 4) {
            this.f53570x.setDuration(420L);
            this.f53570x.setInterpolator(tr.h);
        } else if (this.f53569w) {
            this.f53570x.setDuration(450L);
            this.f53570x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f53570x.setDuration(350L);
            this.f53570x.setInterpolator(tr.f31215f);
        }
        yVar.invalidate();
        h(true);
        if (!z10) {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.f53570x.setStartDelay(30L);
            this.f53570x.start();
        } else {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f53570x;
            Objects.requireNonNull(valueAnimator3);
            o2 o2Var = new o2(valueAnimator3, 11);
            c0.f53351f = this.f53569w;
            c0.f53350e = true;
            c0.f53352g = false;
            if (c0.d) {
                c0.d = false;
            }
            c0.f53349c = o2Var;
        }
        HashSet hashSet = c0.f53347a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9848b == null) {
            z13 = true;
            cacheOutQueue.f9848b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        c0.f53348b = z13;
        c0.f53350e = false;
        c0.f53352g = false;
    }

    public final void d() {
        if (!this.f53564q) {
            sk0 sk0Var = this.f53561n;
            if (sk0Var != null) {
                ValueAnimator valueAnimator = sk0Var.f30860y0;
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
            this.f53564q = true;
            AndroidUtilities.hideKeyboard(this.f53552c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f53565r;
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f53564q) {
            rc.e();
            this.f53564q = true;
            u3 u3Var = this.f53552c;
            AndroidUtilities.hideKeyboard(u3Var);
            u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new x(this, 1));
            if (this.v) {
                n2 n2Var = this.f53565r;
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f53571y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new s(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        v vVar = this.f53560m;
        vVar.f34739h0.setLayerType(i10, null);
        vVar.f34735f0.setLayerType(i10, null);
        if (this.f53569w) {
            for (int i11 = 0; i11 < Math.min(vVar.f34729d0.f26164b.getChildCount(), 16); i11++) {
                vVar.f34729d0.f26164b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        vVar.f34732e0.setLayerType(i10, null);
        vVar.f34729d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            v vVar = this.f53560m;
            x51 x51Var = vVar.f34739h0;
            x51 x51Var2 = vVar.f34739h0;
            if (i10 < x51Var.getChildCount()) {
                if (x51Var2.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var2.getChildAt(i10);
                    if (j61Var.f37590x != null) {
                        j61Var.f37582b = false;
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
        v vVar = this.f53560m;
        float y3 = vVar.getY();
        u51 u51Var = vVar.f34721a0;
        float y10 = u51Var.getY() + y3;
        x51 x51Var = vVar.f34739h0;
        int y11 = (int) (x51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x51Var.getChildCount();
            rectF = this.f53556i;
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
        int y12 = (int) (vVar.f34729d0.getY() + u51Var.getY() + vVar.getY());
        for (int i11 = 0; i11 < vVar.f34729d0.f26164b.getChildCount(); i11++) {
            View childAt2 = vVar.f34729d0.f26164b.getChildAt(i11);
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
            vVar.f34745k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f53571y == 4) {
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
        if (!this.f53569w) {
            v vVar = this.f53560m;
            vVar.f34735f0.setAlpha(this.f53557j);
            vVar.f34739h0.setAlpha(this.f53557j);
            vVar.f34741i0.setAlpha(this.f53557j);
            vVar.f34729d0.setAlpha(this.f53557j);
            vVar.f34732e0.setAlpha(this.f53557j);
        }
    }

    public final void l() {
        float f7;
        v vVar = this.f53560m;
        u51 u51Var = vVar.f34721a0;
        u51 u51Var2 = vVar.f34721a0;
        boolean z10 = this.f53569w;
        y yVar = this.f53550a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = yVar.f53545f;
        }
        u51Var.setTranslationX(f7);
        u51Var2.setTranslationY(yVar.h);
        u51Var2.setPivotX(yVar.f53547r);
        u51Var2.setPivotY(yVar.f53548s);
        u51Var2.setScaleX(yVar.f53546n);
        u51Var2.setScaleY(yVar.f53546n);
    }
}
