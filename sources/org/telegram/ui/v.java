package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f40530a;
    public final k4 f40531b;

    public v(k4 k4Var, int i10) {
        this.f40530a = i10;
        this.f40531b = k4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40530a) {
            case 0:
                this.f40531b.f42176c.d(true);
                return;
            default:
                this.f40531b.f37269k0 = null;
                return;
        }
    }
}
