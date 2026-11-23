package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zb extends r11 {
    public final ub f54479f2;
    public final i11[] f54480g2;
    public final qc f54481h2;

    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, ub ubVar, i11[] i11VarArr) {
        super(qcVar2, activity, true, num, i7, true, h6Var, i10, i11);
        this.f54481h2 = qcVar;
        this.f54479f2 = ubVar;
        this.f54480g2 = i11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f54481h2.f51140a;
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
        this.f54479f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        i11 i11Var = this.f54480g2[0];
        if (i11Var != null) {
            this.f54481h2.R = null;
            i11Var.dismiss();
        }
    }
}
