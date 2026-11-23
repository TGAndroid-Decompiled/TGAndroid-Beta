package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zb extends s11 {
    public final ub f54516f2;
    public final j11[] f54517g2;
    public final qc f54518h2;

    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, ub ubVar, j11[] j11VarArr) {
        super(qcVar2, activity, true, num, i7, true, h6Var, i10, i11);
        this.f54518h2 = qcVar;
        this.f54516f2 = ubVar;
        this.f54517g2 = j11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f54518h2.f51209a;
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
        this.f54516f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        j11 j11Var = this.f54517g2[0];
        if (j11Var != null) {
            this.f54518h2.R = null;
            j11Var.dismiss();
        }
    }
}
