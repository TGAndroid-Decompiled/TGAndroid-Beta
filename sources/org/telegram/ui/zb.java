package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zb extends q11 {
    public final ub f54582f2;
    public final h11[] f54583g2;
    public final qc f54584h2;

    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, ub ubVar, h11[] h11VarArr) {
        super(qcVar2, activity, true, num, i7, true, i6Var, i10, i11);
        this.f54584h2 = qcVar;
        this.f54582f2 = ubVar;
        this.f54583g2 = h11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f54584h2.f51401a;
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
        this.f54582f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        h11 h11Var = this.f54583g2[0];
        if (h11Var != null) {
            this.f54584h2.R = null;
            h11Var.dismiss();
        }
    }
}
