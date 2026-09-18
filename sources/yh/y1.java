package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48231a;
    public final y3 f48232b;

    public y1(y3 y3Var, int i10) {
        this.f48231a = i10;
        this.f48232b = y3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48231a) {
            case 0:
                this.f48232b.f48274j0.setLoading(false);
                return;
            default:
                this.f48232b.f48274j0.setLoading(false);
                return;
        }
    }
}
