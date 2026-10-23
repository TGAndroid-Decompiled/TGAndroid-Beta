package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41089a;
    public final m9 f41090b;
    public final int f41091c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41089a = i11;
        this.f41090b = m9Var;
        this.f41091c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41089a) {
            case 0:
                this.f41090b.getConnectionsManager().cancelRequest(this.f41091c, true);
                return;
            default:
                this.f41090b.getConnectionsManager().cancelRequest(this.f41091c, true);
                return;
        }
    }
}
