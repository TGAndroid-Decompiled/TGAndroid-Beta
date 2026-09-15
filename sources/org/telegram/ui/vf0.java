package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f38590a;
    public final zf0 f38591b;

    public vf0(zf0 zf0Var, int i10) {
        this.f38590a = i10;
        this.f38591b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38590a) {
            case 0:
                this.f38591b.f40185s0.finishFragment();
                return;
            default:
                this.f38591b.f40185s0.finishFragment();
                return;
        }
    }
}
