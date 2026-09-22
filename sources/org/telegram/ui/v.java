package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f38334a;
    public final h4 f38335b;

    public v(h4 h4Var, int i10) {
        this.f38334a = i10;
        this.f38335b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38334a) {
            case 0:
                this.f38335b.f37827c.d(true);
                return;
            default:
                this.f38335b.f34081k0 = null;
                return;
        }
    }
}
