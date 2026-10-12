package org.telegram.ui;

import android.content.DialogInterface;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f42188a;
    public final Object f42189b;

    public tg(Object obj, int i10) {
        this.f42188a = i10;
        this.f42189b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42188a) {
            case 0:
                eo eoVar = (eo) this.f42189b;
                eoVar.f37216b9 = true;
                eoVar.Z8 = 0;
                eoVar.f37401qb = 0;
                eoVar.N4 = 0;
                eoVar.w9();
                eoVar.Rb(false);
                return;
            case 1:
                xo xoVar = (xo) this.f42189b;
                xoVar.M0 = false;
                xoVar.f44054b = null;
                xoVar.N0 = false;
                return;
            case 2:
                ((xp) this.f42189b).f44137n = null;
                return;
            default:
                ((fc0) this.f42189b).b();
                return;
        }
    }
}
