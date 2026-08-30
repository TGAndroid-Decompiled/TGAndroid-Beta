package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f37936a;
    public final l9 f37937b;
    public final int f37938c;

    public r8(l9 l9Var, int i10, int i11) {
        this.f37936a = i11;
        this.f37937b = l9Var;
        this.f37938c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37936a) {
            case 0:
                this.f37937b.getConnectionsManager().cancelRequest(this.f37938c, true);
                return;
            default:
                this.f37937b.getConnectionsManager().cancelRequest(this.f37938c, true);
                return;
        }
    }
}
