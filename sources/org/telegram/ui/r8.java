package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40770a;
    public final l9 f40771b;
    public final int f40772c;

    public r8(l9 l9Var, int i10, int i11) {
        this.f40770a = i11;
        this.f40771b = l9Var;
        this.f40772c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40770a) {
            case 0:
                this.f40771b.getConnectionsManager().cancelRequest(this.f40772c, true);
                return;
            default:
                this.f40771b.getConnectionsManager().cancelRequest(this.f40772c, true);
                return;
        }
    }
}
