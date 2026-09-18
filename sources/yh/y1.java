package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48045a;
    public final a4 f48046b;

    public y1(a4 a4Var, int i10) {
        this.f48045a = i10;
        this.f48046b = a4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48045a) {
            case 0:
                this.f48046b.f46991j0.setLoading(false);
                return;
            default:
                this.f48046b.f46991j0.setLoading(false);
                return;
        }
    }
}
