package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vv0 extends d61 {
    public final bh.v Z1;
    public final u51[] a2;
    public final PremiumPreviewFragment f43788b2;

    public vv0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, bh.v vVar, u51[] u51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, c6Var, i11);
        this.f43788b2 = premiumPreviewFragment;
        this.Z1 = vVar;
        this.a2 = u51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(l10, num);
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            this.f43788b2.f35924o0 = null;
            u51Var.dismiss();
        }
    }
}
