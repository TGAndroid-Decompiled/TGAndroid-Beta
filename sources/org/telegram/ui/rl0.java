package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class rl0 extends org.telegram.ui.Components.a41 {
    public static final int f50968b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        sl0 sl0Var = (sl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) b41Var.G;
        bi.j2 j2Var = sl0Var.h;
        bi.e2 e2Var = sl0Var.f51240e;
        sl0Var.f51237a = savedStarGift.gift.f28280id;
        sl0Var.setPadding(0, 0, 0, 0);
        sl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        sl0Var.f51238b = (TL_stars.starGiftAttributeBackdrop) di.u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        sl0Var.f51239c = (TL_stars.starGiftAttributePattern) di.u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e2Var.d(sl0Var.f51238b);
        e2Var.e(sl0Var.f51239c);
        if (j2Var != null) {
            j2Var.setBackdrop(sl0Var.f51238b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j2Var.f3628b = l10;
            j2Var.f3627a.f(9, l10, false);
        }
        sl0Var.b(b41Var.f33178e, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new sl0(context, e6Var, true);
    }
}
