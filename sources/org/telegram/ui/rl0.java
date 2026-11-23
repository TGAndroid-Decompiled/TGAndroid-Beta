package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class rl0 extends org.telegram.ui.Components.m41 {
    public static final int f51745b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        sl0 sl0Var = (sl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n41Var.H;
        bi.j3 j3Var = sl0Var.h;
        bi.e3 e3Var = sl0Var.f52107e;
        sl0Var.f52104a = savedStarGift.gift.f28721id;
        sl0Var.setPadding(0, 0, 0, 0);
        sl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        sl0Var.f52105b = (TL_stars.starGiftAttributeBackdrop) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        sl0Var.f52106c = (TL_stars.starGiftAttributePattern) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e3Var.d(sl0Var.f52105b);
        e3Var.e(sl0Var.f52106c);
        if (j3Var != null) {
            j3Var.setBackdrop(sl0Var.f52105b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j3Var.f3716b = l10;
            j3Var.f3715a.g(9, l10, false);
        }
        sl0Var.b(n41Var.f37648e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new sl0(context, i6Var, true);
    }
}
