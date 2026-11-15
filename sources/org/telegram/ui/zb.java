package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zb extends n11 {
    public final ub f53887f2;
    public final e11[] f53888g2;
    public final qc f53889h2;

    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, ub ubVar, e11[] e11VarArr) {
        super(qcVar2, activity, true, num, i7, true, e6Var, i10, i11);
        this.f53889h2 = qcVar;
        this.f53887f2 = ubVar;
        this.f53888g2 = e11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f53889h2.f50543a;
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
        this.f53887f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        e11 e11Var = this.f53888g2[0];
        if (e11Var != null) {
            this.f53889h2.R = null;
            e11Var.dismiss();
        }
    }
}
