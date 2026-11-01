package vh;

import android.content.DialogInterface;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f51414a;
    public final b4 f51415b;

    public k3(b4 b4Var, int i10) {
        this.f51414a = i10;
        this.f51415b = b4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51414a) {
            case 0:
                this.f51415b.w0(false);
                return;
            default:
                this.f51415b.w0(false);
                return;
        }
    }
}
