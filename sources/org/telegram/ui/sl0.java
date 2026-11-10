package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class sl0 extends org.telegram.ui.Components.w31 {
    public static final int f49878b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        tl0 tl0Var = (tl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x31Var.G;
        zh.z0 z0Var = tl0Var.h;
        zh.v0 v0Var = tl0Var.f50300e;
        tl0Var.f50297a = savedStarGift.gift.f27189id;
        tl0Var.setPadding(0, 0, 0, 0);
        tl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        tl0Var.f50298b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        tl0Var.f50299c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v0Var.d(tl0Var.f50298b);
        v0Var.e(tl0Var.f50299c);
        if (z0Var != null) {
            z0Var.setBackdrop(tl0Var.f50298b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z0Var.f60650b = m10;
            z0Var.f60649a.f(9, m10, false);
        }
        tl0Var.b(x31Var.f40150e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new tl0(context, h6Var, true);
    }
}
