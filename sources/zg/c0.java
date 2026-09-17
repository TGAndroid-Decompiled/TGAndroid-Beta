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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yv;
import org.telegram.ui.bo;
import org.telegram.ui.c61;
import org.telegram.ui.f61;
import org.telegram.ui.j61;
import org.telegram.ui.j70;
import org.telegram.ui.r61;
import org.telegram.ui.v51;
import w7.x5;
import yh.w3;
import yh.y2;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f49006a;
    public final WindowManager f49007b;
    public final w3 f49008c;
    public final boolean d;
    public float e;
    public float f49010g;
    public float h;
    public float f49012j;
    public boolean f49013k;
    public boolean f49014l;
    public final y f49015m;
    public final gk0 f49016n;
    public final List f49017o;
    public bc0 f49018p;
    public boolean f49019q;
    public final o2 f49020r;
    public final f6 f49021s;
    public float f49022t;
    public float f49023u;
    public boolean v;
    public boolean f49024w;
    public ValueAnimator f49025x;
    public final int f49026y;
    public ch.d f49027z;
    public final RectF f49009f = new RectF();
    public final RectF f49011i = new RectF();

    public c0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, gk0 gk0Var, f6 f6Var, boolean z10) {
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
        this.f49026y = i10;
        this.f49017o = arrayList;
        this.f49020r = o2Var;
        this.f49021s = f6Var;
        if (o2Var != null) {
            context = o2Var.getContext();
        } else {
            context = gk0Var.getContext();
        }
        Context context2 = context;
        w3 w3Var = new w3(this, context2);
        this.f49008c = w3Var;
        w3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f49006a = b0Var;
        int windowType = gk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, o2Var, context2, windowType, z12, f6Var, gk0Var, o2Var);
        this.f49015m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = gk0Var.f24280f1;
        boolean z15 = gk0Var.f24282g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            f61 f61Var = yVar.f34461h0;
            if (f61Var != null) {
                f61Var.invalidate();
            }
            v51 v51Var = yVar.f34463i0;
            if (v51Var != null) {
                v51Var.invalidate();
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
            w3Var.setClipChildren(false);
            w3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        w3Var.addView(b0Var, x5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        w3Var.setClipChildren(false);
        if (i10 == 1 || (gk0Var.getDelegate() != null && gk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(17, this, gk0Var));
        }
        if (z13) {
            ((ViewGroup) gk0Var.getParent()).addView(w3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49007b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, w3Var, b10);
            windowManager.addView(w3Var, b10);
        }
        this.f49016n = gk0Var;
        gk0Var.setOnSwitchedToLoopView(new u(this, 0));
        gk0Var.f24270b1 = true;
        gk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(0, this, gk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        gk0 gk0Var = c0Var.f49016n;
        y yVar = c0Var.f49015m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            f61 f61Var = yVar.f34461h0;
            if (z10) {
                yVar.f34452d0.m(false);
                f61Var.invalidate();
                ArrayList arrayList = f61Var.f35119a3;
                f61Var.g1();
                yVar.f34457f0.b();
                yVar.sendAccessibilityEvent(32);
                gk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < f61Var.getChildCount()) {
                        if (f61Var.getChildAt(i10) instanceof r61) {
                            view = f61Var.getChildAt(i10);
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
                    ValueAnimator valueAnimator = gk0Var.f24308y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    n6 n6Var = gk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    gk0Var.invalidate();
                } else {
                    gk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gk0Var.f24308y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    n6 n6Var2 = gk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    gk0Var.invalidate();
                }
                v51 v51Var = yVar.f34463i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j61 j61Var = (j61) arrayList.get(i11);
                    for (int i12 = 0; i12 < j61Var.O.size(); i12++) {
                        if (((r61) j61Var.O.get(i12)).f37094b) {
                            ((r61) j61Var.O.get(i12)).f37094b = false;
                            ((r61) j61Var.O.get(i12)).invalidate();
                            j61Var.k();
                        }
                    }
                }
                f61Var.invalidate();
                for (int i13 = 0; i13 < v51Var.f35119a3.size(); i13++) {
                    j61 j61Var2 = (j61) v51Var.f35119a3.get(i13);
                    for (int i14 = 0; i14 < j61Var2.O.size(); i14++) {
                        if (((r61) j61Var2.O.get(i14)).f37094b) {
                            ((r61) j61Var2.O.get(i14)).f37094b = false;
                            ((r61) j61Var2.O.get(i14)).invalidate();
                            j61Var2.k();
                        }
                    }
                }
                v51Var.invalidate();
                c0Var.i();
                c0Var.f49006a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof r61) {
            ((r61) view).setAnimatedScale(f7);
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
        int i11 = this.f49026y;
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
        y yVar = this.f49015m;
        int i11 = this.f49026y;
        w3 w3Var = this.f49008c;
        int[] iArr = this.A;
        b0 b0Var = this.f49006a;
        RectF rectF = this.f49009f;
        gk0 gk0Var = this.f49016n;
        rectF.set(gk0Var.f24303w);
        this.e = gk0Var.f24307y;
        int[] iArr2 = new int[2];
        if (z10) {
            gk0Var.getLocationOnScreen(iArr);
        }
        w3Var.getLocationOnScreen(iArr2);
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
        if (b0Var.getMeasuredHeight() + topOffset > w3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (w3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
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
            b0Var.setTranslationX(((w3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f49022t = b0Var.getTranslationY();
        } else {
            this.f49022t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f49010g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        gk0Var.setCustomEmojiEnterProgress(this.f49012j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49024w = z14;
            this.f49013k = false;
        } else {
            this.f49024w = false;
        }
        if (this.f49024w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        cw cwVar = yVar.f34452d0;
        if (z10 && this.f49024w) {
            z12 = true;
        } else {
            z12 = false;
        }
        cwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49025x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49012j;
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
            timeAnimator.f23677a = 0;
            timeAnimator.f23678b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49025x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49025x.addListener(new j70(17, this, z10));
        if (i11 == 4) {
            this.f49025x.setDuration(420L);
            this.f49025x.setInterpolator(qr.h);
        } else if (this.f49024w) {
            this.f49025x.setDuration(450L);
            this.f49025x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49025x.setDuration(350L);
            this.f49025x.setInterpolator(qr.f27380f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            gk0Var.O0 = true;
            gk0Var.invalidate();
            this.f49025x.setStartDelay(30L);
            this.f49025x.start();
        } else {
            gk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49025x;
            Objects.requireNonNull(valueAnimator3);
            y2 y2Var = new y2(valueAnimator3, 9);
            f0.f49048f = this.f49024w;
            f0.e = true;
            f0.f49049g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f49047c = y2Var;
        }
        HashSet hashSet = f0.f49045a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9065b == null) {
            z13 = true;
            cacheOutQueue.f9065b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f49046b = z13;
        f0.e = false;
        f0.f49049g = false;
    }

    public final void d() {
        if (!this.f49019q) {
            gk0 gk0Var = this.f49016n;
            if (gk0Var != null) {
                ValueAnimator valueAnimator = gk0Var.f24308y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                gk0Var.B0 = 0.0f;
                n6 n6Var = gk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                gk0Var.invalidate();
            }
            oc.e();
            this.f49019q = true;
            AndroidUtilities.hideKeyboard(this.f49008c);
            c(false);
            if (this.v) {
                o2 o2Var = this.f49020r;
                if (o2Var instanceof bo) {
                    ((bo) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49019q) {
            oc.e();
            this.f49019q = true;
            w3 w3Var = this.f49008c;
            AndroidUtilities.hideKeyboard(w3Var);
            w3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                o2 o2Var = this.f49020r;
                if (o2Var instanceof bo) {
                    ((bo) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49026y != 5) {
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
        y yVar = this.f49015m;
        yVar.f34461h0.setLayerType(i10, null);
        yVar.f34457f0.setLayerType(i10, null);
        if (this.f49024w) {
            for (int i11 = 0; i11 < Math.min(yVar.f34452d0.f26502b.getChildCount(), 16); i11++) {
                yVar.f34452d0.f26502b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f34454e0.setLayerType(i10, null);
        yVar.f34452d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f49015m;
            f61 f61Var = yVar.f34461h0;
            f61 f61Var2 = yVar.f34461h0;
            if (i10 < f61Var.getChildCount()) {
                if (f61Var2.getChildAt(i10) instanceof r61) {
                    r61 r61Var = (r61) f61Var2.getChildAt(i10);
                    if (r61Var.f37101x != null) {
                        r61Var.f37094b = false;
                        r61Var.invalidate();
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
        y yVar = this.f49015m;
        float y3 = yVar.getY();
        c61 c61Var = yVar.f34444a0;
        float y10 = c61Var.getY() + y3;
        f61 f61Var = yVar.f34461h0;
        int y11 = (int) (f61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = f61Var.getChildCount();
            rectF = this.f49011i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = f61Var.getChildAt(i10);
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
        int y12 = (int) (yVar.f34452d0.getY() + c61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f34452d0.f26502b.getChildCount(); i11++) {
            View childAt2 = yVar.f34452d0.f26502b.getChildAt(i11);
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
            yVar.f34467k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49026y == 4) {
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
        if (!this.f49024w) {
            y yVar = this.f49015m;
            yVar.f34457f0.setAlpha(this.f49012j);
            yVar.f34461h0.setAlpha(this.f49012j);
            yVar.f34463i0.setAlpha(this.f49012j);
            yVar.f34452d0.setAlpha(this.f49012j);
            yVar.f34454e0.setAlpha(this.f49012j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f49015m;
        c61 c61Var = yVar.f34444a0;
        c61 c61Var2 = yVar.f34444a0;
        boolean z10 = this.f49024w;
        b0 b0Var = this.f49006a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f48992f;
        }
        c61Var.setTranslationX(f7);
        c61Var2.setTranslationY(b0Var.h);
        c61Var2.setPivotX(b0Var.f48994r);
        c61Var2.setPivotY(b0Var.f48995s);
        c61Var2.setScaleX(b0Var.f48993n);
        c61Var2.setScaleY(b0Var.f48993n);
    }
}
