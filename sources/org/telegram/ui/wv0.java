package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class wv0 extends a61 {
    public final cg.u0 Z1;
    public final r51[] a2;

    public final PremiumPreviewFragment f44201b2;

    public wv0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, cg.u0 u0Var, r51[] r51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, c6Var, i11);
        this.f44201b2 = premiumPreviewFragment;
        this.Z1 = u0Var;
        this.a2 = r51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(l10, num);
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            this.f44201b2.f35861o0 = null;
            r51Var.dismiss();
        }
    }
}
