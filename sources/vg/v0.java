package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b8.mf;
import ci.l6;
import ci.t4;
import ei.n4;
import ei.u3;
import ei.v7;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.kz;
import org.telegram.messenger.li;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ls0;
import org.telegram.ui.ms0;
import org.telegram.ui.n61;
import org.telegram.ui.vs0;
public final class v0 extends t2 implements cs {
    public static final int G1 = 0;
    public float A1;
    public final ms0 B1;
    public int C1;
    public int D1;
    public int E1;
    public p7 F1;
    public final d2 f56874j1;
    public final o0 k1;
    public final ArrayList f56875l1;
    public float m1;
    public float f56876n1;
    public boolean f56877o1;
    public final t0 f56878p1;
    public final n61 f56879q1;
    public int f56880r1;
    public final FrameLayout f56881s1;
    public boolean f56882t1;
    public final jz f56883u1;
    public final int f56884v1;
    public final boolean f56885w1;
    public boolean f56886x1;
    public int f56887y1;
    public int f56888z1;

    public v0(int i3, Context context, e6 e6Var) {
        this(null, context, h10.f22829t0, false, i3, true, null, e6Var);
    }

    @Override
    public final boolean G() {
        int i3 = 0;
        while (true) {
            t0 t0Var = this.f56878p1;
            if (i3 >= t0Var.getChildCount()) {
                return true;
            }
            u0 u0Var = (u0) t0Var.getChildAt(i3);
            if (u0Var.f56865a == this.f56887y1) {
                ViewGroup viewGroup = u0Var.f56869f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f56568b.canScrollVertically(-1);
                }
            }
            i3++;
        }
    }

    public final void I0() {
        t0 t0Var;
        int i3;
        float f10;
        View m10;
        View m11;
        int i10 = -1;
        boolean z10 = false;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            t0Var = this.f56878p1;
            if (i12 >= t0Var.getChildCount()) {
                break;
            }
            u0 u0Var = (u0) t0Var.getChildAt(i12);
            int i13 = u0Var.f56865a;
            ViewGroup viewGroup = u0Var.f56869f;
            if (i13 == this.f56887y1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f56569c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (u0Var.f56865a == this.f56888z1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f56569c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.D1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.A1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.y(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.A1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.y(1.0f, f12, this.D1, i11 * f12));
        }
        FrameLayout frameLayout = this.f56881s1;
        frameLayout.setAlpha(1.0f - this.f56876n1);
        if (this.m1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f56877o1;
        n61 n61Var = this.f56879q1;
        if (z11) {
            i3 = n61Var.getMeasuredWidth();
        } else {
            i3 = -n61Var.getMeasuredWidth();
        }
        n61Var.setTranslationX(i3 * this.f56876n1);
        if (i14 != this.E1) {
            this.E1 = i14;
            for (int i15 = 0; i15 < t0Var.getChildCount(); i15++) {
                if (!((u0) t0Var.getChildAt(i15)).h) {
                    t0Var.getChildAt(i15).setTranslationY(this.E1);
                }
            }
            n61Var.setTranslationY(this.E1);
            frameLayout.setTranslationY(this.E1);
            this.f28586b.invalidate();
            int i16 = this.E1;
            if (this.f56884v1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z10 = true;
            }
            org.telegram.messenger.g0.Z3(this.F1, z10, 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.f56886x1;
        o0 o0Var = this.k1;
        if (z10) {
            o0Var.f56763f.setText(bd.M0(2131754942, null));
        } else if (this.f56885w1) {
            int i3 = this.f56884v1;
            if (i3 == 4) {
                o0Var.f56763f.setText(bd.M0(2131743869, null));
                o0Var.setIcon(2131624314);
            } else if (i3 == 10) {
                o0Var.f56763f.setText(bd.M0(2131743870, null));
                o0Var.setIcon(2131624314);
            } else {
                o0Var.f56763f.setText(bd.M0(2131754942, null));
            }
        } else {
            o0Var.f56763f.setText(PremiumPreviewFragment.t0(this.f28583a, this.B1));
        }
    }

    public final void K0() {
        this.f56886x1 = true;
        o0 o0Var = this.k1;
        o0Var.f56765r = false;
        o0Var.d(true);
        J0();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != hs.f23253j5 && i3 != hs.f23236g5) {
            if (i3 == hs.f23230f5) {
                boolean q10 = h10.i(this.f28583a).q();
                o0 o0Var = this.k1;
                if (q10) {
                    o0Var.c(bd.M0(2131747839, null), false, true);
                    return;
                }
                o0Var.f56765r = false;
                o0Var.d(true);
                return;
            }
            return;
        }
        J0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        hs.e().n(this, hs.f23253j5);
        hs.f(this.f28583a).n(this, hs.f23236g5);
        hs.f(this.f28583a).n(this, hs.f23230f5);
        hs.e().k(hs.k1, 16);
    }

    @Override
    public final boolean m0() {
        t0 t0Var = this.f56878p1;
        if (t0Var.getChildCount() > 0) {
            u0 u0Var = (u0) t0Var.getChildAt(0);
            ViewGroup viewGroup = u0Var.f56869f;
            if (viewGroup instanceof m0) {
                m0 m0Var = (m0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u0Var.getMeasuredWidth(), 0.0f);
                m0Var.setOffset(u0Var.getMeasuredWidth());
                this.f56882t1 = true;
                ofFloat.addUpdateListener(new n4(m0Var, 14));
                ofFloat.addListener(new ri0(21, this, m0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hs.e().c(this, hs.f23253j5);
        hs.f(this.f28583a).c(this, hs.f23236g5);
        hs.f(this.f28583a).c(this, hs.f23230f5);
        p7 p7Var = new p7(7, getContext(), this);
        this.F1 = p7Var;
        r6.i(k6.f27954h5, p7Var, this.J0);
        r6.m(this.F1, 5, k6.G6, this.J0);
        r6.m(this.F1, 3, k6.f28292z8, this.J0);
        p7 p7Var2 = this.F1;
        int i3 = k6.f28275y8;
        r6.m(p7Var2, 1, i3, this.J0);
        r6.b(this.F1, i3, this.J0, true);
        this.F1.setCastShadows(true);
        this.F1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.F1.setBackButtonImage(2131231240);
        this.F1.setActionBarMenuOnItemClick(new vs0(this, 24));
        this.f28586b.addView(this.F1, mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.F1.getLayoutParams()).topMargin = (-this.f28617t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.F1, false, 1.0f, true, false);
        int i10 = this.f56887y1;
        ArrayList arrayList = this.f56875l1;
        if (((ls0) arrayList.get(i10)).f47430a == 14) {
            this.F1.setTitle(bd.M0(2131743815, null));
            this.F1.requestLayout();
        } else if (((ls0) arrayList.get(this.f56887y1)).f47430a == 28) {
            this.F1.setTitle(bd.M0(2131744262, null));
            this.F1.requestLayout();
        } else if (((ls0) arrayList.get(this.f56887y1)).f47430a == 40) {
            this.F1.setTitle(bd.M0(2131750838, null));
            this.F1.requestLayout();
        } else {
            this.F1.setTitle(bd.M0(2131751350, null));
            this.F1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        hs.e().k(hs.f23249j1, 16);
    }

    public v0(d2 d2Var, int i3, boolean z10) {
        this(d2Var, d2Var.getContext(), d2Var.getCurrentAccount(), false, i3, z10, null);
    }

    public v0(d2 d2Var, Context context, int i3, int i10, boolean z10) {
        this(d2Var, context, i3, false, i10, z10, null);
    }

    public v0(org.telegram.ui.ActionBar.d2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.ms0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: vg.v0.<init>(org.telegram.ui.ActionBar.d2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.ms0):void");
    }

    public v0(d2 d2Var, Context context, int i3, boolean z10, int i10, boolean z11, ms0 ms0Var, e6 e6Var) {
        super(1, context, e6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f56875l1 = arrayList;
        this.C1 = 255;
        this.f56874j1 = d2Var;
        this.B1 = ms0Var;
        P(k6.f27954h5);
        this.f56884v1 = i10;
        this.f56885w1 = z11;
        this.f56883u1 = kz.i(org.telegram.messenger.g0.y2(null, 2131624215));
        kw0 kw0Var = new kw0(12, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i3, arrayList);
        } else {
            PremiumPreviewFragment.r0(i3, arrayList, false);
            PremiumPreviewFragment.r0(i3, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ls0(40, 2131231216, bd.M0(2131750838, null), bd.M0(2131750837, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f56875l1.size()) {
                i11 = 0;
                break;
            } else if (((ls0) this.f56875l1.get(i11)).f47430a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            this.f56875l1.clear();
            this.f56875l1.add((ls0) this.f56875l1.get(i11));
            i11 = 0;
        }
        ls0 ls0Var = (ls0) this.f56875l1.get(i11);
        this.f28619v0 = false;
        this.f28621w0 = false;
        this.U0 = false;
        x0 x0Var = new x0(k6.Ok, k6.Pk, k6.Qk, -1, null);
        x0Var.f56919o = 1.1f;
        x0Var.f56920p = 1.5f;
        x0Var.f56921q = -0.2f;
        x0Var.f56917m = true;
        n61 n61Var = new n61(this, getContext(), x0Var, 6);
        this.f56879q1 = n61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f56881s1 = frameLayout;
        frameLayout.setContentDescription(bd.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232096);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(k6.k0(L, L, L, L, o10, o11, o11));
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final v0 f56777b;

            {
                this.f56777b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56777b.dismiss();
                        return;
                    default:
                        this.f56777b.dismiss();
                        return;
                }
            }
        });
        kw0Var.addView(n61Var, mf.t(-1, -2, 1, 0, 16, 0, 0));
        t0 t0Var = new t0(this, getContext());
        this.f56878p1 = t0Var;
        t0Var.setOverScrollMode(2);
        t0Var.setOffscreenPageLimit(0);
        t0Var.setAdapter(new w10(this, 4));
        this.f56887y1 = i11;
        t0Var.setCurrentItem(i11);
        kw0Var.addView(t0Var, mf.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        kw0Var.addView(frameLayout, mf.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        da daVar = new da(getContext(), t0Var, this.f56875l1.size());
        t0Var.b(new v7(1, this, daVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(kw0Var);
        linearLayout.setOrientation(1);
        int i12 = k6.V8;
        int i13 = k6.P9;
        daVar.f33031n = i12;
        daVar.f33032r = i13;
        if (!z11) {
            linearLayout.addView(daVar, mf.t(this.f56875l1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        o0 o0Var = new o0(getContext(), e6Var, true);
        this.k1 = o0Var;
        o0Var.f56767w.setOnClickListener(new u3(this, d2Var, z11, ls0Var, 5));
        o0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final v0 f56777b;

            {
                this.f56777b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56777b.dismiss();
                        return;
                    default:
                        this.f56777b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(o0Var, mf.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.f27954h5, frameLayout2, e6Var);
        linearLayout.addView(frameLayout2, mf.r(-1, 68, 80));
        if (i10 == 40) {
            o0Var.c(l6.g2(bd.M0(2131743898, null)), true, false);
        } else if (h10.i(i3).q()) {
            o0Var.c(bd.M0(2131747839, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        li.b0(i3).o1();
        J0();
        this.V0 = 83;
        t4 t4Var = new t4(this, getContext(), scrollView, getContext().getDrawable(2131231237).mutate());
        this.f28586b = t4Var;
        int i14 = this.f28618u0;
        t4Var.setPadding(i14, this.f28617t0 - 1, i14, 0);
    }
}
