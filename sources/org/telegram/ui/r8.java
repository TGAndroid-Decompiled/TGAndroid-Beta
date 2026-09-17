package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f37112a;
    public final m9 f37113b;
    public final int f37114c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f37112a = i11;
        this.f37113b = m9Var;
        this.f37114c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37112a) {
            case 0:
                this.f37113b.getConnectionsManager().cancelRequest(this.f37114c, true);
                return;
            default:
                this.f37113b.getConnectionsManager().cancelRequest(this.f37114c, true);
                return;
        }
    }
}
