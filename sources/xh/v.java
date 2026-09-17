package xh;

import ai.d5;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.za;
import org.telegram.ui.ww0;
import w7.x5;
import w7.z5;
public final class v extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final xc[] f46184p0 = new xc[1];
    public static final pz0[] f46185q0 = new pz0[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f46186a0;
    public final TextView f46187b0;
    public final xc f46188c0;
    public final xc f46189d0;
    public final xc f46190e0;
    public final xc f46191f0;
    public final pz0 f46192g0;
    public final org.telegram.tgnet.e f46193h0;
    public final TableRow f46194i0;
    public final ci.d f46195j0;
    public final c90 f46196k0;
    public final c90 f46197l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f46198n0;
    public x51 f46199o0;

    public v(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, f6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.f18347id;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46186a0 = frameLayout;
        frameLayout.addView(kVar, x5.n(-1, -2));
        linearLayout.addView(frameLayout);
        i1 i1Var = new i1(context, this.currentAccount, f6Var);
        i1Var.f45929a0 = true;
        i1Var.g(starGift, false, false, false, false, false);
        i1Var.setImageSize(AndroidUtilities.dp(100.0f));
        i1Var.setImageLayer(7);
        i1Var.J.setVisibility(8);
        frameLayout.addView(i1Var, x5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        linearLayout.addView(textView, x5.t(-1, -2, 17, 20, 0, 20, 6));
        c90 c90Var = new c90(context, null);
        this.f46196k0 = c90Var;
        c90Var.setGravity(17);
        c90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, f6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTextColor(j6.v0(i12, f6Var));
        int i13 = j6.J6;
        c90Var.setLinkTextColor(j6.v0(i13, f6Var));
        linearLayout.addView(c90Var, x5.t(-1, -2, 17, 20, 0, 20, 4));
        qz0 qz0Var = new qz0(context, f6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        xc[] xcVarArr = f46184p0;
        qz0Var.c(string, "", null, xcVarArr);
        this.f46188c0 = xcVarArr[0];
        qz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, xcVarArr);
        this.f46189d0 = xcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(qz0Var, x5.e(-1, -2, 119));
        this.f46193h0 = new org.telegram.tgnet.e(this, new ci.f4[1], frameLayout2, 5);
        TableRow c10 = qz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, xcVarArr);
        this.f46194i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f46094b;

            {
                this.f46094b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new rg.x0(this.f46094b.getContext(), 40, (f6) null).show();
                        return;
                    default:
                        this.f46094b.T();
                        return;
                }
            }
        });
        this.f46190e0 = xcVarArr[0];
        pz0[] pz0VarArr = f46185q0;
        qz0Var.c("", "", pz0VarArr, xcVarArr);
        this.f46191f0 = xcVarArr[0];
        this.f46192g0 = pz0VarArr[0];
        linearLayout.addView(frameLayout2, x5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        c90 c90Var2 = new c90(context, f6Var);
        this.f46197l0 = c90Var2;
        c90Var2.setGravity(17);
        c90Var2.setTextSize(1, 16.0f);
        c90Var2.setTextColor(j6.v0(i13, f6Var));
        c90Var2.setLinkTextColor(j6.v0(i13, f6Var));
        c90Var2.setOnClickListener(new xg.e(this, new boolean[1], f6Var, 4));
        z5.b(c90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starGift.sticker, c90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f46198n0 = spannableStringBuilder;
        } else {
            this.f46198n0 = "";
        }
        ci.d dVar = new ci.d(context, f6Var, true);
        this.f46195j0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new n(this, j3, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        ml0 ml0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f46199o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                qz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                qz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
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
                qz0Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            t tVar = new t(this, context, f6Var, new o(this, 0), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25));
            tVar.d(new f4.d(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.O);
            this.f46186a0.addView(tVar, 0, x5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f46187b0 = textView2;
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
            TextView f7 = p6.f(this.f46186a0, textView2, x5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextSize(1, 21.0f);
            f7.setText(str2);
            f7.setGravity(17);
            f7.setTextColor(-1);
            TextView f10 = p6.f(this.f46186a0, f7, x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            f10.setTextSize(1, 13.0f);
            f10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            f10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            f10.setGravity(17);
            f10.setTextColor(-1342177281);
            f10.setOnClickListener(new View.OnClickListener(this) {
                public final v f46094b;

                {
                    this.f46094b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new rg.x0(this.f46094b.getContext(), 40, (f6) null).show();
                            return;
                        default:
                            this.f46094b.T();
                            return;
                    }
                }
            });
            z5.b(f10, 0.02f, 1.5f);
            this.f46186a0.addView(f10, x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f46196k0.setVisibility(8);
            c90 c90Var3 = new c90(context, f6Var);
            c90Var3.setGravity(17);
            c90Var3.setTextSize(1, 16.0f);
            int i21 = j6.J6;
            c90Var3.setTextColor(j6.v0(i21, f6Var));
            c90Var3.setLinkTextColor(j6.v0(i21, f6Var));
            c90Var3.setOnClickListener(new xg.e(this, context, f6Var, 3));
            z5.b(c90Var3, 0.02f, 1.5f);
            this.Z.addView(c90Var3, x5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = 0; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(stargiftattributemodel.document, c90Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            c90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f46197l0, x5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static void P(v vVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new d5(vVar, zArr, f6Var, 9));
    }

    public static void Q(v vVar, long j3, Context context, f6 f6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, f6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new y4(context, vVar.currentAccount, vVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static void R(v vVar, Context context, f6 f6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new yh.s0(context, f6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, f6Var));
        org.telegram.ui.ActionBar.w0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.g3 i10 = wl.i(1, context, null, false);
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
            linearLayout.addView(imageView, x5.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i11 = j6.G6;
            textView.setTextColor(j6.v0(i11, f6Var));
            linearLayout.addView(textView, x5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(i11, f6Var));
            linearLayout.addView(textView2, x5.t(-1, -2, 17, 20, 0, 20, 16));
            ww0 ww0Var = new ww0(context, f6Var);
            int i12 = starGift.gifts_per_round;
            ww0Var.f39180a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            ww0Var.f39181b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            ww0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = ww0Var.f39182c;
            imageView2.setImageResource(i14);
            imageView2.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var2 = new ww0(context, f6Var);
            ww0Var2.f39180a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            ww0Var2.f39181b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            ww0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = ww0Var2.f39182c;
            imageView3.setImageResource(i15);
            imageView3.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var2, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var3 = new ww0(context, f6Var);
            ww0Var3.f39180a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            ww0Var3.f39181b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            ww0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = ww0Var3.f39182c;
            imageView4.setImageResource(i16);
            imageView4.setColorFilter(j6.v0(i11, f6Var));
            linearLayout.addView(ww0Var3, x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ci.d dVar = new ci.d(context, f6Var, true);
            dVar.setOnClickListener(new bi.p(5, runnable));
            dVar.g(yh.a4.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f46193h0.run(this.f46190e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: xh.v.V(boolean):void");
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
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.f46199o0 = x51Var;
        x51Var.f29851r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
