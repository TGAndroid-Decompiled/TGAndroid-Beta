package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40848a;
    public final l9 f40849b;
    public final int f40850c;

    public r8(l9 l9Var, int i10, int i11) {
        this.f40848a = i11;
        this.f40849b = l9Var;
        this.f40850c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40848a) {
            case 0:
                this.f40849b.getConnectionsManager().cancelRequest(this.f40850c, true);
                return;
            default:
                this.f40849b.getConnectionsManager().cancelRequest(this.f40850c, true);
                return;
        }
    }
}
