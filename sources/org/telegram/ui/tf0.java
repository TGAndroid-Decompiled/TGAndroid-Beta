package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f42180a;
    public final yf0 f42181b;

    public tf0(yf0 yf0Var, int i10) {
        this.f42180a = i10;
        this.f42181b = yf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42180a) {
            case 0:
                this.f42181b.f44382s0.finishFragment();
                return;
            default:
                this.f42181b.f44382s0.finishFragment();
                return;
        }
    }
}
