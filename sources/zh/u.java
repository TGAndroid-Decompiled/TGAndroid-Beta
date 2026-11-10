package zh;

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
import bi.g6;
import bi.k7;
import bi.z6;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ls0;
public final class u extends ma implements v9 {
    public static final ic[] f60558k2 = new ic[1];
    public static final sx0[] f60559l2 = new sx0[1];
    public final TL_stars.StarGift S1;
    public final long T1;
    public final LinearLayout U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final ic X1;
    public final ic Y1;
    public final ic Z1;
    public final ic f60560a2;
    public final sx0 f60561b2;
    public final bi.t0 f60562c2;
    public final TableRow d2;
    public final fi.d f60563e2;
    public final w70 f60564f2;
    public final w70 f60565g2;
    public s9 f60566h2;
    public final CharSequence f60567i2;
    public m41 f60568j2;

    public u(Context context, h6 h6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, h6Var);
        boolean z9;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.S1 = starGift;
        long j10 = starGift.f27189id;
        this.T1 = j10;
        this.E1 = org.telegram.messenger.g0.L(6.0f);
        this.f35908u1 = 0.2f;
        N();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, h6Var);
        lVar.G(-1, false);
        lVar.setOccupyStatusBar(false);
        d1(lVar, context, h6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.addView(lVar, ha.o(-1, -2));
        linearLayout.addView(frameLayout);
        y0 y0Var = new y0(this.f28669a, context, h6Var);
        y0Var.f60618c0 = true;
        y0Var.h(starGift, false, false, false, false, false);
        y0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        y0Var.setImageLayer(7);
        y0Var.J.setVisibility(8);
        frameLayout.addView(y0Var, ha.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = m6.G6;
        t6.U(textView, i11, h6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        w70 w70Var = new w70(context, null);
        this.f60564f2 = w70Var;
        w70Var.setGravity(17);
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(id.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(id.M0(2131750357, null), new o(context, h6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        w70Var.setTextSize(1, 14.0f);
        t6.U(w70Var, i11, h6Var);
        int i12 = m6.J6;
        t6.G(w70Var, i12, h6Var);
        linearLayout.addView(w70Var, ha.t(-1, -2, 17, 20, 0, 20, 4));
        tx0 tx0Var = new tx0(context, h6Var);
        String M0 = id.M0(2131750323, null);
        ic[] icVarArr = f60558k2;
        tx0Var.c(M0, "", null, icVarArr);
        this.X1 = icVarArr[0];
        tx0Var.c(id.M0(2131750324, null), "", null, icVarArr);
        this.Y1 = icVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(tx0Var, ha.e(-1, -2, 119));
        this.f60562c2 = new bi.t0(this, new fi.m3[1], frameLayout2, 7);
        TableRow c10 = tx0Var.c(id.M0(2131749588, null), "", null, icVarArr);
        this.d2 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final u f60516b;

            {
                this.f60516b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.w0(40, this.f60516b.getContext(), (h6) null).show();
                        return;
                    default:
                        this.f60516b.f1();
                        return;
                }
            }
        });
        this.Z1 = icVarArr[0];
        sx0[] sx0VarArr = f60559l2;
        tx0Var.c("", "", sx0VarArr, icVarArr);
        this.f60560a2 = icVarArr[0];
        this.f60561b2 = sx0VarArr[0];
        linearLayout.addView(frameLayout2, ha.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        w70 w70Var2 = new w70(context, h6Var);
        this.f60565g2 = w70Var2;
        w70Var2.setGravity(17);
        w70Var2.setTextSize(1, 16.0f);
        t6.U(w70Var2, i12, h6Var);
        t6.G(w70Var2, i12, h6Var);
        w70Var2.setOnClickListener(new td0(this, new boolean[1], h6Var, 7));
        ka.b(w70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z9 = false;
            spannableStringBuilder.setSpan(new q5(starGift.sticker, w70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f60567i2 = spannableStringBuilder;
        } else {
            z9 = false;
            this.f60567i2 = "";
        }
        fi.d dVar = new fi.d(context, h6Var, true);
        this.f60563e2 = dVar;
        dVar.f();
        final int i13 = z9;
        dVar.setOnClickListener(new m(this, j3, context, h6Var, runnable, 0));
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28705t0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28672b.addView(dVar, d);
        pj0 pj0Var = this.n1;
        int i16 = this.f28705t0;
        pj0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f60568j2.O(i13);
        s9 l10 = w9.c(this.f28669a).l(j10, this);
        this.f60566h2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f25442f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f28669a).getCurrentTime()) {
                tx0Var.c(id.M0(2131750331, null), id.E(this.f60566h2.f25442f.total_rounds, ','), null, null);
            } else {
                String M02 = id.M0(2131750332, null);
                String E = id.E(this.f60566h2.f25442f.current_round, ',');
                String E2 = id.E(this.f60566h2.f25442f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                tx0Var.c(M02, id.a0(null, null, 2131747828, objArr), null, null);
            }
        }
        s9 s9Var = this.f60566h2;
        if (s9Var != null && (tL_starGiftAuctionState = s9Var.f25442f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f60566h2.f25442f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f60566h2.f25442f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f60566h2.f25442f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = id.a0(null, null, 2131750330, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = id.a0(null, null, 2131750328, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = id.c0(starGiftAuctionRound.duration);
                    String c03 = id.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = id.a0(null, null, 2131750329, objArr4);
                } else {
                    G = id.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                tx0Var.c(a02, G, null, null);
            }
        }
        s9 s9Var2 = this.f60566h2;
        if (s9Var2 != null && s9Var2.h != null) {
            s sVar = new s(this, context, h6Var, new n(this, i13), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24));
            sVar.d(new g6(1, 1));
            sVar.setPreviewingAttributes(this.f60566h2.h);
            sVar.removeView(sVar.P);
            this.V1.addView(sVar, i13, ha.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.W1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            s9 s9Var3 = this.f60566h2;
            if (s9Var3.f25443g != null) {
                textView2.setText(id.M0(2131750363, null));
            } else if (s9Var3.g(ConnectionsManager.getInstance(p10.f24474s0).getCurrentTime())) {
                textView2.setText(id.M0(2131750128, null));
            } else {
                textView2.setText(id.M0(2131750129, null));
            }
            textView2.setBackground(m6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView i19 = org.telegram.ui.Cells.f1.i(this.V1, textView2, ha.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            i19.setTypeface(org.telegram.messenger.g0.o());
            i19.setTextSize(1, 21.0f);
            i19.setText(str2);
            i19.setGravity(17);
            i19.setTextColor(-1);
            TextView i20 = org.telegram.ui.Cells.f1.i(this.V1, i19, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            i20.setTextSize(1, 13.0f);
            i20.setText(org.telegram.messenger.g0.I2(id.M0(2131750350, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            i20.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            i20.setGravity(17);
            i20.setTextColor(-1342177281);
            i20.setOnClickListener(new View.OnClickListener(this) {
                public final u f60516b;

                {
                    this.f60516b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.w0(40, this.f60516b.getContext(), (h6) null).show();
                            return;
                        default:
                            this.f60516b.f1();
                            return;
                    }
                }
            });
            ka.b(i20, 0.02f, 1.5f);
            this.V1.addView(i20, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            y0Var.setVisibility(8);
            textView.setVisibility(8);
            this.f60564f2.setVisibility(8);
            w70 w70Var3 = new w70(context, h6Var);
            w70Var3.setGravity(17);
            w70Var3.setTextSize(1, 16.0f);
            int i21 = m6.J6;
            t6.U(w70Var3, i21, h6Var);
            t6.G(w70Var3, i21, h6Var);
            w70Var3.setOnClickListener(new td0(this, context, h6Var, 6));
            ka.b(w70Var3, 0.02f, 1.5f);
            this.U1.addView(w70Var3, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            bi.a aVar = new bi.a(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f60566h2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = i13; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new q5(stargiftattributemodel.document, w70Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            String E3 = id.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            w70Var3.setText(org.telegram.messenger.g0.I2(id.V(null, null, 2131750318, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.U1.addView(this.f60565g2, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i13);
    }

    public static void d1(org.telegram.ui.ActionBar.l lVar, Context context, h6 h6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new t(context, starGift, h6Var));
        org.telegram.ui.ActionBar.r0 a10 = lVar.s().a(0, 2131231244);
        a10.setContentDescription(id.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, 2131232185, id.M0(2131748331, null));
        a10.e(3, 2131231805, id.M0(2131751762, null));
        a10.e(2, 2131232363, id.M0(2131745458, null));
    }

    public static void e1(Context context, h6 h6Var, int i7, long j3, long j10, l0 l0Var) {
        w9 c10 = w9.c(i7);
        ai.v0 v0Var = new ai.v0(context, h6Var, i7, j3, l0Var);
        s9 b10 = c10.b(j10);
        if (b10 != null) {
            v0Var.a(b10, null);
            return;
        }
        q9 q9Var = new q9(c10, v0Var, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.x3(2, c10, q9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, h6 h6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.w2 l10 = k5.l(1, context, null, false);
            org.telegram.ui.ActionBar.g2 g2Var = l10.f28711x0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = m6.Ci;
            paint.setColor(m6.w0(i7, h6Var));
            p6 M = t6.M(i7);
            imageView.setBackground(shapeDrawable);
            t6.j(imageView, shapeDrawable, M, null, h6Var);
            linearLayout.addView(imageView, ha.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(id.M0(2131749818, null));
            textView.setTextSize(1, 20.0f);
            int i10 = m6.G6;
            t6.U(textView, i10, h6Var);
            linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(id.M0(2131749817, null));
            textView2.setTextSize(1, 14.0f);
            t6.U(textView2, i10, h6Var);
            linearLayout.addView(textView2, ha.t(-1, -2, 17, 20, 0, 20, 16));
            ls0 ls0Var = new ls0(context, h6Var);
            int i11 = starGift.gifts_per_round;
            ls0Var.f47682a.l(id.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            ls0Var.f47683b.setText(id.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            ls0Var.d.setVisibility(8);
            ImageView imageView2 = ls0Var.f47684c;
            imageView2.setImageResource(2131231903);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            t6.s(imageView2, i10, h6Var, mode);
            linearLayout.addView(ls0Var, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ls0 ls0Var2 = new ls0(context, h6Var);
            ls0Var2.f47682a.l(id.M0(2131749824, null), false);
            ls0Var2.f47683b.setText(id.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            ls0Var2.d.setVisibility(8);
            ImageView imageView3 = ls0Var2.f47684c;
            imageView3.setImageResource(2131231773);
            t6.s(imageView3, i10, h6Var, mode);
            linearLayout.addView(ls0Var2, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ls0 ls0Var3 = new ls0(context, h6Var);
            ls0Var3.f47682a.l(id.M0(2131749820, null), false);
            ls0Var3.f47683b.setText(id.M0(2131749819, null));
            ls0Var3.d.setVisibility(8);
            ImageView imageView4 = ls0Var3.f47684c;
            imageView4.setImageResource(2131231766);
            t6.s(imageView4, i10, h6Var, mode);
            linearLayout.addView(ls0Var3, ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(context, h6Var, true);
            dVar.setOnClickListener(new z6(6, g2Var));
            dVar.i(k7.f2(id.M0(2131743888, null)), false, true);
            linearLayout.addView(dVar, ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            l10.N = linearLayout;
            l10.show();
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new hi.u1(this, 28), this.I0);
        this.f60568j2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(s9 s9Var) {
        this.f60566h2 = s9Var;
        h1(true);
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28669a).n(this.T1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        s9 s9Var = this.f60566h2;
        if (s9Var != null && (tL_starGiftAuctionStateFinished = s9Var.f25443g) != null && s9Var.d.title != null) {
            this.f60562c2.a(this.Z1, id.a0(null, null, 2131750289, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f60566h2.d.title));
        }
    }

    public final void h1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.u.h1(boolean):void");
    }
}
