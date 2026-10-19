package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42074a;
    public final l4 f42075b;

    public v(l4 l4Var, int i10) {
        this.f42074a = i10;
        this.f42075b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42074a) {
            case 0:
                this.f42075b.f35517c.d(true);
                return;
            default:
                this.f42075b.f38763k0 = null;
                return;
        }
    }
}
