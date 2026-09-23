package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sw0 extends z61 {
    public final ai.m0 f37451d2;
    public final q61[] f37452e2;
    public final PremiumPreviewFragment f37453f2;

    public sw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.m0 m0Var, q61[] q61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f37453f2 = premiumPreviewFragment;
        this.f37451d2 = m0Var;
        this.f37452e2 = q61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f37451d2.run(l4, num);
        q61 q61Var = this.f37452e2[0];
        if (q61Var != null) {
            this.f37453f2.f31150s0 = null;
            q61Var.dismiss();
        }
    }
}
