package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f41558a;
    public final zf0 f41559b;

    public vf0(zf0 zf0Var, int i10) {
        this.f41558a = i10;
        this.f41559b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41558a) {
            case 0:
                this.f41559b.f43448s0.finishFragment();
                return;
            default:
                this.f41559b.f43448s0.finishFragment();
                return;
        }
    }
}
