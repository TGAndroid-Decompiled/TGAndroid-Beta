package xh;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import org.telegram.ui.uw0;
import w7.x5;
import w7.z5;
public final class c0 extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f45809f0 = 0;
    public final long X;
    public final w Y;
    public final LinearLayout Z;
    public final x f45810a0;
    public final TextView f45811b0;
    public final z f45812c0;
    public GiftAuctionController.Auction f45813d0;
    public w51 f45814e0;

    public c0(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, e6Var);
        int i10;
        f9 f9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        e6 e6Var2;
        View view;
        long j10 = starGift.f18334id;
        this.X = j10;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(i6.f18922i5), getThemedColor(i6.f18904h5)));
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
        ci.d dVar = new ci.d(context, e6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.containerView.addView(dVar, d);
        ll0 ll0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f45814e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        this.f45813d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        x xVar = new x(this, context, e6Var, new rg.w1(this, 13), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), i10);
        this.f45810a0 = xVar;
        xVar.d(new f4.d(1, 1));
        xVar.setPreviewingAttributes(arrayList);
        xVar.removeView(xVar.O);
        wVar.addView(xVar, 0, x5.e(-1, i10, 48));
        u9 u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        wVar.addView(u9Var, x5.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            f9Var = new f9(0, user2);
            user = user2;
        } else if (i14 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            f9Var = new f9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            f9Var = new f9(chat);
            user = chat;
        }
        u9Var.e(user, f9Var);
        TextView textView = new TextView(context);
        this.f45811b0 = textView;
        vl.k(21.0f, 1, textView);
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
        wVar.addView(textView, x5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            e6Var2 = e6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            e6Var2 = e6Var;
            textView2.setOnClickListener(new n(context, e6Var, j3, starGift, arrayList));
            z5.b(textView2, 0.02f, 1.5f);
        }
        wVar.addView(textView2, x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        i1 i1Var = new i1(context2, this.currentAccount, e6Var2);
        i1Var.f45902a0 = true;
        e6 e6Var3 = e6Var2;
        i1Var.g(starGift, true, false, false, false, false);
        i1Var.setImageSize(AndroidUtilities.dp(84.0f));
        i1Var.setImageLayer(7);
        i1Var.J.setVisibility(8);
        i1Var.e.g(null);
        i1Var.setRibbonTextOneOf(this.f45813d0.gift.availability_total);
        linearLayout2.addView(i1Var, x5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6.f18998m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, x5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        z zVar = new z(this, context, this.currentAccount, e6Var3);
        this.f45812c0 = zVar;
        zVar.d.removeView(zVar.f45921y);
        zVar.f45902a0 = true;
        zVar.g(starGift, true, false, false, false, false);
        zVar.setImageSize(AndroidUtilities.dp(100.0f));
        zVar.setImageLayer(7);
        zVar.J.setVisibility(8);
        zVar.e.g(null);
        zVar.setRibbonTextOneOf(this.f45813d0.gift.availability_total);
        zVar.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(zVar, x5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = i6.f19215y6;
        textView3.setTextColor(getThemedColor(i15));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = i6.v0(i6.f18834d6, e6Var3);
        int i16 = i6.G6;
        frameLayout.setBackground(i6.b0(dp, i0.a.d(0.2f, v02, i6.v0(i16, e6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(i6.v0(i16, e6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView f7 = org.telegram.ui.Cells.q3.f(frameLayout, textView4, x5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        f7.setTextSize(1, 13.0f);
        f7.setGravity(21);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(i6.v0(i16, e6Var3));
        f7.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(f7, x5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View a0Var = new a0(context, clamp);
        a0Var.setBackground(i6.b0(AndroidUtilities.dp(14.0f), i6.v0(i6.Oh, e6Var3)));
        frameLayout.addView(a0Var, x5.e(-1, -1, 119));
        b0 b0Var = new b0(context, clamp);
        b0Var.setWillNotDraw(false);
        frameLayout.addView(b0Var, x5.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        b0Var.addView(textView5, x5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        b0Var.addView(textView6, x5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.f45813d0;
        if (auction != null && auction.auctionStateActive != null) {
            c90 c90Var = new c90(context, null);
            c90Var.setTextSize(1, 13.0f);
            c90Var.setGravity(17);
            c90Var.setTextColor(getThemedColor(i15));
            c90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f45813d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, e6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            c90Var.setLinkTextColor(i6.v0(i6.J6, e6Var3));
            view = c90Var;
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
                textView7.setTextColor(i6.v0(i16, e6Var3));
                linearLayout.addView(textView7, x5.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
                textView8.setTextSize(1, 14.0f);
                textView8.setTextColor(i6.v0(i16, e6Var3));
                linearLayout.addView(textView8, x5.t(-1, -2, 17, 20, 0, 20, 16));
                uw0 uw0Var = new uw0(context, e6Var3);
                uw0Var.f38186a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                uw0Var.f38187b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                uw0Var.d.setVisibility(8);
                int i17 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = uw0Var.f38188c;
                imageView2.setImageResource(i17);
                imageView2.setColorFilter(i6.v0(i16, e6Var3));
                linearLayout.addView(uw0Var, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                uw0 uw0Var2 = new uw0(context, e6Var3);
                uw0Var2.f38186a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                uw0Var2.f38187b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                uw0Var2.d.setVisibility(8);
                int i18 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = uw0Var2.f38188c;
                imageView3.setImageResource(i18);
                imageView3.setColorFilter(i6.v0(i16, e6Var3));
                linearLayout.addView(uw0Var2, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                uw0 uw0Var3 = new uw0(context, e6Var3);
                uw0Var3.f38186a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                uw0Var3.f38187b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                uw0Var3.d.setVisibility(8);
                int i19 = R.drawable.menu_verification;
                ImageView imageView4 = uw0Var3.f38188c;
                imageView4.setImageResource(i19);
                imageView4.setColorFilter(i6.v0(i16, e6Var3));
                linearLayout.addView(uw0Var3, x5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(yh.z3.g2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 16));
            return;
        }
        linearLayout.addView(linearLayout2, x5.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, x5.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, x5.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, x5.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f45813d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f45813d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f45813d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f45813d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new n(this, j3, context, e6Var3, runnable, 1));
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f45813d0 = auction;
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 15), this.resourcesProvider);
        this.f45814e0 = w51Var;
        w51Var.f29610r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
