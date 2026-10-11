package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yw0 extends j71 {
    public final ai.m0 f44516d2;
    public final a71[] f44517e2;
    public final PremiumPreviewFragment f44518f2;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.m0 m0Var, a71[] a71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f44518f2 = premiumPreviewFragment;
        this.f44516d2 = m0Var;
        this.f44517e2 = a71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f44516d2.run(l4, num);
        a71 a71Var = this.f44517e2[0];
        if (a71Var != null) {
            this.f44518f2.f34178s0 = null;
            a71Var.dismiss();
        }
    }
}
