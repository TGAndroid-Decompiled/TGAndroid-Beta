package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42056a;
    public final l4 f42057b;

    public v(l4 l4Var, int i10) {
        this.f42056a = i10;
        this.f42057b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42056a) {
            case 0:
                this.f42057b.f36079c.d(true);
                return;
            default:
                this.f42057b.f38716k0 = null;
                return;
        }
    }
}
