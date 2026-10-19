package yh;

import ai.md;
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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.t61;
import w7.z5;
public final class a extends f61 {
    public static final int f50165a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) g61Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) g61Var.G;
        View.OnClickListener onClickListener = g61Var.D;
        int i10 = b.f50169c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new a6(auction.giftDocumentId, h6.f21260s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) md.Y0(false, org.telegram.messenger.g0.h(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        k01 k01Var = new k01(bVar.getContext(), bVar.f50170a);
        k01Var.a(spannableStringBuilder).setFilled(true);
        k01Var.n(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.f50171b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new uf.c(15, bVar, onClickListener));
        k01Var.g(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        k01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(k01Var, z5.c(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        b bVar = new b(context, i10, d6Var);
        bVar.setLayoutParams(z5.c(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
