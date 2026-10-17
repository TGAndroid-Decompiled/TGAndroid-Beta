package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42081a;
    public final l4 f42082b;

    public v(l4 l4Var, int i10) {
        this.f42081a = i10;
        this.f42082b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42081a) {
            case 0:
                this.f42082b.f36086c.d(true);
                return;
            default:
                this.f42082b.f38770k0 = null;
                return;
        }
    }
}
