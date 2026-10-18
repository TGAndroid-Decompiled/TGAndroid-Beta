package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f40621a;
    public final m9 f40622b;
    public final int f40623c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f40621a = i11;
        this.f40622b = m9Var;
        this.f40623c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40621a) {
            case 0:
                this.f40622b.getConnectionsManager().cancelRequest(this.f40623c, true);
                return;
            default:
                this.f40622b.getConnectionsManager().cancelRequest(this.f40623c, true);
                return;
        }
    }
}
