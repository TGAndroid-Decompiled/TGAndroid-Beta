package yh;

import ai.l7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import org.telegram.ui.yv0;
import w7.b6;
import w7.z5;
public final class c0 extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f50186f0 = 0;
    public final long X;
    public final w Y;
    public final LinearLayout Z;
    public final x f50187a0;
    public final TextView f50188b0;
    public final z f50189c0;
    public GiftAuctionController.Auction f50190d0;
    public u61 f50191e0;

    public c0(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, d6Var);
        int i10;
        h9 h9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        d6 d6Var2;
        View view;
        long j11 = starGift.f20504id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.f(0.1f, getThemedColor(h6.f21082i5), getThemedColor(h6.f21065h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        w wVar = new w(this, context);
        this.Y = wVar;
        linearLayout.addView(wVar);
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.containerView.addView(dVar, d);
        jm0 jm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f50191e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        int i14 = i10;
        this.f50190d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        x xVar = new x(this, context, d6Var, new tg.p(this, 14), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), i14);
        this.f50187a0 = xVar;
        xVar.d(new ai.h6(1, 1));
        xVar.setPreviewingAttributes(arrayList);
        xVar.removeView(xVar.P);
        wVar.addView(xVar, 0, z5.e(-1, i14, 48));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        wVar.addView(w9Var, z5.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            h9Var = new h9(0, user2);
            user = user2;
        } else if (i15 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            h9Var = new h9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            h9Var = new h9(chat);
            user = chat;
        }
        w9Var.e(user, h9Var);
        TextView textView = new TextView(context);
        this.f50188b0 = textView;
        nk.k(21.0f, 1, textView);
        if (i15 != 0) {
            clientUserId = j10;
        } else {
            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        textView.setText(DialogObject.getShortName(clientUserId));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        wVar.addView(textView, z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            d6Var2 = d6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            d6Var2 = d6Var;
            textView2.setOnClickListener(new n(context, d6Var, j10, starGift, arrayList));
            b6.b(textView2, 0.02f, 1.5f);
        }
        wVar.addView(textView2, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        g1 g1Var = new g1(context2, this.currentAccount, d6Var2);
        g1Var.f50264c0 = true;
        d6 d6Var3 = d6Var2;
        g1Var.g(starGift, true, false, false, false, false);
        g1Var.setImageSize(AndroidUtilities.dp(84.0f));
        g1Var.setImageLayer(7);
        g1Var.J.setVisibility(8);
        g1Var.e.g(null);
        g1Var.setRibbonTextOneOf(this.f50190d0.gift.availability_total);
        linearLayout2.addView(g1Var, z5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(h6.f21157m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, z5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        z zVar = new z(this, context, this.currentAccount, d6Var3);
        this.f50189c0 = zVar;
        zVar.d.removeView(zVar.f50280y);
        zVar.f50264c0 = true;
        zVar.g(starGift, true, false, false, false, false);
        zVar.setImageSize(AndroidUtilities.dp(100.0f));
        zVar.setImageLayer(7);
        zVar.J.setVisibility(8);
        zVar.e.g(null);
        zVar.setRibbonTextOneOf(this.f50190d0.gift.availability_total);
        zVar.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(zVar, z5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i16 = h6.f21382y6;
        textView3.setTextColor(getThemedColor(i16));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int w02 = h6.w0(h6.f20994d6, d6Var3);
        int i17 = h6.G6;
        frameLayout.setBackground(h6.c0(dp, i0.a.f(0.2f, w02, h6.w0(i17, d6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(h6.w0(i17, d6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView j12 = org.telegram.ui.Cells.c1.j(frameLayout, textView4, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        j12.setTextSize(1, 13.0f);
        j12.setGravity(21);
        j12.setTypeface(AndroidUtilities.bold());
        j12.setTextColor(h6.w0(i17, d6Var3));
        j12.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(j12, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View a0Var = new a0(context, clamp);
        a0Var.setBackground(h6.c0(AndroidUtilities.dp(14.0f), h6.w0(h6.Oh, d6Var3)));
        frameLayout.addView(a0Var, z5.e(-1, -1, 119));
        b0 b0Var = new b0(context, clamp);
        b0Var.setWillNotDraw(false);
        frameLayout.addView(b0Var, z5.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        b0Var.addView(textView5, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        b0Var.addView(textView6, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.f50190d0;
        if (auction != null && auction.auctionStateActive != null) {
            x90 x90Var = new x90(context, null);
            x90Var.setTextSize(1, 13.0f);
            x90Var.setGravity(17);
            x90Var.setTextColor(getThemedColor(i16));
            x90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f50190d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, d6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            x90Var.setLinkTextColor(h6.w0(h6.J6, d6Var3));
            view = x90Var;
        } else {
            view = null;
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(AndroidUtilities.bold());
                textView7.setGravity(17);
                textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
                textView7.setTextSize(1, 20.0f);
                textView7.setTextColor(h6.w0(i17, d6Var3));
                linearLayout.addView(textView7, z5.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                nk.j(14.0f, R.string.GiftAuctionWearInfoText, 1, textView8);
                textView8.setTextColor(h6.w0(i17, d6Var3));
                linearLayout.addView(textView8, z5.t(-1, -2, 17, 20, 0, 20, 16));
                yv0 yv0Var = new yv0(context, d6Var3);
                yv0Var.f43567a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                yv0Var.f43568b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                yv0Var.d.setVisibility(8);
                int i18 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = yv0Var.f43569c;
                imageView2.setImageResource(i18);
                imageView2.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(yv0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                yv0 yv0Var2 = new yv0(context, d6Var3);
                yv0Var2.f43567a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                yv0Var2.f43568b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                yv0Var2.d.setVisibility(8);
                int i19 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = yv0Var2.f43569c;
                imageView3.setImageResource(i19);
                imageView3.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(yv0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                yv0 yv0Var3 = new yv0(context, d6Var3);
                yv0Var3.f43567a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                yv0Var3.f43568b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                yv0Var3.d.setVisibility(8);
                int i20 = R.drawable.menu_verification;
                ImageView imageView4 = yv0Var3.f43569c;
                imageView4.setImageResource(i20);
                imageView4.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(yv0Var3, z5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(l7.I2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new hg.r0(this, 27));
            return;
        }
        linearLayout.addView(linearLayout2, z5.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, z5.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, z5.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, z5.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f50190d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f50190d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f50190d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f50190d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new n(this, j10, context, d6Var3, runnable, 1));
    }

    @Override
    public final CharSequence A() {
        return "";
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f50190d0 = auction;
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 26), this.resourcesProvider);
        this.f50191e0 = u61Var;
        u61Var.f30865r = false;
        return u61Var;
    }
}
