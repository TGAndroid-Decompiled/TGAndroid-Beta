package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f40870a;
    public final xf0 f40871b;

    public tf0(xf0 xf0Var, int i10) {
        this.f40870a = i10;
        this.f40871b = xf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40870a) {
            case 0:
                this.f40871b.f42934s0.finishFragment();
                return;
            default:
                this.f40871b.f42934s0.finishFragment();
                return;
        }
    }
}
