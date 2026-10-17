package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class qo0 extends org.telegram.ui.Components.e61 {
    public static final int f40480a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        ro0 ro0Var = (ro0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f61Var.G;
        yh.i1 i1Var = ro0Var.h;
        yh.e1 e1Var = ro0Var.e;
        ro0Var.f40777a = savedStarGift.gift.f20496id;
        ro0Var.setPadding(0, 0, 0, 0);
        ro0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ro0Var.f40778b = (TL_stars.starGiftAttributeBackdrop) ai.fa.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ro0Var.f40779c = (TL_stars.starGiftAttributePattern) ai.fa.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(ro0Var.f40778b);
        e1Var.e(ro0Var.f40779c);
        if (i1Var != null) {
            i1Var.setBackdrop(ro0Var.f40778b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.f50318b = h;
            i1Var.f50317a.f(9, h, false);
        }
        ro0Var.b(f61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ro0(context, d6Var, true);
    }
}
