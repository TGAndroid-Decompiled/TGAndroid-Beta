package zh;

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
import bi.dd;
import bi.ea;
import bi.gd;
import bi.tc;
import c8.ha;
import c8.ka;
import fi.r7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g7;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class l extends na implements v9 {
    public static final int f60430s2 = 0;
    public final long P1;
    public final y31 Q1;
    public final bi.c R1;
    public final bi.w S1;
    public final bg.q T1;
    public final i U1;
    public final pg.h V1;
    public final pg.h W1;
    public final pg.h X1;
    public final n4 Y1;
    public final j6 Z1;
    public final j f60431a2;
    public final j[] f60432b2;
    public final FrameLayout f60433c2;
    public s9 d2;
    public final k f60434e2;
    public Runnable f60435f2;
    public long f60436g2;
    public long f60437h2;
    public boolean f60438i2;
    public final wp[] f60439j2;
    public r5 f60440k2;
    public final te.a f60441l2;
    public final te.a f60442m2;
    public final wp[] f60443n2;
    public boolean f60444o2;
    public m41 f60445p2;
    public boolean f60446q2;
    public boolean f60447r2;

    public l(Context context, g6 g6Var, k kVar, s9 s9Var) {
        super(context, null, false, false, 2, g6Var);
        long j3;
        int i7;
        boolean z9;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f60432b2 = new j[3];
        this.f60438i2 = true;
        this.f60439j2 = new wp[1];
        g gVar = new g(this);
        xq xqVar = xq.h;
        this.f60441l2 = new te.a(0, gVar, xqVar, 380L, false);
        this.f60442m2 = new te.a(0, new g(this), xqVar, 380L, false);
        this.f60443n2 = new wp[1];
        this.d2 = s9Var;
        this.f60434e2 = kVar;
        long j10 = s9Var.f25435b;
        this.P1 = j10;
        this.I1 = true;
        this.f36308r1 = 0.2f;
        s9 l10 = w9.c(this.f28621a).l(j10, this);
        this.T1 = new bg.q(new g(this));
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        N();
        u.d1(this.l1, context, g6Var, l10.d);
        TLRPC.User a22 = qp.s1(this.f28621a).a2(Long.valueOf(p10.i(this.f28621a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Q1 = y31.j(-1, linearLayout);
        i iVar = new i(this, context, g6Var);
        this.U1 = iVar;
        iVar.O = true;
        this.d2.e();
        s9 s9Var2 = this.d2;
        long j11 = s9Var2.f25437e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var2.f25438f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j3 = s9Var2.f25438f.bid_levels.get(0).amount;
        } else {
            j3 = 0;
        }
        if (j3 > 100000) {
            i7 = ((((int) j3) * 3) / 2000) * 1000;
        } else if (j3 > 30000) {
            i7 = 100000;
        } else {
            i7 = 50000;
        }
        int i10 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = iArr[i11];
            if (i12 < 50) {
                z10 = true;
            } else {
                z10 = i12 == 50 ? false : z10;
                if (i12 > i7) {
                    arrayList2.add(Integer.valueOf(i7));
                    break;
                }
                arrayList2.add(Integer.valueOf(i12));
                if (iArr[i11] == i7) {
                    break;
                }
            }
            i11++;
            i10 = 15;
        }
        if (z10) {
            arrayList2.add(0, 50);
        }
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            iArr2[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        i iVar2 = this.U1;
        iVar2.f5199e0 = iArr2;
        linearLayout.addView(iVar2, ha.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        pg.h hVar = new pg.h(4, context, g6Var);
        this.V1 = hVar;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = l6.f27809a7;
        int w02 = l6.w0(i14, this.I0);
        int k10 = i0.a.k(l6.w0(l6.f27957i6, this.I0), l6.w0(i14, this.I0));
        org.telegram.ui.Cells.y k02 = l6.k0(L, L, L, L, w02, k10, k10);
        o6 M = s6.M(i14);
        hVar.setBackground(k02);
        s6.j(hVar, k02, M, null, g6Var);
        hVar.setOnClickListener(new h(this, 2));
        ((TextView) hVar.f53629c).setText(id.M0(2131750375, null));
        pg.h hVar2 = new pg.h(4, context, g6Var);
        this.W1 = hVar2;
        ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(12.0f), l6.w0(i14, this.I0));
        o6 M2 = s6.M(i14);
        hVar2.setBackground(d02);
        s6.j(hVar2, d02, M2, null, g6Var);
        ((TextView) hVar2.f53629c).setText(id.M0(2131750373, null));
        pg.h hVar3 = new pg.h(4, context, g6Var);
        this.X1 = hVar3;
        ShapeDrawable d03 = l6.d0(org.telegram.messenger.g0.L(12.0f), l6.w0(i14, this.I0));
        o6 M3 = s6.M(i14);
        hVar3.setBackground(d03);
        s6.j(hVar3, d03, M3, null, g6Var);
        ((TextView) hVar3.f53629c).setText(id.M0(2131750376, null));
        linearLayout2.addView(hVar, ha.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ha.l(0.0f, 10, -1));
        linearLayout2.addView(hVar2, ha.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ha.l(0.0f, 10, -1));
        linearLayout2.addView(hVar3, ha.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, ha.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.f25437e.acquired_count > 0) {
            x70 x70Var = new x70(context, g6Var);
            x70Var.setGravity(17);
            x70Var.setTextSize(1, 16.0f);
            int i15 = l6.J6;
            s6.U(x70Var, i15, g6Var);
            s6.G(x70Var, i15, g6Var);
            x70Var.setOnClickListener(new ud0(this, new boolean[1], g6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new r5(l10.f25436c, x70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            x70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(id.F("Gift2AuctionsItemsBought2", l10.f25437e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            ka.b(x70Var, 0.02f, 1.5f);
            linearLayout.addView(x70Var, ha.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i16 = l6.L6;
        n4 n4Var = new n4(context, i16, 21, 0, 0, false, true, g6Var);
        this.Y1 = n4Var;
        linearLayout.addView(n4Var, ha.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        j6 j6Var = new j6(context, false, false, false);
        this.Z1 = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        j6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        j6Var.setSizeableBackground(l6.b0(0, 0, 9, 9));
        j6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new wg.a0(this, 3));
        n4Var.addView(j6Var, ha.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        j jVar = new j(context, g6Var);
        this.f60431a2 = jVar;
        j6 j6Var2 = jVar.f60405b;
        s6.q(j6Var2);
        j6Var2.setTextColor(l6.w0(i16, this.I0));
        jVar.c(a22);
        linearLayout.addView(jVar, ha.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        n4 n4Var2 = new n4(context, i16, 21, 15, 0, false, false, g6Var);
        n4Var2.setText(id.M0(2131750320, null));
        linearLayout.addView(n4Var2, ha.o(-1, -2));
        int i17 = 0;
        while (true) {
            j[] jVarArr = this.f60432b2;
            if (i17 >= jVarArr.length) {
                break;
            }
            jVarArr[i17] = new j(context, g6Var);
            int i18 = i17 + 1;
            this.f60432b2[i17].b(i18, true, false);
            this.f60432b2[i17].setBackground(l6.N0(false));
            j jVar2 = this.f60432b2[i17];
            if (i17 < 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            jVar2.f60408f = z9;
            jVar2.setOnClickListener(new bi.l1(23));
            linearLayout.addView(this.f60432b2[i17], ha.o(-1, -2));
            i17 = i18;
        }
        bi.w wVar = new bi.w(3, context, g6Var, true);
        this.S1 = wVar;
        wVar.f();
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i19 = d.leftMargin;
        int i20 = this.f28654t0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.f28624b.addView(wVar, d);
        qj0 qj0Var = this.f36303k1;
        int i21 = this.f28654t0;
        qj0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(64.0f));
        this.f36303k1.setOnItemClickListener(new g7(4));
        long j12 = l10.f25437e.bid_amount;
        if (j12 > 0) {
            this.U1.setValue((int) j12);
        } else {
            this.U1.setValue((int) l10.e());
        }
        n1(false);
        this.f36303k1.setOverScrollMode(2);
        bi.c cVar = new bi.c(this.f28621a, context, g6Var);
        this.R1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.f28627c.addView(cVar, ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ka.a(cVar);
        cVar.setOnClickListener(new gd(2, context, g6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60433c2 = frameLayout;
        this.f28627c.addView(frameLayout, ha.e(-1, 100, 48));
        j1();
        this.f60445p2.O(false);
    }

    public static void d1(l lVar, int i7) {
        lVar.U1.f(di.t.b(lVar.f28621a, i7, 3), di.t.b(lVar.f28621a, i7, 4), true);
        lVar.l1(lVar.f60444o2);
        lVar.m1(lVar.f60444o2);
        lVar.i1(lVar.f60444o2);
        lVar.f1();
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new hi.u1(this, 27), this.I0);
        this.f60445p2 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131750344, null);
    }

    @Override
    public final void c(s9 s9Var) {
        this.d2 = s9Var;
        n1(this.f60444o2);
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28621a).n(this.P1, this);
        this.T1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z9;
        float f10;
        if (this.f60444o2 && !this.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f60446q2 != z9) {
            this.f60446q2 = z9;
            bi.c cVar = this.R1;
            if (cVar != null) {
                cVar.setEnabled(z9);
                cVar.setClickable(z9);
                ViewPropertyAnimator animate = cVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z9) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z9) {
                    f12 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(scaleY, f12, 180L);
            }
        }
    }

    public final void f1() {
        long j3;
        i iVar = this.U1;
        int value = iVar.getValue();
        if (iVar.getProgress() > 0.99f) {
            iVar.g(id.M0(2131750322, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.d2.f25437e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            iVar.g(id.M0(2131750317, null));
        } else if (j11 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j10 - j11 > 0) {
                iVar.g("+" + id.E(j3, ','));
                return;
            }
            iVar.g(null);
        } else {
            iVar.g(null);
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    public final void g1(int i7) {
        long j3;
        if (this.f60447r2) {
            return;
        }
        long j10 = this.d2.f25437e.bid_amount;
        if (j10 > 0) {
            j3 = i7 - j10;
        } else {
            j3 = i7;
        }
        long j11 = j3;
        if (ea.y(this.f28621a, false).f3810e && ea.y(this.f28621a, false).q(null, false, false).amount < j11) {
            new tc(getContext(), this.I0, j11, 14, null, null, 0L).show();
            return;
        }
        this.f60447r2 = true;
        this.S1.setLoading(true);
        w9.c(this.f28621a).k(this.P1, this.f60434e2, i7, new ii.g0(this, j10, 2));
    }

    public final void h1() {
        FrameLayout frameLayout;
        Drawable drawable = this.f28651r0;
        if (drawable != null && this.f28624b != null && (frameLayout = this.f60433c2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.f28624b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
        }
    }

    public final void i1(boolean z9) {
        long value = this.U1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.d2.f25437e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = (value > j3 ? 1 : (value == j3 ? 0 : -1));
        bi.w wVar = this.S1;
        if (i7 == 0) {
            wVar.i(id.M0(2131747831, null), z9, true);
            wVar.setOnClickListener(new h(this, 0));
            return;
        }
        int i10 = (j3 > value ? 1 : (j3 == value ? 0 : -1));
        wp[] wpVarArr = this.f60443n2;
        if (i10 < 0 && !tL_StarGiftAuctionUserState.returned) {
            wVar.i(dd.Y0(false, id.a0(null, null, 2131750338, id.E(value - j3, ',')), wpVarArr), z9, true);
        } else {
            wVar.i(dd.Y0(false, id.a0(null, null, 2131750339, id.E(value, ',')), wpVarArr), z9, true);
        }
        wVar.setOnClickListener(new h(this, 1));
    }

    public final void j1() {
        int f10 = i0.a.f(this.f60441l2.f55499e, i0.a.f(this.f60442m2.f55499e, l6.w0(l6.L6, this.I0), l6.w0(l6.f28106q7, this.I0)), l6.w0(l6.ik, this.I0));
        this.Y1.setTextColor(f10);
        j6 j6Var = this.Z1;
        j6Var.setTextColor(f10);
        this.f60431a2.f60405b.setTextColor(f10);
        if (l6.H1(j6Var.getSizeableBackground(), l6.r1(0.15f, f10), false)) {
            j6Var.invalidate();
        }
    }

    public final void k1(long j3, boolean z9) {
        String h02;
        j6 j6Var = (j6) this.W1.f53628b;
        if (j3 >= 3600) {
            h02 = org.telegram.messenger.g0.j0((int) j3);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j3, true);
        }
        j6Var.c(h02, z9, true);
    }

    public final void l1(boolean z9) {
        int i7;
        long value = this.U1.getValue();
        s9 s9Var = this.d2;
        int i10 = s9Var.f25440i;
        int c10 = s9Var.c(ConnectionsManager.getInstance(s9Var.f25434a).getCurrentTime(), value);
        long max = Math.max(value, this.d2.f25437e.bid_amount);
        j jVar = this.f60431a2;
        jVar.a(max, false);
        if (i10 > 0) {
            c10 = Math.min(i10, c10);
        }
        jVar.b(c10, false, z9);
        s9 s9Var2 = this.d2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var2.f25438f;
        j6 j6Var = this.Z1;
        if (tL_starGiftAuctionState != null && c10 > 0 && s9Var2.d.title != null && s9Var2.d() == 1) {
            s9 s9Var3 = this.d2;
            s9Var3.getClass();
            if (!s9Var3.g(ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime())) {
                s9 s9Var4 = this.d2;
                if (s9Var4.f25438f.last_gift_num + c10 <= s9Var4.d.availability_total) {
                    j6Var.setText(this.d2.d.title + " #" + id.E(i7, ','));
                    return;
                }
            }
        }
        j6Var.setText(null);
    }

    public final void m1(boolean z9) {
        boolean z10;
        int d = this.d2.d();
        int i7 = (this.U1.getValue() > this.d2.f25437e.bid_amount ? 1 : (this.U1.getValue() == this.d2.f25437e.bid_amount ? 0 : -1));
        n4 n4Var = this.Y1;
        boolean z11 = false;
        if (i7 > 0) {
            n4Var.c(id.M0(2131750371, null), z9);
        } else {
            z10 = true;
            if (d == 2) {
                n4Var.c(id.M0(2131750369, null), z9);
            } else if (d == 3) {
                n4Var.c(id.M0(2131750369, null), z9);
            } else if (d == 1) {
                n4Var.c(id.M0(2131750368, null), z9);
                z10 = false;
                z11 = true;
            } else {
                n4Var.c(id.M0(2131750371, null), z9);
            }
            this.f60441l2.a(z11, z9);
            this.f60442m2.a(z10, z9);
        }
        z10 = false;
        this.f60441l2.a(z11, z9);
        this.f60442m2.a(z10, z9);
    }

    @Override
    public final void n0() {
        this.f60444o2 = false;
        e1();
        cc.h(this.f28627c);
    }

    public final void n1(boolean z9) {
        String o02;
        org.telegram.ui.ActionBar.f2 Q;
        int i7;
        j6 j6Var = (j6) this.V1.f53628b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.d2.e();
        if (e10 < 1000000) {
            o02 = id.E(e10, ',');
        } else {
            o02 = org.telegram.messenger.g0.o0((int) e10, 1000000);
        }
        sb2.append(o02);
        j6Var.c(dd.a1(false, sb2.toString(), 0.78f, this.f60439j2), z9, true);
        if (this.d2.f25438f != null) {
            int currentTime = ConnectionsManager.getInstance(this.f28621a).getCurrentTime();
            boolean g10 = this.d2.g(currentTime);
            bg.q qVar = this.T1;
            if (g10) {
                long max = Math.max(0, this.d2.f25438f.start_date - currentTime);
                qVar.a(max);
                k1(max, z9);
            } else {
                long max2 = Math.max(0, this.d2.f25438f.next_round_at - currentTime);
                qVar.a(max2);
                k1(max2, z9);
            }
            r5 r5Var = this.f60440k2;
            pg.h hVar = this.X1;
            if (r5Var == null && this.d2.d.sticker != null) {
                this.f60440k2 = new r5(this.d2.d.sticker.f26962id, ((j6) hVar.f53628b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f60440k2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f60440k2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) id.E(this.d2.f25438f.gifts_left, ','));
            ((j6) hVar.f53628b).c(spannableStringBuilder, z9, true);
            TextView textView = (TextView) this.W1.f53629c;
            s9 s9Var = this.d2;
            s9Var.getClass();
            if (s9Var.g(ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime())) {
                i7 = 2131750372;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.d2.f25438f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i7 = 2131750374;
                } else {
                    i7 = 2131750373;
                }
            }
            textView.setText(id.M0(i7, null));
            j[] jVarArr = this.f60432b2;
            int min = Math.min(jVarArr.length, this.d2.f25438f.top_bidders.size());
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    int i11 = i10 + 1;
                    Long l10 = this.d2.f25438f.top_bidders.get(i10);
                    long longValue = l10.longValue();
                    TLRPC.User a22 = qp.s1(this.f28621a).a2(l10);
                    if (a22 != null) {
                        jVarArr[i10].c(a22);
                    }
                    jVarArr[i10].a(this.d2.b(i11), z9);
                    jVarArr[i10].setOnClickListener(new di.u1(this, longValue, 4));
                    i10 = i11;
                }
            }
        }
        s9 s9Var2 = this.d2;
        i iVar = this.U1;
        iVar.setStarsTop(s9Var2.b(s9Var2.d.gifts_per_round) + 1);
        iVar.setTopText(id.G(this.d2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z9);
        m1(z9);
        i1(z9);
        f1();
        long o4 = m5.o(this.d2.f25437e.peer);
        long j3 = this.d2.f25437e.acquired_count;
        if (this.f60437h2 < j3 && !this.f60438i2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.f60436g2;
            if (j10 != 0) {
                cn ta2 = cn.ta(j10);
                ta2.whenFullyVisible(new qg.b(ta2, 1));
                Q.presentFragment(ta2);
                Runnable runnable = this.f60435f2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.f60436g2 = o4;
        }
        this.f60437h2 = j3;
        this.f60438i2 = false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            if (this.Y1 != null && this.Z1 != null && this.f60431a2 != null) {
                j1();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.f60444o2 = true;
        e1();
        cc.a(this.f28627c, new r7(16));
    }
}
