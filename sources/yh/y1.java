package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48288a;
    public final x3 f48289b;

    public y1(x3 x3Var, int i10) {
        this.f48288a = i10;
        this.f48289b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48288a) {
            case 0:
                this.f48289b.f48247j0.setLoading(false);
                return;
            default:
                this.f48289b.f48247j0.setLoading(false);
                return;
        }
    }
}
