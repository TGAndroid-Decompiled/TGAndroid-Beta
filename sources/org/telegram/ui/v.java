package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38392a;
    public final h4 f38393b;

    public v(h4 h4Var, int i10) {
        this.f38392a = i10;
        this.f38393b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38392a) {
            case 0:
                this.f38393b.f37982c.d(true);
                return;
            default:
                this.f38393b.f34121k0 = null;
                return;
        }
    }
}
