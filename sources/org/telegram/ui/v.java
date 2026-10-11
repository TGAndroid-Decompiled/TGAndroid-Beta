package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42810a;
    public final h4 f42811b;

    public v(h4 h4Var, int i10) {
        this.f42810a = i10;
        this.f42811b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42810a) {
            case 0:
                this.f42811b.f42098c.d(true);
                return;
            default:
                this.f42811b.f38276k0 = null;
                return;
        }
    }
}
