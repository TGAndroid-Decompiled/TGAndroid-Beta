package yh;

import android.content.DialogInterface;
public final class z1 implements DialogInterface.OnDismissListener {
    public final int f52339a;
    public final y3 f52340b;

    public z1(y3 y3Var, int i10) {
        this.f52339a = i10;
        this.f52340b = y3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52339a) {
            case 0:
                this.f52340b.f52298j0.setLoading(false);
                return;
            default:
                this.f52340b.f52298j0.setLoading(false);
                return;
        }
    }
}
