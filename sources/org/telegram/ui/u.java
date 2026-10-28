package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f43811a;
    public final j4 f43812b;

    public u(j4 j4Var, int i10) {
        this.f43811a = i10;
        this.f43812b = j4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43811a) {
            case 0:
                this.f43812b.f40450c.d(true);
                return;
            default:
                this.f43812b.f40405k0 = null;
                return;
        }
    }
}
