package org.telegram.ui;

import android.content.DialogInterface;
public final class t8 implements DialogInterface.OnCancelListener {
    public final int f38409a;
    public final n9 f38410b;
    public final int f38411c;

    public t8(n9 n9Var, int i10, int i11) {
        this.f38409a = i11;
        this.f38410b = n9Var;
        this.f38411c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38409a) {
            case 0:
                this.f38410b.getConnectionsManager().cancelRequest(this.f38411c, true);
                return;
            default:
                this.f38410b.getConnectionsManager().cancelRequest(this.f38411c, true);
                return;
        }
    }
}
