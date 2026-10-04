package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f40810a;
    public final xf0 f40811b;

    public tf0(xf0 xf0Var, int i10) {
        this.f40810a = i10;
        this.f40811b = xf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40810a) {
            case 0:
                this.f40811b.f42875s0.finishFragment();
                return;
            default:
                this.f40811b.f42875s0.finishFragment();
                return;
        }
    }
}
