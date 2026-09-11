package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f41531a;
    public final zf0 f41532b;

    public vf0(zf0 zf0Var, int i10) {
        this.f41531a = i10;
        this.f41532b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41531a) {
            case 0:
                this.f41532b.f43421s0.finishFragment();
                return;
            default:
                this.f41532b.f43421s0.finishFragment();
                return;
        }
    }
}
