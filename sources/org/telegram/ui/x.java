package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f39823a;
    public final l4 f39824b;

    public x(l4 l4Var, int i10) {
        this.f39823a = i10;
        this.f39824b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39823a) {
            case 0:
                this.f39824b.f36477c.d(true);
                return;
            default:
                this.f39824b.f35936h0 = null;
                return;
        }
    }
}
