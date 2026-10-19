package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f41087a;
    public final m9 f41088b;
    public final int f41089c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f41087a = i11;
        this.f41088b = m9Var;
        this.f41089c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41087a) {
            case 0:
                this.f41088b.getConnectionsManager().cancelRequest(this.f41089c, true);
                return;
            default:
                this.f41088b.getConnectionsManager().cancelRequest(this.f41089c, true);
                return;
        }
    }
}
