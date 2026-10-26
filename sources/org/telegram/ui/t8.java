package org.telegram.ui;

import android.content.DialogInterface;
public final class t8 implements DialogInterface.OnCancelListener {
    public final int f43696a;
    public final o9 f43697b;
    public final int f43698c;

    public t8(o9 o9Var, int i10, int i11) {
        this.f43696a = i11;
        this.f43697b = o9Var;
        this.f43698c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f43696a) {
            case 0:
                this.f43697b.getConnectionsManager().cancelRequest(this.f43698c, true);
                return;
            default:
                this.f43697b.getConnectionsManager().cancelRequest(this.f43698c, true);
                return;
        }
    }
}
