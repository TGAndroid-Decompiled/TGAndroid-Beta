package yg;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.m7;
import bi.n7;
import gg.t1;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.f61;
import org.telegram.ui.i61;
import org.telegram.ui.iw0;
import org.telegram.ui.m61;
import org.telegram.ui.u61;
import org.telegram.ui.y51;
import w7.a6;
import xh.t3;
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 f46950a;
    public final WindowManager f46951b;
    public final t3 f46952c;
    public final boolean d;
    public float e;
    public float f46954g;
    public float h;
    public float f46956j;
    public boolean f46957k;
    public boolean f46958l;
    public final y f46959m;
    public final pk0 f46960n;
    public final List f46961o;
    public kc0 f46962p;
    public boolean f46963q;
    public final p2 f46964r;
    public final f6 f46965s;
    public float f46966t;
    public float f46967u;
    public boolean v;
    public boolean f46968w;
    public ValueAnimator f46969x;
    public final int f46970y;
    public bh.d f46971z;
    public final RectF f46953f = new RectF();
    public final RectF f46955i = new RectF();

    public c0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, pk0 pk0Var, f6 f6Var, boolean z10) {
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
        this.f46970y = i10;
        this.f46961o = arrayList;
        this.f46964r = p2Var;
        this.f46965s = f6Var;
        if (p2Var != null) {
            context = p2Var.getContext();
        } else {
            context = pk0Var.getContext();
        }
        Context context2 = context;
        t3 t3Var = new t3(this, context2);
        this.f46952c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.web.c(this, 23));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        b0 b0Var = new b0(this, context2);
        this.f46950a = b0Var;
        int windowType = pk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = new y(this, p2Var, context2, windowType, z12, f6Var, pk0Var, p2Var);
        this.f46959m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z14 = pk0Var.f26173f1;
        boolean z15 = pk0Var.f26175g1;
        if (yVar.K1 != z14) {
            yVar.K1 = z14;
            yVar.L1 = z15;
            i61 i61Var = yVar.f34570h0;
            if (i61Var != null) {
                i61Var.invalidate();
            }
            y51 y51Var = yVar.f34572i0;
            if (y51Var != null) {
                y51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new l2.g(pk0Var, 25));
        yVar.setOnRecentClearedListener(new Object());
        yVar.setRecentReactions(arrayList);
        yVar.setSelectedReactions(hashSet);
        yVar.setDrawBackground(false);
        yVar.s(null);
        b0Var.addView(yVar, a6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
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
        t3Var.addView(b0Var, a6.d(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().t())) {
            yVar.setBackgroundDelegate(new sg.f0(13, this, pk0Var));
        }
        if (z13) {
            ((ViewGroup) pk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f46951b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.f46960n = pk0Var;
        pk0Var.setOnSwitchedToLoopView(new w(this, 0));
        pk0Var.f26163b1 = true;
        pk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new q(1, this, pk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        pk0 pk0Var = c0Var.f46960n;
        y yVar = c0Var.f46959m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            i61 i61Var = yVar.f34570h0;
            if (z10) {
                yVar.f34561d0.m(false);
                i61Var.invalidate();
                ArrayList arrayList = i61Var.f35138a3;
                i61Var.e1();
                yVar.f34566f0.b();
                yVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < i61Var.getChildCount()) {
                        if (i61Var.getChildAt(i10) instanceof u61) {
                            view = i61Var.getChildAt(i10);
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
                if (pk0Var.getPullingLeftProgress() > 0.0f) {
                    pk0Var.O0 = false;
                    ValueAnimator valueAnimator = pk0Var.f26201y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n7 n7Var = pk0Var.S;
                    if (n7Var != null) {
                        n7Var.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.f26201y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n7 n7Var2 = pk0Var.S;
                    if (n7Var2 != null) {
                        n7Var2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                y51 y51Var = yVar.f34572i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    m61 m61Var = (m61) arrayList.get(i11);
                    for (int i12 = 0; i12 < m61Var.O.size(); i12++) {
                        if (((u61) m61Var.O.get(i12)).f37128b) {
                            ((u61) m61Var.O.get(i12)).f37128b = false;
                            ((u61) m61Var.O.get(i12)).invalidate();
                            m61Var.k();
                        }
                    }
                }
                i61Var.invalidate();
                for (int i13 = 0; i13 < y51Var.f35138a3.size(); i13++) {
                    m61 m61Var2 = (m61) y51Var.f35138a3.get(i13);
                    for (int i14 = 0; i14 < m61Var2.O.size(); i14++) {
                        if (((u61) m61Var2.O.get(i14)).f37128b) {
                            ((u61) m61Var2.O.get(i14)).f37128b = false;
                            ((u61) m61Var2.O.get(i14)).invalidate();
                            m61Var2.k();
                        }
                    }
                }
                y51Var.invalidate();
                c0Var.i();
                c0Var.f46950a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof u61) {
            ((u61) view).setAnimatedScale(f7);
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
        int i11 = this.f46970y;
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
        y yVar = this.f46959m;
        int i11 = this.f46970y;
        t3 t3Var = this.f46952c;
        int[] iArr = this.A;
        b0 b0Var = this.f46950a;
        RectF rectF = this.f46953f;
        pk0 pk0Var = this.f46960n;
        rectF.set(pk0Var.f26196w);
        this.e = pk0Var.f26200y;
        int[] iArr2 = new int[2];
        if (z10) {
            pk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (yVar.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = pk0Var.getTopOffset() + (dp - i10);
        if (pk0Var.F0) {
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
            this.f46966t = b0Var.getTranslationY();
        } else {
            this.f46966t = topOffset;
            b0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.f46954g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        pk0Var.setCustomEmojiEnterProgress(this.f46956j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f46968w = z14;
            this.f46957k = false;
        } else {
            this.f46968w = false;
        }
        if (this.f46968w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        yVar.setEnterAnimationInProgress(z11);
        gw gwVar = yVar.f34561d0;
        if (z10 && this.f46968w) {
            z12 = true;
        } else {
            z12 = false;
        }
        gwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f46969x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f46956j;
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
            timeAnimator.f25925a = 0;
            timeAnimator.f25926b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f46969x = valueAnimator;
        valueAnimator.addUpdateListener(new m7(11, this, z10));
        if (!z10) {
            i();
        }
        this.f46969x.addListener(new iw0(13, this, z10));
        if (i11 == 4) {
            this.f46969x.setDuration(420L);
            this.f46969x.setInterpolator(wr.h);
        } else if (this.f46968w) {
            this.f46969x.setDuration(450L);
            this.f46969x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f46969x.setDuration(350L);
            this.f46969x.setInterpolator(wr.f28819f);
        }
        b0Var.invalidate();
        h(true);
        if (!z10) {
            pk0Var.O0 = true;
            pk0Var.invalidate();
            this.f46969x.setStartDelay(30L);
            this.f46969x.start();
        } else {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f46969x;
            Objects.requireNonNull(valueAnimator3);
            xh.x xVar = new xh.x(valueAnimator3, 16);
            f0.f46998f = this.f46968w;
            f0.e = true;
            f0.f46999g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f46997c = xVar;
        }
        HashSet hashSet = f0.f46995a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f7947b == null) {
            z13 = true;
            cacheOutQueue.f7947b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f46996b = z13;
        f0.e = false;
        f0.f46999g = false;
    }

    public final void d() {
        if (!this.f46963q) {
            pk0 pk0Var = this.f46960n;
            if (pk0Var != null) {
                ValueAnimator valueAnimator = pk0Var.f26201y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pk0Var.B0 = 0.0f;
                n7 n7Var = pk0Var.S;
                if (n7Var != null) {
                    n7Var.invalidate();
                }
                pk0Var.invalidate();
            }
            pc.e();
            this.f46963q = true;
            AndroidUtilities.hideKeyboard(this.f46952c);
            c(false);
            if (this.v) {
                p2 p2Var = this.f46964r;
                if (p2Var instanceof eo) {
                    ((eo) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f46963q) {
            pc.e();
            this.f46963q = true;
            t3 t3Var = this.f46952c;
            AndroidUtilities.hideKeyboard(t3Var);
            t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
            if (this.v) {
                p2 p2Var = this.f46964r;
                if (p2Var instanceof eo) {
                    ((eo) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f46970y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        y yVar = this.f46959m;
        yVar.f34570h0.setLayerType(i10, null);
        yVar.f34566f0.setLayerType(i10, null);
        if (this.f46968w) {
            for (int i11 = 0; i11 < Math.min(yVar.f34561d0.f28802b.getChildCount(), 16); i11++) {
                yVar.f34561d0.f28802b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        yVar.f34563e0.setLayerType(i10, null);
        yVar.f34561d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.f46959m;
            i61 i61Var = yVar.f34570h0;
            i61 i61Var2 = yVar.f34570h0;
            if (i10 < i61Var.getChildCount()) {
                if (i61Var2.getChildAt(i10) instanceof u61) {
                    u61 u61Var = (u61) i61Var2.getChildAt(i10);
                    if (u61Var.f37135x != null) {
                        u61Var.f37128b = false;
                        u61Var.invalidate();
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
        y yVar = this.f46959m;
        float y3 = yVar.getY();
        f61 f61Var = yVar.f34553a0;
        float y10 = f61Var.getY() + y3;
        i61 i61Var = yVar.f34570h0;
        int y11 = (int) (i61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = i61Var.getChildCount();
            rectF = this.f46955i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = i61Var.getChildAt(i10);
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
        int y12 = (int) (yVar.f34561d0.getY() + f61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.f34561d0.f28802b.getChildCount(); i11++) {
            View childAt2 = yVar.f34561d0.f28802b.getChildAt(i11);
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
            yVar.f34576k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new t1(28, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.f46970y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f46968w) {
            y yVar = this.f46959m;
            yVar.f34566f0.setAlpha(this.f46956j);
            yVar.f34570h0.setAlpha(this.f46956j);
            yVar.f34572i0.setAlpha(this.f46956j);
            yVar.f34561d0.setAlpha(this.f46956j);
            yVar.f34563e0.setAlpha(this.f46956j);
        }
    }

    public final void l() {
        float f7;
        y yVar = this.f46959m;
        f61 f61Var = yVar.f34553a0;
        f61 f61Var2 = yVar.f34553a0;
        boolean z10 = this.f46968w;
        b0 b0Var = this.f46950a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = b0Var.f46941f;
        }
        f61Var.setTranslationX(f7);
        f61Var2.setTranslationY(b0Var.h);
        f61Var2.setPivotX(b0Var.f46943r);
        f61Var2.setPivotY(b0Var.f46944s);
        f61Var2.setScaleX(b0Var.f46942n);
        f61Var2.setScaleY(b0Var.f46942n);
    }
}
