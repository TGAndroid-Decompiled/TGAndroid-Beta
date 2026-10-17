package yh;

import ai.ld;
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
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.s61;
import w7.z5;
public final class a extends e61 {
    public static final int f50185a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) f61Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) f61Var.G;
        View.OnClickListener onClickListener = f61Var.D;
        int i10 = b.f50199c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new a6(auction.giftDocumentId, h6.f21259s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) ld.Y0(false, org.telegram.messenger.q.h(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        j01 j01Var = new j01(bVar.getContext(), bVar.f50200a);
        j01Var.a(spannableStringBuilder).setFilled(true);
        j01Var.n(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.f50201b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new uf.c(15, bVar, onClickListener));
        j01Var.g(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        j01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(j01Var, z5.d(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        b bVar = new b(context, i10, d6Var);
        bVar.setLayoutParams(z5.d(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
