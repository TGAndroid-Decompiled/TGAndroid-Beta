package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw0 extends k71 {
    public final ai.m0 f45083d2;
    public final b71[] f45084e2;
    public final PremiumPreviewFragment f45085f2;

    public zw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, ai.m0 m0Var, b71[] b71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, e6Var, i11);
        this.f45085f2 = premiumPreviewFragment;
        this.f45083d2 = m0Var;
        this.f45084e2 = b71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f45083d2.run(l4, num);
        b71 b71Var = this.f45084e2[0];
        if (b71Var != null) {
            this.f45085f2.f34150s0 = null;
            b71Var.dismiss();
        }
    }
}
