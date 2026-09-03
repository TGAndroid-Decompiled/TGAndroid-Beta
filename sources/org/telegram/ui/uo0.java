package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 extends org.telegram.ui.Components.g51 {
    public static final int f41881a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        vo0 vo0Var = (vo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) h51Var.G;
        lh.y1 y1Var = vo0Var.h;
        lh.u1 u1Var = vo0Var.f42189e;
        vo0Var.f42186a = savedStarGift.gift.f21072id;
        vo0Var.setPadding(0, 0, 0, 0);
        vo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        vo0Var.f42187b = (TL_stars.starGiftAttributeBackdrop) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        vo0Var.f42188c = (TL_stars.starGiftAttributePattern) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        u1Var.d(vo0Var.f42187b);
        u1Var.e(vo0Var.f42188c);
        if (y1Var != null) {
            y1Var.setBackdrop(vo0Var.f42187b);
            String l10 = l.d.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            y1Var.f13119b = l10;
            y1Var.f13118a.e(9, l10, false);
        }
        vo0Var.b(h51Var.f27369e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new vo0(context, g6Var, true);
    }
}
