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
import bi.h7;
import bi.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.gw0;
public final class v extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final yc[] f53283p0 = new yc[1];
    public static final v01[] f53284q0 = new v01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout f53285a0;
    public final TextView f53286b0;
    public final yc f53287c0;
    public final yc f53288d0;
    public final yc f53289e0;
    public final yc f53290f0;
    public final v01 f53291g0;
    public final bi.t0 f53292h0;
    public final TableRow f53293i0;
    public final fi.d f53294j0;
    public final z90 f53295k0;
    public final z90 f53296l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence f53297n0;
    public j71 f53298o0;

    public v(Context context, u6 u6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, u6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j11 = starGift.f22256id;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var);
        kVar.y(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, u6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53285a0 = frameLayout;
        frameLayout.addView(kVar, gb1.r(-1, -2));
        linearLayout.addView(frameLayout);
        g1 g1Var = new g1(context, this.currentAccount, u6Var);
        g1Var.f52986c0 = true;
        g1Var.h(starGift, false, false, false, false, false);
        g1Var.setImageSize(AndroidUtilities.dp(100.0f));
        g1Var.setImageLayer(7);
        g1Var.J.setVisibility(8);
        frameLayout.addView(g1Var, gb1.h(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = y6.G6;
        f7.V(textView, i12, u6Var);
        linearLayout.addView(textView, gb1.x(-1, -2, 17, 20, 0, 20, 6));
        z90 z90Var = new z90(context, null);
        this.f53295k0 = z90Var;
        z90Var.setGravity(17);
        z90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, u6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        z90Var.setTextSize(1, 14.0f);
        f7.V(z90Var, i12, u6Var);
        int i13 = y6.J6;
        f7.H(z90Var, i13, u6Var);
        linearLayout.addView(z90Var, gb1.x(-1, -2, 17, 20, 0, 20, 4));
        w01 w01Var = new w01(context, u6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        yc[] ycVarArr = f53283p0;
        w01Var.c(string, "", null, ycVarArr);
        this.f53287c0 = ycVarArr[0];
        w01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, ycVarArr);
        this.f53288d0 = ycVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(w01Var, gb1.i(-1, -2, 119));
        this.f53292h0 = new bi.t0(this, new fi.v3[1], frameLayout2, 7);
        TableRow c10 = w01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, ycVarArr);
        this.f53293i0 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v f53217b;

            {
                this.f53217b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new tg.y0(this.f53217b.getContext(), 40, (u6) null).show();
                        return;
                    default:
                        this.f53217b.T();
                        return;
                }
            }
        });
        this.f53289e0 = ycVarArr[0];
        v01[] v01VarArr = f53284q0;
        w01Var.c("", "", v01VarArr, ycVarArr);
        this.f53290f0 = ycVarArr[0];
        this.f53291g0 = v01VarArr[0];
        linearLayout.addView(frameLayout2, gb1.o(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        z90 z90Var2 = new z90(context, u6Var);
        this.f53296l0 = z90Var2;
        z90Var2.setGravity(17);
        z90Var2.setTextSize(1, 16.0f);
        f7.V(z90Var2, i13, u6Var);
        f7.H(z90Var2, i13, u6Var);
        z90Var2.setOnClickListener(new a51(this, new boolean[1], u6Var, 7));
        gb1.c(z90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new c6(starGift.sticker, z90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f53297n0 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f53297n0 = "";
        }
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f53294j0 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new n(this, j10, context, u6Var, runnable, 0));
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = h.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        h.leftMargin = i15 + i16;
        h.rightMargin += i16;
        this.containerView.addView(dVar, h);
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, i14, i17, AndroidUtilities.dp(64.0f));
        this.f53298o0.O(i14);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                w01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                String string2 = LocaleController.getString(R.string.Gift2AuctionTableCurrentRound);
                int i18 = R.string.OfS;
                String formatNumber = LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ',');
                String formatNumber2 = LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = formatNumber;
                objArr[1] = formatNumber2;
                w01Var.c(string2, LocaleController.formatString(i18, objArr), null, null);
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
                w01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            t tVar = new t(this, context, u6Var, new o(this, i14), new bh.f(28), new bh.f(28), new bh.f(28), new bh.f(28), new bh.f(28), new bh.f(28));
            tVar.d(new bi.c6(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.P);
            this.f53285a0.addView(tVar, i14, gb1.i(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.f53286b0 = textView2;
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
            textView2.setBackground(y6.a0(i14, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), i14, AndroidUtilities.dp(12.0f), i14);
            TextView k10 = org.telegram.ui.d3.k(this.f53285a0, textView2, gb1.h(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            k10.setTypeface(AndroidUtilities.bold());
            k10.setTextSize(1, 21.0f);
            k10.setText(str2);
            k10.setGravity(17);
            k10.setTextColor(-1);
            TextView k11 = org.telegram.ui.d3.k(this.f53285a0, k10, gb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            k11.setTextSize(1, 13.0f);
            k11.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), i14, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            k11.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            k11.setGravity(17);
            k11.setTextColor(-1342177281);
            k11.setOnClickListener(new View.OnClickListener(this) {
                public final v f53217b;

                {
                    this.f53217b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new tg.y0(this.f53217b.getContext(), 40, (u6) null).show();
                            return;
                        default:
                            this.f53217b.T();
                            return;
                    }
                }
            });
            gb1.c(k11, 0.02f, 1.5f);
            this.f53285a0.addView(k11, gb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            g1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f53295k0.setVisibility(8);
            z90 z90Var3 = new z90(context, u6Var);
            z90Var3.setGravity(17);
            z90Var3.setTextSize(1, 16.0f);
            int i24 = y6.J6;
            f7.V(z90Var3, i24, u6Var);
            f7.H(z90Var3, i24, u6Var);
            z90Var3.setOnClickListener(new a51(this, context, u6Var, 6));
            gb1.c(z90Var3, 0.02f, 1.5f);
            this.Z.addView(z90Var3, gb1.o(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            bi.a aVar = new bi.a(bg.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = i14; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new c6(stargiftattributemodel.document, z90Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            int i26 = R.string.Gift2AuctionVariants;
            String formatNumber3 = LocaleController.formatNumber(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = formatNumber3;
            z90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(i26, objArr5), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.f53296l0, gb1.o(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(i14);
    }

    public static void P(v vVar, boolean[] zArr, u6 u6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new bi.v3(vVar, zArr, u6Var, 13));
    }

    public static void Q(v vVar, long j10, Context context, u6 u6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, u6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new y4(context, vVar.currentAccount, vVar.m0.gift, null, j10, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static void R(v vVar, Context context, u6 u6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new bi.x1(context, u6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, u6 u6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, u6Var));
        org.telegram.ui.ActionBar.w0 a2 = kVar.l().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, u6 u6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.k3 i10 = vh.i(1, context, null, false);
            runnable = i10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i11 = y6.Oh;
            paint.setColor(y6.w0(i11, u6Var));
            b7 N = f7.N(i11);
            imageView.setBackground(shapeDrawable);
            f7.k(imageView, shapeDrawable, N, null, u6Var);
            linearLayout.addView(imageView, gb1.x(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            org.telegram.ui.d3.o(R.string.GiftAuctionInfoHeader, textView, 1, 20.0f);
            int i12 = y6.G6;
            f7.V(textView, i12, u6Var);
            linearLayout.addView(textView, gb1.x(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            org.telegram.ui.d3.o(R.string.GiftAuctionInfoText, textView2, 1, 14.0f);
            f7.V(textView2, i12, u6Var);
            linearLayout.addView(textView2, gb1.x(-1, -2, 17, 20, 0, 20, 16));
            gw0 gw0Var = new gw0(context, u6Var);
            int i13 = starGift.gifts_per_round;
            gw0Var.f39791a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i13, Integer.valueOf(i13)), false);
            int i14 = starGift.gifts_per_round;
            gw0Var.f39792b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i14, Integer.valueOf(i14)));
            gw0Var.d.setVisibility(8);
            int i15 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = gw0Var.f39793c;
            imageView2.setImageResource(i15);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            f7.t(imageView2, i12, u6Var, mode);
            linearLayout.addView(gw0Var, gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var2 = new gw0(context, u6Var);
            gw0Var2.f39791a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            gw0Var2.f39792b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            gw0Var2.d.setVisibility(8);
            int i16 = R.drawable.menu_carryover_24;
            ImageView imageView3 = gw0Var2.f39793c;
            imageView3.setImageResource(i16);
            f7.t(imageView3, i12, u6Var, mode);
            linearLayout.addView(gw0Var2, gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var3 = new gw0(context, u6Var);
            gw0Var3.f39791a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            gw0Var3.f39792b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            gw0Var3.d.setVisibility(8);
            int i17 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = gw0Var3.f39793c;
            imageView4.setImageResource(i17);
            f7.t(imageView4, i12, u6Var, mode);
            linearLayout.addView(gw0Var3, gb1.o(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(context, u6Var, true);
            dVar.setOnClickListener(new w6(6, runnable));
            dVar.i(h7.H2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, gb1.o(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.customView = linearLayout;
            i10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f53292h0.run(this.f53289e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v.V(boolean):void");
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
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 28), this.resourcesProvider);
        this.f53298o0 = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
