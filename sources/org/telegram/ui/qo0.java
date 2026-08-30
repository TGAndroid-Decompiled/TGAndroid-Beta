package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class qo0 extends org.telegram.ui.Components.h51 {
    public static final int f37802a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        ro0 ro0Var = (ro0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) i51Var.G;
        kh.y1 y1Var = ro0Var.h;
        kh.u1 u1Var = ro0Var.e;
        ro0Var.f38090a = savedStarGift.gift.f19409id;
        ro0Var.setPadding(0, 0, 0, 0);
        ro0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ro0Var.f38091b = (TL_stars.starGiftAttributeBackdrop) lh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ro0Var.f38092c = (TL_stars.starGiftAttributePattern) lh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        u1Var.d(ro0Var.f38091b);
        u1Var.e(ro0Var.f38092c);
        if (y1Var != null) {
            y1Var.setBackdrop(ro0Var.f38091b);
            String l10 = kh.a2.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            y1Var.f10956b = l10;
            y1Var.f10955a.e(9, l10, false);
        }
        ro0Var.b(i51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ro0(context, f6Var, true);
    }
}
