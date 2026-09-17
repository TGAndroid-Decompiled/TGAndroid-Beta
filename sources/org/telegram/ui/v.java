package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f41373a;
    public final i4 f41374b;

    public v(i4 i4Var, int i10) {
        this.f41373a = i10;
        this.f41374b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41373a) {
            case 0:
                this.f41374b.f41436c.d(true);
                return;
            default:
                this.f41374b.f37224k0 = null;
                return;
        }
    }
}
