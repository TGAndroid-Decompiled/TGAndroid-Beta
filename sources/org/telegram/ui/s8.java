package org.telegram.ui;

import android.content.DialogInterface;
public final class s8 implements DialogInterface.OnCancelListener {
    public final int f39991a;
    public final n9 f39992b;
    public final int f39993c;

    public s8(n9 n9Var, int i10, int i11) {
        this.f39991a = i11;
        this.f39992b = n9Var;
        this.f39993c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39991a) {
            case 0:
                this.f39992b.getConnectionsManager().cancelRequest(this.f39993c, true);
                return;
            default:
                this.f39992b.getConnectionsManager().cancelRequest(this.f39993c, true);
                return;
        }
    }
}
