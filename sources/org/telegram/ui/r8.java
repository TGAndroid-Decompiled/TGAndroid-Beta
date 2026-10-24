package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41051a;
    public final m9 f41052b;
    public final int f41053c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41051a = i11;
        this.f41052b = m9Var;
        this.f41053c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41051a) {
            case 0:
                this.f41052b.getConnectionsManager().cancelRequest(this.f41053c, true);
                return;
            default:
                this.f41052b.getConnectionsManager().cancelRequest(this.f41053c, true);
                return;
        }
    }
}
