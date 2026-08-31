package qh;

import android.content.DialogInterface;
public final class e4 implements DialogInterface.OnDismissListener {
    public final int f45243a;
    public final b5 f45244b;

    public e4(b5 b5Var, int i10) {
        this.f45243a = i10;
        this.f45244b = b5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45243a) {
            case 0:
                this.f45244b.z0(false);
                return;
            default:
                this.f45244b.z0(false);
                return;
        }
    }
}
