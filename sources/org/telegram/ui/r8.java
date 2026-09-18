package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f37117a;
    public final m9 f37118b;
    public final int f37119c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f37117a = i11;
        this.f37118b = m9Var;
        this.f37119c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37117a) {
            case 0:
                this.f37118b.getConnectionsManager().cancelRequest(this.f37119c, true);
                return;
            default:
                this.f37118b.getConnectionsManager().cancelRequest(this.f37119c, true);
                return;
        }
    }
}
