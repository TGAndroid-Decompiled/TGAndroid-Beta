package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f48017a;
    public final a4 f48018b;

    public y1(a4 a4Var, int i10) {
        this.f48017a = i10;
        this.f48018b = a4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48017a) {
            case 0:
                this.f48018b.f46963j0.setLoading(false);
                return;
            default:
                this.f48018b.f46963j0.setLoading(false);
                return;
        }
    }
}
