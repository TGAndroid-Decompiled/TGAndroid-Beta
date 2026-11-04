package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yb extends g11 {
    public final tb f52246f2;
    public final x01[] f52247g2;
    public final pc f52248h2;

    public yb(pc pcVar, pc pcVar2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, tb tbVar, x01[] x01VarArr) {
        super(pcVar2, activity, true, num, i3, true, e6Var, i10, i11);
        this.f52248h2 = pcVar;
        this.f52246f2 = tbVar;
        this.f52247g2 = x01VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f52248h2.f48510a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        this.f52246f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        x01 x01Var = this.f52247g2[0];
        if (x01Var != null) {
            this.f52248h2.R = null;
            x01Var.dismiss();
        }
    }
}
