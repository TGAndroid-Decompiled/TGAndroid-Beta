package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import bi.dd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w01;
public final class a extends s61 {
    public static final int f52890a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) t61Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) t61Var.G;
        View.OnClickListener onClickListener = t61Var.D;
        int i10 = b.f52900c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new c6(auction.giftDocumentId, y6.f23628s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) dd.W0(false, org.telegram.messenger.t.i(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        w01 w01Var = new w01(bVar.getContext(), bVar.f52901a);
        w01Var.a(spannableStringBuilder).setFilled(true);
        w01Var.n(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.f52902b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new vi.i0(8, bVar, onClickListener));
        w01Var.g(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        w01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(w01Var, gb1.g(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        b bVar = new b(context, i10, u6Var);
        bVar.setLayoutParams(gb1.g(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
