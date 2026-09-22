package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw0 extends h71 {
    public final ai.m0 f40319d2;
    public final y61[] f40320e2;
    public final PremiumPreviewFragment f40321f2;

    public zw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, ai.m0 m0Var, y61[] y61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, e6Var, i11);
        this.f40321f2 = premiumPreviewFragment;
        this.f40319d2 = m0Var;
        this.f40320e2 = y61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f40319d2.run(l4, num);
        y61 y61Var = this.f40320e2[0];
        if (y61Var != null) {
            this.f40321f2.f31176s0 = null;
            y61Var.dismiss();
        }
    }
}
