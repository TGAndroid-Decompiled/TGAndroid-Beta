package yh;

import ai.h6;
import ai.l7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.za;
import org.telegram.ui.bw0;
import w7.b6;
import w7.z5;
public final class c0 extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f50627g0 = 0;
    public final long X;
    public final w Y;
    public final LinearLayout Z;
    public final x f50628a0;
    public final TextView f50629b0;
    public final z f50630c0;
    public GiftAuctionController.Auction f50631d0;
    public a71 f50632e0;
    public int f50633f0;

    public c0(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, g6Var);
        int i10;
        f9 f9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        g6 g6Var2;
        w90 w90Var;
        long j11 = starGift.f20568id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.f(0.1f, getThemedColor(k6.f21272i5), getThemedColor(k6.f21255h5)));
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
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.containerView.addView(dVar, d);
        lm0 lm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f50632e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        int i14 = i10;
        this.f50631d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        x xVar = new x(this, context, g6Var, new tg.p(this, 14), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), i14);
        this.f50628a0 = xVar;
        xVar.d(new h6(1, 1));
        xVar.setPreviewingAttributes(arrayList);
        xVar.removeView(xVar.P);
        wVar.addView(xVar, 0, z5.e(-1, i14, 48));
        u9 u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        wVar.addView(u9Var, z5.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            f9Var = new f9(0, user2);
            user = user2;
        } else if (i15 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            f9Var = new f9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            f9Var = new f9(chat);
            user = chat;
        }
        u9Var.e(user, f9Var);
        TextView textView = new TextView(context);
        this.f50629b0 = textView;
        tl.k(21.0f, 1, textView);
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
            g6Var2 = g6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            g6Var2 = g6Var;
            textView2.setOnClickListener(new n(context, g6Var, j10, starGift, arrayList));
            b6.b(textView2, 0.02f, 1.5f);
        }
        wVar.addView(textView2, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        g1 g1Var = new g1(context2, this.currentAccount, g6Var2);
        g1Var.f50707c0 = true;
        g6 g6Var3 = g6Var2;
        g1Var.h(starGift, true, false, false, false, false);
        g1Var.setImageSize(AndroidUtilities.dp(84.0f));
        g1Var.setImageLayer(7);
        g1Var.J.setVisibility(8);
        g1Var.e.g(null);
        g1Var.setRibbonTextOneOf(this.f50631d0.gift.availability_total);
        linearLayout2.addView(g1Var, z5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        r6.t(imageView, k6.f21347m6, g6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, z5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        z zVar = new z(this, context, this.currentAccount, g6Var3);
        this.f50630c0 = zVar;
        zVar.d.removeView(zVar.f50731y);
        zVar.f50707c0 = true;
        zVar.h(starGift, true, false, false, false, false);
        zVar.setImageSize(AndroidUtilities.dp(100.0f));
        zVar.setImageLayer(7);
        zVar.J.setVisibility(8);
        zVar.e.g(null);
        zVar.setRibbonTextOneOf(this.f50631d0.gift.availability_total);
        zVar.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(zVar, z5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i16 = k6.f21572y6;
        r6.W(textView3, i16, g6Var3);
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int i17 = k6.f21184d6;
        int w02 = k6.w0(i17, g6Var3);
        int i18 = k6.G6;
        Drawable c02 = k6.c0(dp, i0.a.f(0.2f, w02, k6.w0(i18, g6Var3)));
        frameLayout.setBackground(c02);
        m6 p5 = r6.p(frameLayout, true);
        p5.d = c02;
        p5.e = null;
        p5.f21646f = null;
        l6 l6Var = new l6();
        p5.e = l6Var;
        l6Var.c(i17, i18, 3, 0.2f, g6Var3);
        l6Var.f21614g = r6.v(c02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        r6.W(textView4, i18, g6Var3);
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView j12 = org.telegram.ui.Cells.b1.j(frameLayout, textView4, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        j12.setTextSize(1, 13.0f);
        j12.setGravity(21);
        j12.setTypeface(AndroidUtilities.bold());
        r6.W(j12, i18, g6Var3);
        j12.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(j12, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View a0Var = new a0(context, clamp);
        int dp2 = AndroidUtilities.dp(14.0f);
        int i19 = k6.Oh;
        Drawable c03 = k6.c0(dp2, k6.w0(i19, g6Var3));
        n6 O = r6.O(i19);
        a0Var.setBackground(c03);
        r6.k(a0Var, c03, O, null, g6Var3);
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
        GiftAuctionController.Auction auction = this.f50631d0;
        if (auction != null && auction.auctionStateActive != null) {
            w90Var = new w90(context, null);
            w90Var.setTextSize(1, 13.0f);
            w90Var.setGravity(17);
            r6.W(w90Var, i16, g6Var3);
            w90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f50631d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, g6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            r6.I(w90Var, k6.J6, g6Var3);
        } else {
            w90Var = null;
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(AndroidUtilities.bold());
                textView7.setGravity(17);
                textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
                textView7.setTextSize(1, 20.0f);
                r6.W(textView7, i18, g6Var3);
                linearLayout.addView(textView7, z5.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                tl.n(R.string.GiftAuctionWearInfoText, textView8, 1, 14.0f);
                r6.W(textView8, i18, g6Var3);
                linearLayout.addView(textView8, z5.t(-1, -2, 17, 20, 0, 20, 16));
                bw0 bw0Var = new bw0(context, g6Var3);
                bw0Var.f36150a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                bw0Var.f36151b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                bw0Var.d.setVisibility(8);
                int i20 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = bw0Var.f36152c;
                imageView2.setImageResource(i20);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                r6.t(imageView2, i18, g6Var3, mode);
                linearLayout.addView(bw0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                bw0 bw0Var2 = new bw0(context, g6Var3);
                bw0Var2.f36150a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                bw0Var2.f36151b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                bw0Var2.d.setVisibility(8);
                int i21 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = bw0Var2.f36152c;
                imageView3.setImageResource(i21);
                r6.t(imageView3, i18, g6Var3, mode);
                linearLayout.addView(bw0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                bw0 bw0Var3 = new bw0(context, g6Var3);
                bw0Var3.f36150a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                bw0Var3.f36151b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                bw0Var3.d.setVisibility(8);
                int i22 = R.drawable.menu_verification;
                ImageView imageView4 = bw0Var3.f36152c;
                imageView4.setImageResource(i22);
                r6.t(imageView4, i18, g6Var3, mode);
                linearLayout.addView(bw0Var3, z5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.i(l7.H2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new hg.r0(this, 27));
            return;
        }
        linearLayout.addView(linearLayout2, z5.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, z5.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, z5.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (w90Var != null) {
            linearLayout.addView(w90Var, z5.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f50631d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f50631d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f50631d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f50631d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new n(this, j10, context, g6Var3, runnable, 1));
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int f7 = i0.a.f(0.1f, getThemedColor(k6.f21272i5), getThemedColor(k6.f21255h5));
            if (f7 != this.f50633f0) {
                this.f50633f0 = f7;
                setBackgroundColor(f7);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f50631d0 = auction;
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 26), this.resourcesProvider);
        this.f50632e0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return "";
    }
}
