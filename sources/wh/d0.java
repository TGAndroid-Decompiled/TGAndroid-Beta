package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ww0;
import w7.a6;
import w7.c6;
public final class d0 extends ab implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f44046f0 = 0;
    public final long X;
    public final x Y;
    public final LinearLayout Z;
    public final y f44047a0;
    public final TextView f44048b0;
    public final a0 f44049c0;
    public GiftAuctionController.Auction f44050d0;
    public j61 f44051e0;

    public d0(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, f6Var);
        int i10;
        g9 g9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        f6 f6Var2;
        View view;
        long j10 = starGift.f17425id;
        this.X = j10;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(j6.f18016i5), getThemedColor(j6.f17998h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        x xVar = new x(this, context);
        this.Y = xVar;
        linearLayout.addView(xVar);
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.containerView.addView(dVar, d);
        vl0 vl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f44051e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        this.f44050d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        y yVar = new y(this, context, f6Var, new qg.q0(this, 20), new d5(25), new d5(25), new d5(25), new d5(25), new d5(25), new d5(25), i10);
        this.f44047a0 = yVar;
        yVar.d(new f4.d(1, 1));
        yVar.setPreviewingAttributes(arrayList);
        yVar.removeView(yVar.O);
        xVar.addView(yVar, 0, a6.e(-1, i10, 48));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        xVar.addView(w9Var, a6.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            g9Var = new g9(0, user2);
            user = user2;
        } else if (i14 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            g9Var = new g9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            g9Var = new g9(chat);
            user = chat;
        }
        w9Var.e(user, g9Var);
        TextView textView = new TextView(context);
        this.f44048b0 = textView;
        em.j(21.0f, 1, textView);
        if (i14 != 0) {
            clientUserId = j3;
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
        xVar.addView(textView, a6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            f6Var2 = f6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            f6Var2 = f6Var;
            textView2.setOnClickListener(new n(context, f6Var, j3, starGift, arrayList));
            c6.b(textView2, 0.02f, 1.5f);
        }
        xVar.addView(textView2, a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        h1 h1Var = new h1(context2, this.currentAccount, f6Var2);
        h1Var.f44115a0 = true;
        f6 f6Var3 = f6Var2;
        h1Var.g(starGift, true, false, false, false, false);
        h1Var.setImageSize(AndroidUtilities.dp(84.0f));
        h1Var.setImageLayer(7);
        h1Var.J.setVisibility(8);
        h1Var.e.g(null);
        h1Var.setRibbonTextOneOf(this.f44050d0.gift.availability_total);
        linearLayout2.addView(h1Var, a6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.f18091m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, a6.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        a0 a0Var = new a0(this, context, this.currentAccount, f6Var3);
        this.f44049c0 = a0Var;
        a0Var.d.removeView(a0Var.f44134y);
        a0Var.f44115a0 = true;
        a0Var.g(starGift, true, false, false, false, false);
        a0Var.setImageSize(AndroidUtilities.dp(100.0f));
        a0Var.setImageLayer(7);
        a0Var.J.setVisibility(8);
        a0Var.e.g(null);
        a0Var.setRibbonTextOneOf(this.f44050d0.gift.availability_total);
        a0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(a0Var, a6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = j6.f18306y6;
        textView3.setTextColor(getThemedColor(i15));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = j6.v0(j6.f17928d6, f6Var3);
        int i16 = j6.G6;
        frameLayout.setBackground(j6.b0(dp, i0.a.d(0.2f, v02, j6.v0(i16, f6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(j6.v0(i16, f6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView f7 = r6.f(frameLayout, textView4, a6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        f7.setTextSize(1, 13.0f);
        f7.setGravity(21);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(j6.v0(i16, f6Var3));
        f7.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(f7, a6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View b0Var = new b0(context, clamp);
        b0Var.setBackground(j6.b0(AndroidUtilities.dp(14.0f), j6.v0(j6.Oh, f6Var3)));
        frameLayout.addView(b0Var, a6.e(-1, -1, 119));
        c0 c0Var = new c0(context, clamp);
        c0Var.setWillNotDraw(false);
        frameLayout.addView(c0Var, a6.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        c0Var.addView(textView5, a6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        c0Var.addView(textView6, a6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.f44050d0;
        if (auction != null && auction.auctionStateActive != null) {
            m90 m90Var = new m90(context, null);
            m90Var.setTextSize(1, 13.0f);
            m90Var.setGravity(17);
            m90Var.setTextColor(getThemedColor(i15));
            m90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f44050d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, f6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            m90Var.setLinkTextColor(j6.v0(j6.J6, f6Var3));
            view = m90Var;
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
                textView7.setTextColor(j6.v0(i16, f6Var3));
                linearLayout.addView(textView7, a6.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
                textView8.setTextSize(1, 14.0f);
                textView8.setTextColor(j6.v0(i16, f6Var3));
                linearLayout.addView(textView8, a6.t(-1, -2, 17, 20, 0, 20, 16));
                ww0 ww0Var = new ww0(context, f6Var3);
                ww0Var.f38396a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                ww0Var.f38397b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                ww0Var.d.setVisibility(8);
                int i17 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = ww0Var.f38398c;
                imageView2.setImageResource(i17);
                imageView2.setColorFilter(j6.v0(i16, f6Var3));
                linearLayout.addView(ww0Var, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ww0 ww0Var2 = new ww0(context, f6Var3);
                ww0Var2.f38396a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                ww0Var2.f38397b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                ww0Var2.d.setVisibility(8);
                int i18 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = ww0Var2.f38398c;
                imageView3.setImageResource(i18);
                imageView3.setColorFilter(j6.v0(i16, f6Var3));
                linearLayout.addView(ww0Var2, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ww0 ww0Var3 = new ww0(context, f6Var3);
                ww0Var3.f38396a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                ww0Var3.f38397b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                ww0Var3.d.setVisibility(8);
                int i19 = R.drawable.menu_verification;
                ImageView imageView4 = ww0Var3.f38398c;
                imageView4.setImageResource(i19);
                imageView4.setColorFilter(j6.v0(i16, f6Var3));
                linearLayout.addView(ww0Var3, a6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(xh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new org.telegram.ui.web.c(this, 11));
            return;
        }
        linearLayout.addView(linearLayout2, a6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, a6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, a6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, a6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f44050d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f44050d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f44050d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f44050d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new n(this, j3, context, f6Var3, runnable, 1));
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f44050d0 = auction;
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 15), this.resourcesProvider);
        this.f44051e0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
