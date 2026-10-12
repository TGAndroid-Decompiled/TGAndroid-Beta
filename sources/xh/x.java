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
import org.telegram.messenger.am;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.x01;
import org.telegram.ui.ww0;
import w7.w5;
import w7.y5;
public final class x extends db implements GiftAuctionController.OnAuctionUpdateListener {
    public static final bd[] f51801p0 = new bd[1];
    public static final w01[] f51802q0 = new w01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f51803a0;
    public final TextView f51804b0;
    public final bd f51805c0;
    public final bd f51806d0;
    public final bd f51807e0;
    public final bd f51808f0;
    public final w01 f51809g0;
    public final org.telegram.tgnet.e f51810h0;
    public final TableRow f51811i0;
    public final ci.d f51812j0;
    public final ia0 f51813k0;
    public final ia0 f51814l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f51815n0;
    public h71 f51816o0;

    public x(Context context, c6 c6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, c6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.f20031id;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.E(-1, false);
        kVar.setOccupyStatusBar(false);
        T(kVar, context, c6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51803a0 = frameLayout;
        frameLayout.addView(kVar, w5.n(-1, -2));
        linearLayout.addView(frameLayout);
        i1 i1Var = new i1(context, this.currentAccount, c6Var);
        i1Var.f51510a0 = true;
        i1Var.g(starGift, false, false, false, false, false);
        i1Var.setImageSize(AndroidUtilities.dp(100.0f));
        i1Var.setImageLayer(7);
        i1Var.J.setVisibility(8);
        frameLayout.addView(i1Var, w5.a(130.0f, 0.0f, 18.0f, 0.0f, 14.0f, 130, 17));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = h6.G6;
        textView.setTextColor(h6.w0(i12, c6Var));
        linearLayout.addView(textView, w5.t(-1, -2, 17, 20, 0, 20, 6));
        ia0 ia0Var = new ia0(context, null);
        this.f51813k0 = ia0Var;
        ia0Var.setGravity(17);
        ia0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new r(context, c6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTextColor(h6.w0(i12, c6Var));
        int i13 = h6.J6;
        ia0Var.setLinkTextColor(h6.w0(i13, c6Var));
        linearLayout.addView(ia0Var, w5.t(-1, -2, 17, 20, 0, 20, 4));
        x01 x01Var = new x01(context, c6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        bd[] bdVarArr = f51801p0;
        x01Var.c(string, "", null, bdVarArr);
        this.f51805c0 = bdVarArr[0];
        x01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, bdVarArr);
        this.f51806d0 = bdVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(x01Var, w5.e(-1, -2, 119));
        this.f51810h0 = new org.telegram.tgnet.e(this, new ci.d4[1], frameLayout2, 5);
        TableRow c10 = x01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, bdVarArr);
        this.f51811i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final x f51734b;

            {
                this.f51734b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new rg.y0(this.f51734b.getContext(), 40, (c6) null).show();
                        return;
                    default:
                        this.f51734b.U();
                        return;
                }
            }
        });
        this.f51807e0 = bdVarArr[0];
        w01[] w01VarArr = f51802q0;
        x01Var.c("", "", w01VarArr, bdVarArr);
        this.f51808f0 = bdVarArr[0];
        this.f51809g0 = w01VarArr[0];
        linearLayout.addView(frameLayout2, w5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        ia0 ia0Var2 = new ia0(context, c6Var);
        this.f51814l0 = ia0Var2;
        ia0Var2.setGravity(17);
        ia0Var2.setTextSize(1, 16.0f);
        ia0Var2.setTextColor(h6.w0(i13, c6Var));
        ia0Var2.setLinkTextColor(h6.w0(i13, c6Var));
        ia0Var2.setOnClickListener(new xg.e(this, new boolean[1], c6Var, 4));
        y5.b(ia0Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new b6(starGift.sticker, ia0Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f51815n0 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f51815n0 = "";
        }
        ci.d dVar = new ci.d(context, c6Var, true);
        this.f51812j0 = dVar;
        dVar.e();
        final int i14 = z10;
        dVar.setOnClickListener(new p(this, j3, context, c6Var, runnable, 0));
        FrameLayout.LayoutParams a2 = w5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(dVar, a2);
        wm0 wm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i17, i14, i17, AndroidUtilities.dp(64.0f));
        this.f51816o0.N(i14);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                x01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                String string2 = LocaleController.getString(R.string.Gift2AuctionTableCurrentRound);
                int i18 = R.string.OfS;
                String formatNumber = LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ',');
                String formatNumber2 = LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = formatNumber;
                objArr[1] = formatNumber2;
                x01Var.c(string2, LocaleController.formatString(i18, objArr), null, null);
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
                x01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            v vVar = new v(this, context, c6Var, new q(this, i14), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25), new ai.e2(25));
            vVar.d(new f4.d(1, 1));
            vVar.setPreviewingAttributes(this.m0.previewAttributes);
            vVar.removeView(vVar.O);
            this.f51803a0.addView(vVar, i14, w5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f51804b0 = textView2;
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
            textView2.setBackground(h6.a0(i14, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), i14, AndroidUtilities.dp(12.0f), i14);
            TextView g10 = org.telegram.ui.Cells.c1.g(this.f51803a0, textView2, w5.a(26.0f, 16.0f, 0.0f, 16.0f, 77.0f, -2, 81), context);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextSize(1, 21.0f);
            g10.setText(str2);
            g10.setGravity(17);
            g10.setTextColor(-1);
            TextView g11 = org.telegram.ui.Cells.c1.g(this.f51803a0, g10, w5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.0f, -1, 87), context);
            g11.setTextSize(1, 13.0f);
            g11.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), i14, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            g11.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            g11.setGravity(17);
            g11.setTextColor(-1342177281);
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final x f51734b;

                {
                    this.f51734b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new rg.y0(this.f51734b.getContext(), 40, (c6) null).show();
                            return;
                        default:
                            this.f51734b.U();
                            return;
                    }
                }
            });
            y5.b(g11, 0.02f, 1.5f);
            this.f51803a0.addView(g11, w5.a(-2.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
            i1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f51813k0.setVisibility(8);
            ia0 ia0Var3 = new ia0(context, c6Var);
            ia0Var3.setGravity(17);
            ia0Var3.setTextSize(1, 16.0f);
            int i24 = h6.J6;
            ia0Var3.setTextColor(h6.w0(i24, c6Var));
            ia0Var3.setLinkTextColor(h6.w0(i24, c6Var));
            ia0Var3.setOnClickListener(new xg.e(this, context, c6Var, 3));
            y5.b(ia0Var3, 0.02f, 1.5f);
            this.Z.addView(ia0Var3, w5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = i14; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new b6(stargiftattributemodel.document, ia0Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            int i26 = R.string.Gift2AuctionVariants;
            String formatNumber3 = LocaleController.formatNumber(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = formatNumber3;
            ia0Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(i26, objArr5), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f51814l0, w5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        W(i14);
    }

    public static void Q(x xVar, boolean[] zArr, c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(xVar.currentAccount).getOrRequestAcquiredGifts(xVar.Y, new d5(xVar, zArr, c6Var, 12));
    }

    public static void R(x xVar, long j3, Context context, c6 c6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = xVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(xVar.currentAccount).getClientUserId()) && (arrayList = (auction = xVar.m0).previewAttributes) != null) {
                new e0(context, c6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new y4(context, xVar.currentAccount, xVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        xVar.dismiss();
    }

    public static void S(x xVar, Context context, c6 c6Var) {
        int i10 = xVar.currentAccount;
        GiftAuctionController.Auction auction = xVar.m0;
        new yh.r0(context, c6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        xVar.dismiss();
    }

    public static void T(org.telegram.ui.ActionBar.k kVar, Context context, c6 c6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new w(context, starGift, c6Var));
        org.telegram.ui.ActionBar.u0 a2 = kVar.p().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void V(Context context, TL_stars.StarGift starGift, c6 c6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.e3 i10 = am.i(1, context, null, false);
            runnable = i10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(h6.w0(h6.Oh, c6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, w5.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            am.j(20.0f, R.string.GiftAuctionInfoHeader, 1, textView);
            int i11 = h6.G6;
            textView.setTextColor(h6.w0(i11, c6Var));
            linearLayout.addView(textView, w5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            am.j(14.0f, R.string.GiftAuctionInfoText, 1, textView2);
            textView2.setTextColor(h6.w0(i11, c6Var));
            linearLayout.addView(textView2, w5.t(-1, -2, 17, 20, 0, 20, 16));
            ww0 ww0Var = new ww0(context, c6Var);
            int i12 = starGift.gifts_per_round;
            ww0Var.f43682a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
            int i13 = starGift.gifts_per_round;
            ww0Var.f43683b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
            ww0Var.d.setVisibility(8);
            int i14 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = ww0Var.f43684c;
            imageView2.setImageResource(i14);
            imageView2.setColorFilter(h6.w0(i11, c6Var));
            linearLayout.addView(ww0Var, w5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var2 = new ww0(context, c6Var);
            ww0Var2.f43682a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            ww0Var2.f43683b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            ww0Var2.d.setVisibility(8);
            int i15 = R.drawable.menu_carryover_24;
            ImageView imageView3 = ww0Var2.f43684c;
            imageView3.setImageResource(i15);
            imageView3.setColorFilter(h6.w0(i11, c6Var));
            linearLayout.addView(ww0Var2, w5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var3 = new ww0(context, c6Var);
            ww0Var3.f43682a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            ww0Var3.f43683b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            ww0Var3.d.setVisibility(8);
            int i16 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = ww0Var3.f43684c;
            imageView4.setImageResource(i16);
            imageView4.setColorFilter(h6.w0(i11, c6Var));
            linearLayout.addView(ww0Var3, w5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ci.d dVar = new ci.d(context, c6Var, true);
            dVar.setOnClickListener(new bi.p(5, runnable));
            dVar.g(yh.s3.i2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, w5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    @Override
    public final CharSequence A() {
        return "";
    }

    public final void U() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f51810h0.run(this.f51807e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void W(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        W(true);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.f51816o0 = h71Var;
        h71Var.f26675r = false;
        return h71Var;
    }
}
