package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zl0;
import w7.y5;
import yh.w7;
public final class a extends x51 {
    public static final int f46176a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) y51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) y51Var.G;
        View.OnClickListener onClickListener = y51Var.D;
        int i10 = b.f46187c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new z5(auction.giftDocumentId, h6.f19348s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) w7.X0(false, org.telegram.messenger.f0.h(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        c01 c01Var = new c01(bVar.getContext(), bVar.f46188a);
        c01Var.a(spannableStringBuilder).setFilled(true);
        c01Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.f46189b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new u2.p0(8, bVar, onClickListener));
        c01Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        c01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(c01Var, y5.c(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        b bVar = new b(context, i10, d6Var);
        bVar.setLayoutParams(y5.c(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
