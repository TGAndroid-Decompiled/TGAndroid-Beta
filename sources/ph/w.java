package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.m5;
import org.telegram.messenger.s9;
import org.telegram.messenger.u9;
import org.telegram.messenger.x9;
import org.telegram.messenger.y9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.rt0;
import w7.b6;
import w7.e6;
public final class w extends ha implements x9 {
    public static final ec[] f45346h2 = new ec[1];
    public static final wy0[] f45347i2 = new wy0[1];
    public final TL_stars.StarGift P1;
    public final long Q1;
    public final LinearLayout R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final ec U1;
    public final ec V1;
    public final ec W1;
    public final ec X1;
    public final wy0 Y1;
    public final org.telegram.tgnet.e Z1;
    public final TableRow a2;
    public final vh.d f45348b2;
    public final p80 f45349c2;
    public final p80 f45350d2;
    public u9 f45351e2;
    public final CharSequence f45352f2;
    public q51 f45353g2;

    public w(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, p6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.P1 = starGift;
        long j11 = starGift.f20022id;
        this.Q1 = j11;
        this.B1 = org.telegram.messenger.i0.L(6.0f);
        this.f26730r1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        lVar.D(-1, false);
        lVar.setOccupyStatusBar(false);
        d1(lVar, context, p6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.addView(lVar, b6.o(-1, -2));
        linearLayout.addView(frameLayout);
        c1 c1Var = new c1(this.f21584a, context, p6Var);
        c1Var.f45000c0 = true;
        c1Var.h(starGift, false, false, false, false, false);
        c1Var.setImageSize(org.telegram.messenger.i0.L(100.0f));
        c1Var.setImageLayer(7);
        c1Var.J.setVisibility(8);
        frameLayout.addView(c1Var, b6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = t6.G6;
        a7.V(textView, i12, p6Var);
        linearLayout.addView(textView, b6.t(-1, -2, 17, 20, 0, 20, 6));
        p80 p80Var = new p80(context, null);
        this.f45349c2 = p80Var;
        p80Var.setGravity(17);
        p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.W2(dd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(dd.L0(2131750366, null), new q(context, p6Var, starGift, 0)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f))));
        p80Var.setTextSize(1, 14.0f);
        a7.V(p80Var, i12, p6Var);
        int i13 = t6.J6;
        a7.H(p80Var, i13, p6Var);
        linearLayout.addView(p80Var, b6.t(-1, -2, 17, 20, 0, 20, 4));
        xy0 xy0Var = new xy0(context, p6Var);
        String L0 = dd.L0(2131750332, null);
        ec[] ecVarArr = f45346h2;
        xy0Var.c(L0, "", null, ecVarArr);
        this.U1 = ecVarArr[0];
        xy0Var.c(dd.L0(2131750333, null), "", null, ecVarArr);
        this.V1 = ecVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(xy0Var, b6.e(-1, -2, 119));
        this.Z1 = new org.telegram.tgnet.e(this, new vh.p2[1], frameLayout2, 5);
        TableRow c10 = xy0Var.c(dd.L0(2131749597, null), "", null, ecVarArr);
        this.a2 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final w f45294b;

            {
                this.f45294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new kg.i1(40, this.f45294b.getContext(), (p6) null).show();
                        return;
                    default:
                        this.f45294b.f1();
                        return;
                }
            }
        });
        this.W1 = ecVarArr[0];
        wy0[] wy0VarArr = f45347i2;
        xy0Var.c("", "", wy0VarArr, ecVarArr);
        this.X1 = ecVarArr[0];
        this.Y1 = wy0VarArr[0];
        linearLayout.addView(frameLayout2, b6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        this.f45350d2 = p80Var2;
        p80Var2.setGravity(17);
        p80Var2.setTextSize(1, 16.0f);
        a7.V(p80Var2, i13, p6Var);
        a7.H(p80Var2, i13, p6Var);
        p80Var2.setOnClickListener(new ag.i(this, new boolean[1], p6Var, 26));
        e6.b(p80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new o5(starGift.sticker, p80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f45352f2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f45352f2 = "";
        }
        vh.d dVar = new vh.d(context, p6Var, true);
        this.f45348b2 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new n(this, j10, context, p6Var, runnable, 0));
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.f21616t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.f21587b.addView(dVar, d);
        uk0 uk0Var = this.f26724k1;
        int i17 = this.f21616t0;
        uk0Var.setPadding(i17, i14, i17, org.telegram.messenger.i0.L(64.0f));
        this.f45353g2.O(i14);
        u9 l4 = y9.c(this.f21584a).l(j11, this);
        this.f45351e2 = l4;
        if (l4 != null && (tL_starGiftAuctionState2 = l4.f18405f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f21584a).getCurrentTime()) {
                xy0Var.c(dd.L0(2131750340, null), dd.E(this.f45351e2.f18405f.total_rounds, ','), null, null);
            } else {
                String L02 = dd.L0(2131750341, null);
                String E = dd.E(this.f45351e2.f18405f.current_round, ',');
                String E2 = dd.E(this.f45351e2.f18405f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                xy0Var.c(L02, dd.a0(null, null, 2131747844, objArr), null, null);
            }
        }
        u9 u9Var = this.f45351e2;
        if (u9Var != null && (tL_starGiftAuctionState = u9Var.f18405f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i18 = i14; i18 < size; i18++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f45351e2.f18405f.rounds.get(i18);
                if (i18 < size - 1) {
                    i10 = 1;
                    i11 = this.f45351e2.f18405f.rounds.get(i18 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.f45351e2.f18405f.total_rounds;
                }
                int i19 = starGiftAuctionRound.num;
                if (i19 == i11) {
                    Object[] objArr2 = new Object[i10];
                    objArr2[i14] = Integer.valueOf(i19);
                    a02 = dd.a0(null, null, 2131750339, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i10] = valueOf2;
                    a02 = dd.a0(null, null, 2131750337, objArr3);
                }
                if (starGiftAuctionRound.num == i11) {
                    String c02 = dd.c0(starGiftAuctionRound.duration);
                    String c03 = dd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = dd.a0(null, null, 2131750338, objArr4);
                } else {
                    G = dd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                xy0Var.c(a02, G, null, null);
            }
        }
        u9 u9Var2 = this.f45351e2;
        if (u9Var2 != null && u9Var2.h != null) {
            u uVar = new u(this, context, p6Var, new o(this, i14), new bh.c(21), new bh.c(21), new bh.c(21), new bh.c(21), new bh.c(21), new bh.c(21));
            uVar.d(new f4.d(1, 1));
            uVar.setPreviewingAttributes(this.f45351e2.h);
            uVar.removeView(uVar.P);
            this.S1.addView(uVar, i14, b6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.T1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            u9 u9Var3 = this.f45351e2;
            if (u9Var3.f18406g != null) {
                textView2.setText(dd.L0(2131750372, null));
            } else if (u9Var3.g(ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime())) {
                textView2.setText(dd.L0(2131750137, null));
            } else {
                textView2.setText(dd.L0(2131750138, null));
            }
            textView2.setBackground(t6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), i14, org.telegram.messenger.i0.L(12.0f), i14);
            TextView l10 = org.telegram.ui.Cells.f1.l(this.S1, textView2, b6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            l10.setTypeface(org.telegram.messenger.i0.o());
            l10.setTextSize(1, 21.0f);
            l10.setText(str2);
            l10.setGravity(17);
            l10.setTextColor(-1);
            TextView l11 = org.telegram.ui.Cells.f1.l(this.S1, l10, b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            l11.setTextSize(1, 13.0f);
            l11.setText(org.telegram.messenger.i0.H2(dd.L0(2131750359, null), i14, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
            l11.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            l11.setGravity(17);
            l11.setTextColor(-1342177281);
            l11.setOnClickListener(new View.OnClickListener(this) {
                public final w f45294b;

                {
                    this.f45294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new kg.i1(40, this.f45294b.getContext(), (p6) null).show();
                            return;
                        default:
                            this.f45294b.f1();
                            return;
                    }
                }
            });
            e6.b(l11, 0.02f, 1.5f);
            this.S1.addView(l11, b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            c1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f45349c2.setVisibility(8);
            p80 p80Var3 = new p80(context, p6Var);
            p80Var3.setGravity(17);
            p80Var3.setTextSize(1, 16.0f);
            int i20 = t6.J6;
            a7.V(p80Var3, i20, p6Var);
            a7.H(p80Var3, i20, p6Var);
            p80Var3.setOnClickListener(new ag.i(this, context, p6Var, 25));
            e6.b(p80Var3, 0.02f, 1.5f);
            this.R1.addView(p80Var3, b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(sf.d.c(TL_stars.starGiftAttributeModel.class, this.f45351e2.h));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i21 = i14; i21 < 3; i21++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new o5(stargiftattributemodel.document, p80Var3.getPaint().getFontMetricsInt()), i21, i21 + 1, 33);
                }
            }
            String E3 = dd.E(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            p80Var3.setText(org.telegram.messenger.i0.H2(dd.V(null, null, 2131750327, objArr5), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
        }
        this.R1.addView(this.f45350d2, b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i14);
    }

    public static void d1(org.telegram.ui.ActionBar.l lVar, Context context, p6 p6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new v(context, starGift, p6Var));
        org.telegram.ui.ActionBar.t0 a2 = lVar.p().a(0, 2131231245);
        a2.setContentDescription(dd.L0(2131754839, "AccDescrMoreOptions"));
        a2.e(4, 2131232184, dd.L0(2131748346, null));
        a2.e(3, 2131231804, dd.L0(2131751762, null));
        a2.e(2, 2131232362, dd.L0(2131745476, null));
    }

    public static void e1(Context context, p6 p6Var, int i10, long j10, long j11, n0 n0Var) {
        y9 c10 = y9.c(i10);
        org.telegram.ui.Components.s2 s2Var = new org.telegram.ui.Components.s2(context, p6Var, i10, j10, n0Var);
        u9 b10 = c10.b(j11);
        if (b10 != null) {
            s2Var.a(b10, null);
            return;
        }
        s9 s9Var = new s9(c10, s2Var, j11, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j11;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(1), new org.telegram.messenger.a4(1, c10, s9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, p6 p6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, null, false);
            mg.l1 l1Var = k10.f21622x0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i10 = t6.Ci;
            paint.setColor(t6.w0(i10, p6Var));
            w6 N = a7.N(i10);
            imageView.setBackground(shapeDrawable);
            a7.k(imageView, shapeDrawable, N, null, p6Var);
            linearLayout.addView(imageView, b6.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(17);
            textView.setText(dd.L0(2131749827, null));
            textView.setTextSize(1, 20.0f);
            int i11 = t6.G6;
            a7.V(textView, i11, p6Var);
            linearLayout.addView(textView, b6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(dd.L0(2131749826, null));
            textView2.setTextSize(1, 14.0f);
            a7.V(textView2, i11, p6Var);
            linearLayout.addView(textView2, b6.t(-1, -2, 17, 20, 0, 20, 16));
            rt0 rt0Var = new rt0(context, p6Var);
            int i12 = starGift.gifts_per_round;
            rt0Var.f41149a.l(dd.G(i12, "GiftAuctionInfo1Header", Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            rt0Var.f41150b.setText(dd.G(i13, "GiftAuctionInfo1Text", Integer.valueOf(i13)));
            rt0Var.d.setVisibility(8);
            ImageView imageView2 = rt0Var.f41151c;
            imageView2.setImageResource(2131231902);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            a7.t(imageView2, i11, p6Var, mode);
            linearLayout.addView(rt0Var, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rt0 rt0Var2 = new rt0(context, p6Var);
            rt0Var2.f41149a.l(dd.L0(2131749833, null), false);
            rt0Var2.f41150b.setText(dd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            rt0Var2.d.setVisibility(8);
            ImageView imageView3 = rt0Var2.f41151c;
            imageView3.setImageResource(2131231772);
            a7.t(imageView3, i11, p6Var, mode);
            linearLayout.addView(rt0Var2, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rt0 rt0Var3 = new rt0(context, p6Var);
            rt0Var3.f41149a.l(dd.L0(2131749829, null), false);
            rt0Var3.f41150b.setText(dd.L0(2131749828, null));
            rt0Var3.d.setVisibility(8);
            ImageView imageView4 = rt0Var3.f41151c;
            imageView4.setImageResource(2131231765);
            a7.t(imageView4, i11, p6Var, mode);
            linearLayout.addView(rt0Var3, b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            vh.d dVar = new vh.d(context, p6Var, true);
            dVar.setOnClickListener(new og.u(1, l1Var));
            dVar.i(rh.e4.g2(dd.L0(2131743913, null)), false, true);
            linearLayout.addView(dVar, b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            k10.N = linearLayout;
            k10.show();
        }
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new ag.a(this, 23), this.I0);
        this.f45353g2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(u9 u9Var) {
        this.f45351e2 = u9Var;
        h1(true);
    }

    @Override
    public final void dismiss() {
        y9.c(this.f21584a).n(this.Q1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        u9 u9Var = this.f45351e2;
        if (u9Var != null && (tL_starGiftAuctionStateFinished = u9Var.f18406g) != null && u9Var.d.title != null) {
            this.Z1.a(this.W1, dd.a0(null, null, 2131750298, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f45351e2.d.title));
        }
    }

    public final void h1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ph.w.h1(boolean):void");
    }
}
