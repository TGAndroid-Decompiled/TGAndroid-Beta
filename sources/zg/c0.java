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
import org.telegram.ui.a61;
import org.telegram.ui.bo;
import org.telegram.ui.d61;
import org.telegram.ui.h61;
import org.telegram.ui.h70;
import org.telegram.ui.p61;
import org.telegram.ui.t51;
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
    public final b0 f48983a;
    public final WindowManager f48984b;
    public final w3 f48985c;
    public final boolean d;
    public float e;
    public float f48987g;
    public float h;
    public float f48989j;
    public boolean f48990k;
    public boolean f48991l;
    public final y f48992m;
    public final fk0 f48993n;
    public final List f48994o;
    public bc0 f48995p;
    public boolean f48996q;
    public final n2 f48997r;
    public final e6 f48998s;
    public float f48999t;
    public float f49000u;
    public boolean v;
    public boolean f49001w;
    public ValueAnimator f49002x;
    public final int f49003y;
    public ch.d f49004z;
    public final RectF f48986f = new RectF();
    public final RectF f48988i = new RectF();

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
        this.f49003y = i10;
        this.f48994o = arrayList;
        this.f48997r = n2Var;
        this.f48998s = e6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = fk0Var.getContext();
        }
        Context context2 = context;
        w3 w3Var = new w3(this, context2);
        this.f48985c = w3Var;
        w3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f48983a = b0Var;
        int windowType = fk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, n2Var, context2, windowType, z12, e6Var, fk0Var, n2Var);
        this.f48992m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = fk0Var.f23981f1;
        boolean z15 = fk0Var.f23983g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            d61 d61Var = yVar.f33796h0;
            if (d61Var != null) {
                d61Var.invalidate();
            }
            t51 t51Var = yVar.f33798i0;
            if (t51Var != null) {
                t51Var.invalidate();
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
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(17, this, fk0Var));
        }
        if (z13) {
            ((ViewGroup) fk0Var.getParent()).addView(w3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f48984b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, w3Var, b10);
            windowManager.addView(w3Var, b10);
        }
        this.f48993n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new u(this, 0));
        fk0Var.f23971b1 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(0, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        fk0 fk0Var = c0Var.f48993n;
        y yVar = c0Var.f48992m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            d61 d61Var = yVar.f33796h0;
            if (z10) {
                yVar.f33787d0.m(false);
                d61Var.invalidate();
                ArrayList arrayList = d61Var.f34517a3;
                d61Var.f1();
                yVar.f33792f0.b();
                yVar.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < d61Var.getChildCount()) {
                        if (d61Var.getChildAt(i10) instanceof p61) {
                            view = d61Var.getChildAt(i10);
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
                    ValueAnimator valueAnimator = fk0Var.f24009y0;
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
                    ValueAnimator valueAnimator2 = fk0Var.f24009y0;
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
                t51 t51Var = yVar.f33798i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    h61 h61Var = (h61) arrayList.get(i11);
                    for (int i12 = 0; i12 < h61Var.O.size(); i12++) {
                        if (((p61) h61Var.O.get(i12)).f36445b) {
                            ((p61) h61Var.O.get(i12)).f36445b = false;
                            ((p61) h61Var.O.get(i12)).invalidate();
                            h61Var.k();
                        }
                    }
                }
                d61Var.invalidate();
                for (int i13 = 0; i13 < t51Var.f34517a3.size(); i13++) {
                    h61 h61Var2 = (h61) t51Var.f34517a3.get(i13);
                    for (int i14 = 0; i14 < h61Var2.O.size(); i14++) {
                        if (((p61) h61Var2.O.get(i14)).f36445b) {
                            ((p61) h61Var2.O.get(i14)).f36445b = false;
                            ((p61) h61Var2.O.get(i14)).invalidate();
                            h61Var2.k();
                        }
                    }
                }
                t51Var.invalidate();
                c0Var.i();
                c0Var.f48983a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof p61) {
            ((p61) view).setAnimatedScale(f7);
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
        int i11 = this.f49003y;
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
        y yVar = this.f48992m;
        int i11 = this.f49003y;
        w3 w3Var = this.f48985c;
        int[] iArr = this.A;
        b0 b0Var = this.f48983a;
        RectF rectF = this.f48986f;
        fk0 fk0Var = this.f48993n;
        rectF.set(fk0Var.f24004w);
        this.e = fk0Var.f24008y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        w3Var.getLocationOnScreen(iArr2);
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
            this.f48999t = b0Var.getTranslationY();
        } else {
            this.f48999t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f48987g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        fk0Var.setCustomEmojiEnterProgress(this.f48989j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49001w = z14;
            this.f48990k = false;
        } else {
            this.f49001w = false;
        }
        if (this.f49001w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        cw cwVar = yVar.f33787d0;
        if (z10 && this.f49001w) {
            z12 = true;
        } else {
            z12 = false;
        }
        cwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49002x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f48989j;
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
            timeAnimator.f23403a = 0;
            timeAnimator.f23404b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49002x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49002x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f49002x.setDuration(420L);
            this.f49002x.setInterpolator(qr.h);
        } else if (this.f49001w) {
            this.f49002x.setDuration(450L);
            this.f49002x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49002x.setDuration(350L);
            this.f49002x.setInterpolator(qr.f27423f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            fk0Var.O0 = true;
            fk0Var.invalidate();
            this.f49002x.setStartDelay(30L);
            this.f49002x.start();
        } else {
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49002x;
            Objects.requireNonNull(valueAnimator3);
            y2 y2Var = new y2(valueAnimator3, 9);
            f0.f49025f = this.f49001w;
            f0.e = true;
            f0.f49026g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f49024c = y2Var;
        }
        HashSet hashSet = f0.f49022a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9060b == null) {
            z13 = true;
            cacheOutQueue.f9060b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f49023b = z13;
        f0.e = false;
        f0.f49026g = false;
    }

    public final void d() {
        if (!this.f48996q) {
            fk0 fk0Var = this.f48993n;
            if (fk0Var != null) {
                ValueAnimator valueAnimator = fk0Var.f24009y0;
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
            this.f48996q = true;
            AndroidUtilities.hideKeyboard(this.f48985c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f48997r;
                if (n2Var instanceof bo) {
                    ((bo) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f48996q) {
            oc.e();
            this.f48996q = true;
            w3 w3Var = this.f48985c;
            AndroidUtilities.hideKeyboard(w3Var);
            w3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                n2 n2Var = this.f48997r;
                if (n2Var instanceof bo) {
                    ((bo) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49003y != 5) {
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
        y yVar = this.f48992m;
        yVar.f33796h0.setLayerType(i10, null);
        yVar.f33792f0.setLayerType(i10, null);
        if (this.f49001w) {
            for (int i11 = 0; i11 < Math.min(yVar.f33787d0.f26180b.getChildCount(), 16); i11++) {
                yVar.f33787d0.f26180b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f33789e0.setLayerType(i10, null);
        yVar.f33787d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f48992m;
            d61 d61Var = yVar.f33796h0;
            d61 d61Var2 = yVar.f33796h0;
            if (i10 < d61Var.getChildCount()) {
                if (d61Var2.getChildAt(i10) instanceof p61) {
                    p61 p61Var = (p61) d61Var2.getChildAt(i10);
                    if (p61Var.f36452x != null) {
                        p61Var.f36445b = false;
                        p61Var.invalidate();
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
        y yVar = this.f48992m;
        float y3 = yVar.getY();
        a61 a61Var = yVar.f33779a0;
        float y10 = a61Var.getY() + y3;
        d61 d61Var = yVar.f33796h0;
        int y11 = (int) (d61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = d61Var.getChildCount();
            rectF = this.f48988i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = d61Var.getChildAt(i10);
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
        int y12 = (int) (yVar.f33787d0.getY() + a61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f33787d0.f26180b.getChildCount(); i11++) {
            View childAt2 = yVar.f33787d0.f26180b.getChildAt(i11);
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
            yVar.f33802k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49003y == 4) {
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
        if (!this.f49001w) {
            y yVar = this.f48992m;
            yVar.f33792f0.setAlpha(this.f48989j);
            yVar.f33796h0.setAlpha(this.f48989j);
            yVar.f33798i0.setAlpha(this.f48989j);
            yVar.f33787d0.setAlpha(this.f48989j);
            yVar.f33789e0.setAlpha(this.f48989j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f48992m;
        a61 a61Var = yVar.f33779a0;
        a61 a61Var2 = yVar.f33779a0;
        boolean z10 = this.f49001w;
        b0 b0Var = this.f48983a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f48969f;
        }
        a61Var.setTranslationX(f7);
        a61Var2.setTranslationY(b0Var.h);
        a61Var2.setPivotX(b0Var.f48971r);
        a61Var2.setPivotY(b0Var.f48972s);
        a61Var2.setScaleX(b0Var.f48970n);
        a61Var2.setScaleY(b0Var.f48970n);
    }
}
