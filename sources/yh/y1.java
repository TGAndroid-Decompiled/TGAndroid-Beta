package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48276a;
    public final x3 f48277b;

    public y1(x3 x3Var, int i10) {
        this.f48276a = i10;
        this.f48277b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48276a) {
            case 0:
                this.f48277b.f48235j0.setLoading(false);
                return;
            default:
                this.f48277b.f48235j0.setLoading(false);
                return;
        }
    }
}
