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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.uw0;
import w7.x5;
import w7.z5;
public final class e0 extends eb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f51210f0 = 0;
    public final long X;
    public final y Y;
    public final LinearLayout Z;
    public final z f51211a0;
    public final TextView f51212b0;
    public final b0 f51213c0;
    public GiftAuctionController.Auction f51214d0;
    public c71 f51215e0;

    public e0(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, e6Var);
        int i10;
        j9 j9Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        e6 e6Var2;
        View view;
        long j10 = starGift.f20265id;
        this.X = j10;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(i6.f20887i5), getThemedColor(i6.f20868h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        y yVar = new y(this, context);
        this.Y = yVar;
        linearLayout.addView(yVar);
        ci.d dVar = new ci.d(context, e6Var, true);
        dVar.e();
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i11 = a2.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        a2.leftMargin = i11 + i12;
        a2.rightMargin += i12;
        this.containerView.addView(dVar, a2);
        qm0 qm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f51215e0.N(false);
        if (z10) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        int i14 = i10;
        this.f51214d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        z zVar = new z(this, context, e6Var, new rg.x1(this, 17), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), new ai.e2(26), i14);
        this.f51211a0 = zVar;
        zVar.d(new f4.d(1, 1));
        zVar.setPreviewingAttributes(arrayList);
        zVar.removeView(zVar.O);
        yVar.addView(zVar, 0, x5.e(-1, i14, 48));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        yVar.addView(y9Var, x5.a(90.0f, 0.0f, 42.0f, 0.0f, 0.0f, 90, 49));
        int i15 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i15 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            j9Var = new j9(0, user2);
            user = user2;
        } else if (i15 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            j9Var = new j9(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            j9Var = new j9(chat);
            user = chat;
        }
        y9Var.e(user, j9Var);
        TextView textView = new TextView(context);
        this.f51212b0 = textView;
        bi.k(21.0f, 1, textView);
        if (i15 != 0) {
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
        yVar.addView(textView, x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.0f, -2, 81));
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
            textView2.setOnClickListener(new p(context, e6Var, j3, starGift, arrayList));
            z5.b(textView2, 0.02f, 1.5f);
        }
        yVar.addView(textView2, x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        j1 j1Var = new j1(context2, this.currentAccount, e6Var2);
        j1Var.f51297a0 = true;
        e6 e6Var3 = e6Var2;
        j1Var.g(starGift, true, false, false, false, false);
        j1Var.setImageSize(AndroidUtilities.dp(84.0f));
        j1Var.setImageLayer(7);
        j1Var.J.setVisibility(8);
        j1Var.f51303e.g(null);
        j1Var.setRibbonTextOneOf(this.f51214d0.gift.availability_total);
        linearLayout2.addView(j1Var, x5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context2);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6.f20962m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, x5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        b0 b0Var = new b0(this, context2, this.currentAccount, e6Var3);
        this.f51213c0 = b0Var;
        b0Var.d.removeView(b0Var.f51317y);
        b0Var.f51297a0 = true;
        b0Var.g(starGift, true, false, false, false, false);
        b0Var.setImageSize(AndroidUtilities.dp(100.0f));
        b0Var.setImageLayer(7);
        b0Var.J.setVisibility(8);
        b0Var.f51303e.g(null);
        b0Var.setRibbonTextOneOf(this.f51214d0.gift.availability_total);
        b0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(b0Var, x5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context2);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i16 = i6.f21181y6;
        textView3.setTextColor(getThemedColor(i16));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context2);
        int dp = AndroidUtilities.dp(14.0f);
        int w02 = i6.w0(i6.f20797d6, e6Var3);
        int i17 = i6.G6;
        frameLayout.setBackground(i6.c0(dp, i0.a.d(0.2f, w02, i6.w0(i17, e6Var3))));
        TextView textView4 = new TextView(context2);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(i6.w0(i17, e6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView4, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3), context2);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(i6.w0(i17, e6Var3));
        g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(g10, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        View c0Var = new c0(context2, clamp);
        c0Var.setBackground(i6.c0(AndroidUtilities.dp(14.0f), i6.w0(i6.Oh, e6Var3)));
        frameLayout.addView(c0Var, x5.e(-1, -1, 119));
        d0 d0Var = new d0(context2, clamp);
        d0Var.setWillNotDraw(false);
        frameLayout.addView(d0Var, x5.e(-1, -1, 119));
        TextView textView5 = new TextView(context2);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        d0Var.addView(textView5, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3));
        TextView textView6 = new TextView(context2);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        d0Var.addView(textView6, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        GiftAuctionController.Auction auction = this.f51214d0;
        if (auction != null && auction.auctionStateActive != null) {
            ea0 ea0Var = new ea0(context2, null);
            ea0Var.setTextSize(1, 13.0f);
            ea0Var.setGravity(17);
            ea0Var.setTextColor(getThemedColor(i16));
            ea0Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f51214d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new r(context2, e6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            ea0Var.setLinkTextColor(i6.w0(i6.J6, e6Var3));
            view = ea0Var;
        } else {
            view = null;
        }
        if (z10) {
            if (context2 != null) {
                TextView textView7 = new TextView(context2);
                textView7.setTypeface(AndroidUtilities.bold());
                textView7.setGravity(17);
                textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
                textView7.setTextSize(1, 20.0f);
                textView7.setTextColor(i6.w0(i17, e6Var3));
                linearLayout.addView(textView7, x5.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context2);
                textView8.setGravity(17);
                bi.j(14.0f, R.string.GiftAuctionWearInfoText, 1, textView8);
                textView8.setTextColor(i6.w0(i17, e6Var3));
                linearLayout.addView(textView8, x5.t(-1, -2, 17, 20, 0, 20, 16));
                uw0 uw0Var = new uw0(context2, e6Var3);
                uw0Var.f42571a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
                uw0Var.f42572b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
                uw0Var.d.setVisibility(8);
                int i18 = R.drawable.msg_emoji_gem;
                ImageView imageView2 = uw0Var.f42573c;
                imageView2.setImageResource(i18);
                imageView2.setColorFilter(i6.w0(i17, e6Var3));
                linearLayout.addView(uw0Var, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                uw0 uw0Var2 = new uw0(context2, e6Var3);
                uw0Var2.f42571a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
                uw0Var2.f42572b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
                uw0Var2.d.setVisibility(8);
                int i19 = R.drawable.menu_feature_cover_24;
                ImageView imageView3 = uw0Var2.f42573c;
                imageView3.setImageResource(i19);
                imageView3.setColorFilter(i6.w0(i17, e6Var3));
                linearLayout.addView(uw0Var2, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                uw0 uw0Var3 = new uw0(context2, e6Var3);
                uw0Var3.f42571a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
                uw0Var3.f42572b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
                uw0Var3.d.setVisibility(8);
                int i20 = R.drawable.menu_verification;
                ImageView imageView4 = uw0Var3.f42573c;
                imageView4.setImageResource(i20);
                imageView4.setColorFilter(i6.w0(i17, e6Var3));
                linearLayout.addView(uw0Var3, x5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.g(yh.s3.i2(LocaleController.getString(R.string.Understood)), false, true);
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
        GiftAuctionController.Auction auction2 = this.f51214d0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f51214d0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f51214d0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f51214d0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new p(this, j3, context2, e6Var3, runnable, 1));
    }

    @Override
    public final CharSequence B() {
        return "";
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f51214d0 = auction;
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 15), this.resourcesProvider);
        this.f51215e0 = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
