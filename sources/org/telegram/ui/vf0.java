package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f42843a;
    public final zf0 f42844b;

    public vf0(zf0 zf0Var, int i10) {
        this.f42843a = i10;
        this.f42844b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42843a) {
            case 0:
                this.f42844b.f44612s0.finishFragment();
                return;
            default:
                this.f42844b.f44612s0.finishFragment();
                return;
        }
    }
}
