package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48274a;
    public final y3 f48275b;

    public y1(y3 y3Var, int i10) {
        this.f48274a = i10;
        this.f48275b = y3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48274a) {
            case 0:
                this.f48275b.f48317j0.setLoading(false);
                return;
            default:
                this.f48275b.f48317j0.setLoading(false);
                return;
        }
    }
}
