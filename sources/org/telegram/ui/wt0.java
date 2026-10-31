package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wt0 extends i31 {
    public final ih.s f43366e2;
    public final z21[] f43367f2;
    public final PremiumPreviewFragment f43368g2;

    public wt0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, ih.s sVar, z21[] z21VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, p6Var, i11);
        this.f43368g2 = premiumPreviewFragment;
        this.f43366e2 = sVar;
        this.f43367f2 = z21VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f43366e2.a(l4, num);
        z21 z21Var = this.f43367f2[0];
        if (z21Var != null) {
            this.f43368g2.f33715u0 = null;
            z21Var.dismiss();
        }
    }
}
