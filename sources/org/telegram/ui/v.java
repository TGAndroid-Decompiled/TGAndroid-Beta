package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f41372a;
    public final i4 f41373b;

    public v(i4 i4Var, int i10) {
        this.f41372a = i10;
        this.f41373b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41372a) {
            case 0:
                this.f41373b.f41435c.d(true);
                return;
            default:
                this.f41373b.f37223k0 = null;
                return;
        }
    }
}
