package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f39946a;
    public final m9 f39947b;
    public final int f39948c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f39946a = i11;
        this.f39947b = m9Var;
        this.f39948c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39946a) {
            case 0:
                this.f39947b.getConnectionsManager().cancelRequest(this.f39948c, true);
                return;
            default:
                this.f39947b.getConnectionsManager().cancelRequest(this.f39948c, true);
                return;
        }
    }
}
