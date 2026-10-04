package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tw0 extends c71 {
    public final ai.m0 f40976d2;
    public final t61[] f40977e2;
    public final PremiumPreviewFragment f40978f2;

    public tw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.m0 m0Var, t61[] t61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f40978f2 = premiumPreviewFragment;
        this.f40976d2 = m0Var;
        this.f40977e2 = t61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f40976d2.run(l4, num);
        t61 t61Var = this.f40977e2[0];
        if (t61Var != null) {
            this.f40978f2.f34141s0 = null;
            t61Var.dismiss();
        }
    }
}
