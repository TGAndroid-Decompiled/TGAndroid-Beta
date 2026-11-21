package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class tl0 extends org.telegram.ui.Components.n41 {
    public static final int f52344b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        ul0 ul0Var = (ul0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) o41Var.H;
        bi.h3 h3Var = ul0Var.h;
        bi.c3 c3Var = ul0Var.f52596e;
        ul0Var.f52593a = savedStarGift.gift.f28660id;
        ul0Var.setPadding(0, 0, 0, 0);
        ul0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ul0Var.f52594b = (TL_stars.starGiftAttributeBackdrop) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ul0Var.f52595c = (TL_stars.starGiftAttributePattern) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        c3Var.d(ul0Var.f52594b);
        c3Var.e(ul0Var.f52595c);
        if (h3Var != null) {
            h3Var.setBackdrop(ul0Var.f52594b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h3Var.f3696b = l10;
            h3Var.f3695a.g(9, l10, false);
        }
        ul0Var.b(o41Var.f38091e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ul0(context, h6Var, true);
    }
}
