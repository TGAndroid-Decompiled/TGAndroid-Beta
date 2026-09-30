package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48395a;
    public final x3 f48396b;

    public y1(x3 x3Var, int i10) {
        this.f48395a = i10;
        this.f48396b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48395a) {
            case 0:
                this.f48396b.f48354j0.setLoading(false);
                return;
            default:
                this.f48396b.f48354j0.setLoading(false);
                return;
        }
    }
}
