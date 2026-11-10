package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.k7;
import bi.m5;
import c8.ha;
import di.n4;
import di.r3;
import di.v7;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qt0;
import org.telegram.ui.ys0;
import org.telegram.ui.zs0;
public final class w0 extends w2 implements ls {
    public static final int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final zs0 D1;
    public int E1;
    public int F1;
    public int G1;
    public q7 H1;
    public final f2 l1;
    public final p0 f56855m1;
    public final ArrayList n1;
    public float f56856o1;
    public float f56857p1;
    public boolean f56858q1;
    public final u0 f56859r1;
    public final pg.h f56860s1;
    public int f56861t1;
    public final FrameLayout f56862u1;
    public boolean f56863v1;
    public final rz f56864w1;
    public final int f56865x1;
    public final boolean f56866y1;
    public boolean f56867z1;

    public w0(int i7, Context context, h6 h6Var) {
        this(null, context, p10.f24474s0, false, i7, true, null, h6Var);
    }

    @Override
    public final boolean G() {
        int i7 = 0;
        while (true) {
            u0 u0Var = this.f56859r1;
            if (i7 >= u0Var.getChildCount()) {
                return true;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i7);
            if (v0Var.f56847a == this.A1) {
                ViewGroup viewGroup = v0Var.f56851f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f56534b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void I0() {
        u0 u0Var;
        int i7;
        float f10;
        View m10;
        View m11;
        int i10 = -1;
        boolean z9 = false;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            u0Var = this.f56859r1;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i12);
            int i13 = v0Var.f56847a;
            ViewGroup viewGroup = v0Var.f56851f;
            if (i13 == this.A1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f56535c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (v0Var.f56847a == this.B1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f56535c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.F1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.C1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.C1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.F1, i11 * f12));
        }
        FrameLayout frameLayout = this.f56862u1;
        frameLayout.setAlpha(1.0f - this.f56857p1);
        if (this.f56856o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.f56858q1;
        pg.h hVar = this.f56860s1;
        if (z10) {
            i7 = hVar.getMeasuredWidth();
        } else {
            i7 = -hVar.getMeasuredWidth();
        }
        hVar.setTranslationX(i7 * this.f56857p1);
        if (i14 != this.G1) {
            this.G1 = i14;
            for (int i15 = 0; i15 < u0Var.getChildCount(); i15++) {
                if (!((v0) u0Var.getChildAt(i15)).h) {
                    u0Var.getChildAt(i15).setTranslationY(this.G1);
                }
            }
            hVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.f28672b.invalidate();
            int i16 = this.G1;
            if (this.f56865x1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z9 = true;
            }
            org.telegram.messenger.g0.Z3(this.H1, z9, 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z9 = this.f56867z1;
        p0 p0Var = this.f56855m1;
        if (z9) {
            p0Var.f56768f.setText(id.M0(2131754942, null));
        } else if (this.f56866y1) {
            int i7 = this.f56865x1;
            if (i7 == 4) {
                p0Var.f56768f.setText(id.M0(2131743859, null));
                p0Var.setIcon(2131624314);
            } else if (i7 == 10) {
                p0Var.f56768f.setText(id.M0(2131743860, null));
                p0Var.setIcon(2131624314);
            } else {
                p0Var.f56768f.setText(id.M0(2131754942, null));
            }
        } else {
            p0Var.f56768f.setText(PremiumPreviewFragment.t0(this.f28669a, this.D1));
        }
    }

    public final void K0() {
        this.f56867z1 = true;
        p0 p0Var = this.f56855m1;
        p0Var.f56770r = false;
        p0Var.d(true);
        J0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != qs.f25028j5 && i7 != qs.f25011g5) {
            if (i7 == qs.f25005f5) {
                boolean q10 = p10.i(this.f28669a).q();
                p0 p0Var = this.f56855m1;
                if (q10) {
                    p0Var.c(id.M0(2131747831, null), false, true);
                    return;
                }
                p0Var.f56770r = false;
                p0Var.d(true);
                return;
            }
            return;
        }
        J0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qs.e().n(this, qs.f25028j5);
        qs.f(this.f28669a).n(this, qs.f25011g5);
        qs.f(this.f28669a).n(this, qs.f25005f5);
        qs.e().k(qs.f25030k1, 16);
    }

    @Override
    public final boolean m0() {
        u0 u0Var = this.f56859r1;
        if (u0Var.getChildCount() > 0) {
            v0 v0Var = (v0) u0Var.getChildAt(0);
            ViewGroup viewGroup = v0Var.f56851f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(v0Var.getMeasuredWidth());
                this.f56863v1 = true;
                ofFloat.addUpdateListener(new n4(n0Var, 13));
                ofFloat.addListener(new v50(22, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(wq.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qs.e().c(this, qs.f25028j5);
        qs.f(this.f28669a).c(this, qs.f25011g5);
        qs.f(this.f28669a).c(this, qs.f25005f5);
        q7 q7Var = new q7(7, getContext(), this);
        this.H1 = q7Var;
        t6.h(m6.f27963h5, q7Var, this.I0);
        t6.l(this.H1, 5, m6.G6, this.I0);
        t6.l(this.H1, 3, m6.f28302z8, this.I0);
        q7 q7Var2 = this.H1;
        int i7 = m6.f28284y8;
        t6.l(q7Var2, 1, i7, this.I0);
        t6.b(this.H1, i7, this.I0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.H1.setBackButtonImage(2131231240);
        this.H1.setActionBarMenuOnItemClick(new qt0(this, 23));
        this.f28672b.addView(this.H1, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.f28704s0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.H1, false, 1.0f, true, false);
        int i10 = this.A1;
        ArrayList arrayList = this.n1;
        if (((ys0) arrayList.get(i10)).f52109a == 14) {
            this.H1.setTitle(id.M0(2131743805, null));
            this.H1.requestLayout();
        } else if (((ys0) arrayList.get(this.A1)).f52109a == 28) {
            this.H1.setTitle(id.M0(2131744252, null));
            this.H1.requestLayout();
        } else if (((ys0) arrayList.get(this.A1)).f52109a == 40) {
            this.H1.setTitle(id.M0(2131750837, null));
            this.H1.requestLayout();
        } else {
            this.H1.setTitle(id.M0(2131751349, null));
            this.H1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        qs.e().k(qs.f25025j1, 16);
    }

    public w0(f2 f2Var, int i7, boolean z9) {
        this(f2Var, f2Var.getContext(), f2Var.getCurrentAccount(), false, i7, z9, null);
    }

    public w0(f2 f2Var, Context context, int i7, int i10, boolean z9) {
        this(f2Var, context, i7, false, i10, z9, null);
    }

    public w0(org.telegram.ui.ActionBar.f2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.zs0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.w0.<init>(org.telegram.ui.ActionBar.f2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.zs0):void");
    }

    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, zs0 zs0Var, h6 h6Var) {
        super(1, context, h6Var, false);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = 255;
        this.l1 = f2Var;
        this.D1 = zs0Var;
        P(m6.f27963h5);
        this.f56865x1 = i10;
        this.f56866y1 = z10;
        this.f56864w1 = sz.i(org.telegram.messenger.g0.y2(null, 2131624215));
        w41 w41Var = new w41(11, getContext(), this);
        if (!z9 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ys0(40, 2131231216, id.M0(2131750837, null), id.M0(2131750836, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.n1.size()) {
                i11 = 0;
                break;
            } else if (((ys0) this.n1.get(i11)).f52109a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z10) {
            this.n1.clear();
            this.n1.add((ys0) this.n1.get(i11));
            i11 = 0;
        }
        ys0 ys0Var = (ys0) this.n1.get(i11);
        this.f28706u0 = false;
        this.f28707v0 = false;
        this.T0 = false;
        y0 y0Var = new y0(m6.Ok, m6.Pk, m6.Qk, -1, null);
        y0Var.f56885o = 1.1f;
        y0Var.f56886p = 1.5f;
        y0Var.f56887q = -0.2f;
        y0Var.f56883m = true;
        pg.h hVar = new pg.h(this, getContext(), y0Var, 3);
        this.f56860s1 = hVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f56862u1 = frameLayout;
        frameLayout.setContentDescription(id.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232096);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(m6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f56804b;

            {
                this.f56804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56804b.dismiss();
                        return;
                    default:
                        this.f56804b.dismiss();
                        return;
                }
            }
        });
        w41Var.addView(hVar, ha.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.f56859r1 = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new a20(this, 4));
        this.A1 = i11;
        u0Var.setCurrentItem(i11);
        w41Var.addView(u0Var, ha.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w41Var.addView(frameLayout, ha.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        da daVar = new da(getContext(), u0Var, this.n1.size());
        u0Var.b(new v7(this, daVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w41Var);
        linearLayout.setOrientation(1);
        int i12 = m6.V8;
        int i13 = m6.P9;
        daVar.f32935n = i12;
        daVar.f32936r = i13;
        if (!z10) {
            linearLayout.addView(daVar, ha.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), h6Var, true);
        this.f56855m1 = p0Var;
        p0Var.f56772w.setOnClickListener(new r3(this, f2Var, z10, ys0Var, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f56804b;

            {
                this.f56804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56804b.dismiss();
                        return;
                    default:
                        this.f56804b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        t6.h(m6.f27963h5, frameLayout2, h6Var);
        linearLayout.addView(frameLayout2, ha.r(-1, 68, 80));
        if (i10 == 40) {
            p0Var.c(k7.f2(id.M0(2131743888, null)), true, false);
        } else if (p10.i(i7).q()) {
            p0Var.c(id.M0(2131747831, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.N = scrollView;
        ui.b0(i7).o1();
        J0();
        this.U0 = 83;
        m5 m5Var = new m5(this, getContext(), scrollView, getContext().getDrawable(2131231237).mutate());
        this.f28672b = m5Var;
        int i14 = this.f28705t0;
        m5Var.setPadding(i14, this.f28704s0 - 1, i14, 0);
    }
}
