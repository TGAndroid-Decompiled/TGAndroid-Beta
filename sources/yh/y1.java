package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f52283a;
    public final x3 f52284b;

    public y1(x3 x3Var, int i10) {
        this.f52283a = i10;
        this.f52284b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52283a) {
            case 0:
                this.f52284b.f52225j0.setLoading(false);
                return;
            default:
                this.f52284b.f52225j0.setLoading(false);
                return;
        }
    }
}
