package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38371a;
    public final h4 f38372b;

    public v(h4 h4Var, int i10) {
        this.f38371a = i10;
        this.f38372b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38371a) {
            case 0:
                this.f38372b.f37981c.d(true);
                return;
            default:
                this.f38372b.f34105k0 = null;
                return;
        }
    }
}
