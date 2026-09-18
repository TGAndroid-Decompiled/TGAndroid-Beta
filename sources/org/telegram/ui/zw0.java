package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw0 extends g71 {
    public final ai.m0 f40579d2;
    public final x61[] f40580e2;
    public final PremiumPreviewFragment f40581f2;

    public zw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, ai.m0 m0Var, x61[] x61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, e6Var, i11);
        this.f40581f2 = premiumPreviewFragment;
        this.f40579d2 = m0Var;
        this.f40580e2 = x61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f40579d2.run(l4, num);
        x61 x61Var = this.f40580e2[0];
        if (x61Var != null) {
            this.f40581f2.f31423s0 = null;
            x61Var.dismiss();
        }
    }
}
