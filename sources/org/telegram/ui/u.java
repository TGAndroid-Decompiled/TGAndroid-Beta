package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f42117a;
    public final k4 f42118b;

    public u(k4 k4Var, int i10) {
        this.f42117a = i10;
        this.f42118b = k4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42117a) {
            case 0:
                this.f42118b.f37231c.d(true);
                return;
            default:
                this.f42118b.f38796k0 = null;
                return;
        }
    }
}
