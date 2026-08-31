package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class so0 extends org.telegram.ui.Components.i51 {
    public static final int f41333a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        to0 to0Var = (to0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) j51Var.G;
        lh.y1 y1Var = to0Var.h;
        lh.u1 u1Var = to0Var.f41684e;
        to0Var.f41681a = savedStarGift.gift.f21070id;
        to0Var.setPadding(0, 0, 0, 0);
        to0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        to0Var.f41682b = (TL_stars.starGiftAttributeBackdrop) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        to0Var.f41683c = (TL_stars.starGiftAttributePattern) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        u1Var.d(to0Var.f41682b);
        u1Var.e(to0Var.f41683c);
        if (y1Var != null) {
            y1Var.setBackdrop(to0Var.f41682b);
            String l10 = l.d.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            y1Var.f13117b = l10;
            y1Var.f13116a.e(9, l10, false);
        }
        to0Var.b(j51Var.f28008e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new to0(context, g6Var, true);
    }
}
