package zh;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f52817a;
    public final w3 f52818b;

    public x1(w3 w3Var, int i10) {
        this.f52817a = i10;
        this.f52818b = w3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52817a) {
            case 0:
                this.f52818b.f52773j0.setLoading(false);
                return;
            default:
                this.f52818b.f52773j0.setLoading(false);
                return;
        }
    }
}
