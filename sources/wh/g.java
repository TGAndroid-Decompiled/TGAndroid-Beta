package wh;

import ag.y0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.t0;
import j$.util.Objects;
import java.util.ArrayList;
import kg.g2;
import mg.i2;
import org.telegram.messenger.cd;
import org.telegram.messenger.k0;
import org.telegram.messenger.u1;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.y1;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.voip.i0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.br;
import org.telegram.ui.do0;
import org.telegram.ui.o10;
import org.telegram.ui.p10;
import org.telegram.ui.u71;
import ph.o3;
import ph.p0;
import rh.e6;
import rh.g8;
import rh.h8;
import rh.i;
import rh.o7;
import rh.r;
import s4.a0;
import s4.g0;
import s4.j;
import vh.d0;
import vh.w3;
import w7.b6;
import w7.b9;
import xh.z2;
public final class g extends p10 implements us {
    public FrameLayout R;
    public a7 S;
    public g8 T;
    public ku0 U;
    public t0 V;
    public View W;
    public fe.b X;
    public fe.b Y;
    public fe.b Z;
    public int f52863b0;
    public int f52864c0;
    public boolean f52865d0;
    public boolean f52866e0;
    public do0 f52868g0;
    public final boolean f52869h0;
    public LinearLayout f52870i0;
    public SpannableStringBuilder f52871j0;
    public f6 f52872k0;
    public f6 f52873l0;
    public i0 m0;
    public vh.d f52874n0;
    public u71 f52875o0;
    public vh.d f52876p0;
    public vh.d f52877q0;
    public boolean f52878r0;
    public boolean f52879s0;
    public o3 f52880t0;
    public int f52862a0 = -1;
    public final d0 f52867f0 = new d0(this, 23);

