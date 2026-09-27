package org.telegram.ui;

import android.content.DialogInterface;
public final class s8 implements DialogInterface.OnCancelListener {
    public final int f37331a;
    public final n9 f37332b;
    public final int f37333c;

    public s8(n9 n9Var, int i10, int i11) {
        this.f37331a = i11;
        this.f37332b = n9Var;
        this.f37333c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37331a) {
            case 0:
                this.f37332b.getConnectionsManager().cancelRequest(this.f37333c, true);
                return;
            default:
                this.f37332b.getConnectionsManager().cancelRequest(this.f37333c, true);
                return;
        }
    }
}
