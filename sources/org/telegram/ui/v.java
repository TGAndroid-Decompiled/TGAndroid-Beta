package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38323a;
    public final h4 f38324b;

    public v(h4 h4Var, int i10) {
        this.f38323a = i10;
        this.f38324b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38323a) {
            case 0:
                this.f38324b.f37875c.d(true);
                return;
            default:
                this.f38324b.f34142k0 = null;
                return;
        }
    }
}
