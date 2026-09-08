package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw0 extends j71 {
    public final bi.f0 f43593d2;
    public final a71[] f43594e2;
    public final PremiumPreviewFragment f43595f2;

    public zw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, bi.f0 f0Var, a71[] a71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f43595f2 = premiumPreviewFragment;
        this.f43593d2 = f0Var;
        this.f43594e2 = a71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f43593d2.run(l4, num);
        a71 a71Var = this.f43594e2[0];
        if (a71Var != null) {
            this.f43595f2.f33822s0 = null;
            a71Var.dismiss();
        }
    }
}
