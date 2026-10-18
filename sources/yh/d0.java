package yh;

import ai.g6;
import ai.k7;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import org.telegram.ui.aw0;
import w7.b6;
import w7.z5;
public final class d0 extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f50240f0 = 0;
    public final long X;
    public final x Y;
    public final LinearLayout Z;
    public final y f50241a0;
    public final TextView f50242b0;
    public final a0 f50243c0;
    public GiftAuctionController.Auction f50244d0;
    public s61 f50245e0;

    public d0(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, d6Var);
        int i10;
        h9 h9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        d6 d6Var2;
        View view;
        long j11 = starGift.f20503id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.f(0.1f, getThemedColor(h6.f21081i5), getThemedColor(h6.f21064h5)));
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
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.e();
        FrameLayout.LayoutParams a2 = z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i11 = a2.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        a2.leftMargin = i11 + i12;
        a2.rightMargin += i12;
        this.containerView.addView(dVar, a2);
        im0 im0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        im0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f50245e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        int i14 = i10;
        this.f50244d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        y yVar = new y(this, context, d6Var, new tg.p(this, 14), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), new ah.f(29), i14);
        this.f50241a0 = yVar;
        yVar.d(new g6(1, 1));
        yVar.setPreviewingAttributes(arrayList);
        yVar.removeView(yVar.P);
        xVar.addView(yVar, 0, z5.e(-1, i14, 48));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        xVar.addView(w9Var, z5.a(90.0f, 0.0f, 42.0f, 0.0f, 0.0f, 90, 49));
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
        this.f50242b0 = textView;
        kk.k(21.0f, 1, textView);
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
        xVar.addView(textView, z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.0f, -2, 81));
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
            textView2.setOnClickListener(new o(context, d6Var, j10, starGift, arrayList));
            b6.b(textView2, 0.02f, 1.5f);
        }
        xVar.addView(textView2, z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        h1 h1Var = new h1(context2, this.currentAccount, d6Var2);
        h1Var.f50314c0 = true;
        d6 d6Var3 = d6Var2;
        h1Var.g(starGift, true, false, false, false, false);
        h1Var.setImageSize(AndroidUtilities.dp(84.0f));
        h1Var.setImageLayer(7);
        h1Var.J.setVisibility(8);
        h1Var.e.g(null);
        h1Var.setRibbonTextOneOf(this.f50244d0.gift.availability_total);
        linearLayout2.addView(h1Var, z5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(h6.f21156m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, z5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        a0 a0Var = new a0(this, context, this.currentAccount, d6Var3);
        this.f50243c0 = a0Var;
        a0Var.d.removeView(a0Var.f50330y);
        a0Var.f50314c0 = true;
        a0Var.g(starGift, true, false, false, false, false);
        a0Var.setImageSize(AndroidUtilities.dp(100.0f));
        a0Var.setImageLayer(7);
        a0Var.J.setVisibility(8);
        a0Var.e.g(null);
        a0Var.setRibbonTextOneOf(this.f50244d0.gift.availability_total);
        a0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(a0Var, z5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i16 = h6.f21381y6;
        textView3.setTextColor(getThemedColor(i16));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int w02 = h6.w0(h6.f20993d6, d6Var3);
        int i17 = h6.G6;
        frameLayout.setBackground(h6.c0(dp, i0.a.f(0.2f, w02, h6.w0(i17, d6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(h6.w0(i17, d6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView j12 = org.telegram.ui.Cells.c1.j(frameLayout, textView4, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3), context);
        j12.setTextSize(1, 13.0f);
        j12.setGravity(21);
        j12.setTypeface(AndroidUtilities.bold());
        j12.setTextColor(h6.w0(i17, d6Var3));
        j12.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(j12, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        View b0Var = new b0(context, clamp);
        b0Var.setBackground(h6.c0(AndroidUtilities.dp(14.0f), h6.w0(h6.Oh, d6Var3)));
        frameLayout.addView(b0Var, z5.e(-1, -1, 119));
        c0 c0Var = new c0(context, clamp);
        c0Var.setWillNotDraw(false);
        frameLayout.addView(c0Var, z5.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        c0Var.addView(textView5, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        c0Var.addView(textView6, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        GiftAuctionController.Auction auction = this.f50244d0;
        if (auction != null && auction.auctionStateActive != null) {
            x90 x90Var = new x90(context, null);
            x90Var.setTextSize(1, 13.0f);
            x90Var.setGravity(17);
            x90Var.setTextColor(getThemedColor(i16));
            x90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f50244d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new q(context, d6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
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
                kk.j(14.0f, R.string.GiftAuctionWearInfoText, 1, textView8);
                textView8.setTextColor(h6.w0(i17, d6Var3));
                linearLayout.addView(textView8, z5.t(-1, -2, 17, 20, 0, 20, 16));
                aw0 aw0Var = new aw0(context, d6Var3);
                aw0Var.f35531a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                aw0Var.f35532b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                aw0Var.d.setVisibility(8);
                int i18 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = aw0Var.f35533c;
                imageView2.setImageResource(i18);
                imageView2.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(aw0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                aw0 aw0Var2 = new aw0(context, d6Var3);
                aw0Var2.f35531a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                aw0Var2.f35532b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                aw0Var2.d.setVisibility(8);
                int i19 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = aw0Var2.f35533c;
                imageView3.setImageResource(i19);
                imageView3.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(aw0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                aw0 aw0Var3 = new aw0(context, d6Var3);
                aw0Var3.f35531a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                aw0Var3.f35532b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                aw0Var3.d.setVisibility(8);
                int i20 = R.drawable.menu_verification;
                ImageView imageView4 = aw0Var3.f35533c;
                imageView4.setImageResource(i20);
                imageView4.setColorFilter(h6.w0(i17, d6Var3));
                linearLayout.addView(aw0Var3, z5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(k7.B2(LocaleController.getString(R.string.Understood)), false, true);
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
        GiftAuctionController.Auction auction2 = this.f50244d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f50244d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f50244d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f50244d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new o(this, j10, context, d6Var3, runnable, 1));
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
        this.f50244d0 = auction;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 26), this.resourcesProvider);
        this.f50245e0 = s61Var;
        s61Var.f30207r = false;
        return s61Var;
    }
}
