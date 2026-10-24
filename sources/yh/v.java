package yh;

import ai.a7;
import ai.h6;
import ai.l7;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.za;
import org.telegram.ui.bw0;
import w7.b6;
import w7.z5;
public final class v extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final xc[] f51000p0 = new xc[1];
    public static final m01[] f51001q0 = new m01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f51002a0;
    public final TextView f51003b0;
    public final xc f51004c0;
    public final xc f51005d0;
    public final xc f51006e0;
    public final xc f51007f0;
    public final m01 f51008g0;
    public final ai.s0 f51009h0;
    public final TableRow f51010i0;
    public final ei.d f51011j0;
    public final w90 f51012k0;
    public final w90 f51013l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f51014n0;
    public a71 f51015o0;

    public v(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, g6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j11 = starGift.f20568id;
        this.Y = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, g6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51002a0 = frameLayout;
        frameLayout.addView(kVar, z5.n(-1, -2));
        linearLayout.addView(frameLayout);
        g1 g1Var = new g1(context, this.currentAccount, g6Var);
        g1Var.f50707c0 = true;
        g1Var.h(starGift, false, false, false, false, false);
        g1Var.setImageSize(AndroidUtilities.dp(100.0f));
        g1Var.setImageLayer(7);
        g1Var.J.setVisibility(8);
        frameLayout.addView(g1Var, z5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = k6.G6;
        r6.W(textView, i12, g6Var);
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        w90 w90Var = new w90(context, null);
        this.f51012k0 = w90Var;
        w90Var.setGravity(17);
        w90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, g6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        w90Var.setTextSize(1, 14.0f);
        r6.W(w90Var, i12, g6Var);
        int i13 = k6.J6;
        r6.I(w90Var, i13, g6Var);
        linearLayout.addView(w90Var, z5.t(-1, -2, 17, 20, 0, 20, 4));
        n01 n01Var = new n01(context, g6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        xc[] xcVarArr = f51000p0;
        n01Var.c(string, "", null, xcVarArr);
        this.f51004c0 = xcVarArr[0];
        n01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, xcVarArr);
        this.f51005d0 = xcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(n01Var, z5.e(-1, -2, 119));
        this.f51009h0 = new ai.s0(this, new ei.x3[1], frameLayout2, 7);
        TableRow c10 = n01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, xcVarArr);
        this.f51010i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f50938b;

            {
                this.f50938b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new sg.y0(this.f50938b.getContext(), 40, (g6) null).show();
                        return;
                    default:
                        this.f50938b.T();
                        return;
                }
            }
        });
        this.f51006e0 = xcVarArr[0];
        m01[] m01VarArr = f51001q0;
        n01Var.c("", "", m01VarArr, xcVarArr);
        this.f51007f0 = xcVarArr[0];
        this.f51008g0 = m01VarArr[0];
        linearLayout.addView(frameLayout2, z5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        w90 w90Var2 = new w90(context, g6Var);
        this.f51013l0 = w90Var2;
        w90Var2.setGravity(17);
        w90Var2.setTextSize(1, 16.0f);
        r6.W(w90Var2, i13, g6Var);
        r6.I(w90Var2, i13, g6Var);
        w90Var2.setOnClickListener(new s41(this, new boolean[1], g6Var, 7));
        b6.b(w90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new y5(starGift.sticker, w90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f51014n0 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f51014n0 = "";
        }
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f51011j0 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new n(this, j10, context, g6Var, runnable, 0));
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        lm0 lm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i17, i14, i17, AndroidUtilities.dp(64.0f));
        this.f51015o0.N(i14);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                n01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                String string2 = LocaleController.getString(R.string.Gift2AuctionTableCurrentRound);
                int i18 = R.string.OfS;
                String formatNumber = LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ',');
                String formatNumber2 = LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = formatNumber;
                objArr[1] = formatNumber2;
                n01Var.c(string2, LocaleController.formatString(i18, objArr), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i19 = i14; i19 < size; i19++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i19);
                if (i19 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i19 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i20 = starGiftAuctionRound.num;
                if (i20 == i11) {
                    int i21 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr2 = new Object[i10];
                    objArr2[i14] = Integer.valueOf(i20);
                    formatString = LocaleController.formatString(i21, objArr2);
                } else {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i20);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i10] = valueOf2;
                    formatString = LocaleController.formatString(i22, objArr3);
                }
                if (starGiftAuctionRound.num == i11) {
                    int i23 = R.string.Gift2AuctionTableCurrentRoundsOneDuration;
                    String formatTTLString = LocaleController.formatTTLString(starGiftAuctionRound.duration);
                    String formatTTLString2 = LocaleController.formatTTLString(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = formatTTLString;
                    objArr4[1] = formatTTLString2;
                    objArr4[2] = valueOf3;
                    formatPluralString = LocaleController.formatString(i23, objArr4);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[i14]);
                }
                n01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            t tVar = new t(this, context, g6Var, new o(this, i14), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28));
            tVar.d(new h6(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.P);
            this.f51002a0.addView(tVar, i14, z5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f51003b0 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.m0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(k6.a0(i14, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), i14, AndroidUtilities.dp(12.0f), i14);
            TextView j12 = org.telegram.ui.Cells.b1.j(this.f51002a0, textView2, z5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            j12.setTypeface(AndroidUtilities.bold());
            j12.setTextSize(1, 21.0f);
            j12.setText(str2);
            j12.setGravity(17);
            j12.setTextColor(-1);
            TextView j13 = org.telegram.ui.Cells.b1.j(this.f51002a0, j12, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            j13.setTextSize(1, 13.0f);
            j13.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), i14, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            j13.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            j13.setGravity(17);
            j13.setTextColor(-1342177281);
            j13.setOnClickListener(new View.OnClickListener(this) {
                public final v f50938b;

                {
                    this.f50938b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new sg.y0(this.f50938b.getContext(), 40, (g6) null).show();
                            return;
                        default:
                            this.f50938b.T();
                            return;
                    }
                }
            });
            b6.b(j13, 0.02f, 1.5f);
            this.f51002a0.addView(j13, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            g1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f51012k0.setVisibility(8);
            w90 w90Var3 = new w90(context, g6Var);
            w90Var3.setGravity(17);
            w90Var3.setTextSize(1, 16.0f);
            int i24 = k6.J6;
            r6.W(w90Var3, i24, g6Var);
            r6.I(w90Var3, i24, g6Var);
            w90Var3.setOnClickListener(new s41(this, context, g6Var, 6));
            b6.b(w90Var3, 0.02f, 1.5f);
            this.Z.addView(w90Var3, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ai.a aVar = new ai.a(ag.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j14 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = i14; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new y5(stargiftattributemodel.document, w90Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            int i26 = R.string.Gift2AuctionVariants;
            String formatNumber3 = LocaleController.formatNumber(j14, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = formatNumber3;
            w90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(i26, objArr5), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f51013l0, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(i14);
    }

    public static void P(v vVar, boolean[] zArr, g6 g6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new ai.a4(vVar, zArr, g6Var, 13));
    }

    public static void Q(v vVar, long j10, Context context, g6 g6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, g6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new x4(context, vVar.currentAccount, vVar.m0.gift, null, j10, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static void R(v vVar, Context context, g6 g6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new ai.a2(context, g6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, g6 g6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, g6Var));
        org.telegram.ui.ActionBar.u0 a2 = kVar.m().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.h3 j10 = tl.j(1, context, null, false);
            runnable = j10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i10 = k6.Oh;
            paint.setColor(k6.w0(i10, g6Var));
            n6 O = r6.O(i10);
            imageView.setBackground(shapeDrawable);
            r6.k(imageView, shapeDrawable, O, null, g6Var);
            linearLayout.addView(imageView, z5.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            tl.n(R.string.GiftAuctionInfoHeader, textView, 1, 20.0f);
            int i11 = k6.G6;
            r6.W(textView, i11, g6Var);
            linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            tl.n(R.string.GiftAuctionInfoText, textView2, 1, 14.0f);
            r6.W(textView2, i11, g6Var);
            linearLayout.addView(textView2, z5.t(-1, -2, 17, 20, 0, 20, 16));
            bw0 bw0Var = new bw0(context, g6Var);
            int i12 = starGift.gifts_per_round;
            bw0Var.f36150a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            bw0Var.f36151b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            bw0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = bw0Var.f36152c;
            imageView2.setImageResource(i14);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            r6.t(imageView2, i11, g6Var, mode);
            linearLayout.addView(bw0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            bw0 bw0Var2 = new bw0(context, g6Var);
            bw0Var2.f36150a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            bw0Var2.f36151b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            bw0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = bw0Var2.f36152c;
            imageView3.setImageResource(i15);
            r6.t(imageView3, i11, g6Var, mode);
            linearLayout.addView(bw0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            bw0 bw0Var3 = new bw0(context, g6Var);
            bw0Var3.f36150a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            bw0Var3.f36151b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            bw0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = bw0Var3.f36152c;
            imageView4.setImageResource(i16);
            r6.t(imageView4, i11, g6Var, mode);
            linearLayout.addView(bw0Var3, z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ei.d dVar = new ei.d(context, g6Var, true);
            dVar.setOnClickListener(new a7(6, runnable));
            dVar.i(l7.H2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j10.customView = linearLayout;
            j10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f51009h0.run(this.f51006e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: yh.v.V(boolean):void");
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        V(true);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 25), this.resourcesProvider);
        this.f51015o0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return "";
    }
}
