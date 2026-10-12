package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41524a;
    public final m9 f41525b;
    public final int f41526c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41524a = i11;
        this.f41525b = m9Var;
        this.f41526c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41524a) {
            case 0:
                this.f41525b.getConnectionsManager().cancelRequest(this.f41526c, true);
                return;
            default:
                this.f41525b.getConnectionsManager().cancelRequest(this.f41526c, true);
                return;
        }
    }
}
