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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yv;
import org.telegram.ui.b61;
import org.telegram.ui.bo;
import org.telegram.ui.e61;
import org.telegram.ui.h70;
import org.telegram.ui.i61;
import org.telegram.ui.q61;
import org.telegram.ui.u51;
import w7.x5;
import yh.v3;
import yh.x2;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f48976a;
    public final WindowManager f48977b;
    public final v3 f48978c;
    public final boolean d;
    public float e;
    public float f48980g;
    public float h;
    public float f48982j;
    public boolean f48983k;
    public boolean f48984l;
    public final y f48985m;
    public final fk0 f48986n;
    public final List f48987o;
    public bc0 f48988p;
    public boolean f48989q;
    public final n2 f48990r;
    public final e6 f48991s;
    public float f48992t;
    public float f48993u;
    public boolean v;
    public boolean f48994w;
    public ValueAnimator f48995x;
    public final int f48996y;
    public ch.d f48997z;
    public final RectF f48979f = new RectF();
    public final RectF f48981i = new RectF();

    public c0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, fk0 fk0Var, e6 e6Var, boolean z10) {
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
        this.f48996y = i10;
        this.f48987o = arrayList;
        this.f48990r = n2Var;
        this.f48991s = e6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = fk0Var.getContext();
        }
        Context context2 = context;
        v3 v3Var = new v3(this, context2);
        this.f48978c = v3Var;
        v3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f48976a = b0Var;
        int windowType = fk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, n2Var, context2, windowType, z12, e6Var, fk0Var, n2Var);
        this.f48985m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = fk0Var.f23980f1;
        boolean z15 = fk0Var.f23982g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            e61 e61Var = yVar.f34132h0;
            if (e61Var != null) {
                e61Var.invalidate();
            }
            u51 u51Var = yVar.f34134i0;
            if (u51Var != null) {
                u51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new v8.s(fk0Var));
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
            v3Var.setClipChildren(false);
            v3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        v3Var.addView(b0Var, x5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        v3Var.setClipChildren(false);
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(17, this, fk0Var));
        }
        if (z13) {
            ((ViewGroup) fk0Var.getParent()).addView(v3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f48977b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, v3Var, b10);
            windowManager.addView(v3Var, b10);
        }
        this.f48986n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new u(this, 0));
        fk0Var.f23970b1 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(0, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        fk0 fk0Var = c0Var.f48986n;
        y yVar = c0Var.f48985m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            e61 e61Var = yVar.f34132h0;
            if (z10) {
                yVar.f34123d0.m(false);
                e61Var.invalidate();
                ArrayList arrayList = e61Var.f34801a3;
                e61Var.f1();
                yVar.f34128f0.b();
                yVar.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < e61Var.getChildCount()) {
                        if (e61Var.getChildAt(i10) instanceof q61) {
                            view = e61Var.getChildAt(i10);
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
                if (fk0Var.getPullingLeftProgress() > 0.0f) {
                    fk0Var.O0 = false;
                    ValueAnimator valueAnimator = fk0Var.f24008y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    n6 n6Var = fk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    fk0Var.invalidate();
                } else {
                    fk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = fk0Var.f24008y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    n6 n6Var2 = fk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    fk0Var.invalidate();
                }
                u51 u51Var = yVar.f34134i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i61 i61Var = (i61) arrayList.get(i11);
                    for (int i12 = 0; i12 < i61Var.O.size(); i12++) {
                        if (((q61) i61Var.O.get(i12)).f36769b) {
                            ((q61) i61Var.O.get(i12)).f36769b = false;
                            ((q61) i61Var.O.get(i12)).invalidate();
                            i61Var.k();
                        }
                    }
                }
                e61Var.invalidate();
                for (int i13 = 0; i13 < u51Var.f34801a3.size(); i13++) {
                    i61 i61Var2 = (i61) u51Var.f34801a3.get(i13);
                    for (int i14 = 0; i14 < i61Var2.O.size(); i14++) {
                        if (((q61) i61Var2.O.get(i14)).f36769b) {
                            ((q61) i61Var2.O.get(i14)).f36769b = false;
                            ((q61) i61Var2.O.get(i14)).invalidate();
                            i61Var2.k();
                        }
                    }
                }
                u51Var.invalidate();
                c0Var.i();
                c0Var.f48976a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof q61) {
            ((q61) view).setAnimatedScale(f7);
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
        int i11 = this.f48996y;
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
        y yVar = this.f48985m;
        int i11 = this.f48996y;
        v3 v3Var = this.f48978c;
        int[] iArr = this.A;
        b0 b0Var = this.f48976a;
        RectF rectF = this.f48979f;
        fk0 fk0Var = this.f48986n;
        rectF.set(fk0Var.f24003w);
        this.e = fk0Var.f24007y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        v3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (yVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = fk0Var.getTopOffset() + (dp - i10);
        if (fk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > v3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (v3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
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
            b0Var.setTranslationX(((v3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f48992t = b0Var.getTranslationY();
        } else {
            this.f48992t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f48980g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        fk0Var.setCustomEmojiEnterProgress(this.f48982j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f48994w = z14;
            this.f48983k = false;
        } else {
            this.f48994w = false;
        }
        if (this.f48994w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        cw cwVar = yVar.f34123d0;
        if (z10 && this.f48994w) {
            z12 = true;
        } else {
            z12 = false;
        }
        cwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f48995x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f48982j;
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
            timeAnimator.f23400a = 0;
            timeAnimator.f23401b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f48995x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f48995x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f48995x.setDuration(420L);
            this.f48995x.setInterpolator(qr.h);
        } else if (this.f48994w) {
            this.f48995x.setDuration(450L);
            this.f48995x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f48995x.setDuration(350L);
            this.f48995x.setInterpolator(qr.f27420f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            fk0Var.O0 = true;
            fk0Var.invalidate();
            this.f48995x.setStartDelay(30L);
            this.f48995x.start();
        } else {
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f48995x;
            Objects.requireNonNull(valueAnimator3);
            x2 x2Var = new x2(valueAnimator3, 9);
            f0.f49018f = this.f48994w;
            f0.e = true;
            f0.f49019g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f49017c = x2Var;
        }
        HashSet hashSet = f0.f49015a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9062b == null) {
            z13 = true;
            cacheOutQueue.f9062b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f49016b = z13;
        f0.e = false;
        f0.f49019g = false;
    }

    public final void d() {
        if (!this.f48989q) {
            fk0 fk0Var = this.f48986n;
            if (fk0Var != null) {
                ValueAnimator valueAnimator = fk0Var.f24008y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fk0Var.B0 = 0.0f;
                n6 n6Var = fk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                fk0Var.invalidate();
            }
            oc.e();
            this.f48989q = true;
            AndroidUtilities.hideKeyboard(this.f48978c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f48990r;
                if (n2Var instanceof bo) {
                    ((bo) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f48989q) {
            oc.e();
            this.f48989q = true;
            v3 v3Var = this.f48978c;
            AndroidUtilities.hideKeyboard(v3Var);
            v3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                n2 n2Var = this.f48990r;
                if (n2Var instanceof bo) {
                    ((bo) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f48996y != 5) {
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
        y yVar = this.f48985m;
        yVar.f34132h0.setLayerType(i10, null);
        yVar.f34128f0.setLayerType(i10, null);
        if (this.f48994w) {
            for (int i11 = 0; i11 < Math.min(yVar.f34123d0.f26179b.getChildCount(), 16); i11++) {
                yVar.f34123d0.f26179b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f34125e0.setLayerType(i10, null);
        yVar.f34123d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f48985m;
            e61 e61Var = yVar.f34132h0;
            e61 e61Var2 = yVar.f34132h0;
            if (i10 < e61Var.getChildCount()) {
                if (e61Var2.getChildAt(i10) instanceof q61) {
                    q61 q61Var = (q61) e61Var2.getChildAt(i10);
                    if (q61Var.f36776x != null) {
                        q61Var.f36769b = false;
                        q61Var.invalidate();
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
        y yVar = this.f48985m;
        float y3 = yVar.getY();
        b61 b61Var = yVar.f34115a0;
        float y10 = b61Var.getY() + y3;
        e61 e61Var = yVar.f34132h0;
        int y11 = (int) (e61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e61Var.getChildCount();
            rectF = this.f48981i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = e61Var.getChildAt(i10);
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
        int y12 = (int) (yVar.f34123d0.getY() + b61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f34123d0.f26179b.getChildCount(); i11++) {
            View childAt2 = yVar.f34123d0.f26179b.getChildAt(i11);
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
            yVar.f34138k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f48996y == 4) {
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
        if (!this.f48994w) {
            y yVar = this.f48985m;
            yVar.f34128f0.setAlpha(this.f48982j);
            yVar.f34132h0.setAlpha(this.f48982j);
            yVar.f34134i0.setAlpha(this.f48982j);
            yVar.f34123d0.setAlpha(this.f48982j);
            yVar.f34125e0.setAlpha(this.f48982j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f48985m;
        b61 b61Var = yVar.f34115a0;
        b61 b61Var2 = yVar.f34115a0;
        boolean z10 = this.f48994w;
        b0 b0Var = this.f48976a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f48962f;
        }
        b61Var.setTranslationX(f7);
        b61Var2.setTranslationY(b0Var.h);
        b61Var2.setPivotX(b0Var.f48964r);
        b61Var2.setPivotY(b0Var.f48965s);
        b61Var2.setScaleX(b0Var.f48963n);
        b61Var2.setScaleY(b0Var.f48963n);
    }
}
