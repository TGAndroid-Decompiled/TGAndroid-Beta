package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f40840a;
    public final k4 f40841b;

    public v(k4 k4Var, int i10) {
        this.f40840a = i10;
        this.f40841b = k4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40840a) {
            case 0:
                this.f40841b.f42502c.d(true);
                return;
            default:
                this.f40841b.f37548k0 = null;
                return;
        }
    }
}
