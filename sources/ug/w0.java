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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pt0;
import org.telegram.ui.xs0;
import org.telegram.ui.ys0;
public final class w0 extends v2 implements ls {
    public static final int F1 = 0;
    public final ys0 A1;
    public int B1;
    public int C1;
    public int D1;
    public r7 E1;
    public final f2 f56856i1;
    public final p0 f56857j1;
    public final ArrayList f56858k1;
    public float l1;
    public float f56859m1;
    public boolean n1;
    public final u0 f56860o1;
    public final pg.h f56861p1;
    public int f56862q1;
    public final FrameLayout f56863r1;
    public boolean f56864s1;
    public final rz f56865t1;
    public final int f56866u1;
    public final boolean f56867v1;
    public boolean f56868w1;
    public int f56869x1;
    public int f56870y1;
    public float f56871z1;

    public w0(int i7, Context context, g6 g6Var) {
        this(null, context, p10.f24470s0, false, i7, true, null, g6Var);
    }

    @Override
    public final boolean G() {
        int i7 = 0;
        while (true) {
            u0 u0Var = this.f56860o1;
            if (i7 >= u0Var.getChildCount()) {
                return true;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i7);
            if (v0Var.f56848a == this.f56869x1) {
                ViewGroup viewGroup = v0Var.f56852f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f56535b.canScrollVertically(-1);
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
            u0Var = this.f56860o1;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i12);
            int i13 = v0Var.f56848a;
            ViewGroup viewGroup = v0Var.f56852f;
            if (i13 == this.f56869x1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f56536c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (v0Var.f56848a == this.f56870y1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f56536c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.C1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.f56871z1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.f56871z1;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.C1, i11 * f12));
        }
        FrameLayout frameLayout = this.f56863r1;
        frameLayout.setAlpha(1.0f - this.f56859m1);
        if (this.l1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.n1;
        pg.h hVar = this.f56861p1;
        if (z10) {
            i7 = hVar.getMeasuredWidth();
        } else {
            i7 = -hVar.getMeasuredWidth();
        }
        hVar.setTranslationX(i7 * this.f56859m1);
        if (i14 != this.D1) {
            this.D1 = i14;
            for (int i15 = 0; i15 < u0Var.getChildCount(); i15++) {
                if (!((v0) u0Var.getChildAt(i15)).h) {
                    u0Var.getChildAt(i15).setTranslationY(this.D1);
                }
            }
            hVar.setTranslationY(this.D1);
            frameLayout.setTranslationY(this.D1);
            this.f28624b.invalidate();
            int i16 = this.D1;
            if (this.f56866u1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z9 = true;
            }
            org.telegram.messenger.g0.Z3(this.E1, z9, 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z9 = this.f56868w1;
        p0 p0Var = this.f56857j1;
        if (z9) {
            p0Var.f56769f.setText(id.M0(2131754942, null));
        } else if (this.f56867v1) {
            int i7 = this.f56866u1;
            if (i7 == 4) {
                p0Var.f56769f.setText(id.M0(2131743859, null));
                p0Var.setIcon(2131624314);
            } else if (i7 == 10) {
                p0Var.f56769f.setText(id.M0(2131743860, null));
                p0Var.setIcon(2131624314);
            } else {
                p0Var.f56769f.setText(id.M0(2131754942, null));
            }
        } else {
            p0Var.f56769f.setText(PremiumPreviewFragment.t0(this.f28621a, this.A1));
        }
    }

    public final void K0() {
        this.f56868w1 = true;
        p0 p0Var = this.f56857j1;
        p0Var.f56771r = false;
        p0Var.d(true);
        J0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != qs.f25024j5 && i7 != qs.f25007g5) {
            if (i7 == qs.f25001f5) {
                boolean q10 = p10.i(this.f28621a).q();
                p0 p0Var = this.f56857j1;
                if (q10) {
                    p0Var.c(id.M0(2131747831, null), false, true);
                    return;
                }
                p0Var.f56771r = false;
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
        qs.e().n(this, qs.f25024j5);
        qs.f(this.f28621a).n(this, qs.f25007g5);
        qs.f(this.f28621a).n(this, qs.f25001f5);
        qs.e().k(qs.f25026k1, 16);
    }

    @Override
    public final boolean m0() {
        u0 u0Var = this.f56860o1;
        if (u0Var.getChildCount() > 0) {
            v0 v0Var = (v0) u0Var.getChildAt(0);
            ViewGroup viewGroup = v0Var.f56852f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(v0Var.getMeasuredWidth());
                this.f56864s1 = true;
                ofFloat.addUpdateListener(new n4(n0Var, 13));
                ofFloat.addListener(new w50(22, this, n0Var));
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
        qs.e().c(this, qs.f25024j5);
        qs.f(this.f28621a).c(this, qs.f25007g5);
        qs.f(this.f28621a).c(this, qs.f25001f5);
        r7 r7Var = new r7(7, getContext(), this);
        this.E1 = r7Var;
        s6.h(l6.f27938h5, r7Var, this.I0);
        s6.l(this.E1, 5, l6.G6, this.I0);
        s6.l(this.E1, 3, l6.f28277z8, this.I0);
        r7 r7Var2 = this.E1;
        int i7 = l6.f28259y8;
        s6.l(r7Var2, 1, i7, this.I0);
        s6.b(this.E1, i7, this.I0, true);
        this.E1.setCastShadows(true);
        this.E1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.E1.setBackButtonImage(2131231240);
        this.E1.setActionBarMenuOnItemClick(new pt0(this, 23));
        this.f28624b.addView(this.E1, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.E1.getLayoutParams()).topMargin = (-this.f28653s0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.E1, false, 1.0f, true, false);
        int i10 = this.f56869x1;
        ArrayList arrayList = this.f56858k1;
        if (((xs0) arrayList.get(i10)).f51756a == 14) {
            this.E1.setTitle(id.M0(2131743805, null));
            this.E1.requestLayout();
        } else if (((xs0) arrayList.get(this.f56869x1)).f51756a == 28) {
            this.E1.setTitle(id.M0(2131744252, null));
            this.E1.requestLayout();
        } else if (((xs0) arrayList.get(this.f56869x1)).f51756a == 40) {
            this.E1.setTitle(id.M0(2131750837, null));
            this.E1.requestLayout();
        } else {
            this.E1.setTitle(id.M0(2131751349, null));
            this.E1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        qs.e().k(qs.f25021j1, 16);
    }

    public w0(f2 f2Var, int i7, boolean z9) {
        this(f2Var, f2Var.getContext(), f2Var.getCurrentAccount(), false, i7, z9, null);
    }

    public w0(f2 f2Var, Context context, int i7, int i10, boolean z9) {
        this(f2Var, context, i7, false, i10, z9, null);
    }

    public w0(org.telegram.ui.ActionBar.f2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.ys0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.w0.<init>(org.telegram.ui.ActionBar.f2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.ys0):void");
    }

    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, ys0 ys0Var, g6 g6Var) {
        super(1, context, g6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f56858k1 = arrayList;
        this.B1 = 255;
        this.f56856i1 = f2Var;
        this.A1 = ys0Var;
        P(l6.f27938h5);
        this.f56866u1 = i10;
        this.f56867v1 = z10;
        this.f56865t1 = sz.i(org.telegram.messenger.g0.y2(null, 2131624215));
        w41 w41Var = new w41(11, getContext(), this);
        if (!z9 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new xs0(40, 2131231216, id.M0(2131750837, null), id.M0(2131750836, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f56858k1.size()) {
                i11 = 0;
                break;
            } else if (((xs0) this.f56858k1.get(i11)).f51756a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z10) {
            this.f56858k1.clear();
            this.f56858k1.add((xs0) this.f56858k1.get(i11));
            i11 = 0;
        }
        xs0 xs0Var = (xs0) this.f56858k1.get(i11);
        this.f28655u0 = false;
        this.f28656v0 = false;
        this.T0 = false;
        y0 y0Var = new y0(l6.Ok, l6.Pk, l6.Qk, -1, null);
        y0Var.f56889o = 1.1f;
        y0Var.f56890p = 1.5f;
        y0Var.f56891q = -0.2f;
        y0Var.f56887m = true;
        pg.h hVar = new pg.h(this, getContext(), y0Var, 3);
        this.f56861p1 = hVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f56863r1 = frameLayout;
        frameLayout.setContentDescription(id.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232096);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(l6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f56805b;

            {
                this.f56805b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56805b.dismiss();
                        return;
                    default:
                        this.f56805b.dismiss();
                        return;
                }
            }
        });
        w41Var.addView(hVar, ha.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.f56860o1 = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new b20(this, 4));
        this.f56869x1 = i11;
        u0Var.setCurrentItem(i11);
        w41Var.addView(u0Var, ha.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w41Var.addView(frameLayout, ha.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ea eaVar = new ea(getContext(), u0Var, this.f56858k1.size());
        u0Var.b(new v7(this, eaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w41Var);
        linearLayout.setOrientation(1);
        int i12 = l6.V8;
        int i13 = l6.P9;
        eaVar.f33350n = i12;
        eaVar.f33351r = i13;
        if (!z10) {
            linearLayout.addView(eaVar, ha.t(this.f56858k1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), g6Var, true);
        this.f56857j1 = p0Var;
        p0Var.f56773w.setOnClickListener(new r3(this, f2Var, z10, xs0Var, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final w0 f56805b;

            {
                this.f56805b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f56805b.dismiss();
                        return;
                    default:
                        this.f56805b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        s6.h(l6.f27938h5, frameLayout2, g6Var);
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
        this.f28624b = m5Var;
        int i14 = this.f28654t0;
        m5Var.setPadding(i14, this.f28653s0 - 1, i14, 0);
    }
}
