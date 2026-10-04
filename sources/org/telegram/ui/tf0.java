package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f40816a;
    public final xf0 f40817b;

    public tf0(xf0 xf0Var, int i10) {
        this.f40816a = i10;
        this.f40817b = xf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40816a) {
            case 0:
                this.f40817b.f42882s0.finishFragment();
                return;
            default:
                this.f40817b.f42882s0.finishFragment();
                return;
        }
    }
}
