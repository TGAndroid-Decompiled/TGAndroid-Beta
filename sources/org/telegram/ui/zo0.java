package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 extends org.telegram.ui.Components.x51 {
    public static final int f40660a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        ap0 ap0Var = (ap0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y51Var.G;
        xh.k1 k1Var = ap0Var.h;
        xh.f1 f1Var = ap0Var.e;
        ap0Var.f32281a = savedStarGift.gift.f18577id;
        ap0Var.setPadding(0, 0, 0, 0);
        ap0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ap0Var.f32282b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ap0Var.f32283c = (TL_stars.starGiftAttributePattern) yh.s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        f1Var.d(ap0Var.f32282b);
        f1Var.e(ap0Var.f32283c);
        if (k1Var != null) {
            k1Var.setBackdrop(ap0Var.f32282b);
            String h = org.telegram.messenger.f0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            k1Var.f46359b = h;
            k1Var.f46358a.e(9, h, false);
        }
        ap0Var.b(y51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ap0(context, d6Var, true);
    }
}
