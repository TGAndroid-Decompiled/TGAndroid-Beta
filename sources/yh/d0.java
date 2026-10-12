package yh;

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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ax0;
import w7.a6;
public final class d0 extends db implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f48809f0 = 0;
    public final long X;
    public final x Y;
    public final LinearLayout Z;
    public final y f48810a0;
    public final TextView f48811b0;
    public final a0 f48812c0;
    public GiftAuctionController.Auction f48813d0;
    public z61 f48814e0;

    public d0(Context context, c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, c6Var);
        int i10;
        k9 k9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        c6 c6Var2;
        View view;
        long j11 = starGift.f19441id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(g6.f19989i5), getThemedColor(g6.f19972h5)));
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
        di.d dVar = new di.d(context, c6Var, true);
        dVar.e();
        FrameLayout.LayoutParams a2 = a6.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i11 = a2.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        a2.leftMargin = i11 + i12;
        a2.rightMargin += i12;
        this.containerView.addView(dVar, a2);
        mm0 mm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f48814e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        int i14 = i10;
        this.f48813d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        y yVar = new y(this, context, c6Var, new rh.j(this, 24), new ah.f(27), new ah.f(27), new ah.f(27), new ah.f(27), new ah.f(27), new ah.f(27), i14);
        this.f48810a0 = yVar;
        yVar.d(new f4.d(1, 1));
        yVar.setPreviewingAttributes(arrayList);
        yVar.removeView(yVar.O);
        xVar.addView(yVar, 0, a6.e(-1, i14, 48));
        z9 z9Var = new z9(context);
        z9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        xVar.addView(z9Var, a6.a(90.0f, 0.0f, 42.0f, 0.0f, 0.0f, 90, 49));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            k9Var = new k9(0, user2);
            user = user2;
        } else if (i15 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            k9Var = new k9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            k9Var = new k9(chat);
            user = chat;
        }
        z9Var.e(user, k9Var);
        TextView textView = new TextView(context);
        this.f48811b0 = textView;
        yh.k(21.0f, 1, textView);
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
        xVar.addView(textView, a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.0f, -2, 81));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            c6Var2 = c6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            c6Var2 = c6Var;
            textView2.setOnClickListener(new o(context, c6Var, j10, starGift, arrayList));
            w7.c6.b(textView2, 0.02f, 1.5f);
        }
        xVar.addView(textView2, a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        h1 h1Var = new h1(context2, this.currentAccount, c6Var2);
        h1Var.f48893a0 = true;
        c6 c6Var3 = c6Var2;
        h1Var.g(starGift, true, false, false, false, false);
        h1Var.setImageSize(AndroidUtilities.dp(84.0f));
        h1Var.setImageLayer(7);
        h1Var.J.setVisibility(8);
        h1Var.e.g(null);
        h1Var.setRibbonTextOneOf(this.f48813d0.gift.availability_total);
        linearLayout2.addView(h1Var, a6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.f20064m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, a6.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        a0 a0Var = new a0(this, context, this.currentAccount, c6Var3);
        this.f48812c0 = a0Var;
        a0Var.d.removeView(a0Var.f48912y);
        a0Var.f48893a0 = true;
        a0Var.g(starGift, true, false, false, false, false);
        a0Var.setImageSize(AndroidUtilities.dp(100.0f));
        a0Var.setImageLayer(7);
        a0Var.J.setVisibility(8);
        a0Var.e.g(null);
        a0Var.setRibbonTextOneOf(this.f48813d0.gift.availability_total);
        a0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(a0Var, a6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i16 = g6.f20288y6;
        textView3.setTextColor(getThemedColor(i16));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int w02 = g6.w0(g6.f19901d6, c6Var3);
        int i17 = g6.G6;
        frameLayout.setBackground(g6.c0(dp, i0.a.d(0.2f, w02, g6.w0(i17, c6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(g6.w0(i17, c6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView4, a6.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3), context);
        h.setTextSize(1, 13.0f);
        h.setGravity(21);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextColor(g6.w0(i17, c6Var3));
        h.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(h, a6.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        View b0Var = new b0(context, clamp);
        b0Var.setBackground(g6.c0(AndroidUtilities.dp(14.0f), g6.w0(g6.Oh, c6Var3)));
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
        c0Var.addView(textView5, a6.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        c0Var.addView(textView6, a6.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        GiftAuctionController.Auction auction = this.f48813d0;
        if (auction != null && auction.auctionStateActive != null) {
            da0 da0Var = new da0(context, null);
            da0Var.setTextSize(1, 13.0f);
            da0Var.setGravity(17);
            da0Var.setTextColor(getThemedColor(i16));
            da0Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f48813d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new q(context, c6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            da0Var.setLinkTextColor(g6.w0(g6.J6, c6Var3));
            view = da0Var;
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
                textView7.setTextColor(g6.w0(i17, c6Var3));
                linearLayout.addView(textView7, a6.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                yh.j(14.0f, R.string.GiftAuctionWearInfoText, 1, textView8);
                textView8.setTextColor(g6.w0(i17, c6Var3));
                linearLayout.addView(textView8, a6.t(-1, -2, 17, 20, 0, 20, 16));
                ax0 ax0Var = new ax0(context, c6Var3);
                ax0Var.f34364a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                ax0Var.f34365b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                ax0Var.d.setVisibility(8);
                int i18 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = ax0Var.f34366c;
                imageView2.setImageResource(i18);
                imageView2.setColorFilter(g6.w0(i17, c6Var3));
                linearLayout.addView(ax0Var, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ax0 ax0Var2 = new ax0(context, c6Var3);
                ax0Var2.f34364a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                ax0Var2.f34365b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                ax0Var2.d.setVisibility(8);
                int i19 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = ax0Var2.f34366c;
                imageView3.setImageResource(i19);
                imageView3.setColorFilter(g6.w0(i17, c6Var3));
                linearLayout.addView(ax0Var2, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ax0 ax0Var3 = new ax0(context, c6Var3);
                ax0Var3.f34364a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                ax0Var3.f34365b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                ax0Var3.d.setVisibility(8);
                int i20 = R.drawable.menu_verification;
                ImageView imageView4 = ax0Var3.f34366c;
                imageView4.setImageResource(i20);
                imageView4.setColorFilter(g6.w0(i17, c6Var3));
                linearLayout.addView(ax0Var3, a6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(zh.r3.i2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new ji.o4(this, 17));
            return;
        }
        linearLayout.addView(linearLayout2, a6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, a6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, a6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, a6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f48813d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f48813d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f48813d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f48813d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new o(this, j10, context, c6Var3, runnable, 1));
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
        this.f48813d0 = auction;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 15), this.resourcesProvider);
        this.f48814e0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
