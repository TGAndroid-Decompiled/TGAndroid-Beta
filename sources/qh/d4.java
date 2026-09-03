package qh;

import android.content.DialogInterface;
public final class d4 implements DialogInterface.OnDismissListener {
    public final int f45224a;
    public final a5 f45225b;

    public d4(a5 a5Var, int i10) {
        this.f45224a = i10;
        this.f45225b = a5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45224a) {
            case 0:
                this.f45225b.z0(false);
                return;
            default:
                this.f45225b.z0(false);
                return;
        }
    }
}
