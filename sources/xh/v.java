package xh;

import ai.c5;
import android.content.Context;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ow0;
import w7.b6;
import w7.z5;
public final class v extends cb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final ad[] f50259p0 = new ad[1];
    public static final j01[] f50260q0 = new j01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f50261a0;
    public final TextView f50262b0;
    public final ad f50263c0;
    public final ad f50264d0;
    public final ad f50265e0;
    public final ad f50266f0;
    public final j01 f50267g0;
    public final org.telegram.tgnet.e f50268h0;
    public final TableRow f50269i0;
    public final ci.d f50270j0;
    public final q90 f50271k0;
    public final q90 f50272l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f50273n0;
    public u61 f50274o0;

    public v(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, d6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.f20269id;
        this.Y = j10;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        Q(kVar, context, d6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50261a0 = frameLayout;
        frameLayout.addView(kVar, z5.n(-1, -2));
        linearLayout.addView(frameLayout);
        i1 i1Var = new i1(context, this.currentAccount, d6Var);
        i1Var.f49994a0 = true;
        i1Var.g(starGift, false, false, false, false, false);
        i1Var.setImageSize(AndroidUtilities.dp(100.0f));
        i1Var.setImageLayer(7);
        i1Var.J.setVisibility(8);
        frameLayout.addView(i1Var, z5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = i6.G6;
        textView.setTextColor(i6.v0(i12, d6Var));
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        q90 q90Var = new q90(context, null);
        this.f50271k0 = q90Var;
        q90Var.setGravity(17);
        q90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, d6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(i6.v0(i12, d6Var));
        int i13 = i6.J6;
        q90Var.setLinkTextColor(i6.v0(i13, d6Var));
        linearLayout.addView(q90Var, z5.t(-1, -2, 17, 20, 0, 20, 4));
        k01 k01Var = new k01(context, d6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        ad[] adVarArr = f50259p0;
        k01Var.c(string, "", null, adVarArr);
        this.f50263c0 = adVarArr[0];
        k01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, adVarArr);
        this.f50264d0 = adVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(k01Var, z5.e(-1, -2, 119));
        this.f50268h0 = new org.telegram.tgnet.e(this, new ci.e4[1], frameLayout2, 5);
        TableRow c10 = k01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, adVarArr);
        this.f50269i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f50184b;

            {
                this.f50184b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new rg.y0(this.f50184b.getContext(), 40, (d6) null).show();
                        return;
                    default:
                        this.f50184b.R();
                        return;
                }
            }
        });
        this.f50265e0 = adVarArr[0];
        j01[] j01VarArr = f50260q0;
        k01Var.c("", "", j01VarArr, adVarArr);
        this.f50266f0 = adVarArr[0];
        this.f50267g0 = j01VarArr[0];
        linearLayout.addView(frameLayout2, z5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        q90 q90Var2 = new q90(context, d6Var);
        this.f50272l0 = q90Var2;
        q90Var2.setGravity(17);
        q90Var2.setTextSize(1, 16.0f);
        q90Var2.setTextColor(i6.v0(i13, d6Var));
        q90Var2.setLinkTextColor(i6.v0(i13, d6Var));
        q90Var2.setOnClickListener(new xg.e(this, new boolean[1], d6Var, 4));
        b6.b(q90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(starGift.sticker, q90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f50273n0 = spannableStringBuilder;
        } else {
            this.f50273n0 = "";
        }
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f50270j0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new n(this, j3, context, d6Var, runnable, 0));
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        zl0 zl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f50274o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                k01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                k01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i17);
                if (i17 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i17 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i11) {
                    int i19 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i18);
                    formatString = LocaleController.formatString(i19, objArr);
                } else {
                    int i20 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i20, objArr2);
                }
                if (starGiftAuctionRound.num == i11) {
                    formatPluralString = LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top));
                } else {
                    formatPluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]);
                }
                k01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            t tVar = new t(this, context, d6Var, new o(this, 0), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25));
            tVar.d(new f4.d(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.O);
            this.f50261a0.addView(tVar, 0, z5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f50262b0 = textView2;
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
            textView2.setBackground(i6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView i21 = org.telegram.ui.Cells.c1.i(this.f50261a0, textView2, z5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            i21.setTypeface(AndroidUtilities.bold());
            i21.setTextSize(1, 21.0f);
            i21.setText(str2);
            i21.setGravity(17);
            i21.setTextColor(-1);
            TextView i22 = org.telegram.ui.Cells.c1.i(this.f50261a0, i21, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            i22.setTextSize(1, 13.0f);
            i22.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            i22.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            i22.setGravity(17);
            i22.setTextColor(-1342177281);
            i22.setOnClickListener(new View.OnClickListener(this) {
                public final v f50184b;

                {
                    this.f50184b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new rg.y0(this.f50184b.getContext(), 40, (d6) null).show();
                            return;
                        default:
                            this.f50184b.R();
                            return;
                    }
                }
            });
            b6.b(i22, 0.02f, 1.5f);
            this.f50261a0.addView(i22, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f50271k0.setVisibility(8);
            q90 q90Var3 = new q90(context, d6Var);
            q90Var3.setGravity(17);
            q90Var3.setTextSize(1, 16.0f);
            int i23 = i6.J6;
            q90Var3.setTextColor(i6.v0(i23, d6Var));
            q90Var3.setLinkTextColor(i6.v0(i23, d6Var));
            q90Var3.setOnClickListener(new xg.e(this, context, d6Var, 3));
            b6.b(q90Var3, 0.02f, 1.5f);
            this.Z.addView(q90Var3, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i24 = 0; i24 < 3; i24++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.z5(stargiftattributemodel.document, q90Var3.getPaint().getFontMetricsInt()), i24, i24 + 1, 33);
                }
            }
            q90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f50272l0, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        T(false);
    }

    public static void N(v vVar, boolean[] zArr, d6 d6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new c5(vVar, zArr, d6Var, 12));
    }

    public static void O(v vVar, long j3, Context context, d6 d6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, d6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new z4(context, vVar.currentAccount, vVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static void P(v vVar, Context context, d6 d6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new yh.s0(context, d6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void Q(org.telegram.ui.ActionBar.k kVar, Context context, d6 d6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, d6Var));
        org.telegram.ui.ActionBar.v0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void S(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.f3 i10 = bi.i(1, context, null, false);
            runnable = i10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(i6.v0(i6.Oh, d6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, z5.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i11 = i6.G6;
            textView.setTextColor(i6.v0(i11, d6Var));
            linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(i6.v0(i11, d6Var));
            linearLayout.addView(textView2, z5.t(-1, -2, 17, 20, 0, 20, 16));
            ow0 ow0Var = new ow0(context, d6Var);
            int i12 = starGift.gifts_per_round;
            ow0Var.f39291a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            ow0Var.f39292b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            ow0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = ow0Var.f39293c;
            imageView2.setImageResource(i14);
            imageView2.setColorFilter(i6.v0(i11, d6Var));
            linearLayout.addView(ow0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ow0 ow0Var2 = new ow0(context, d6Var);
            ow0Var2.f39291a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            ow0Var2.f39292b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            ow0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = ow0Var2.f39293c;
            imageView3.setImageResource(i15);
            imageView3.setColorFilter(i6.v0(i11, d6Var));
            linearLayout.addView(ow0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ow0 ow0Var3 = new ow0(context, d6Var);
            ow0Var3.f39291a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            ow0Var3.f39292b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            ow0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = ow0Var3.f39293c;
            imageView4.setImageResource(i16);
            imageView4.setColorFilter(i6.v0(i11, d6Var));
            linearLayout.addView(ow0Var3, z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ci.d dVar = new ci.d(context, d6Var, true);
            dVar.setOnClickListener(new bi.p(5, runnable));
            dVar.g(yh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    public final void R() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f50268h0.run(this.f50265e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void T(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: xh.v.T(boolean):void");
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        T(true);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.f50274o0 = u61Var;
        u61Var.f31313r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
