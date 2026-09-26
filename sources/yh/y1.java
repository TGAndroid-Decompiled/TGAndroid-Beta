package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48286a;
    public final x3 f48287b;

    public y1(x3 x3Var, int i10) {
        this.f48286a = i10;
        this.f48287b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48286a) {
            case 0:
                this.f48287b.f48245j0.setLoading(false);
                return;
            default:
                this.f48287b.f48245j0.setLoading(false);
                return;
        }
    }
}
