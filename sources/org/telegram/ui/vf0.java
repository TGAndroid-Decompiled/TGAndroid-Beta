package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f38526a;
    public final zf0 f38527b;

    public vf0(zf0 zf0Var, int i10) {
        this.f38526a = i10;
        this.f38527b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38526a) {
            case 0:
                this.f38527b.f40191s0.finishFragment();
                return;
            default:
                this.f38527b.f40191s0.finishFragment();
                return;
        }
    }
}
