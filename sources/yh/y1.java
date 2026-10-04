package yh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f52288a;
    public final x3 f52289b;

    public y1(x3 x3Var, int i10) {
        this.f52288a = i10;
        this.f52289b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52288a) {
            case 0:
                this.f52289b.f52230j0.setLoading(false);
                return;
            default:
                this.f52289b.f52230j0.setLoading(false);
                return;
        }
    }
}
