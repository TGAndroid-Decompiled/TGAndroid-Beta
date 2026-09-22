package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f47953a;
    public final z3 f47954b;

    public y1(z3 z3Var, int i10) {
        this.f47953a = i10;
        this.f47954b = z3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47953a) {
            case 0:
                this.f47954b.f48029j0.setLoading(false);
                return;
            default:
                this.f47954b.f48029j0.setLoading(false);
                return;
        }
    }
}
