package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48040a;
    public final a4 f48041b;

    public y1(a4 a4Var, int i10) {
        this.f48040a = i10;
        this.f48041b = a4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48040a) {
            case 0:
                this.f48041b.f46986j0.setLoading(false);
                return;
            default:
                this.f48041b.f46986j0.setLoading(false);
                return;
        }
    }
}
