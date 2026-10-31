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
import org.telegram.messenger.hc;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.wb;
import org.telegram.ui.d21;
import org.telegram.ui.g21;
import org.telegram.ui.k21;
import org.telegram.ui.s21;
import org.telegram.ui.un;
import org.telegram.ui.v11;
import w7.b6;
public final class b0 {
    public final int[] A;
    public final e2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f48275a;
    public final WindowManager f48276b;
    public final ph.k f48277c;
    public final boolean d;
    public float e;
    public float f48279g;
    public float h;
    public float f48281j;
    public boolean f48282k;
    public boolean f48283l;
    public final w f48284m;
    public final mj0 f48285n;
    public final List f48286o;
    public eb0 f48287p;
    public boolean f48288q;
    public final k2 f48289r;
    public final p6 f48290s;
    public float f48291t;
    public float f48292u;
    public boolean v;
    public boolean f48293w;
    public ValueAnimator f48294x;
    public final int f48295y;
    public vg.f f48296z;
    public final RectF f48278f = new RectF();
    public final RectF f48280i = new RectF();

    public b0(int i10, k2 k2Var, ArrayList arrayList, HashSet hashSet, mj0 mj0Var, p6 p6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        new Path();
        this.A = new int[2];
        this.B = new e2.f(null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f48295y = i10;
        this.f48286o = arrayList;
        this.f48289r = k2Var;
        this.f48290s = p6Var;
        if (k2Var != null) {
            context = k2Var.getContext();
        } else {
            context = mj0Var.getContext();
        }
        Context context2 = context;
        ph.k kVar = new ph.k(this, context2);
        this.f48277c = kVar;
        kVar.setOnClickListener(new rh.s(this, 10));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f48275a = a0Var;
        boolean z13 = z11;
        int windowType = mj0Var.getWindowType();
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        w wVar = new w(this, k2Var, context2, windowType, z12, p6Var, mj0Var, k2Var);
        this.f48284m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z14 = mj0Var.f28514g1;
        boolean z15 = mj0Var.f28516h1;
        if (wVar.L1 != z14) {
            wVar.L1 = z14;
            wVar.M1 = z15;
            g21 g21Var = wVar.f38129h0;
            if (g21Var != null) {
                g21Var.invalidate();
            }
            v11 v11Var = wVar.f38131i0;
            if (v11Var != null) {
                v11Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new r2.y(mj0Var, 7));
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
        if (i10 == 1 || (mj0Var.getDelegate() != null && mj0Var.getDelegate().A())) {
            wVar.setBackgroundDelegate(new org.telegram.ui.web.k0(16, this, mj0Var));
        }
        if (z13) {
            ((ViewGroup) mj0Var.getParent()).addView(kVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.i0.W(context2).getWindowManager();
            this.f48276b = windowManager;
            org.telegram.messenger.i0.x3(windowManager, kVar, b10);
            windowManager.addView(kVar, b10);
        }
        this.f48285n = mj0Var;
        mj0Var.setOnSwitchedToLoopView(new t(this, 0));
        mj0Var.f28505c1 = true;
        mj0Var.invalidate();
        org.telegram.messenger.i0.h3(new rh.o(23, this, mj0Var), 50L);
        if (i10 != 5) {
            zs.e().k(zs.f19633j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        mj0 mj0Var = b0Var.f48285n;
        w wVar = b0Var.f48284m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            g21 g21Var = wVar.f38129h0;
            if (z10) {
                wVar.f38120d0.m(false);
                g21Var.invalidate();
                ArrayList arrayList = g21Var.f39032h3;
                g21Var.g1();
                wVar.f38125f0.b();
                wVar.sendAccessibilityEvent(32);
                mj0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < g21Var.getChildCount()) {
                        if (g21Var.getChildAt(i10) instanceof s21) {
                            view = g21Var.getChildAt(i10);
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
                if (mj0Var.getPullingLeftProgress() > 0.0f) {
                    mj0Var.O0 = false;
                    ValueAnimator valueAnimator = mj0Var.f28541y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mj0Var.B0 = 0.0f;
                    fg.i iVar = mj0Var.S;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                    mj0Var.invalidate();
                } else {
                    mj0Var.O0 = true;
                    ValueAnimator valueAnimator2 = mj0Var.f28541y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    mj0Var.B0 = 0.0f;
                    fg.i iVar2 = mj0Var.S;
                    if (iVar2 != null) {
                        iVar2.invalidate();
                    }
                    mj0Var.invalidate();
                }
                v11 v11Var = wVar.f38131i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k21 k21Var = (k21) arrayList.get(i11);
                    for (int i12 = 0; i12 < k21Var.O.size(); i12++) {
                        if (((s21) k21Var.O.get(i12)).f41357b) {
                            ((s21) k21Var.O.get(i12)).f41357b = false;
                            ((s21) k21Var.O.get(i12)).invalidate();
                            k21Var.k();
                        }
                    }
                }
                g21Var.invalidate();
                for (int i13 = 0; i13 < v11Var.f39032h3.size(); i13++) {
                    k21 k21Var2 = (k21) v11Var.f39032h3.get(i13);
                    for (int i14 = 0; i14 < k21Var2.O.size(); i14++) {
                        if (((s21) k21Var2.O.get(i14)).f41357b) {
                            ((s21) k21Var2.O.get(i14)).f41357b = false;
                            ((s21) k21Var2.O.get(i14)).invalidate();
                            k21Var2.k();
                        }
                    }
                }
                v11Var.invalidate();
                b0Var.i();
                b0Var.f48275a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof s21) {
            ((s21) view).setAnimatedScale(f7);
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
        int i11 = this.f48295y;
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
        w wVar = this.f48284m;
        int i11 = this.f48295y;
        ph.k kVar = this.f48277c;
        int[] iArr = this.A;
        a0 a0Var = this.f48275a;
        RectF rectF = this.f48278f;
        mj0 mj0Var = this.f48285n;
        rectF.set(mj0Var.f28538x);
        this.e = mj0Var.D;
        int[] iArr2 = new int[2];
        if (z10) {
            mj0Var.getLocationOnScreen(iArr);
        }
        kVar.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.i0.L(44.0f)) - org.telegram.messenger.i0.L(52.0f);
        if (wVar.O0) {
            i10 = org.telegram.messenger.i0.L(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = mj0Var.getTopOffset() + (L - i10);
        if (mj0Var.F0) {
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
            this.f48291t = a0Var.getTranslationY();
        } else {
            this.f48291t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f48279g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        mj0Var.setCustomEmojiEnterProgress(this.f48281j);
        if (z10) {
            if (tz.o() >= 2 && sc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f48293w = z14;
            this.f48282k = false;
        } else {
            this.f48293w = false;
        }
        if (this.f48293w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        mv mvVar = wVar.f38120d0;
        if (z10 && this.f48293w) {
            z12 = true;
        } else {
            z12 = false;
        }
        mvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f48294x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f48281j;
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
            timeAnimator.f27105a = 0;
            timeAnimator.f27106b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f48294x = valueAnimator;
        valueAnimator.addUpdateListener(new jg.o0(10, this, z10));
        if (!z10) {
            i();
        }
        this.f48294x.addListener(new y(0, this, z10));
        if (i11 == 4) {
            this.f48294x.setDuration(420L);
            this.f48294x.setInterpolator(gr.h);
        } else if (this.f48293w) {
            this.f48294x.setDuration(450L);
            z20.j(0.5f, this.f48294x);
        } else {
            this.f48294x.setDuration(350L);
            this.f48294x.setInterpolator(gr.f26495f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            mj0Var.O0 = true;
            mj0Var.invalidate();
            this.f48294x.setStartDelay(30L);
            this.f48294x.start();
        } else {
            mj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f48294x;
            Objects.requireNonNull(valueAnimator3);
            v vVar = new v(valueAnimator3, 0);
            e0.f48322f = this.f48293w;
            e0.e = true;
            e0.f48323g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f48321c = vVar;
        }
        HashSet hashSet = e0.f48319a;
        com.google.android.gms.internal.cast.c0 c0Var = hc.D().f15865p;
        if (((CountDownLatch) c0Var.f4586c) == null) {
            z13 = true;
            c0Var.f4586c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        e0.f48320b = z13;
        e0.e = false;
        e0.f48323g = false;
    }

    public final void d() {
        if (!this.f48288q) {
            mj0 mj0Var = this.f48285n;
            if (mj0Var != null) {
                ValueAnimator valueAnimator = mj0Var.f28541y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mj0Var.B0 = 0.0f;
                fg.i iVar = mj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                mj0Var.invalidate();
            }
            wb.e();
            this.f48288q = true;
            org.telegram.messenger.i0.v1(this.f48277c);
            c(false);
            if (this.v) {
                k2 k2Var = this.f48289r;
                if (k2Var instanceof un) {
                    ((un) k2Var).ja(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f48288q) {
            wb.e();
            this.f48288q = true;
            ph.k kVar = this.f48277c;
            org.telegram.messenger.i0.v1(kVar);
            kVar.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                k2 k2Var = this.f48289r;
                if (k2Var instanceof un) {
                    ((un) k2Var).ja(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f48295y != 5) {
            zs.e().k(zs.f19639k1, 7);
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
        w wVar = this.f48284m;
        wVar.f38129h0.setLayerType(i10, null);
        wVar.f38125f0.setLayerType(i10, null);
        if (this.f48293w) {
            for (int i11 = 0; i11 < Math.min(wVar.f38120d0.f32758b.getChildCount(), 16); i11++) {
                wVar.f38120d0.f32758b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        wVar.f38122e0.setLayerType(i10, null);
        wVar.f38120d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.f48284m;
            g21 g21Var = wVar.f38129h0;
            g21 g21Var2 = wVar.f38129h0;
            if (i10 < g21Var.getChildCount()) {
                if (g21Var2.getChildAt(i10) instanceof s21) {
                    s21 s21Var = (s21) g21Var2.getChildAt(i10);
                    if (s21Var.f41365y != null) {
                        s21Var.f41357b = false;
                        s21Var.invalidate();
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
        w wVar = this.f48284m;
        float y3 = wVar.getY();
        d21 d21Var = wVar.f38112a0;
        float y10 = d21Var.getY() + y3;
        g21 g21Var = wVar.f38129h0;
        int y11 = (int) (g21Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g21Var.getChildCount();
            rectF = this.f48280i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = g21Var.getChildAt(i10);
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
        int y12 = (int) (wVar.f38120d0.getY() + d21Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.f38120d0.f32758b.getChildCount(); i11++) {
            View childAt2 = wVar.f38120d0.f32758b.getChildAt(i11);
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
            wVar.f38135k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new p2(28, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 14));
            if (this.f48295y == 4) {
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
        if (!this.f48293w) {
            w wVar = this.f48284m;
            wVar.f38125f0.setAlpha(this.f48281j);
            wVar.f38129h0.setAlpha(this.f48281j);
            wVar.f38131i0.setAlpha(this.f48281j);
            wVar.f38120d0.setAlpha(this.f48281j);
            wVar.f38122e0.setAlpha(this.f48281j);
        }
    }

    public final void l() {
        float f7;
        w wVar = this.f48284m;
        d21 d21Var = wVar.f38112a0;
        d21 d21Var2 = wVar.f38112a0;
        boolean z10 = this.f48293w;
        a0 a0Var = this.f48275a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = a0Var.f48265f;
        }
        d21Var.setTranslationX(f7);
        d21Var2.setTranslationY(a0Var.h);
        d21Var2.setPivotX(a0Var.f48267r);
        d21Var2.setPivotY(a0Var.f48268s);
        d21Var2.setScaleX(a0Var.f48266n);
        d21Var2.setScaleY(a0Var.f48266n);
    }
}
