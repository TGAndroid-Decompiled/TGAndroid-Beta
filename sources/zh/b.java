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
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.sx0;
public final class b extends q31 {
    public static final int f60095b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        c cVar = (c) view;
        s9 s9Var = (s9) r31Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        int i7 = c.f60116c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new r5(s9Var.f25432c, k6.f28123s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) hd.a0(null, null, 2131750308, s9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) dd.a1(false, jg.g.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = hd.a0(null, null, 2131750307, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        sx0 sx0Var = new sx0(cVar.getContext(), cVar.f60117a);
        sx0Var.a(spannableStringBuilder).setFilled(true);
        sx0Var.n(hd.M0(2131750310, null), cVar.f60118b, m5.o(tL_StarGiftAuctionAcquiredGift.peer), new wi.q(10, cVar, onClickListener));
        sx0Var.g(tL_StarGiftAuctionAcquiredGift.date, hd.M0(2131750314, null));
        sx0Var.e(hd.M0(2131750315, null), spannableStringBuilder2, a02, null, null);
        cVar.addView(sx0Var, ha.c(-2.0f, -1));
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
