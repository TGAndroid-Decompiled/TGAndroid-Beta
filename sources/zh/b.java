package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import bi.dd;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.s9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class b extends x31 {
    public static final int f60217b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        c cVar = (c) view;
        s9 s9Var = (s9) y31Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) y31Var.G;
        View.OnClickListener onClickListener = y31Var.D;
        int i7 = c.f60246c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new r5(s9Var.f25436c, l6.f28140s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) id.a0(null, null, 2131750309, s9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) dd.a1(false, jg.g.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = id.a0(null, null, 2131750308, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        ux0 ux0Var = new ux0(cVar.getContext(), cVar.f60247a);
        ux0Var.a(spannableStringBuilder).setFilled(true);
        ux0Var.n(id.M0(2131750311, null), cVar.f60248b, m5.o(tL_StarGiftAuctionAcquiredGift.peer), new yf.b(6, cVar, onClickListener));
        ux0Var.g(tL_StarGiftAuctionAcquiredGift.date, id.M0(2131750315, null));
        ux0Var.e(id.M0(2131750316, null), spannableStringBuilder2, a02, null, null);
        cVar.addView(ux0Var, ha.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        c cVar = new c(i7, context, g6Var);
        cVar.setLayoutParams(ha.c(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
