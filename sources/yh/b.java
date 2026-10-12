package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.z61;
import w7.a6;
import zh.p7;
public final class b extends k61 {
    public static final int f48796a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        c cVar = (c) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) l61Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) l61Var.G;
        View.OnClickListener onClickListener = l61Var.D;
        int i10 = c.f48801c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new b6(auction.giftDocumentId, g6.f20174s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) p7.Y0(false, org.telegram.messenger.q.i(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        n01 n01Var = new n01(cVar.getContext(), cVar.f48802a);
        n01Var.a(spannableStringBuilder).setFilled(true);
        n01Var.m(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), cVar.f48803b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new s9.b(24, cVar, onClickListener));
        n01Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        n01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        cVar.addView(n01Var, a6.d(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        c cVar = new c(context, i10, c6Var);
        cVar.setLayoutParams(a6.d(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
