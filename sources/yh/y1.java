package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48289a;
    public final x3 f48290b;

    public y1(x3 x3Var, int i10) {
        this.f48289a = i10;
        this.f48290b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48289a) {
            case 0:
                this.f48290b.f48248j0.setLoading(false);
                return;
            default:
                this.f48290b.f48248j0.setLoading(false);
                return;
        }
    }
}
