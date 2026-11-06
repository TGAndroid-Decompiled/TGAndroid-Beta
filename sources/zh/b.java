package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import bi.dd;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.s9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class b extends w31 {
    public static final int f60119b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        c cVar = (c) view;
        s9 s9Var = (s9) x31Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        int i7 = c.f60140c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new r5(s9Var.f25440c, k6.f28124s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) hd.a0(null, null, 2131750308, s9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) dd.a1(false, jg.g.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = hd.a0(null, null, 2131750307, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        tx0 tx0Var = new tx0(cVar.getContext(), cVar.f60141a);
        tx0Var.a(spannableStringBuilder).setFilled(true);
        tx0Var.n(hd.M0(2131750310, null), cVar.f60142b, m5.o(tL_StarGiftAuctionAcquiredGift.peer), new wi.q(10, cVar, onClickListener));
        tx0Var.g(tL_StarGiftAuctionAcquiredGift.date, hd.M0(2131750314, null));
        tx0Var.e(hd.M0(2131750315, null), spannableStringBuilder2, a02, null, null);
        cVar.addView(tx0Var, ha.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        c cVar = new c(i7, context, f6Var);
        cVar.setLayoutParams(ha.c(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
