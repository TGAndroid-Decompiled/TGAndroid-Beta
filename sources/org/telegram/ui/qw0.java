package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qw0 extends a71 {
    public final ai.m0 f36988d2;
    public final r61[] f36989e2;
    public final PremiumPreviewFragment f36990f2;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.m0 m0Var, r61[] r61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f36990f2 = premiumPreviewFragment;
        this.f36988d2 = m0Var;
        this.f36989e2 = r61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f36988d2.run(l4, num);
        r61 r61Var = this.f36989e2[0];
        if (r61Var != null) {
            this.f36990f2.f31451s0 = null;
            r61Var.dismiss();
        }
    }
}
