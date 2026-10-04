package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f52282a;
    public final x3 f52283b;

    public y1(x3 x3Var, int i10) {
        this.f52282a = i10;
        this.f52283b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52282a) {
            case 0:
                this.f52283b.f52224j0.setLoading(false);
                return;
            default:
                this.f52283b.f52224j0.setLoading(false);
                return;
        }
    }
}
