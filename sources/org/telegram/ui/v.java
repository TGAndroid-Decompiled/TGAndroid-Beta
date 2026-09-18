package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38253a;
    public final h4 f38254b;

    public v(h4 h4Var, int i10) {
        this.f38253a = i10;
        this.f38254b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38253a) {
            case 0:
                this.f38254b.f38587c.d(true);
                return;
            default:
                this.f38254b.f34164k0 = null;
                return;
        }
    }
}
