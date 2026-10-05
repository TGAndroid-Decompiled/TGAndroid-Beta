package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40006a;
    public final m9 f40007b;
    public final int f40008c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f40006a = i11;
        this.f40007b = m9Var;
        this.f40008c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40006a) {
            case 0:
                this.f40007b.getConnectionsManager().cancelRequest(this.f40008c, true);
                return;
            default:
                this.f40007b.getConnectionsManager().cancelRequest(this.f40008c, true);
                return;
        }
    }
}
