package zh;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f52848a;
    public final w3 f52849b;

    public x1(w3 w3Var, int i10) {
        this.f52848a = i10;
        this.f52849b = w3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52848a) {
            case 0:
                this.f52849b.f52804j0.setLoading(false);
                return;
            default:
                this.f52849b.f52804j0.setLoading(false);
                return;
        }
    }
}
