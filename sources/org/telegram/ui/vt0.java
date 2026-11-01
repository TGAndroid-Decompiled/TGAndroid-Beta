package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vt0 extends g31 {
    public final ih.s f42604e2;
    public final x21[] f42605f2;
    public final PremiumPreviewFragment f42606g2;

    public vt0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, ih.s sVar, x21[] x21VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, p6Var, i11);
        this.f42606g2 = premiumPreviewFragment;
        this.f42604e2 = sVar;
        this.f42605f2 = x21VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f42604e2.a(l4, num);
        x21 x21Var = this.f42605f2[0];
        if (x21Var != null) {
            this.f42606g2.f33722u0 = null;
            x21Var.dismiss();
        }
    }
}
