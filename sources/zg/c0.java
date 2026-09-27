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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.d61;
import org.telegram.ui.f70;
import org.telegram.ui.l61;
import org.telegram.ui.p51;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import org.telegram.ui.z51;
import w7.y5;
import yh.r2;
import yh.t3;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f49299a;
    public final WindowManager f49300b;
    public final t3 f49301c;
    public final boolean d;
    public float e;
    public float f49303g;
    public float h;
    public float f49305j;
    public boolean f49306k;
    public boolean f49307l;
    public final y f49308m;
    public final sk0 f49309n;
    public final List f49310o;
    public jc0 f49311p;
    public boolean f49312q;
    public final o2 f49313r;
    public final e6 f49314s;
    public float f49315t;
    public float f49316u;
    public boolean v;
    public boolean f49317w;
    public ValueAnimator f49318x;
    public final int f49319y;
    public ch.d f49320z;
    public final RectF f49302f = new RectF();
    public final RectF f49304i = new RectF();

    public c0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, e6 e6Var, boolean z10) {
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
        this.f49319y = i10;
        this.f49310o = arrayList;
        this.f49313r = o2Var;
        this.f49314s = e6Var;
        if (o2Var != null) {
            context = o2Var.getContext();
        } else {
            context = sk0Var.getContext();
        }
        Context context2 = context;
        t3 t3Var = new t3(this, context2);
        this.f49301c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f49299a = b0Var;
        int windowType = sk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, o2Var, context2, windowType, z12, e6Var, sk0Var, o2Var);
        this.f49308m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = sk0Var.f28297f1;
        boolean z15 = sk0Var.f28299g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            z51 z51Var = yVar.f32585h0;
            if (z51Var != null) {
                z51Var.invalidate();
            }
            p51 p51Var = yVar.f32587i0;
            if (p51Var != null) {
                p51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new ka.c(sk0Var, 29));
        yVar.setOnRecentClearedListener(new Object());
        yVar.setRecentReactions(arrayList);
        yVar.setSelectedReactions(hashSet);
        yVar.setDrawBackground(false);
        yVar.s(null);
        b0Var.addView(yVar, y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            b0Var.setClipChildren(false);
            b0Var.setClipToPadding(false);
            t3Var.setClipChildren(false);
            t3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        t3Var.addView(b0Var, y5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().t())) {
            yVar.setBackgroundDelegate(new s5.e(19, this, sk0Var));
        }
        if (z13) {
            ((ViewGroup) sk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49300b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.f49309n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new v(this, 0));
        sk0Var.f28287b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new k(3, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        sk0 sk0Var = c0Var.f49309n;
        y yVar = c0Var.f49308m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            z51 z51Var = yVar.f32585h0;
            if (z10) {
                yVar.f32576d0.m(false);
                z51Var.invalidate();
                ArrayList arrayList = z51Var.f33157a3;
                z51Var.g1();
                yVar.f32581f0.b();
                yVar.sendAccessibilityEvent(32);
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
                    yVar.performAccessibilityAction(64, null);
                }
                if (sk0Var.getPullingLeftProgress() > 0.0f) {
                    sk0Var.O0 = false;
                    ValueAnimator valueAnimator = sk0Var.f28325y0;
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
                    ValueAnimator valueAnimator2 = sk0Var.f28325y0;
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
                p51 p51Var = yVar.f32587i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d61 d61Var = (d61) arrayList.get(i11);
                    for (int i12 = 0; i12 < d61Var.O.size(); i12++) {
                        if (((l61) d61Var.O.get(i12)).f35256b) {
                            ((l61) d61Var.O.get(i12)).f35256b = false;
                            ((l61) d61Var.O.get(i12)).invalidate();
                            d61Var.k();
                        }
                    }
                }
                z51Var.invalidate();
                for (int i13 = 0; i13 < p51Var.f33157a3.size(); i13++) {
                    d61 d61Var2 = (d61) p51Var.f33157a3.get(i13);
                    for (int i14 = 0; i14 < d61Var2.O.size(); i14++) {
                        if (((l61) d61Var2.O.get(i14)).f35256b) {
                            ((l61) d61Var2.O.get(i14)).f35256b = false;
                            ((l61) d61Var2.O.get(i14)).invalidate();
                            d61Var2.k();
                        }
                    }
                }
                p51Var.invalidate();
                c0Var.i();
                c0Var.f49299a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof l61) {
            ((l61) view).setAnimatedScale(f7);
        } else if (view instanceof aw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f49319y;
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
        y yVar = this.f49308m;
        int i11 = this.f49319y;
        t3 t3Var = this.f49301c;
        int[] iArr = this.A;
        b0 b0Var = this.f49299a;
        RectF rectF = this.f49302f;
        sk0 sk0Var = this.f49309n;
        rectF.set(sk0Var.f28320w);
        this.e = sk0Var.f28324y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (yVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = sk0Var.getTopOffset() + (dp - i10);
        if (sk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
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
            b0Var.setTranslationX(((t3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f49315t = b0Var.getTranslationY();
        } else {
            this.f49315t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f49303g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        sk0Var.setCustomEmojiEnterProgress(this.f49305j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49317w = z14;
            this.f49306k = false;
        } else {
            this.f49317w = false;
        }
        if (this.f49317w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        ew ewVar = yVar.f32576d0;
        if (z10 && this.f49317w) {
            z12 = true;
        } else {
            z12 = false;
        }
        ewVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49318x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49305j;
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
            timeAnimator.f27840a = 0;
            timeAnimator.f27841b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49318x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49318x.addListener(new f70(17, this, z10));
        if (i11 == 4) {
            this.f49318x.setDuration(420L);
            this.f49318x.setInterpolator(sr.h);
        } else if (this.f49317w) {
            this.f49318x.setDuration(450L);
            this.f49318x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49318x.setDuration(350L);
            this.f49318x.setInterpolator(sr.f28359f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.f49318x.setStartDelay(30L);
            this.f49318x.start();
        } else {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49318x;
            Objects.requireNonNull(valueAnimator3);
            r2 r2Var = new r2(valueAnimator3, 10);
            f0.f49341f = this.f49317w;
            f0.e = true;
            f0.f49342g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f49340c = r2Var;
        }
        HashSet hashSet = f0.f49338a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9050b == null) {
            z13 = true;
            cacheOutQueue.f9050b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f49339b = z13;
        f0.e = false;
        f0.f49342g = false;
    }

    public final void d() {
        if (!this.f49312q) {
            sk0 sk0Var = this.f49309n;
            if (sk0Var != null) {
                ValueAnimator valueAnimator = sk0Var.f28325y0;
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
            qc.e();
            this.f49312q = true;
            AndroidUtilities.hideKeyboard(this.f49301c);
            c(false);
            if (this.v) {
                o2 o2Var = this.f49313r;
                if (o2Var instanceof xn) {
                    ((xn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49312q) {
            qc.e();
            this.f49312q = true;
            t3 t3Var = this.f49301c;
            AndroidUtilities.hideKeyboard(t3Var);
            t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                o2 o2Var = this.f49313r;
                if (o2Var instanceof xn) {
                    ((xn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49319y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new v(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        y yVar = this.f49308m;
        yVar.f32585h0.setLayerType(i10, null);
        yVar.f32581f0.setLayerType(i10, null);
        if (this.f49317w) {
            for (int i11 = 0; i11 < Math.min(yVar.f32576d0.f22722b.getChildCount(), 16); i11++) {
                yVar.f32576d0.f22722b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f32578e0.setLayerType(i10, null);
        yVar.f32576d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f49308m;
            z51 z51Var = yVar.f32585h0;
            z51 z51Var2 = yVar.f32585h0;
            if (i10 < z51Var.getChildCount()) {
                if (z51Var2.getChildAt(i10) instanceof l61) {
                    l61 l61Var = (l61) z51Var2.getChildAt(i10);
                    if (l61Var.f35263x != null) {
                        l61Var.f35256b = false;
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
        y yVar = this.f49308m;
        float y3 = yVar.getY();
        w51 w51Var = yVar.f32568a0;
        float y10 = w51Var.getY() + y3;
        z51 z51Var = yVar.f32585h0;
        int y11 = (int) (z51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = z51Var.getChildCount();
            rectF = this.f49304i;
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
        int y12 = (int) (yVar.f32576d0.getY() + w51Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f32576d0.f22722b.getChildCount(); i11++) {
            View childAt2 = yVar.f32576d0.f22722b.getChildAt(i11);
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
            yVar.f32591k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49319y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(sr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f49317w) {
            y yVar = this.f49308m;
            yVar.f32581f0.setAlpha(this.f49305j);
            yVar.f32585h0.setAlpha(this.f49305j);
            yVar.f32587i0.setAlpha(this.f49305j);
            yVar.f32576d0.setAlpha(this.f49305j);
            yVar.f32578e0.setAlpha(this.f49305j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f49308m;
        w51 w51Var = yVar.f32568a0;
        w51 w51Var2 = yVar.f32568a0;
        boolean z10 = this.f49317w;
        b0 b0Var = this.f49299a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f49285f;
        }
        w51Var.setTranslationX(f7);
        w51Var2.setTranslationY(b0Var.h);
        w51Var2.setPivotX(b0Var.f49287r);
        w51Var2.setPivotY(b0Var.f49288s);
        w51Var2.setScaleX(b0Var.f49286n);
        w51Var2.setScaleY(b0Var.f49286n);
    }
}
