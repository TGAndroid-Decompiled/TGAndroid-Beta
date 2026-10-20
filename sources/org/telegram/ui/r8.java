package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41085a;
    public final m9 f41086b;
    public final int f41087c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41085a = i11;
        this.f41086b = m9Var;
        this.f41087c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41085a) {
            case 0:
                this.f41086b.getConnectionsManager().cancelRequest(this.f41087c, true);
                return;
            default:
                this.f41086b.getConnectionsManager().cancelRequest(this.f41087c, true);
                return;
        }
    }
}
