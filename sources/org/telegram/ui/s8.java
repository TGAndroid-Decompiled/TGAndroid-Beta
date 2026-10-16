package org.telegram.ui;

import android.content.DialogInterface;
public final class s8 implements DialogInterface.OnCancelListener {
    public final int f39715a;
    public final n9 f39716b;
    public final int f39717c;

    public s8(n9 n9Var, int i10, int i11) {
        this.f39715a = i11;
        this.f39716b = n9Var;
        this.f39717c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39715a) {
            case 0:
                this.f39716b.getConnectionsManager().cancelRequest(this.f39717c, true);
                return;
            default:
                this.f39716b.getConnectionsManager().cancelRequest(this.f39717c, true);
                return;
        }
    }
}
