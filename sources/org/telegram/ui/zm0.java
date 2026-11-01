package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class zm0 extends org.telegram.ui.Components.a51 {
    public static final int f44022b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        an0 an0Var = (an0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) b51Var.G;
        ph.d1 d1Var = an0Var.h;
        ph.z0 z0Var = an0Var.e;
        an0Var.f35810a = savedStarGift.gift.f20022id;
        an0Var.setPadding(0, 0, 0, 0);
        an0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        an0Var.f35811b = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        an0Var.f35812c = (TL_stars.starGiftAttributePattern) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        z0Var.d(an0Var.f35811b);
        z0Var.e(an0Var.f35812c);
        if (d1Var != null) {
            d1Var.setBackdrop(an0Var.f35811b);
            String k10 = i0.a.k(savedStarGift.gift.num, ',', new StringBuilder("#"));
            d1Var.f45032b = k10;
            d1Var.f45031a.f(9, k10, false);
        }
        an0Var.b(b51Var.e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new an0(context, p6Var, true);
    }
}
