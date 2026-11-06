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
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.is0;
public final class v extends na implements v9 {
    public static final jc[] f60452h2 = new jc[1];
    public static final rx0[] f60453i2 = new rx0[1];
    public final TL_stars.StarGift P1;
    public final long Q1;
    public final LinearLayout R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final jc U1;
    public final jc V1;
    public final jc W1;
    public final jc X1;
    public final rx0 Y1;
    public final bi.t0 Z1;
    public final TableRow f60454a2;
    public final fi.d f60455b2;
    public final w70 f60456c2;
    public final w70 d2;
    public s9 f60457e2;
    public final CharSequence f60458f2;
    public k41 f60459g2;

    public v(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, f6Var);
        boolean z9;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.P1 = starGift;
        long j10 = starGift.f27181id;
        this.Q1 = j10;
        this.B1 = org.telegram.messenger.g0.L(6.0f);
        this.f36227r1 = 0.2f;
        N();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.addView(kVar, ha.o(-1, -2));
        linearLayout.addView(frameLayout);
        z0 z0Var = new z0(this.f28612a, context, f6Var);
        z0Var.f60509c0 = true;
        z0Var.h(starGift, false, false, false, false, false);
        z0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        z0Var.setImageLayer(7);
        z0Var.J.setVisibility(8);
        frameLayout.addView(z0Var, ha.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = k6.G6;
        r6.V(textView, i11, f6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        w70 w70Var = new w70(context, null);
        this.f60456c2 = w70Var;
        w70Var.setGravity(17);
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750356, null), new p(context, f6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        w70Var.setTextSize(1, 14.0f);
        r6.V(w70Var, i11, f6Var);
        int i12 = k6.J6;
        r6.H(w70Var, i12, f6Var);
        linearLayout.addView(w70Var, ha.t(-1, -2, 17, 20, 0, 20, 4));
        sx0 sx0Var = new sx0(context, f6Var);
        String M0 = hd.M0(2131750322, null);
        jc[] jcVarArr = f60452h2;
        sx0Var.c(M0, "", null, jcVarArr);
        this.U1 = jcVarArr[0];
        sx0Var.c(hd.M0(2131750323, null), "", null, jcVarArr);
        this.V1 = jcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(sx0Var, ha.e(-1, -2, 119));
        this.Z1 = new bi.t0(this, new fi.m3[1], frameLayout2, 7);
        TableRow c10 = sx0Var.c(hd.M0(2131749587, null), "", null, jcVarArr);
        this.f60454a2 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f60415b;

            {
                this.f60415b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.w0(40, this.f60415b.getContext(), (f6) null).show();
                        return;
                    default:
                        this.f60415b.f1();
                        return;
                }
            }
        });
        this.W1 = jcVarArr[0];
        rx0[] rx0VarArr = f60453i2;
        sx0Var.c("", "", rx0VarArr, jcVarArr);
        this.X1 = jcVarArr[0];
        this.Y1 = rx0VarArr[0];
        linearLayout.addView(frameLayout2, ha.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        w70 w70Var2 = new w70(context, f6Var);
        this.d2 = w70Var2;
        w70Var2.setGravity(17);
        w70Var2.setTextSize(1, 16.0f);
        r6.V(w70Var2, i12, f6Var);
        r6.H(w70Var2, i12, f6Var);
        w70Var2.setOnClickListener(new td0(this, new boolean[1], f6Var, 7));
        ka.b(w70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z9 = false;
            spannableStringBuilder.setSpan(new r5(starGift.sticker, w70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f60458f2 = spannableStringBuilder;
        } else {
            z9 = false;
            this.f60458f2 = "";
        }
        fi.d dVar = new fi.d(context, f6Var, true);
        this.f60455b2 = dVar;
        dVar.f();
        final int i13 = z9;
        dVar.setOnClickListener(new n(this, j3, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28645t0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28615b.addView(dVar, d);
        pj0 pj0Var = this.f36222k1;
        int i16 = this.f28645t0;
        pj0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f60459g2.O(i13);
        s9 l10 = w9.c(this.f28612a).l(j10, this);
        this.f60457e2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f25434f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f28612a).getCurrentTime()) {
                sx0Var.c(hd.M0(2131750330, null), hd.E(this.f60457e2.f25434f.total_rounds, ','), null, null);
            } else {
                String M02 = hd.M0(2131750331, null);
                String E = hd.E(this.f60457e2.f25434f.current_round, ',');
                String E2 = hd.E(this.f60457e2.f25434f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                sx0Var.c(M02, hd.a0(null, null, 2131747827, objArr), null, null);
            }
        }
        s9 s9Var = this.f60457e2;
        if (s9Var != null && (tL_starGiftAuctionState = s9Var.f25434f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f60457e2.f25434f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f60457e2.f25434f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f60457e2.f25434f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = hd.a0(null, null, 2131750329, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = hd.a0(null, null, 2131750327, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = hd.c0(starGiftAuctionRound.duration);
                    String c03 = hd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = hd.a0(null, null, 2131750328, objArr4);
                } else {
                    G = hd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                sx0Var.c(a02, G, null, null);
            }
        }
        s9 s9Var2 = this.f60457e2;
        if (s9Var2 != null && s9Var2.h != null) {
            t tVar = new t(this, context, f6Var, new o(this, i13), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24), new bi.l1(24));
            tVar.d(new g6(1, 1));
            tVar.setPreviewingAttributes(this.f60457e2.h);
            tVar.removeView(tVar.P);
            this.S1.addView(tVar, i13, ha.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.T1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            s9 s9Var3 = this.f60457e2;
            if (s9Var3.f25435g != null) {
                textView2.setText(hd.M0(2131750362, null));
            } else if (s9Var3.g(ConnectionsManager.getInstance(p10.f24459s0).getCurrentTime())) {
                textView2.setText(hd.M0(2131750127, null));
            } else {
                textView2.setText(hd.M0(2131750128, null));
            }
            textView2.setBackground(k6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView i19 = org.telegram.ui.Cells.f1.i(this.S1, textView2, ha.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            i19.setTypeface(org.telegram.messenger.g0.o());
            i19.setTextSize(1, 21.0f);
            i19.setText(str2);
            i19.setGravity(17);
            i19.setTextColor(-1);
            TextView i20 = org.telegram.ui.Cells.f1.i(this.S1, i19, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            i20.setTextSize(1, 13.0f);
            i20.setText(org.telegram.messenger.g0.I2(hd.M0(2131750349, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            i20.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            i20.setGravity(17);
            i20.setTextColor(-1342177281);
            i20.setOnClickListener(new View.OnClickListener(this) {
                public final v f60415b;

                {
                    this.f60415b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.w0(40, this.f60415b.getContext(), (f6) null).show();
                            return;
                        default:
                            this.f60415b.f1();
                            return;
                    }
                }
            });
            ka.b(i20, 0.02f, 1.5f);
            this.S1.addView(i20, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            z0Var.setVisibility(8);
            textView.setVisibility(8);
            this.f60456c2.setVisibility(8);
            w70 w70Var3 = new w70(context, f6Var);
            w70Var3.setGravity(17);
            w70Var3.setTextSize(1, 16.0f);
            int i21 = k6.J6;
            r6.V(w70Var3, i21, f6Var);
            r6.H(w70Var3, i21, f6Var);
            w70Var3.setOnClickListener(new td0(this, context, f6Var, 6));
            ka.b(w70Var3, 0.02f, 1.5f);
            this.R1.addView(w70Var3, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            bi.a aVar = new bi.a(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f60457e2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = i13; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new r5(stargiftattributemodel.document, w70Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            String E3 = hd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            w70Var3.setText(org.telegram.messenger.g0.I2(hd.V(null, null, 2131750317, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.R1.addView(this.d2, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i13);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, f6Var));
        org.telegram.ui.ActionBar.r0 a10 = kVar.q().a(0, 2131231244);
        a10.setContentDescription(hd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, 2131232185, hd.M0(2131748330, null));
        a10.e(3, 2131231805, hd.M0(2131751762, null));
        a10.e(2, 2131232363, hd.M0(2131745459, null));
    }

    public static void e1(Context context, f6 f6Var, int i7, long j3, long j10, l0 l0Var) {
        w9 c10 = w9.c(i7);
        ai.v0 v0Var = new ai.v0(context, f6Var, i7, j3, l0Var);
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

    public static void g1(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context, null, false);
            org.telegram.ui.ActionBar.g2 g2Var = l10.f28651x0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = k6.Ci;
            paint.setColor(k6.w0(i7, f6Var));
            n6 N = r6.N(i7);
            imageView.setBackground(shapeDrawable);
            r6.k(imageView, shapeDrawable, N, null, f6Var);
            linearLayout.addView(imageView, ha.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(hd.M0(2131749817, null));
            textView.setTextSize(1, 20.0f);
            int i10 = k6.G6;
            r6.V(textView, i10, f6Var);
            linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(hd.M0(2131749816, null));
            textView2.setTextSize(1, 14.0f);
            r6.V(textView2, i10, f6Var);
            linearLayout.addView(textView2, ha.t(-1, -2, 17, 20, 0, 20, 16));
            is0 is0Var = new is0(context, f6Var);
            int i11 = starGift.gifts_per_round;
            is0Var.f46735a.l(hd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            is0Var.f46736b.setText(hd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            is0Var.d.setVisibility(8);
            ImageView imageView2 = is0Var.f46737c;
            imageView2.setImageResource(2131231903);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            r6.t(imageView2, i10, f6Var, mode);
            linearLayout.addView(is0Var, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var2 = new is0(context, f6Var);
            is0Var2.f46735a.l(hd.M0(2131749823, null), false);
            is0Var2.f46736b.setText(hd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            is0Var2.d.setVisibility(8);
            ImageView imageView3 = is0Var2.f46737c;
            imageView3.setImageResource(2131231773);
            r6.t(imageView3, i10, f6Var, mode);
            linearLayout.addView(is0Var2, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var3 = new is0(context, f6Var);
            is0Var3.f46735a.l(hd.M0(2131749819, null), false);
            is0Var3.f46736b.setText(hd.M0(2131749818, null));
            is0Var3.d.setVisibility(8);
            ImageView imageView4 = is0Var3.f46737c;
            imageView4.setImageResource(2131231766);
            r6.t(imageView4, i10, f6Var, mode);
            linearLayout.addView(is0Var3, ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(context, f6Var, true);
            dVar.setOnClickListener(new z6(6, g2Var));
            dVar.i(k7.g2(hd.M0(2131743889, null)), false, true);
            linearLayout.addView(dVar, ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            l10.N = linearLayout;
            l10.show();
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        k41 k41Var = new k41(this.f36222k1, getContext(), this.f28612a, 0, true, new hi.u1(this, 28), this.I0);
        this.f60459g2 = k41Var;
        k41Var.f35132r = false;
        return k41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(s9 s9Var) {
        this.f60457e2 = s9Var;
        h1(true);
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28612a).n(this.Q1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        s9 s9Var = this.f60457e2;
        if (s9Var != null && (tL_starGiftAuctionStateFinished = s9Var.f25435g) != null && s9Var.d.title != null) {
            this.Z1.a(this.W1, hd.a0(null, null, 2131750288, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f60457e2.d.title));
        }
    }

    public final void h1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v.h1(boolean):void");
    }
}
