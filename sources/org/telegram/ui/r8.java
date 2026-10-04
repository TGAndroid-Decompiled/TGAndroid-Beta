package org.telegram.ui;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnCancelListener {
    public final int f39945a;
    public final m9 f39946b;
    public final int f39947c;

    public r8(m9 m9Var, int i10, int i11) {
        this.f39945a = i11;
        this.f39946b = m9Var;
        this.f39947c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39945a) {
            case 0:
                this.f39946b.getConnectionsManager().cancelRequest(this.f39947c, true);
                return;
            default:
                this.f39946b.getConnectionsManager().cancelRequest(this.f39947c, true);
                return;
        }
    }
}
