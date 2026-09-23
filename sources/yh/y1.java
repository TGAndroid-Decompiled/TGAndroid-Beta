package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f47921a;
    public final y3 f47922b;

    public y1(y3 y3Var, int i10) {
        this.f47921a = i10;
        this.f47922b = y3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47921a) {
            case 0:
                this.f47922b.f47964j0.setLoading(false);
                return;
            default:
                this.f47922b.f47964j0.setLoading(false);
                return;
        }
    }
}
