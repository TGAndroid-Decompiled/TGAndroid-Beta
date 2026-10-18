package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ro0 extends org.telegram.ui.Components.e61 {
    public static final int f40801a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        so0 so0Var = (so0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f61Var.G;
        yh.i1 i1Var = so0Var.h;
        yh.e1 e1Var = so0Var.e;
        so0Var.f41495a = savedStarGift.gift.f20503id;
        so0Var.setPadding(0, 0, 0, 0);
        so0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        so0Var.f41496b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        so0Var.f41497c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(so0Var.f41496b);
        e1Var.e(so0Var.f41497c);
        if (i1Var != null) {
            i1Var.setBackdrop(so0Var.f41496b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f50343b = h;
            i1Var.f50342a.f(9, h, false);
        }
        so0Var.b(f61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new so0(context, d6Var, true);
    }
}
