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
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.f6;
import di.n4;
import fi.d4;
import fi.k3;
import fi.l7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.lz;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.u7;
import org.telegram.ui.Components.w01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gs0;
import org.telegram.ui.vs0;
import org.telegram.ui.w61;
import org.telegram.ui.ws0;
public final class y0 extends w2 implements fs {
    public static final int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final ws0 E1;
    public int F1;
    public int G1;
    public int H1;
    public u7 I1;
    public final g2 f59078m1;
    public final r0 n1;
    public final ArrayList f59079o1;
    public float f59080p1;
    public float f59081q1;
    public boolean f59082r1;
    public final w0 f59083s1;
    public final w61 f59084t1;
    public int f59085u1;
    public final FrameLayout f59086v1;
    public boolean f59087w1;
    public final kz f59088x1;
    public final int f59089y1;
    public final boolean f59090z1;

    public y0(int i7, Context context, i6 i6Var) {
        this(null, context, i10.f24637t0, false, i7, true, null, i6Var);
    }

    @Override
    public final boolean F() {
        int i7 = 0;
        while (true) {
            w0 w0Var = this.f59083s1;
            if (i7 >= w0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i7);
            if (x0Var.f59058a == this.B1) {
                ViewGroup viewGroup = x0Var.f59062f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f58721b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void J0() {
        w0 w0Var;
        int i7;
        float f10;
        View m10;
        View m11;
        int i10 = -1;
        boolean z10 = false;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            w0Var = this.f59083s1;
            if (i12 >= w0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i12);
            int i13 = x0Var.f59058a;
            ViewGroup viewGroup = x0Var.f59062f;
            if (i13 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f58722c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (x0Var.f59058a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f58722c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.G1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.D1;
            i14 = Math.min(i14, (int) e2.z(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.D1;
            i14 = Math.min(i14, (int) e2.z(1.0f, f12, this.G1, i11 * f12));
        }
        FrameLayout frameLayout = this.f59086v1;
        frameLayout.setAlpha(1.0f - this.f59081q1);
        if (this.f59080p1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f59082r1;
        w61 w61Var = this.f59084t1;
        if (z11) {
            i7 = w61Var.getMeasuredWidth();
        } else {
            i7 = -w61Var.getMeasuredWidth();
        }
        w61Var.setTranslationX(i7 * this.f59081q1);
        if (i14 != this.H1) {
            this.H1 = i14;
            for (int i15 = 0; i15 < w0Var.getChildCount(); i15++) {
                if (!((x0) w0Var.getChildAt(i15)).h) {
                    w0Var.getChildAt(i15).setTranslationY(this.H1);
                }
            }
            w61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.f30226b.invalidate();
            int i16 = this.H1;
            if (this.f59089y1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z10 = true;
            }
            org.telegram.messenger.g0.X3(this.I1, z10, 1.0f, true, true);
        }
    }

    public final void K0() {
        boolean z10 = this.A1;
        r0 r0Var = this.n1;
        if (z10) {
            r0Var.f58984f.setText(gd.N0(2131754942, null));
        } else if (this.f59090z1) {
            int i7 = this.f59089y1;
            if (i7 == 4) {
                r0Var.f58984f.setText(gd.N0(2131743612, null));
                r0Var.setIcon(2131624315);
            } else if (i7 == 10) {
                r0Var.f58984f.setText(gd.N0(2131743613, null));
                r0Var.setIcon(2131624315);
            } else {
                r0Var.f58984f.setText(gd.N0(2131754942, null));
            }
        } else {
            r0Var.f58984f.setText(PremiumPreviewFragment.t0(this.f30223a, this.E1));
        }
    }

    public final void L0() {
        this.A1 = true;
        r0 r0Var = this.n1;
        r0Var.f58986r = false;
        r0Var.d(true);
        K0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.f25253m5 && i7 != ks.f25237j5) {
            if (i7 == ks.f25232i5) {
                boolean q10 = i10.i(this.f30223a).q();
                r0 r0Var = this.n1;
                if (q10) {
                    r0Var.c(gd.N0(2131747637, null), false, true);
                    return;
                }
                r0Var.f58986r = false;
                r0Var.d(true);
                return;
            }
            return;
        }
        K0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ks.e().n(this, ks.f25253m5);
        ks.f(this.f30223a).n(this, ks.f25237j5);
        ks.f(this.f30223a).n(this, ks.f25232i5);
        ks.e().k(ks.f25239k1, 16);
    }

    @Override
    public final boolean m0() {
        w0 w0Var = this.f59083s1;
        if (w0Var.getChildCount() > 0) {
            x0 x0Var = (x0) w0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f59062f;
            if (viewGroup instanceof p0) {
                p0 p0Var = (p0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                p0Var.setOffset(x0Var.getMeasuredWidth());
                this.f59087w1 = true;
                ofFloat.addUpdateListener(new d4(p0Var, 13));
                ofFloat.addListener(new f10(22, this, p0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(kr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ks.e().c(this, ks.f25253m5);
        ks.f(this.f30223a).c(this, ks.f25237j5);
        ks.f(this.f30223a).c(this, ks.f25232i5);
        u7 u7Var = new u7(7, getContext(), this);
        this.I1 = u7Var;
        u6.h(n6.f29524h5, u7Var, this.J0);
        u6.l(this.I1, 5, n6.G6, this.J0);
        u6.l(this.I1, 3, n6.f29864z8, this.J0);
        u7 u7Var2 = this.I1;
        int i7 = n6.f29845y8;
        u6.l(u7Var2, 1, i7, this.J0);
        u6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(2131231243);
        this.I1.setActionBarMenuOnItemClick(new gs0(this, 26));
        this.f30226b.addView(this.I1, na.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.f30260t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.X3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.f59079o1;
        if (((vs0) arrayList.get(i10)).f53023a == 14) {
            this.I1.setTitle(gd.N0(2131743558, null));
            this.I1.requestLayout();
        } else if (((vs0) arrayList.get(this.B1)).f53023a == 28) {
            this.I1.setTitle(gd.N0(2131744007, null));
            this.I1.requestLayout();
        } else if (((vs0) arrayList.get(this.B1)).f53023a == 40) {
            this.I1.setTitle(gd.N0(2131750825, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(gd.N0(2131751337, null));
            this.I1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        ks.e().k(ks.f25234j1, 16);
    }

    public y0(g2 g2Var, int i7, boolean z10) {
        this(g2Var, g2Var.getContext(), g2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public y0(g2 g2Var, Context context, int i7, int i10, boolean z10) {
        this(g2Var, context, i7, false, i10, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.g2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.ws0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.y0.<init>(org.telegram.ui.ActionBar.g2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.ws0):void");
    }

    public y0(g2 g2Var, Context context, int i7, boolean z10, int i10, boolean z11, ws0 ws0Var, i6 i6Var) {
        super(1, context, i6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f59079o1 = arrayList;
        this.F1 = 255;
        this.f59078m1 = g2Var;
        this.E1 = ws0Var;
        Q(n6.f29524h5);
        this.f59089y1 = i10;
        this.f59090z1 = z11;
        this.f59088x1 = lz.i(org.telegram.messenger.g0.y2(null, 2131624216));
        w01 w01Var = new w01(11, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new vs0(40, 2131231219, gd.N0(2131750825, null), gd.N0(2131750824, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f59079o1.size()) {
                i11 = 0;
                break;
            } else if (((vs0) this.f59079o1.get(i11)).f53023a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            this.f59079o1.clear();
            this.f59079o1.add((vs0) this.f59079o1.get(i11));
            i11 = 0;
        }
        vs0 vs0Var = (vs0) this.f59079o1.get(i11);
        this.f30262v0 = false;
        this.f30264w0 = false;
        this.U0 = false;
        a1 a1Var = new a1(n6.Rk, n6.Sk, n6.Tk, -1, null);
        a1Var.f58735o = 1.1f;
        a1Var.f58736p = 1.5f;
        a1Var.f58737q = -0.2f;
        a1Var.f58733m = true;
        w61 w61Var = new w61(this, getContext(), a1Var, 6);
        this.f59084t1 = w61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59086v1 = frameLayout;
        frameLayout.setContentDescription(gd.N0(2131752029, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232101);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(n6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, na.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f59010b;

            {
                this.f59010b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f59010b.dismiss();
                        return;
                    default:
                        this.f59010b.dismiss();
                        return;
                }
            }
        });
        w01Var.addView(w61Var, na.t(-1, -2, 1, 0, 16, 0, 0));
        w0 w0Var = new w0(this, getContext());
        this.f59083s1 = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setOffscreenPageLimit(0);
        w0Var.setAdapter(new l20(this, 4));
        this.B1 = i11;
        w0Var.setCurrentItem(i11);
        w01Var.addView(w0Var, na.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w01Var.addView(frameLayout, na.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ha haVar = new ha(getContext(), w0Var, this.f59079o1.size());
        w0Var.b(new l7(this, haVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w01Var);
        linearLayout.setOrientation(1);
        int i12 = n6.V8;
        int i13 = n6.P9;
        haVar.f35704n = i12;
        haVar.f35705r = i13;
        if (!z11) {
            linearLayout.addView(haVar, na.t(this.f59079o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        r0 r0Var = new r0(getContext(), i6Var, true);
        this.n1 = r0Var;
        r0Var.f58988w.setOnClickListener(new k3(this, g2Var, z11, vs0Var, 5));
        r0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f59010b;

            {
                this.f59010b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f59010b.dismiss();
                        return;
                    default:
                        this.f59010b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(r0Var, na.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        u6.h(n6.f29524h5, frameLayout2, i6Var);
        linearLayout.addView(frameLayout2, na.r(-1, 68, 80));
        if (i10 == 40) {
            r0Var.c(f6.t2(gd.N0(2131743641, null)), true, false);
        } else if (i10.i(i7).q()) {
            r0Var.c(gd.N0(2131747637, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        ri.d0(i7).r1();
        K0();
        this.V0 = 83;
        n4 n4Var = new n4(this, getContext(), scrollView, getContext().getDrawable(2131231240).mutate());
        this.f30226b = n4Var;
        int i14 = this.f30261u0;
        n4Var.setPadding(i14, this.f30260t0 - 1, i14, 0);
    }
}
