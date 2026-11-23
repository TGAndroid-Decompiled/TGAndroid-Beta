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
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.f6;
import di.n4;
import fi.d4;
import fi.k3;
import fi.l7;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.nz;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.x01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hs0;
import org.telegram.ui.ws0;
import org.telegram.ui.xs0;
import org.telegram.ui.y61;
public final class y0 extends w2 implements gs {
    public static final int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final xs0 E1;
    public int F1;
    public int G1;
    public int H1;
    public v7 I1;
    public final g2 f58996m1;
    public final r0 n1;
    public final ArrayList f58997o1;
    public float f58998p1;
    public float f58999q1;
    public boolean f59000r1;
    public final w0 f59001s1;
    public final y61 f59002t1;
    public int f59003u1;
    public final FrameLayout f59004v1;
    public boolean f59005w1;
    public final mz f59006x1;
    public final int f59007y1;
    public final boolean f59008z1;

    public y0(int i7, Context context, h6 h6Var) {
        this(null, context, k10.f24968t0, false, i7, true, null, h6Var);
    }

    @Override
    public final boolean G() {
        int i7 = 0;
        while (true) {
            w0 w0Var = this.f59001s1;
            if (i7 >= w0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i7);
            if (x0Var.f58987a == this.B1) {
                ViewGroup viewGroup = x0Var.f58991f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f58641b.canScrollVertically(-1);
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
            w0Var = this.f59001s1;
            if (i12 >= w0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i12);
            int i13 = x0Var.f58987a;
            ViewGroup viewGroup = x0Var.f58991f;
            if (i13 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f58642c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (x0Var.f58987a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f58642c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
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
        FrameLayout frameLayout = this.f59004v1;
        frameLayout.setAlpha(1.0f - this.f58999q1);
        if (this.f58998p1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f59000r1;
        y61 y61Var = this.f59002t1;
        if (z11) {
            i7 = y61Var.getMeasuredWidth();
        } else {
            i7 = -y61Var.getMeasuredWidth();
        }
        y61Var.setTranslationX(i7 * this.f58999q1);
        if (i14 != this.H1) {
            this.H1 = i14;
            for (int i15 = 0; i15 < w0Var.getChildCount(); i15++) {
                if (!((x0) w0Var.getChildAt(i15)).h) {
                    w0Var.getChildAt(i15).setTranslationY(this.H1);
                }
            }
            y61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.f30176b.invalidate();
            int i16 = this.H1;
            if (this.f59007y1 == 40) {
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
            r0Var.f58904f.setText(hd.N0(2131754942, null));
        } else if (this.f59008z1) {
            int i7 = this.f59007y1;
            if (i7 == 4) {
                r0Var.f58904f.setText(hd.N0(2131743614, null));
                r0Var.setIcon(2131624315);
            } else if (i7 == 10) {
                r0Var.f58904f.setText(hd.N0(2131743615, null));
                r0Var.setIcon(2131624315);
            } else {
                r0Var.f58904f.setText(hd.N0(2131754942, null));
            }
        } else {
            r0Var.f58904f.setText(PremiumPreviewFragment.t0(this.f30173a, this.E1));
        }
    }

    public final void L0() {
        this.A1 = true;
        r0 r0Var = this.n1;
        r0Var.f58906r = false;
        r0Var.d(true);
        K0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ls.f25348m5 && i7 != ls.f25332j5) {
            if (i7 == ls.f25327i5) {
                boolean q10 = k10.i(this.f30173a).q();
                r0 r0Var = this.n1;
                if (q10) {
                    r0Var.c(hd.N0(2131747637, null), false, true);
                    return;
                }
                r0Var.f58906r = false;
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
        ls.e().n(this, ls.f25348m5);
        ls.f(this.f30173a).n(this, ls.f25332j5);
        ls.f(this.f30173a).n(this, ls.f25327i5);
        ls.e().k(ls.f25334k1, 16);
    }

    @Override
    public final boolean m0() {
        w0 w0Var = this.f59001s1;
        if (w0Var.getChildCount() > 0) {
            x0 x0Var = (x0) w0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f58991f;
            if (viewGroup instanceof p0) {
                p0 p0Var = (p0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                p0Var.setOffset(x0Var.getMeasuredWidth());
                this.f59005w1 = true;
                ofFloat.addUpdateListener(new d4(p0Var, 13));
                ofFloat.addListener(new h10(22, this, p0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ls.e().c(this, ls.f25348m5);
        ls.f(this.f30173a).c(this, ls.f25332j5);
        ls.f(this.f30173a).c(this, ls.f25327i5);
        v7 v7Var = new v7(7, getContext(), this);
        this.I1 = v7Var;
        t6.h(m6.f29454h5, v7Var, this.J0);
        t6.l(this.I1, 5, m6.G6, this.J0);
        t6.l(this.I1, 3, m6.f29794z8, this.J0);
        v7 v7Var2 = this.I1;
        int i7 = m6.f29775y8;
        t6.l(v7Var2, 1, i7, this.J0);
        t6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(2131231240);
        this.I1.setActionBarMenuOnItemClick(new hs0(this, 26));
        this.f30176b.addView(this.I1, ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.f30210t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.X3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.f58997o1;
        if (((ws0) arrayList.get(i10)).f53519a == 14) {
            this.I1.setTitle(hd.N0(2131743560, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).f53519a == 28) {
            this.I1.setTitle(hd.N0(2131744009, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).f53519a == 40) {
            this.I1.setTitle(hd.N0(2131750825, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(hd.N0(2131751337, null));
            this.I1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        ls.e().k(ls.f25329j1, 16);
    }

    public y0(g2 g2Var, int i7, boolean z10) {
        this(g2Var, g2Var.getContext(), g2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public y0(g2 g2Var, Context context, int i7, int i10, boolean z10) {
        this(g2Var, context, i7, false, i10, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.g2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.xs0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.y0.<init>(org.telegram.ui.ActionBar.g2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.xs0):void");
    }

    public y0(g2 g2Var, Context context, int i7, boolean z10, int i10, boolean z11, xs0 xs0Var, h6 h6Var) {
        super(1, context, h6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f58997o1 = arrayList;
        this.F1 = 255;
        this.f58996m1 = g2Var;
        this.E1 = xs0Var;
        Q(m6.f29454h5);
        this.f59007y1 = i10;
        this.f59008z1 = z11;
        this.f59006x1 = nz.i(org.telegram.messenger.g0.y2(null, 2131624216));
        x01 x01Var = new x01(11, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ws0(40, 2131231216, hd.N0(2131750825, null), hd.N0(2131750824, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f58997o1.size()) {
                i11 = 0;
                break;
            } else if (((ws0) this.f58997o1.get(i11)).f53519a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            this.f58997o1.clear();
            this.f58997o1.add((ws0) this.f58997o1.get(i11));
            i11 = 0;
        }
        ws0 ws0Var = (ws0) this.f58997o1.get(i11);
        this.f30212v0 = false;
        this.f30214w0 = false;
        this.U0 = false;
        a1 a1Var = new a1(m6.Rk, m6.Sk, m6.Tk, -1, null);
        a1Var.f58655o = 1.1f;
        a1Var.f58656p = 1.5f;
        a1Var.f58657q = -0.2f;
        a1Var.f58653m = true;
        y61 y61Var = new y61(this, getContext(), a1Var, 6);
        this.f59002t1 = y61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59004v1 = frameLayout;
        frameLayout.setContentDescription(hd.N0(2131752029, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232098);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(m6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ma.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f58930b;

            {
                this.f58930b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58930b.dismiss();
                        return;
                    default:
                        this.f58930b.dismiss();
                        return;
                }
            }
        });
        x01Var.addView(y61Var, ma.t(-1, -2, 1, 0, 16, 0, 0));
        w0 w0Var = new w0(this, getContext());
        this.f59001s1 = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setOffscreenPageLimit(0);
        w0Var.setAdapter(new n20(this, 4));
        this.B1 = i11;
        w0Var.setCurrentItem(i11);
        x01Var.addView(w0Var, ma.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        x01Var.addView(frameLayout, ma.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ia iaVar = new ia(getContext(), w0Var, this.f58997o1.size());
        w0Var.b(new l7(this, iaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(x01Var);
        linearLayout.setOrientation(1);
        int i12 = m6.V8;
        int i13 = m6.P9;
        iaVar.f36232n = i12;
        iaVar.f36233r = i13;
        if (!z11) {
            linearLayout.addView(iaVar, ma.t(this.f58997o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        r0 r0Var = new r0(getContext(), h6Var, true);
        this.n1 = r0Var;
        r0Var.f58908w.setOnClickListener(new k3(this, g2Var, z11, ws0Var, 5));
        r0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f58930b;

            {
                this.f58930b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58930b.dismiss();
                        return;
                    default:
                        this.f58930b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(r0Var, ma.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        t6.h(m6.f29454h5, frameLayout2, h6Var);
        linearLayout.addView(frameLayout2, ma.r(-1, 68, 80));
        if (i10 == 40) {
            r0Var.c(f6.t2(hd.N0(2131743643, null)), true, false);
        } else if (k10.i(i7).q()) {
            r0Var.c(hd.N0(2131747637, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        si.d0(i7).r1();
        K0();
        this.V0 = 83;
        n4 n4Var = new n4(this, getContext(), scrollView, getContext().getDrawable(2131231237).mutate());
        this.f30176b = n4Var;
        int i14 = this.f30211u0;
        n4Var.setPadding(i14, this.f30210t0 - 1, i14, 0);
    }
}
