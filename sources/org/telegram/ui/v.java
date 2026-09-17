package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38248a;
    public final h4 f38249b;

    public v(h4 h4Var, int i10) {
        this.f38248a = i10;
        this.f38249b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38248a) {
            case 0:
                this.f38249b.f38582c.d(true);
                return;
            default:
                this.f38249b.f34159k0 = null;
                return;
        }
    }
}
