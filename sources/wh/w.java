package wh;

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
import bi.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.h7;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ww0;
import w7.a6;
import w7.c6;
public final class w extends ab implements GiftAuctionController.OnAuctionUpdateListener {
    public static final yc[] f44396p0 = new yc[1];
    public static final a01[] f44397q0 = new a01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f44398a0;
    public final TextView f44399b0;
    public final yc f44400c0;
    public final yc f44401d0;
    public final yc f44402e0;
    public final yc f44403f0;
    public final a01 f44404g0;
    public final org.telegram.tgnet.g f44405h0;
    public final TableRow f44406i0;
    public final bi.d f44407j0;
    public final m90 f44408k0;
    public final m90 f44409l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f44410n0;
    public j61 f44411o0;

    public w(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, f6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.f17425id;
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
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var);
        lVar.C(-1, false);
        lVar.setOccupyStatusBar(false);
        S(lVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44398a0 = frameLayout;
        frameLayout.addView(lVar, a6.n(-1, -2));
        linearLayout.addView(frameLayout);
        h1 h1Var = new h1(context, this.currentAccount, f6Var);
        h1Var.f44115a0 = true;
        h1Var.g(starGift, false, false, false, false, false);
        h1Var.setImageSize(AndroidUtilities.dp(100.0f));
        h1Var.setImageLayer(7);
        h1Var.J.setVisibility(8);
        frameLayout.addView(h1Var, a6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        linearLayout.addView(textView, a6.t(-1, -2, 17, 20, 0, 20, 6));
        m90 m90Var = new m90(context, null);
        this.f44408k0 = m90Var;
        m90Var.setGravity(17);
        m90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, f6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(j6.v0(i12, f6Var));
        int i13 = j6.J6;
        m90Var.setLinkTextColor(j6.v0(i13, f6Var));
        linearLayout.addView(m90Var, a6.t(-1, -2, 17, 20, 0, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        yc[] ycVarArr = f44396p0;
        b01Var.c(string, "", null, ycVarArr);
        this.f44400c0 = ycVarArr[0];
        b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, ycVarArr);
        this.f44401d0 = ycVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(b01Var, a6.e(-1, -2, 119));
        this.f44405h0 = new org.telegram.tgnet.g(this, new bi.x4[1], frameLayout2, 5);
        TableRow c10 = b01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, ycVarArr);
        this.f44406i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final w f44311b;

            {
                this.f44311b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new qg.a1(this.f44311b.getContext(), 40, (f6) null).show();
                        return;
                    default:
                        this.f44311b.T();
                        return;
                }
            }
        });
        this.f44402e0 = ycVarArr[0];
        a01[] a01VarArr = f44397q0;
        b01Var.c("", "", a01VarArr, ycVarArr);
        this.f44403f0 = ycVarArr[0];
        this.f44404g0 = a01VarArr[0];
        linearLayout.addView(frameLayout2, a6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        m90 m90Var2 = new m90(context, f6Var);
        this.f44409l0 = m90Var2;
        m90Var2.setGravity(17);
        m90Var2.setTextSize(1, 16.0f);
        m90Var2.setTextColor(j6.v0(i13, f6Var));
        m90Var2.setLinkTextColor(j6.v0(i13, f6Var));
        m90Var2.setOnClickListener(new r(this, new boolean[1], f6Var, 0));
        c6.b(m90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new y5(starGift.sticker, m90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f44410n0 = spannableStringBuilder;
        } else {
            this.f44410n0 = "";
        }
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f44407j0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new n(this, j3, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        vl0 vl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f44411o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
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
                b01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            u uVar = new u(this, context, f6Var, new o(this, 0), new d5(24), new d5(24), new d5(24), new d5(24), new d5(24), new d5(24));
            uVar.d(new f4.d(1, 1));
            uVar.setPreviewingAttributes(this.m0.previewAttributes);
            uVar.removeView(uVar.O);
            this.f44398a0.addView(uVar, 0, a6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f44399b0 = textView2;
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
            textView2.setBackground(j6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView f7 = r6.f(this.f44398a0, textView2, a6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextSize(1, 21.0f);
            f7.setText(str2);
            f7.setGravity(17);
            f7.setTextColor(-1);
            TextView f10 = r6.f(this.f44398a0, f7, a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            f10.setTextSize(1, 13.0f);
            f10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            f10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            f10.setGravity(17);
            f10.setTextColor(-1342177281);
            f10.setOnClickListener(new View.OnClickListener(this) {
                public final w f44311b;

                {
                    this.f44311b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new qg.a1(this.f44311b.getContext(), 40, (f6) null).show();
                            return;
                        default:
                            this.f44311b.T();
                            return;
                    }
                }
            });
            c6.b(f10, 0.02f, 1.5f);
            this.f44398a0.addView(f10, a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            h1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f44408k0.setVisibility(8);
            m90 m90Var3 = new m90(context, f6Var);
            m90Var3.setGravity(17);
            m90Var3.setTextSize(1, 16.0f);
            int i21 = j6.J6;
            m90Var3.setTextColor(j6.v0(i21, f6Var));
            m90Var3.setLinkTextColor(j6.v0(i21, f6Var));
            m90Var3.setOnClickListener(new bi.q(this, context, f6Var, 29));
            c6.b(m90Var3, 0.02f, 1.5f);
            this.Z.addView(m90Var3, a6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(yf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = 0; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new y5(stargiftattributemodel.document, m90Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            m90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f44409l0, a6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static void P(w wVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(wVar.currentAccount).getOrRequestAcquiredGifts(wVar.Y, new h7(wVar, zArr, f6Var, 6));
    }

    public static void Q(w wVar, long j3, Context context, f6 f6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = wVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(wVar.currentAccount).getClientUserId()) && (arrayList = (auction = wVar.m0).previewAttributes) != null) {
                new d0(context, f6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new y4(context, wVar.currentAccount, wVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        wVar.dismiss();
    }

    public static void R(w wVar, Context context, f6 f6Var) {
        int i10 = wVar.currentAccount;
        GiftAuctionController.Auction auction = wVar.m0;
        new xh.s0(context, f6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        wVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.l lVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new v(context, starGift, f6Var));
        org.telegram.ui.ActionBar.w0 a2 = lVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, null, false);
            runnable = i10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(j6.v0(j6.Oh, f6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, a6.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i11 = j6.G6;
            textView.setTextColor(j6.v0(i11, f6Var));
            linearLayout.addView(textView, a6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(i11, f6Var));
            linearLayout.addView(textView2, a6.t(-1, -2, 17, 20, 0, 20, 16));
            ww0 ww0Var = new ww0(context, f6Var);
            int i12 = starGift.gifts_per_round;
            ww0Var.f38396a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            ww0Var.f38397b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            ww0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = ww0Var.f38398c;
            imageView2.setImageResource(i14);
            imageView2.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var2 = new ww0(context, f6Var);
            ww0Var2.f38396a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            ww0Var2.f38397b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            ww0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = ww0Var2.f38398c;
            imageView3.setImageResource(i15);
            imageView3.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var2, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var3 = new ww0(context, f6Var);
            ww0Var3.f38396a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            ww0Var3.f38397b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            ww0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = ww0Var3.f38398c;
            imageView4.setImageResource(i16);
            imageView4.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var3, a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            bi.d dVar = new bi.d(context, f6Var, true);
            dVar.setOnClickListener(new ai.v(5, runnable));
            dVar.g(xh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f44405h0.run(this.f44402e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: wh.w.V(boolean):void");
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
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 14), this.resourcesProvider);
        this.f44411o0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
