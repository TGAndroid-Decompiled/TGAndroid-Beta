package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48337a;
    public final x3 f48338b;

    public y1(x3 x3Var, int i10) {
        this.f48337a = i10;
        this.f48338b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48337a) {
            case 0:
                this.f48338b.f48295j0.setLoading(false);
                return;
            default:
                this.f48338b.f48295j0.setLoading(false);
                return;
        }
    }
}
