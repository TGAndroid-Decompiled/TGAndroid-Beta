package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f40809a;
    public final xf0 f40810b;

    public tf0(xf0 xf0Var, int i10) {
        this.f40809a = i10;
        this.f40810b = xf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40809a) {
            case 0:
                this.f40810b.f42874s0.finishFragment();
                return;
            default:
                this.f40810b.f42874s0.finishFragment();
                return;
        }
    }
}
