package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40587a;
    public final m9 f40588b;
    public final int f40589c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f40587a = i11;
        this.f40588b = m9Var;
        this.f40589c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40587a) {
            case 0:
                this.f40588b.getConnectionsManager().cancelRequest(this.f40589c, true);
                return;
            default:
                this.f40588b.getConnectionsManager().cancelRequest(this.f40589c, true);
                return;
        }
    }
}
