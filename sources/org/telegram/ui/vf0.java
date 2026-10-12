package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f42776a;
    public final zf0 f42777b;

    public vf0(zf0 zf0Var, int i10) {
        this.f42776a = i10;
        this.f42777b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42776a) {
            case 0:
                this.f42777b.f44833s0.finishFragment();
                return;
            default:
                this.f42777b.f44833s0.finishFragment();
                return;
        }
    }
}
