package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40596a;
    public final m9 f40597b;
    public final int f40598c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f40596a = i11;
        this.f40597b = m9Var;
        this.f40598c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40596a) {
            case 0:
                this.f40597b.getConnectionsManager().cancelRequest(this.f40598c, true);
                return;
            default:
                this.f40597b.getConnectionsManager().cancelRequest(this.f40598c, true);
                return;
        }
    }
}
