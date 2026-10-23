package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41042a;
    public final m9 f41043b;
    public final int f41044c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41042a = i11;
        this.f41043b = m9Var;
        this.f41044c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41042a) {
            case 0:
                this.f41043b.getConnectionsManager().cancelRequest(this.f41044c, true);
                return;
            default:
                this.f41043b.getConnectionsManager().cancelRequest(this.f41044c, true);
                return;
        }
    }
}
