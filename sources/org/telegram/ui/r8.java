package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41079a;
    public final m9 f41080b;
    public final int f41081c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41079a = i11;
        this.f41080b = m9Var;
        this.f41081c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41079a) {
            case 0:
                this.f41080b.getConnectionsManager().cancelRequest(this.f41081c, true);
                return;
            default:
                this.f41080b.getConnectionsManager().cancelRequest(this.f41081c, true);
                return;
        }
    }
}
