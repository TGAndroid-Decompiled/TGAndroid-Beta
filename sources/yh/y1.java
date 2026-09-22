package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48295a;
    public final y3 f48296b;

    public y1(y3 y3Var, int i10) {
        this.f48295a = i10;
        this.f48296b = y3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48295a) {
            case 0:
                this.f48296b.f48338j0.setLoading(false);
                return;
            default:
                this.f48296b.f48338j0.setLoading(false);
                return;
        }
    }
}
