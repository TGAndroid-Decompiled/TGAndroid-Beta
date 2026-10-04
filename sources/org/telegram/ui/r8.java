package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f39951a;
    public final m9 f39952b;
    public final int f39953c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f39951a = i11;
        this.f39952b = m9Var;
        this.f39953c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39951a) {
            case 0:
                this.f39952b.getConnectionsManager().cancelRequest(this.f39953c, true);
                return;
            default:
                this.f39952b.getConnectionsManager().cancelRequest(this.f39953c, true);
                return;
        }
    }
}
