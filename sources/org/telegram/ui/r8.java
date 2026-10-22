package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41088a;
    public final m9 f41089b;
    public final int f41090c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41088a = i11;
        this.f41089b = m9Var;
        this.f41090c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41088a) {
            case 0:
                this.f41089b.getConnectionsManager().cancelRequest(this.f41090c, true);
                return;
            default:
                this.f41089b.getConnectionsManager().cancelRequest(this.f41090c, true);
                return;
        }
    }
}
