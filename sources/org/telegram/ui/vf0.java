package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f42778a;
    public final zf0 f42779b;

    public vf0(zf0 zf0Var, int i10) {
        this.f42778a = i10;
        this.f42779b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42778a) {
            case 0:
                this.f42779b.f44838s0.finishFragment();
                return;
            default:
                this.f42779b.f44838s0.finishFragment();
                return;
        }
    }
}
