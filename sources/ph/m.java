package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.u9;
import org.telegram.messenger.wp;
import org.telegram.messenger.x9;
import org.telegram.messenger.y9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c7;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f51;
import org.telegram.ui.un;
import org.telegram.ui.z70;
import rh.h8;
import rh.x7;
import w7.b6;
import w7.e6;
public final class m extends ha implements x9 {
    public static final int f45224s2 = 0;
    public final long P1;
    public final b51 Q1;
    public final rh.a R1;
    public final i S1;
    public final rf.m T1;
    public final h U1;
    public final k V1;
    public final k W1;
    public final k X1;
    public final p4 Y1;
    public final f6 Z1;
    public final j a2;
    public final j[] f45225b2;
    public final FrameLayout f45226c2;
    public u9 f45227d2;
    public final l f45228e2;
    public Runnable f45229f2;
    public long f45230g2;
    public long f45231h2;
    public boolean f45232i2;
    public final dq[] f45233j2;
    public o5 f45234k2;
    public final fe.b f45235l2;
    public final fe.b f45236m2;
    public final dq[] f45237n2;
    public boolean f45238o2;
    public q51 f45239p2;
    public boolean f45240q2;
    public boolean f45241r2;

    public m(Context context, p6 p6Var, l lVar, u9 u9Var) {
        super(context, null, false, false, 2, p6Var);
        long j10;
        int i10;
        boolean z10;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f45225b2 = new j[3];
        this.f45232i2 = true;
        this.f45233j2 = new dq[1];
        f fVar = new f(this);
        gr grVar = gr.h;
        this.f45235l2 = new fe.b(0, fVar, grVar, 380L, false);
        this.f45236m2 = new fe.b(0, new f(this), grVar, 380L, false);
        this.f45237n2 = new dq[1];
        this.f45227d2 = u9Var;
        this.f45228e2 = lVar;
        long j11 = u9Var.f18403b;
        this.P1 = j11;
        this.I1 = true;
        this.f26730r1 = 0.2f;
        u9 l4 = y9.c(this.f21584a).l(j11, this);
        this.T1 = new rf.m(new f(this));
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        w.d1(this.l1, context, p6Var, l4.d);
        TLRPC.User Z1 = wp.r1(this.f21584a).Z1(Long.valueOf(e20.i(this.f21584a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Q1 = b51.j(-1, linearLayout);
        h hVar = new h(this, context, p6Var);
        this.U1 = hVar;
        hVar.O = true;
        this.f45227d2.e();
        u9 u9Var2 = this.f45227d2;
        long j12 = u9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var2.f18405f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j10 = u9Var2.f18405f.bid_levels.get(0).amount;
        } else {
            j10 = 0;
        }
        if (j10 > 100000) {
            i10 = ((((int) j10) * 3) / 2000) * 1000;
        } else if (j10 > 30000) {
            i10 = 100000;
        } else {
            i10 = 50000;
        }
        int i11 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 < 50) {
                z11 = true;
            } else {
                z11 = i13 == 50 ? false : z11;
                if (i13 > i10) {
                    arrayList2.add(Integer.valueOf(i10));
                    break;
                }
                arrayList2.add(Integer.valueOf(i13));
                if (iArr[i12] == i10) {
                    break;
                }
            }
            i12++;
            i11 = 15;
        }
        if (z11) {
            arrayList2.add(0, 50);
        }
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            iArr2[i14] = ((Integer) arrayList2.get(i14)).intValue();
        }
        h hVar2 = this.U1;
        hVar2.f47617e0 = iArr2;
        linearLayout.addView(hVar2, b6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        k kVar = new k(context, p6Var);
        this.V1 = kVar;
        int L = org.telegram.messenger.i0.L(12.0f);
        int i15 = t6.f20873a7;
        int w02 = t6.w0(i15, this.I0);
        int k10 = i0.b.k(t6.w0(t6.f21021i6, this.I0), t6.w0(i15, this.I0));
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, k10, k10);
        w6 N = a7.N(i15);
        kVar.setBackground(k02);
        a7.k(kVar, k02, N, null, p6Var);
        kVar.setOnClickListener(new g(this, 2));
        ((TextView) kVar.f45154c).setText(dd.L0(2131750384, null));
        k kVar2 = new k(context, p6Var);
        this.W1 = kVar2;
        ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(12.0f), t6.w0(i15, this.I0));
        w6 N2 = a7.N(i15);
        kVar2.setBackground(d02);
        a7.k(kVar2, d02, N2, null, p6Var);
        ((TextView) kVar2.f45154c).setText(dd.L0(2131750382, null));
        k kVar3 = new k(context, p6Var);
        this.X1 = kVar3;
        ShapeDrawable d03 = t6.d0(org.telegram.messenger.i0.L(12.0f), t6.w0(i15, this.I0));
        w6 N3 = a7.N(i15);
        kVar3.setBackground(d03);
        a7.k(kVar3, d03, N3, null, p6Var);
        ((TextView) kVar3.f45154c).setText(dd.L0(2131750385, null));
        linearLayout2.addView(kVar, b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), b6.l(0.0f, 10, -1));
        linearLayout2.addView(kVar2, b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), b6.l(0.0f, 10, -1));
        linearLayout2.addView(kVar3, b6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, b6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l4.e.acquired_count > 0) {
            p80 p80Var = new p80(context, p6Var);
            p80Var.setGravity(17);
            p80Var.setTextSize(1, 16.0f);
            int i16 = t6.J6;
            a7.V(p80Var, i16, p6Var);
            a7.H(p80Var, i16, p6Var);
            p80Var.setOnClickListener(new ag.i(this, new boolean[1], p6Var, 24));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new o5(l4.f18404c, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.H2(dd.F("Gift2AuctionsItemsBought2", l4.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f))));
            e6.b(p80Var, 0.02f, 1.5f);
            linearLayout.addView(p80Var, b6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = t6.L6;
        p4 p4Var = new p4(context, i17, 21, 0, 0, false, true, p6Var);
        this.Y1 = p4Var;
        linearLayout.addView(p4Var, b6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        f6 f6Var = new f6(context, false, false, false);
        this.Z1 = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(12.5f));
        f6Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        f6Var.setSizeableBackground(t6.b0(0, 0, 9, 9));
        f6Var.setHideBackgroundIfEmpty(true);
        p4Var.setOnWidthUpdateListener(new w5(this, 24));
        p4Var.addView(f6Var, b6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        j jVar = new j(context, p6Var);
        this.a2 = jVar;
        f6 f6Var2 = jVar.f45135b;
        a7.r(f6Var2);
        f6Var2.setTextColor(t6.w0(i17, this.I0));
        jVar.c(Z1);
        linearLayout.addView(jVar, b6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        p4 p4Var2 = new p4(context, i17, 21, 15, 0, false, false, p6Var);
        p4Var2.setText(dd.L0(2131750329, null));
        linearLayout.addView(p4Var2, b6.o(-1, -2));
        int i18 = 0;
        while (true) {
            j[] jVarArr = this.f45225b2;
            if (i18 >= jVarArr.length) {
                break;
            }
            jVarArr[i18] = new j(context, p6Var);
            int i19 = i18 + 1;
            this.f45225b2[i18].b(i19, true, false);
            this.f45225b2[i18].setBackground(t6.N0(false));
            j jVar2 = this.f45225b2[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar2.f45137f = z10;
            jVar2.setOnClickListener(new bh.c(20));
            linearLayout.addView(this.f45225b2[i18], b6.o(-1, -2));
            i18 = i19;
        }
        i iVar = new i(0, context, p6Var, true);
        this.S1 = iVar;
        iVar.f();
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.f21616t0;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.f21587b.addView(iVar, d);
        uk0 uk0Var = this.f26724k1;
        int i22 = this.f21616t0;
        uk0Var.setPadding(i22, 0, i22, org.telegram.messenger.i0.L(64.0f));
        this.f26724k1.setOnItemClickListener(new c7(4));
        long j13 = l4.e.bid_amount;
        if (j13 > 0) {
            this.U1.setValue((int) j13);
        } else {
            this.U1.setValue((int) l4.e());
        }
        n1(false);
        this.f26724k1.setOverScrollMode(2);
        rh.a aVar = new rh.a(this.f21584a, context, p6Var);
        this.R1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.f21590c.addView(aVar, b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        e6.a(aVar);
        aVar.setOnClickListener(new f51(1, context, p6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45226c2 = frameLayout;
        this.f21590c.addView(frameLayout, b6.e(-1, 100, 48));
        j1();
        this.f45239p2.O(false);
    }

    public static void d1(m mVar, int i10) {
        mVar.U1.f(th.o.b(mVar.f21584a, i10, 3), th.o.b(mVar.f21584a, i10, 4), true);
        mVar.l1(mVar.f45238o2);
        mVar.m1(mVar.f45238o2);
        mVar.i1(mVar.f45238o2);
        mVar.f1();
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new ag.a(this, 22), this.I0);
        this.f45239p2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131750353, null);
    }

    @Override
    public final void c(u9 u9Var) {
        this.f45227d2 = u9Var;
        n1(this.f45238o2);
    }

    @Override
    public final void dismiss() {
        y9.c(this.f21584a).n(this.P1, this);
        this.T1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z10;
        float f7;
        if (this.f45238o2 && !this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45240q2 != z10) {
            this.f45240q2 = z10;
            rh.a aVar = this.R1;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                a30.l(scaleY, f11, 180L);
            }
        }
    }

    public final void f1() {
        long j10;
        h hVar = this.U1;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(dd.L0(2131750331, null));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f45227d2.e;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            hVar.g(dd.L0(2131750326, null));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                hVar.g("+" + dd.E(j10, ','));
                return;
            }
            hVar.g(null);
        } else {
            hVar.g(null);
        }
    }

    @Override
    public final void g0(float f7) {
        super.g0(f7);
        e1();
    }

    public final void g1(int i10) {
        long j10;
        if (this.f45241r2) {
            return;
        }
        long j11 = this.f45227d2.e.bid_amount;
        if (j11 > 0) {
            j10 = i10 - j11;
        } else {
            j10 = i10;
        }
        long j12 = j10;
        if (rh.e6.y(this.f21584a, false).e && rh.e6.y(this.f21584a, false).q(null, false, false).amount < j12) {
            new x7(getContext(), this.I0, j12, 14, null, null, 0L).show();
            return;
        }
        this.f45241r2 = true;
        this.S1.setLoading(true);
        y9.c(this.f21584a).k(this.P1, this.f45228e2, i10, new z70(this, j11, 1));
    }

    public final void h1() {
        FrameLayout frameLayout;
        Drawable drawable = this.f21613r0;
        if (drawable != null && this.f21587b != null && (frameLayout = this.f45226c2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.f21587b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.i0.L(10.0f)));
        }
    }

    public final void i1(boolean z10) {
        long value = this.U1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f45227d2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i10 = (value > j10 ? 1 : (value == j10 ? 0 : -1));
        i iVar = this.S1;
        if (i10 == 0) {
            iVar.i(dd.L0(2131747847, null), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        int i11 = (j10 > value ? 1 : (j10 == value ? 0 : -1));
        dq[] dqVarArr = this.f45237n2;
        if (i11 < 0 && !tL_StarGiftAuctionUserState.returned) {
            iVar.i(h8.Y0(false, dd.a0(null, null, 2131750347, dd.E(value - j10, ',')), dqVarArr), z10, true);
        } else {
            iVar.i(h8.Y0(false, dd.a0(null, null, 2131750348, dd.E(value, ',')), dqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void j1() {
        int f7 = i0.b.f(this.f45235l2.e, i0.b.f(this.f45236m2.e, t6.w0(t6.L6, this.I0), t6.w0(t6.f21171q7, this.I0)), t6.w0(t6.ik, this.I0));
        this.Y1.setTextColor(f7);
        f6 f6Var = this.Z1;
        f6Var.setTextColor(f7);
        this.a2.f45135b.setTextColor(f7);
        if (t6.H1(f6Var.getSizeableBackground(), t6.r1(0.15f, f7), false)) {
            f6Var.invalidate();
        }
    }

    public final void k1(long j10, boolean z10) {
        String h02;
        f6 f6Var = (f6) this.W1.f45153b;
        if (j10 >= 3600) {
            h02 = org.telegram.messenger.i0.j0((int) j10);
        } else {
            h02 = org.telegram.messenger.i0.h0((int) j10, true);
        }
        f6Var.c(h02, z10, true);
    }

    public final void l1(boolean z10) {
        int i10;
        long value = this.U1.getValue();
        u9 u9Var = this.f45227d2;
        int i11 = u9Var.f18407i;
        int c10 = u9Var.c(ConnectionsManager.getInstance(u9Var.f18402a).getCurrentTime(), value);
        long max = Math.max(value, this.f45227d2.e.bid_amount);
        j jVar = this.a2;
        jVar.a(max, false);
        if (i11 > 0) {
            c10 = Math.min(i11, c10);
        }
        jVar.b(c10, false, z10);
        u9 u9Var2 = this.f45227d2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var2.f18405f;
        f6 f6Var = this.Z1;
        if (tL_starGiftAuctionState != null && c10 > 0 && u9Var2.d.title != null && u9Var2.d() == 1) {
            u9 u9Var3 = this.f45227d2;
            u9Var3.getClass();
            if (!u9Var3.g(ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime())) {
                u9 u9Var4 = this.f45227d2;
                if (u9Var4.f18405f.last_gift_num + c10 <= u9Var4.d.availability_total) {
                    f6Var.setText(this.f45227d2.d.title + " #" + dd.E(i10, ','));
                    return;
                }
            }
        }
        f6Var.setText(null);
    }

    public final void m1(boolean z10) {
        boolean z11;
        int d = this.f45227d2.d();
        int i10 = (this.U1.getValue() > this.f45227d2.e.bid_amount ? 1 : (this.U1.getValue() == this.f45227d2.e.bid_amount ? 0 : -1));
        p4 p4Var = this.Y1;
        boolean z12 = false;
        if (i10 > 0) {
            p4Var.c(dd.L0(2131750380, null), z10);
        } else {
            z11 = true;
            if (d == 2) {
                p4Var.c(dd.L0(2131750378, null), z10);
            } else if (d == 3) {
                p4Var.c(dd.L0(2131750378, null), z10);
            } else if (d == 1) {
                p4Var.c(dd.L0(2131750377, null), z10);
                z11 = false;
                z12 = true;
            } else {
                p4Var.c(dd.L0(2131750380, null), z10);
            }
            this.f45235l2.a(z12, z10);
            this.f45236m2.a(z11, z10);
        }
        z11 = false;
        this.f45235l2.a(z12, z10);
        this.f45236m2.a(z11, z10);
    }

    @Override
    public final void n0() {
        this.f45238o2 = false;
        e1();
        wb.h(this.f21590c);
    }

    public final void n1(boolean z10) {
        String o02;
        org.telegram.ui.ActionBar.k2 Q;
        int i10;
        f6 f6Var = (f6) this.V1.f45153b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e = (int) this.f45227d2.e();
        if (e < 1000000) {
            o02 = dd.E(e, ',');
        } else {
            o02 = org.telegram.messenger.i0.o0((int) e, 1000000);
        }
        sb2.append(o02);
        f6Var.c(h8.a1(false, sb2.toString(), 0.78f, this.f45233j2), z10, true);
        if (this.f45227d2.f18405f != null) {
            int currentTime = ConnectionsManager.getInstance(this.f21584a).getCurrentTime();
            boolean g10 = this.f45227d2.g(currentTime);
            rf.m mVar = this.T1;
            if (g10) {
                long max = Math.max(0, this.f45227d2.f18405f.start_date - currentTime);
                mVar.a(max);
                k1(max, z10);
            } else {
                long max2 = Math.max(0, this.f45227d2.f18405f.next_round_at - currentTime);
                mVar.a(max2);
                k1(max2, z10);
            }
            o5 o5Var = this.f45234k2;
            k kVar = this.X1;
            if (o5Var == null && this.f45227d2.d.sticker != null) {
                this.f45234k2 = new o5(this.f45227d2.d.sticker.f19800id, ((f6) kVar.f45153b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f45234k2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f45234k2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) dd.E(this.f45227d2.f18405f.gifts_left, ','));
            ((f6) kVar.f45153b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.W1.f45154c;
            u9 u9Var = this.f45227d2;
            u9Var.getClass();
            if (u9Var.g(ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime())) {
                i10 = 2131750381;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f45227d2.f18405f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = 2131750383;
                } else {
                    i10 = 2131750382;
                }
            }
            textView.setText(dd.L0(i10, null));
            j[] jVarArr = this.f45225b2;
            int min = Math.min(jVarArr.length, this.f45227d2.f18405f.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f45227d2.f18405f.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User Z1 = wp.r1(this.f21584a).Z1(l4);
                    if (Z1 != null) {
                        jVarArr[i11].c(Z1);
                    }
                    jVarArr[i11].a(this.f45227d2.b(i12), z10);
                    jVarArr[i11].setOnClickListener(new ih.p(this, longValue, 3));
                    i11 = i12;
                }
            }
        }
        u9 u9Var2 = this.f45227d2;
        h hVar = this.U1;
        hVar.setStarsTop(u9Var2.b(u9Var2.d.gifts_per_round) + 1);
        hVar.setTopText(dd.G(this.f45227d2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z10);
        m1(z10);
        i1(z10);
        f1();
        long o10 = org.telegram.messenger.o5.o(this.f45227d2.e.peer);
        long j10 = this.f45227d2.e.acquired_count;
        if (this.f45231h2 < j10 && !this.f45232i2 && (Q = LaunchActivity.Q()) != null) {
            long j11 = this.f45230g2;
            if (j11 != 0) {
                un ma2 = un.ma(j11);
                ma2.whenFullyVisible(new gg.b(ma2, 1));
                Q.presentFragment(ma2);
                Runnable runnable = this.f45229f2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o10 != 0) {
            this.f45230g2 = o10;
        }
        this.f45231h2 = j10;
        this.f45232i2 = false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            if (this.Y1 != null && this.Z1 != null && this.a2 != null) {
                j1();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void w() {
        this.f45238o2 = true;
        e1();
        wb.a(this.f21590c, new mg.u(10));
    }
}
