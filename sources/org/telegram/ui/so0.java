package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class so0 extends org.telegram.ui.Components.l61 {
    public static final int f41779a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        to0 to0Var = (to0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m61Var.G;
        yh.h1 h1Var = to0Var.h;
        yh.d1 d1Var = to0Var.e;
        to0Var.f42051a = savedStarGift.gift.f20567id;
        to0Var.setPadding(0, 0, 0, 0);
        to0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        to0Var.f42052b = (TL_stars.starGiftAttributeBackdrop) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        to0Var.f42053c = (TL_stars.starGiftAttributePattern) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(to0Var.f42052b);
        d1Var.e(to0Var.f42053c);
        if (h1Var != null) {
            h1Var.setBackdrop(to0Var.f42052b);
            String m10 = i2.o1.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.f50745b = m10;
            h1Var.f50744a.f(9, m10, false);
        }
        to0Var.b(m61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new to0(context, g6Var, true);
    }
}
