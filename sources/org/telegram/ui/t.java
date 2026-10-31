package org.telegram.ui;

import android.content.DialogInterface;
public final class t implements DialogInterface.OnDismissListener {
    public final int f41674a;
    public final h4 f41675b;

    public t(h4 h4Var, int i10) {
        this.f41674a = i10;
        this.f41675b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41674a) {
            case 0:
                this.f41675b.f39482c.f(true);
                return;
            default:
                this.f41675b.f37737k0 = null;
                return;
        }
    }
}
