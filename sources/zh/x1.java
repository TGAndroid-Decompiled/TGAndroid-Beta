package zh;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f52849a;
    public final w3 f52850b;

    public x1(w3 w3Var, int i10) {
        this.f52849a = i10;
        this.f52850b = w3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52849a) {
            case 0:
                this.f52850b.f52805j0.setLoading(false);
                return;
            default:
                this.f52850b.f52805j0.setLoading(false);
                return;
        }
    }
}
