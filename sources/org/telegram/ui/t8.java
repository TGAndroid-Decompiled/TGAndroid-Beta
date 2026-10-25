package org.telegram.ui;

import android.content.DialogInterface;
public final class t8 implements DialogInterface.OnCancelListener {
    public final int f43693a;
    public final o9 f43694b;
    public final int f43695c;

    public t8(o9 o9Var, int i10, int i11) {
        this.f43693a = i11;
        this.f43694b = o9Var;
        this.f43695c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f43693a) {
            case 0:
                this.f43694b.getConnectionsManager().cancelRequest(this.f43695c, true);
                return;
            default:
                this.f43694b.getConnectionsManager().cancelRequest(this.f43695c, true);
                return;
        }
    }
}
