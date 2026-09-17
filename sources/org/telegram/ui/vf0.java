package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f41532a;
    public final zf0 f41533b;

    public vf0(zf0 zf0Var, int i10) {
        this.f41532a = i10;
        this.f41533b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41532a) {
            case 0:
                this.f41533b.f43422s0.finishFragment();
                return;
            default:
                this.f41533b.f43422s0.finishFragment();
                return;
        }
    }
}
