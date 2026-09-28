package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48287a;
    public final x3 f48288b;

    public y1(x3 x3Var, int i10) {
        this.f48287a = i10;
        this.f48288b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48287a) {
            case 0:
                this.f48288b.f48246j0.setLoading(false);
                return;
            default:
                this.f48288b.f48246j0.setLoading(false);
                return;
        }
    }
}
