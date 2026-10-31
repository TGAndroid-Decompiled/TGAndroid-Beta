package vh;

import android.content.DialogInterface;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f51399a;
    public final b4 f51400b;

    public k3(b4 b4Var, int i10) {
        this.f51399a = i10;
        this.f51400b = b4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51399a) {
            case 0:
                this.f51400b.w0(false);
                return;
            default:
                this.f51400b.w0(false);
                return;
        }
    }
}
