package org.telegram.ui;

import android.content.DialogInterface;
public final class t8 implements DialogInterface.OnCancelListener {
    public final int f43534a;
    public final o9 f43535b;
    public final int f43536c;

    public t8(o9 o9Var, int i10, int i11) {
        this.f43534a = i11;
        this.f43535b = o9Var;
        this.f43536c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f43534a) {
            case 0:
                this.f43535b.getConnectionsManager().cancelRequest(this.f43536c, true);
                return;
            default:
                this.f43535b.getConnectionsManager().cancelRequest(this.f43536c, true);
                return;
        }
    }
}
