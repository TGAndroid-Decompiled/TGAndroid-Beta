package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f37550a;
    public final zf0 f37551b;

    public vf0(zf0 zf0Var, int i10) {
        this.f37550a = i10;
        this.f37551b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37550a) {
            case 0:
                this.f37551b.f39305s0.finishFragment();
                return;
            default:
                this.f37551b.f39305s0.finishFragment();
                return;
        }
    }
}
