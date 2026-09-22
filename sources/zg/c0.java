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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zv;
import org.telegram.ui.d61;
import org.telegram.ui.g61;
import org.telegram.ui.h70;
import org.telegram.ui.k61;
import org.telegram.ui.s61;
import org.telegram.ui.w51;
import org.telegram.ui.zn;
import w7.y5;
import yh.s2;
import yh.s5;
import yh.u3;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f49303a;
    public final WindowManager f49304b;
    public final u3 f49305c;
    public final boolean d;
    public float e;
    public float f49307g;
    public float h;
    public float f49309j;
    public boolean f49310k;
    public boolean f49311l;
    public final y f49312m;
    public final sk0 f49313n;
    public final List f49314o;
    public jc0 f49315p;
    public boolean f49316q;
    public final n2 f49317r;
    public final f6 f49318s;
    public float f49319t;
    public float f49320u;
    public boolean v;
    public boolean f49321w;
    public ValueAnimator f49322x;
    public final int f49323y;
    public ch.d f49324z;
    public final RectF f49306f = new RectF();
    public final RectF f49308i = new RectF();

    public c0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, f6 f6Var, boolean z10) {
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
        this.f49323y = i10;
        this.f49314o = arrayList;
        this.f49317r = n2Var;
        this.f49318s = f6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = sk0Var.getContext();
        }
        Context context2 = context;
        u3 u3Var = new u3(this, context2);
        this.f49305c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f49303a = b0Var;
        int windowType = sk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, n2Var, context2, windowType, z12, f6Var, sk0Var, n2Var);
        this.f49312m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = sk0Var.f28241f1;
        boolean z15 = sk0Var.f28243g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            g61 g61Var = yVar.f34817h0;
            if (g61Var != null) {
                g61Var.invalidate();
            }
            w51 w51Var = yVar.f34819i0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new o0.b(sk0Var, 27));
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
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        u3Var.addView(b0Var, y5.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new s5.e(18, this, sk0Var));
        }
        if (z13) {
            ((ViewGroup) sk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f49304b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.f49313n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new v(this, 0));
        sk0Var.f28231b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new s5(6, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        sk0 sk0Var = c0Var.f49313n;
        y yVar = c0Var.f49312m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            g61 g61Var = yVar.f34817h0;
            if (z10) {
                yVar.f34808d0.m(false);
                g61Var.invalidate();
                ArrayList arrayList = g61Var.f35343a3;
                g61Var.g1();
                yVar.f34813f0.b();
                yVar.sendAccessibilityEvent(32);
                sk0Var.setImportantForAccessibility(4);
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
                    yVar.performAccessibilityAction(64, null);
                }
                if (sk0Var.getPullingLeftProgress() > 0.0f) {
                    sk0Var.O0 = false;
                    ValueAnimator valueAnimator = sk0Var.f28269y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    n6 n6Var = sk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    sk0Var.invalidate();
                } else {
                    sk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = sk0Var.f28269y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    n6 n6Var2 = sk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    sk0Var.invalidate();
                }
                w51 w51Var = yVar.f34819i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k61 k61Var = (k61) arrayList.get(i11);
                    for (int i12 = 0; i12 < k61Var.O.size(); i12++) {
                        if (((s61) k61Var.O.get(i12)).f37329b) {
                            ((s61) k61Var.O.get(i12)).f37329b = false;
                            ((s61) k61Var.O.get(i12)).invalidate();
                            k61Var.k();
                        }
                    }
                }
                g61Var.invalidate();
                for (int i13 = 0; i13 < w51Var.f35343a3.size(); i13++) {
                    k61 k61Var2 = (k61) w51Var.f35343a3.get(i13);
                    for (int i14 = 0; i14 < k61Var2.O.size(); i14++) {
                        if (((s61) k61Var2.O.get(i14)).f37329b) {
                            ((s61) k61Var2.O.get(i14)).f37329b = false;
                            ((s61) k61Var2.O.get(i14)).invalidate();
                            k61Var2.k();
                        }
                    }
                }
                w51Var.invalidate();
                c0Var.i();
                c0Var.f49303a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof s61) {
            ((s61) view).setAnimatedScale(f7);
        } else if (view instanceof zv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f49323y;
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
        y yVar = this.f49312m;
        int i11 = this.f49323y;
        u3 u3Var = this.f49305c;
        int[] iArr = this.A;
        b0 b0Var = this.f49303a;
        RectF rectF = this.f49306f;
        sk0 sk0Var = this.f49313n;
        rectF.set(sk0Var.f28264w);
        this.e = sk0Var.f28268y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
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
        if (b0Var.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
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
            b0Var.setTranslationX(((u3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f49319t = b0Var.getTranslationY();
        } else {
            this.f49319t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f49307g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        sk0Var.setCustomEmojiEnterProgress(this.f49309j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49321w = z14;
            this.f49310k = false;
        } else {
            this.f49321w = false;
        }
        if (this.f49321w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        dw dwVar = yVar.f34808d0;
        if (z10 && this.f49321w) {
            z12 = true;
        } else {
            z12 = false;
        }
        dwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f49322x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f49309j;
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
            timeAnimator.f27684a = 0;
            timeAnimator.f27685b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f49322x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.f49322x.addListener(new h70(17, this, z10));
        if (i11 == 4) {
            this.f49322x.setDuration(420L);
            this.f49322x.setInterpolator(qr.h);
        } else if (this.f49321w) {
            this.f49322x.setDuration(450L);
            this.f49322x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f49322x.setDuration(350L);
            this.f49322x.setInterpolator(qr.f27653f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.f49322x.setStartDelay(30L);
            this.f49322x.start();
        } else {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f49322x;
            Objects.requireNonNull(valueAnimator3);
            s2 s2Var = new s2(valueAnimator3, 10);
            f0.f49345f = this.f49321w;
            f0.e = true;
            f0.f49346g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f49344c = s2Var;
        }
        HashSet hashSet = f0.f49342a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9065b == null) {
            z13 = true;
            cacheOutQueue.f9065b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f49343b = z13;
        f0.e = false;
        f0.f49346g = false;
    }

    public final void d() {
        if (!this.f49316q) {
            sk0 sk0Var = this.f49313n;
            if (sk0Var != null) {
                ValueAnimator valueAnimator = sk0Var.f28269y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sk0Var.B0 = 0.0f;
                n6 n6Var = sk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                sk0Var.invalidate();
            }
            pc.e();
            this.f49316q = true;
            AndroidUtilities.hideKeyboard(this.f49305c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f49317r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f49316q) {
            pc.e();
            this.f49316q = true;
            u3 u3Var = this.f49305c;
            AndroidUtilities.hideKeyboard(u3Var);
            u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                n2 n2Var = this.f49317r;
                if (n2Var instanceof zn) {
                    ((zn) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f49323y != 5) {
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
        y yVar = this.f49312m;
        yVar.f34817h0.setLayerType(i10, null);
        yVar.f34813f0.setLayerType(i10, null);
        if (this.f49321w) {
            for (int i11 = 0; i11 < Math.min(yVar.f34808d0.f22703b.getChildCount(), 16); i11++) {
                yVar.f34808d0.f22703b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f34810e0.setLayerType(i10, null);
        yVar.f34808d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f49312m;
            g61 g61Var = yVar.f34817h0;
            g61 g61Var2 = yVar.f34817h0;
            if (i10 < g61Var.getChildCount()) {
                if (g61Var2.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var2.getChildAt(i10);
                    if (s61Var.f37336x != null) {
                        s61Var.f37329b = false;
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
        y yVar = this.f49312m;
        float y3 = yVar.getY();
        d61 d61Var = yVar.f34800a0;
        float y10 = d61Var.getY() + y3;
        g61 g61Var = yVar.f34817h0;
        int y11 = (int) (g61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g61Var.getChildCount();
            rectF = this.f49308i;
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
        int y12 = (int) (yVar.f34808d0.getY() + d61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f34808d0.f22703b.getChildCount(); i11++) {
            View childAt2 = yVar.f34808d0.f22703b.getChildAt(i11);
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
            yVar.f34823k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f49323y == 4) {
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
        if (!this.f49321w) {
            y yVar = this.f49312m;
            yVar.f34813f0.setAlpha(this.f49309j);
            yVar.f34817h0.setAlpha(this.f49309j);
            yVar.f34819i0.setAlpha(this.f49309j);
            yVar.f34808d0.setAlpha(this.f49309j);
            yVar.f34810e0.setAlpha(this.f49309j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f49312m;
        d61 d61Var = yVar.f34800a0;
        d61 d61Var2 = yVar.f34800a0;
        boolean z10 = this.f49321w;
        b0 b0Var = this.f49303a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f49289f;
        }
        d61Var.setTranslationX(f7);
        d61Var2.setTranslationY(b0Var.h);
        d61Var2.setPivotX(b0Var.f49291r);
        d61Var2.setPivotY(b0Var.f49292s);
        d61Var2.setScaleX(b0Var.f49290n);
        d61Var2.setScaleY(b0Var.f49290n);
    }
}