    public g() {
        boolean z10;
        w0.u();
        if (!v2.a()) {
            w0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f52869h0 = z10;
        this.M = true;
    }

    public static void z0(g gVar, int i10) {
        a51 G;
        o3 o3Var = gVar.f52880t0;
        if (o3Var != null && (G = o3Var.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                gVar.f52880t0.O(true);
            } else if (i11 == -2) {
                e6.y(gVar.currentAccount, true).u();
                i2.l1(1, y1.a(gVar.currentAccount).b());
            } else if (i11 == -3) {
                e6.y(gVar.currentAccount, true).V();
                gVar.f52880t0.O(true);
            } else if (i11 == -4) {
                if (vp.r1(gVar.currentAccount).u2()) {
                    org.telegram.ui.b.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new z2(gVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void C0() {
        F0();
        tk0 tk0Var = this.f40417c;
        if (tk0Var != null && this.U != null && tk0Var.getLayoutParams() != null) {
            int C = z20.C(48.0f, this.f52863b0, -org.telegram.messenger.i0.L(8.0f));
            int C2 = z20.C(48.0f, this.f52864c0, -org.telegram.messenger.i0.L(8.0f));
            org.telegram.messenger.i0.A3(this.f40417c, 0, C, 0, C2);
            tk0 tk0Var2 = this.f40417c;
            int i10 = -C;
            tk0Var2.setPadding(tk0Var2.getPaddingLeft(), i10, this.f40417c.getPaddingRight(), this.f52864c0 - C2);
            this.U.z(i10, -C2);
        }
    }

    public final void D0(ArrayList arrayList, p51 p51Var) {
        boolean z10;
        tk0 tk0Var;
        ku0 ku0Var = this.U;
        if (ku0Var != null && ku0Var.f27914e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52862a0 = -1;
        if (getParentActivity() != null) {
            e6 y3 = e6.y(this.currentAccount, true);
            a51 a51Var = new a51(-2);
            a51Var.f24286c = (t0) super.n0(getParentActivity());
            arrayList.add(a51Var);
            arrayList.add(a51.k(this.f52870i0));
            boolean z11 = this.f52869h0;
            if (z11) {
                arrayList.add(a51.C(cd.L0(2131749523, null)));
            }
            boolean N = y3.N(0);
            this.f52878r0 = N;
            if (N) {
                if (!z11) {
                    arrayList.add(a51.C(null));
                }
                this.f52862a0 = arrayList.size();
                arrayList.add(a51.n(this.V, -2));
                if (z10 && (tk0Var = this.f40417c) != null) {
                    d0 d0Var = this.f52867f0;
                    tk0Var.removeCallbacks(d0Var);
                    this.f40417c.post(d0Var);
                    return;
                }
                return;
            }
            arrayList.add(a51.m(this.f52868g0));
        }
    }

    public final void E0() {
        int i10;
        final boolean z10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        e6 y3 = e6.y(this.currentAccount, true);
        double d = ((k0) getMessagesController().f18957y7.f17844l.f13480b).f16499a;
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f52871j0);
        spannableStringBuilder.append((CharSequence) h8.L0(p5, 0.66f, ' '));
        this.f52872k0.setText(spannableStringBuilder);
        if (((int) ((p5.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.f52873l0.setText("≈" + u1.i().f(i10, "USD"));
        } else {
            this.f52873l0.setText(cd.L0(2131742814, null));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = r.g(this.currentAccount).j(getUserConfig().e(), true);
        if (j10 != null && (tL_starsRevenueStatus = j10.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f52879s0 == z10) {
            return;
        }
        this.f52879s0 = z10;
        this.m0.setVisibility(0);
        this.f52875o0.setVisibility(0);
        ViewPropertyAnimator animate = this.m0.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final g f52858b;

            {
                this.f52858b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f52858b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f52858b.f52875o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f52875o0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final g f52858b;

            {
                this.f52858b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f52858b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f52858b.f52875o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    public final void F0() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(44.0f) + l.getCurrentActionBarHeight() + this.f52863b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        G0();
    }

    public final void G0() {
        float f7;
        View view = this.W;
        if (view == null) {
            return;
        }
        fe.b bVar = this.X;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        fe.b bVar2 = this.Y;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * l.getCurrentActionBarHeight()) - ((1.0f - f10) * org.telegram.messenger.i0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        int i10;
        int i11;
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        ku0 ku0Var = new ku0(context);
        this.U = ku0Var;
        ku0Var.setCommonInsetsManagedExternally(true);
        if (!this.f52865d0) {
            z4 z4Var = this.parentLayout;
            if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
                i11 = 0;
            } else {
                i11 = org.telegram.messenger.i0.f16020m;
            }
            this.f52863b0 = i11;
            this.f52864c0 = org.telegram.messenger.i0.f16021n;
        }
        this.U.setGeometry(new w3(this));
        this.U.z(-z20.C(48.0f, this.f52863b0, -org.telegram.messenger.i0.L(8.0f)), -z20.C(48.0f, this.f52864c0, -org.telegram.messenger.i0.L(8.0f)));
        ku0 ku0Var2 = this.U;
        ku0Var2.getClass();
        this.V = new t0(ku0Var2, context, 20);
        this.T = new g8(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f52868g0 = new do0(this, context, 12);
        super.createView(context);
        o10 o10Var = this.f40421s;
        getBaseSimpleGlass().f(o10Var, this.f40417c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f6605l = this.U;
        this.f40417c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f6606m = new ei.a(9, this, new org.telegram.ui.ActionBar.y1(3, o10Var));
        FrameLayout tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        float f10 = 0.0f;
        view.setAlpha(0.0f);
        ku0 ku0Var3 = this.U;
        ku0Var3.addView(this.W, ku0Var3.indexOfChild(tabsContainer), b6.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        gr grVar = gr.h;
        fe.b bVar = new fe.b(0, aVar, grVar, 380L, false);
        this.X = bVar;
        this.Y = new fe.b(1, new a(this, 1), grVar, 380L, false);
        this.Z = new fe.b(2, new a(this, 2), grVar, 380L, false);
        if (!this.f40417c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.a(z10, false);
        this.Y.a(this.U.f27914e0, false);
        this.f40417c.j(new bu0(this, 27));
        F0();
        vg.f c10 = getBaseSimpleGlass().f6599c.c(tabsContainer, null, false);
        c10.o(b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        tabsContainer.setBackground(c10);
        z4 z4Var2 = this.parentLayout;
        if (z4Var2 != null && ((ActionBarLayout) z4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        a7 a7Var = new a7(170, context, false);
        this.S = a7Var;
        a7Var.setStarParticlesView(this.e);
        this.R.addView(this.S, b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(cd.L0(2131749521, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131749522, null), new p0(context, 11)), true), this.R, null);
        this.f40417c.setOverScrollMode(2);
        j jVar = new j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.f40417c.setItemAnimator(jVar);
        this.f40417c.setOnItemClickListener(new y0(this, 22));
        this.f40421s.addView(new xz(getParentActivity()), b6.c(-1.0f, -1));
        e6.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f52870i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f52870i0.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(10.0f));
        f6 f6Var = new f6(getParentActivity(), false, true, false);
        this.f52872k0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.f52872k0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.f52872k0.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.f52872k0, t6.G6, this.resourceProvider);
        this.f52871j0 = new SpannableStringBuilder("S");
        dq dqVar = new dq(2131231956, 0);
        dqVar.d = false;
        dqVar.H = 0.5f;
        dqVar.I = 0.5f;
        dqVar.f25508r = -org.telegram.messenger.i0.L(3.0f);
        dqVar.f25509s = 0.0f;
        this.f52871j0.setSpan(dqVar, 0, 1, 33);
        this.f52870i0.addView(this.f52872k0, b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        f6 f6Var2 = new f6(getParentActivity(), false, false, false);
        this.f52873l0 = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.f52873l0.setGravity(17);
        this.f52873l0.setText(cd.L0(2131742814, null));
        org.telegram.ui.ActionBar.a7.Z(this.f52873l0, t6.f21330z6, this.resourceProvider);
        this.f52870i0.addView(this.f52873l0, b6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        i0 i0Var = new i0(this, getParentActivity(), 10);
        this.m0 = i0Var;
        frameLayout2.addView(i0Var);
        boolean z11 = this.f52869h0;
        if (z11) {
            vh.d dVar = new vh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f52874n0 = dVar;
            dVar.f();
            this.f52874n0.i(cd.L0(2131744055, null), false, true);
            this.f52874n0.setOnClickListener(new View.OnClickListener(this) {
                public final g f52856b;

                {
                    this.f52856b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i12 = r2;
                    g gVar = this.f52856b;
                    switch (i12) {
                        case 0:
                            gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                            return;
                        case 1:
                            gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                            return;
                        default:
                            gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.m0.addView(this.f52874n0, b6.e(-1, 48, 119));
        }
        u71 u71Var = new u71(this, getParentActivity(), 24);
        this.f52875o0 = u71Var;
        frameLayout2.addView(u71Var);
        vh.d dVar2 = new vh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f52876p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new dq(2131231976, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) cd.L0(2131744068, null));
        this.f52876p0.i(spannableStringBuilder, false, true);
        this.f52876p0.setOnClickListener(new View.OnClickListener(this) {
            public final g f52856b;

            {
                this.f52856b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                g gVar = this.f52856b;
                switch (i12) {
                    case 0:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        return;
                    case 1:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        return;
                    default:
                        gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (z11) {
            this.f52875o0.addView(this.f52876p0, b6.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        vh.d dVar3 = new vh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f52877q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new dq(2131231972, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) cd.L0(2131744069, null));
        this.f52877q0.i(spannableStringBuilder2, false, true);
        this.f52877q0.setOnClickListener(new View.OnClickListener(this) {
            public final g f52856b;

            {
                this.f52856b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                g gVar = this.f52856b;
                switch (i12) {
                    case 0:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        return;
                    case 1:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        return;
                    default:
                        gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                        return;
                }
            }
        });
        this.f52875o0.addView(this.f52877q0, b6.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f52870i0.addView(frameLayout2, b6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.f52875o0.animate().cancel();
        u71 u71Var2 = this.f52875o0;
        if (this.f52879s0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u71Var2.setAlpha(f7);
        i0 i0Var2 = this.m0;
        if (!this.f52879s0) {
            f10 = 1.0f;
        }
        i0Var2.setAlpha(f10);
        u71 u71Var3 = this.f52875o0;
        int i12 = 8;
        if (this.f52879s0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u71Var3.setVisibility(i10);
        i0 i0Var3 = this.m0;
        if (!this.f52879s0) {
            i12 = 0;
        }
        i0Var3.setVisibility(i12);
        E0();
        o3 o3Var = this.f52880t0;
        if (o3Var != null) {
            o3Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19707v3) {
            t0();
            o3 o3Var = this.f52880t0;
            if (o3Var != null) {
                o3Var.O(true);
            }
            g0();
        } else if (i10 == zs.f19734z3) {
            e6 y3 = e6.y(this.currentAccount, true);
            if (this.f52878r0 != y3.N(0)) {
                this.f52878r0 = y3.N(0);
                t0();
                o3 o3Var2 = this.f52880t0;
                if (o3Var2 != null) {
                    o3Var2.O(false);
                }
                g0();
            }
        } else if (i10 == zs.A3) {
            o3 o3Var3 = this.f52880t0;
            if (o3Var3 != null) {
                o3Var3.O(true);
            }
        } else if (i10 == zs.y3) {
            E0();
        } else if (i10 == zs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override
    public final void g0() {
        ku0 ku0Var;
        super.g0();
        if (this.f52866e0 && (ku0Var = this.U) != null && this.f52862a0 != -1) {
            ku0Var.a();
        }
        this.f52866e0 = false;
    }

    @Override
    public final int getNavigationBarColor() {
        return t6.x0(null, t6.f21019i5, false);
    }

    @Override
    public final void h0() {
        this.f40421s.addView(this.U, b6.c(-1.0f, -1));
        this.U.u(this.f40417c, new a(this, 3));
        ku0 ku0Var = this.U;
        g8 g8Var = this.T;
        w71 viewPager = g8Var.getViewPager();
        g8 g8Var2 = this.T;
        Objects.requireNonNull(g8Var2);
        ku0Var.x(g8Var, viewPager, new b(g8Var2, 0));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        C0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ku0 ku0Var = this.U;
        if (ku0Var == null || motionEvent == null || ku0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().f32090b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final g0 j0() {
        o3 o3Var = new o3(this, this.f40417c, getParentActivity(), this.currentAccount, this.classGuid, new qh.d(this, 24), getResourceProvider(), 3);
        this.f52880t0 = o3Var;
        o3Var.f29295r = false;
        return o3Var;
    }

    @Override
    public final a0 k0(Context context) {
        ku0 ku0Var = this.U;
        ku0Var.getClass();
        return new br((Object) ku0Var, 4);
    }

    @Override
    public final g2 l0() {
        return new o7(getParentActivity(), 75, 1, 1);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.f19707v3);
        zs.f(this.currentAccount).c(this, zs.y3);
        zs.f(this.currentAccount).c(this, zs.f19734z3);
        zs.f(this.currentAccount).c(this, zs.A3);
        zs.f(this.currentAccount).c(this, zs.C3);
        e6.y(this.currentAccount, true).S(true);
        e6.y(this.currentAccount, true).R();
        e6.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        tk0 tk0Var = this.f40417c;
        if (tk0Var != null) {
            tk0Var.removeCallbacks(this.f52867f0);
        }
        zs.f(this.currentAccount).n(this, zs.f19707v3);
        zs.f(this.currentAccount).n(this, zs.y3);
        zs.f(this.currentAccount).n(this, zs.f19734z3);
        zs.f(this.currentAccount).n(this, zs.A3);
        zs.f(this.currentAccount).n(this, zs.C3);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f52865d0 = true;
        this.f52863b0 = i11;
        this.f52864c0 = i13;
        C0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setPaused(false);
        }
    }

    @Override
    public final float p0() {
        tk0 tk0Var = this.f40417c;
        if (tk0Var == null) {
            return 0.0f;
        }
        return tk0Var.getY();
    }

    @Override
    public final View q0() {
        return this.U;
    }

    @Override
    public final void r0(boolean z10) {
        fe.b bVar = this.Z;
        if (bVar != null && bVar.f7021f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public final void s0(float f7) {
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setHeaderTilt(f7 * 70.0f);
        }
    }

    @Override
    public final void t0() {
        boolean z10;
        super.t0();
        ku0 ku0Var = this.U;
        if (ku0Var != null && ku0Var.f27914e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52866e0 = z10;
        tk0 tk0Var = this.f40417c;
        if (tk0Var != null && this.P >= 0) {
            this.Q -= tk0Var.getPaddingTop();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
