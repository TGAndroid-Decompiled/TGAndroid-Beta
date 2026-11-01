package sg;

import ag.p2;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.ic;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.b21;
import org.telegram.ui.e21;
import org.telegram.ui.i21;
import org.telegram.ui.q21;
import org.telegram.ui.t11;
import org.telegram.ui.un;
import w7.b6;
public final class b0 {
    public final int[] A;
    public final e2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f48286a;
    public final WindowManager f48287b;
    public final ph.k f48288c;
    public final boolean d;
    public float e;
    public float f48290g;
    public float h;
    public float f48292j;
    public boolean f48293k;
    public boolean f48294l;
    public final w f48295m;
    public final nj0 f48296n;
    public final List f48297o;
    public eb0 f48298p;
    public boolean f48299q;
    public final k2 f48300r;
    public final p6 f48301s;
    public float f48302t;
    public float f48303u;
    public boolean v;
    public boolean f48304w;
    public ValueAnimator f48305x;
    public final int f48306y;
    public vg.f f48307z;
    public final RectF f48289f = new RectF();
    public final RectF f48291i = new RectF();

    public b0(int i10, k2 k2Var, ArrayList arrayList, HashSet hashSet, nj0 nj0Var, p6 p6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        new Path();
        this.A = new int[2];
        this.B = new e2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f48306y = i10;
        this.f48297o = arrayList;
        this.f48300r = k2Var;
        this.f48301s = p6Var;
        if (k2Var != null) {
            context = k2Var.getContext();
        } else {
            context = nj0Var.getContext();
        }
        Context context2 = context;
        ph.k kVar = new ph.k(this, context2);
        this.f48288c = kVar;
        kVar.setOnClickListener(new rh.s(this, 10));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f48286a = a0Var;
        boolean z13 = z11;
        int windowType = nj0Var.getWindowType();
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, k2Var, context2, windowType, z12, p6Var, nj0Var, k2Var);
        this.f48295m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = nj0Var.f28875g1;
        boolean z15 = nj0Var.f28877h1;
        if (wVar.L1 != z14) {
            wVar.L1 = z14;
            wVar.M1 = z15;
            e21 e21Var = wVar.f37305h0;
            if (e21Var != null) {
                e21Var.invalidate();
            }
            t11 t11Var = wVar.f37307i0;
            if (t11Var != null) {
                t11Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new r2.y(nj0Var, 7));
        wVar.setOnRecentClearedListener(new oa.d(20));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions(hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        a0Var.addView(wVar, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            kVar.setClipChildren(false);
            kVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        int i13 = i12;
        float f7 = i11;
        kVar.addView(a0Var, b6.d(-1, -1.0f, i13, f7, f7, f7, 16.0f));
        kVar.setClipChildren(false);
        if (i10 == 1 || (nj0Var.getDelegate() != null && nj0Var.getDelegate().A())) {
            wVar.setBackgroundDelegate(new org.telegram.ui.web.k0(16, this, nj0Var));
        }
        if (z13) {
            ((ViewGroup) nj0Var.getParent()).addView(kVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.i0.W(context2).getWindowManager();
            this.f48287b = windowManager;
            org.telegram.messenger.i0.x3(windowManager, kVar, b10);
            windowManager.addView(kVar, b10);
        }
        this.f48296n = nj0Var;
        nj0Var.setOnSwitchedToLoopView(new t(this, 0));
        nj0Var.f28866c1 = true;
        nj0Var.invalidate();
        org.telegram.messenger.i0.h3(new rh.n(24, this, nj0Var), 50L);
        if (i10 != 5) {
            at.e().k(at.f14729j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        nj0 nj0Var = b0Var.f48296n;
        w wVar = b0Var.f48295m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            e21 e21Var = wVar.f37305h0;
            if (z10) {
                wVar.f37296d0.m(false);
                e21Var.invalidate();
                ArrayList arrayList = e21Var.f38260h3;
                e21Var.g1();
                wVar.f37301f0.b();
                wVar.sendAccessibilityEvent(32);
                nj0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < e21Var.getChildCount()) {
                        if (e21Var.getChildAt(i10) instanceof q21) {
                            view = e21Var.getChildAt(i10);
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
                if (nj0Var.getPullingLeftProgress() > 0.0f) {
                    nj0Var.O0 = false;
                    ValueAnimator valueAnimator = nj0Var.f28902y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    nj0Var.B0 = 0.0f;
                    fg.i iVar = nj0Var.S;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                    nj0Var.invalidate();
                } else {
                    nj0Var.O0 = true;
                    ValueAnimator valueAnimator2 = nj0Var.f28902y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nj0Var.B0 = 0.0f;
                    fg.i iVar2 = nj0Var.S;
                    if (iVar2 != null) {
                        iVar2.invalidate();
                    }
                    nj0Var.invalidate();
                }
                t11 t11Var = wVar.f37307i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i21 i21Var = (i21) arrayList.get(i11);
                    for (int i12 = 0; i12 < i21Var.O.size(); i12++) {
                        if (((q21) i21Var.O.get(i12)).f40663b) {
                            ((q21) i21Var.O.get(i12)).f40663b = false;
                            ((q21) i21Var.O.get(i12)).invalidate();
                            i21Var.k();
                        }
                    }
                }
                e21Var.invalidate();
                for (int i13 = 0; i13 < t11Var.f38260h3.size(); i13++) {
                    i21 i21Var2 = (i21) t11Var.f38260h3.get(i13);
                    for (int i14 = 0; i14 < i21Var2.O.size(); i14++) {
                        if (((q21) i21Var2.O.get(i14)).f40663b) {
                            ((q21) i21Var2.O.get(i14)).f40663b = false;
                            ((q21) i21Var2.O.get(i14)).invalidate();
                            i21Var2.k();
                        }
                    }
                }
                t11Var.invalidate();
                b0Var.i();
                b0Var.f48286a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof q21) {
            ((q21) view).setAnimatedScale(f7);
        } else if (view instanceof iv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f48306y;
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
        w wVar = this.f48295m;
        int i11 = this.f48306y;
        ph.k kVar = this.f48288c;
        int[] iArr = this.A;
        a0 a0Var = this.f48286a;
        RectF rectF = this.f48289f;
        nj0 nj0Var = this.f48296n;
        rectF.set(nj0Var.f28899x);
        this.e = nj0Var.D;
        int[] iArr2 = new int[2];
        if (z10) {
            nj0Var.getLocationOnScreen(iArr);
        }
        kVar.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.i0.L(44.0f)) - org.telegram.messenger.i0.L(52.0f);
        if (wVar.O0) {
            i10 = org.telegram.messenger.i0.L(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = nj0Var.getTopOffset() + (L - i10);
        if (nj0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.i0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > kVar.getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) {
            topOffset = (kVar.getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.i0.L(16.0f)) {
            topOffset = org.telegram.messenger.i0.L(16.0f);
        }
        float f7 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((kVar.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.i0.L(16.0f));
        } else {
            boolean z15 = true;
            if (i11 != 2 && i11 != 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.i0.L(2.0f));
                r18 = z15;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.i0.L(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f48302t = a0Var.getTranslationY();
        } else {
            this.f48302t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f48290g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        nj0Var.setCustomEmojiEnterProgress(this.f48292j);
        if (z10) {
            if (uz.o() >= 2 && tc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f48304w = z14;
            this.f48293k = false;
        } else {
            this.f48304w = false;
        }
        if (this.f48304w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        mv mvVar = wVar.f37296d0;
        if (z10 && this.f48304w) {
            z12 = true;
        } else {
            z12 = false;
        }
        mvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f48305x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f48292j;
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
            timeAnimator.f27578a = 0;
            timeAnimator.f27579b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f48305x = valueAnimator;
        valueAnimator.addUpdateListener(new jg.o0(10, this, z10));
        if (!z10) {
            i();
        }
        this.f48305x.addListener(new y(0, this, z10));
        if (i11 == 4) {
            this.f48305x.setDuration(420L);
            this.f48305x.setInterpolator(gr.h);
        } else if (this.f48304w) {
            this.f48305x.setDuration(450L);
            a30.j(0.5f, this.f48305x);
        } else {
            this.f48305x.setDuration(350L);
            this.f48305x.setInterpolator(gr.f26523f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            nj0Var.O0 = true;
            nj0Var.invalidate();
            this.f48305x.setStartDelay(30L);
            this.f48305x.start();
        } else {
            nj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f48305x;
            Objects.requireNonNull(valueAnimator3);
            v vVar = new v(valueAnimator3, 0);
            e0.f48333f = this.f48304w;
            e0.e = true;
            e0.f48334g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f48332c = vVar;
        }
        HashSet hashSet = e0.f48330a;
        com.google.android.gms.internal.cast.c0 c0Var = ic.D().f16258p;
        if (((CountDownLatch) c0Var.f4586c) == null) {
            z13 = true;
            c0Var.f4586c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f48331b = z13;
        e0.e = false;
        e0.f48334g = false;
    }

    public final void d() {
        if (!this.f48299q) {
            nj0 nj0Var = this.f48296n;
            if (nj0Var != null) {
                ValueAnimator valueAnimator = nj0Var.f28902y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nj0Var.B0 = 0.0f;
                fg.i iVar = nj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                nj0Var.invalidate();
            }
            wb.e();
            this.f48299q = true;
            org.telegram.messenger.i0.v1(this.f48288c);
            c(false);
            if (this.v) {
                k2 k2Var = this.f48300r;
                if (k2Var instanceof un) {
                    ((un) k2Var).oa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f48299q) {
            wb.e();
            this.f48299q = true;
            ph.k kVar = this.f48288c;
            org.telegram.messenger.i0.v1(kVar);
            kVar.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                k2 k2Var = this.f48300r;
                if (k2Var instanceof un) {
                    ((un) k2Var).oa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f48306y != 5) {
            at.e().k(at.f14735k1, 7);
        }
        org.telegram.messenger.i0.g3(new t(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        w wVar = this.f48295m;
        wVar.f37305h0.setLayerType(i10, null);
        wVar.f37301f0.setLayerType(i10, null);
        if (this.f48304w) {
            for (int i11 = 0; i11 < Math.min(wVar.f37296d0.f33184b.getChildCount(), 16); i11++) {
                wVar.f37296d0.f33184b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f37298e0.setLayerType(i10, null);
        wVar.f37296d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f48295m;
            e21 e21Var = wVar.f37305h0;
            e21 e21Var2 = wVar.f37305h0;
            if (i10 < e21Var.getChildCount()) {
                if (e21Var2.getChildAt(i10) instanceof q21) {
                    q21 q21Var = (q21) e21Var2.getChildAt(i10);
                    if (q21Var.f40671y != null) {
                        q21Var.f40663b = false;
                        q21Var.invalidate();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(boolean z10, float f7) {
        RectF rectF;
        HashSet hashSet;
        w wVar = this.f48295m;
        float y3 = wVar.getY();
        b21 b21Var = wVar.f37288a0;
        float y10 = b21Var.getY() + y3;
        e21 e21Var = wVar.f37305h0;
        int y11 = (int) (e21Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e21Var.getChildCount();
            rectF = this.f48291i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = e21Var.getChildAt(i10);
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
        int y12 = (int) (wVar.f37296d0.getY() + b21Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f37296d0.f33184b.getChildCount(); i11++) {
            View childAt2 = wVar.f37296d0.f33184b.getChildAt(i11);
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
            wVar.f37311k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new p2(28, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 14));
            if (this.f48306y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f48304w) {
            w wVar = this.f48295m;
            wVar.f37301f0.setAlpha(this.f48292j);
            wVar.f37305h0.setAlpha(this.f48292j);
            wVar.f37307i0.setAlpha(this.f48292j);
            wVar.f37296d0.setAlpha(this.f48292j);
            wVar.f37298e0.setAlpha(this.f48292j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f48295m;
        b21 b21Var = wVar.f37288a0;
        b21 b21Var2 = wVar.f37288a0;
        boolean z10 = this.f48304w;
        a0 a0Var = this.f48286a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f48276f;
        }
        b21Var.setTranslationX(f7);
        b21Var2.setTranslationY(a0Var.h);
        b21Var2.setPivotX(a0Var.f48278r);
        b21Var2.setPivotY(a0Var.f48279s);
        b21Var2.setScaleX(a0Var.f48277n);
        b21Var2.setScaleY(a0Var.f48277n);
    }
}
