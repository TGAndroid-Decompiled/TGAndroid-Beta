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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.uw0;
import w7.a6;
import w7.y5;
public final class v extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final zc[] f46401p0 = new zc[1];
    public static final a01[] f46402q0 = new a01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f46403a0;
    public final TextView f46404b0;
    public final zc f46405c0;
    public final zc f46406d0;
    public final zc f46407e0;
    public final zc f46408f0;
    public final a01 f46409g0;
    public final org.telegram.tgnet.e f46410h0;
    public final TableRow f46411i0;
    public final ci.d f46412j0;
    public final l90 f46413k0;
    public final l90 f46414l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f46415n0;
    public l61 f46416o0;

    public v(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.f18521id;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46403a0 = frameLayout;
        frameLayout.addView(kVar, y5.n(-1, -2));
        linearLayout.addView(frameLayout);
        j1 j1Var = new j1(context, this.currentAccount, e6Var);
        j1Var.f46177a0 = true;
        j1Var.g(starGift, false, false, false, false, false);
        j1Var.setImageSize(AndroidUtilities.dp(100.0f));
        j1Var.setImageLayer(7);
        j1Var.J.setVisibility(8);
        frameLayout.addView(j1Var, y5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, e6Var));
        linearLayout.addView(textView, y5.t(-1, -2, 17, 20, 0, 20, 6));
        l90 l90Var = new l90(context, null);
        this.f46413k0 = l90Var;
        l90Var.setGravity(17);
        l90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, e6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTextColor(j6.v0(i12, e6Var));
        int i13 = j6.J6;
        l90Var.setLinkTextColor(j6.v0(i13, e6Var));
        linearLayout.addView(l90Var, y5.t(-1, -2, 17, 20, 0, 20, 4));
        b01 b01Var = new b01(context, e6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        zc[] zcVarArr = f46401p0;
        b01Var.c(string, "", null, zcVarArr);
        this.f46405c0 = zcVarArr[0];
        b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, zcVarArr);
        this.f46406d0 = zcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(b01Var, y5.e(-1, -2, 119));
        this.f46410h0 = new org.telegram.tgnet.e(this, new ci.f4[1], frameLayout2, 5);
        TableRow c10 = b01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, zcVarArr);
        this.f46411i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f46325b;

            {
                this.f46325b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new rg.x0(this.f46325b.getContext(), 40, (e6) null).show();
                        return;
                    default:
                        this.f46325b.T();
                        return;
                }
            }
        });
        this.f46407e0 = zcVarArr[0];
        a01[] a01VarArr = f46402q0;
        b01Var.c("", "", a01VarArr, zcVarArr);
        this.f46408f0 = zcVarArr[0];
        this.f46409g0 = a01VarArr[0];
        linearLayout.addView(frameLayout2, y5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        l90 l90Var2 = new l90(context, e6Var);
        this.f46414l0 = l90Var2;
        l90Var2.setGravity(17);
        l90Var2.setTextSize(1, 16.0f);
        l90Var2.setTextColor(j6.v0(i13, e6Var));
        l90Var2.setLinkTextColor(j6.v0(i13, e6Var));
        l90Var2.setOnClickListener(new xg.e(this, new boolean[1], e6Var, 4));
        a6.b(l90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new z5(starGift.sticker, l90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f46415n0 = spannableStringBuilder;
        } else {
            this.f46415n0 = "";
        }
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f46412j0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new n(this, j3, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        wl0 wl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f46416o0.N(false);
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
            t tVar = new t(this, context, e6Var, new o(this, 0), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25));
            tVar.d(new f4.d(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.O);
            this.f46403a0.addView(tVar, 0, y5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f46404b0 = textView2;
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
            TextView g10 = org.telegram.ui.Cells.c1.g(this.f46403a0, textView2, y5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextSize(1, 21.0f);
            g10.setText(str2);
            g10.setGravity(17);
            g10.setTextColor(-1);
            TextView g11 = org.telegram.ui.Cells.c1.g(this.f46403a0, g10, y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            g11.setTextSize(1, 13.0f);
            g11.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            g11.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            g11.setGravity(17);
            g11.setTextColor(-1342177281);
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final v f46325b;

                {
                    this.f46325b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new rg.x0(this.f46325b.getContext(), 40, (e6) null).show();
                            return;
                        default:
                            this.f46325b.T();
                            return;
                    }
                }
            });
            a6.b(g11, 0.02f, 1.5f);
            this.f46403a0.addView(g11, y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            j1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f46413k0.setVisibility(8);
            l90 l90Var3 = new l90(context, e6Var);
            l90Var3.setGravity(17);
            l90Var3.setTextSize(1, 16.0f);
            int i21 = j6.J6;
            l90Var3.setTextColor(j6.v0(i21, e6Var));
            l90Var3.setLinkTextColor(j6.v0(i21, e6Var));
            l90Var3.setOnClickListener(new xg.e(this, context, e6Var, 3));
            a6.b(l90Var3, 0.02f, 1.5f);
            this.Z.addView(l90Var3, y5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = 0; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new z5(stargiftattributemodel.document, l90Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            l90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f46414l0, y5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static void P(v vVar, boolean[] zArr, e6 e6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new d5(vVar, zArr, e6Var, 9));
    }

    public static void Q(v vVar, long j3, Context context, e6 e6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, e6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new z4(context, vVar.currentAccount, vVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static void R(v vVar, Context context, e6 e6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new yh.s0(context, e6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, e6Var));
        org.telegram.ui.ActionBar.v0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.f3 i10 = wh.i(1, context, null, false);
            runnable = i10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(j6.v0(j6.Oh, e6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, y5.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i11 = j6.G6;
            textView.setTextColor(j6.v0(i11, e6Var));
            linearLayout.addView(textView, y5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(i11, e6Var));
            linearLayout.addView(textView2, y5.t(-1, -2, 17, 20, 0, 20, 16));
            uw0 uw0Var = new uw0(context, e6Var);
            int i12 = starGift.gifts_per_round;
            uw0Var.f38113a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            uw0Var.f38114b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            uw0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = uw0Var.f38115c;
            imageView2.setImageResource(i14);
            imageView2.setColorFilter(j6.v0(i11, e6Var));
            linearLayout.addView(uw0Var, y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            uw0 uw0Var2 = new uw0(context, e6Var);
            uw0Var2.f38113a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            uw0Var2.f38114b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            uw0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = uw0Var2.f38115c;
            imageView3.setImageResource(i15);
            imageView3.setColorFilter(j6.v0(i11, e6Var));
            linearLayout.addView(uw0Var2, y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            uw0 uw0Var3 = new uw0(context, e6Var);
            uw0Var3.f38113a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            uw0Var3.f38114b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            uw0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = uw0Var3.f38115c;
            imageView4.setImageResource(i16);
            imageView4.setColorFilter(j6.v0(i11, e6Var));
            linearLayout.addView(uw0Var3, y5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ci.d dVar = new ci.d(context, e6Var, true);
            dVar.setOnClickListener(new bi.p(5, runnable));
            dVar.g(yh.y3.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, y5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f46410h0.run(this.f46407e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
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
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.f46416o0 = l61Var;
        l61Var.f26042r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
