package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f42841a;
    public final zf0 f42842b;

    public vf0(zf0 zf0Var, int i10) {
        this.f42841a = i10;
        this.f42842b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42841a) {
            case 0:
                this.f42842b.f44610s0.finishFragment();
                return;
            default:
                this.f42842b.f44610s0.finishFragment();
                return;
        }
    }
}
