package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.u9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y41;
import rh.h8;
import w7.b6;
public final class a extends a51 {
    public static final int f44976b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        b bVar = (b) view;
        u9 u9Var = (u9) b51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) b51Var.G;
        View.OnClickListener onClickListener = b51Var.D;
        int i10 = b.f44987c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new o5(u9Var.f18404c, t6.f21201s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) dd.a0(null, null, 2131750318, u9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) h8.a1(false, i0.a.k(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = dd.a0(null, null, 2131750317, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        xy0 xy0Var = new xy0(bVar.getContext(), bVar.f44988a);
        xy0Var.a(spannableStringBuilder).setFilled(true);
        xy0Var.n(dd.L0(2131750320, null), bVar.f44989b, org.telegram.messenger.o5.o(tL_StarGiftAuctionAcquiredGift.peer), new org.telegram.ui.web.v1(8, bVar, onClickListener));
        xy0Var.g(tL_StarGiftAuctionAcquiredGift.date, dd.L0(2131750324, null));
        xy0Var.e(dd.L0(2131750325, null), spannableStringBuilder2, a02, null, null);
        bVar.addView(xy0Var, b6.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        b bVar = new b(i10, context, p6Var);
        bVar.setLayoutParams(b6.c(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
