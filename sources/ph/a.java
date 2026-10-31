package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.t9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;
import rh.h8;
import w7.b6;
public final class a extends z41 {
    public static final int f44965b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        b bVar = (b) view;
        t9 t9Var = (t9) a51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) a51Var.G;
        View.OnClickListener onClickListener = a51Var.D;
        int i10 = b.f44976c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new o5(t9Var.f18035c, t6.f21200s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) cd.a0(null, null, 2131750318, t9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) h8.Z0(false, i0.a.k(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = cd.a0(null, null, 2131750317, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        wy0 wy0Var = new wy0(bVar.getContext(), bVar.f44977a);
        wy0Var.a(spannableStringBuilder).setFilled(true);
        wy0Var.n(cd.L0(2131750320, null), bVar.f44978b, org.telegram.messenger.o5.o(tL_StarGiftAuctionAcquiredGift.peer), new org.telegram.ui.web.v1(7, bVar, onClickListener));
        wy0Var.g(tL_StarGiftAuctionAcquiredGift.date, cd.L0(2131750324, null));
        wy0Var.e(cd.L0(2131750325, null), spannableStringBuilder2, a02, null, null);
        bVar.addView(wy0Var, b6.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        b bVar = new b(i10, context, p6Var);
        bVar.setLayoutParams(b6.c(-2.0f, -1));
        return bVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
