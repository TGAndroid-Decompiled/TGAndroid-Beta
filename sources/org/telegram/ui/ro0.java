package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ro0 extends org.telegram.ui.Components.k61 {
    public static final int f41194a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        so0 so0Var = (so0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l61Var.G;
        yh.h1 h1Var = so0Var.h;
        yh.d1 d1Var = so0Var.e;
        so0Var.f41775a = savedStarGift.gift.f20568id;
        so0Var.setPadding(0, 0, 0, 0);
        so0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        so0Var.f41776b = (TL_stars.starGiftAttributeBackdrop) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        so0Var.f41777c = (TL_stars.starGiftAttributePattern) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(so0Var.f41776b);
        d1Var.e(so0Var.f41777c);
        if (h1Var != null) {
            h1Var.setBackdrop(so0Var.f41776b);
            String m10 = i2.o1.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.f50744b = m10;
            h1Var.f50743a.f(9, m10, false);
        }
        so0Var.b(l61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new so0(context, g6Var, true);
    }
}
