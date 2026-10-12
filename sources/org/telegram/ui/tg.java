package org.telegram.ui;

import android.content.DialogInterface;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f42186a;
    public final Object f42187b;

    public tg(Object obj, int i10) {
        this.f42186a = i10;
        this.f42187b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42186a) {
            case 0:
                eo eoVar = (eo) this.f42187b;
                eoVar.f37211b9 = true;
                eoVar.Z8 = 0;
                eoVar.f37396qb = 0;
                eoVar.N4 = 0;
                eoVar.w9();
                eoVar.Rb(false);
                return;
            case 1:
                xo xoVar = (xo) this.f42187b;
                xoVar.M0 = false;
                xoVar.f44049b = null;
                xoVar.N0 = false;
                return;
            case 2:
                ((xp) this.f42187b).f44132n = null;
                return;
            default:
                ((fc0) this.f42187b).b();
                return;
        }
    }
}
