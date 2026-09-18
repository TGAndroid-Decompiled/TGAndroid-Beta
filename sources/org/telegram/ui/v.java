package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38264a;
    public final h4 f38265b;

    public v(h4 h4Var, int i10) {
        this.f38264a = i10;
        this.f38265b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38264a) {
            case 0:
                this.f38265b.f37897c.d(true);
                return;
            default:
                this.f38265b.f34065k0 = null;
                return;
        }
    }
}
