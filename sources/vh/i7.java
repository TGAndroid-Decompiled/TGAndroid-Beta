package vh;

import android.content.DialogInterface;
public final class i7 implements DialogInterface.OnDismissListener {
    public final int f51284a;
    public final o8 f51285b;

    public i7(o8 o8Var, int i10) {
        this.f51284a = i10;
        this.f51285b = o8Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51284a) {
            case 0:
                o8 o8Var = this.f51285b;
                o8Var.X0.x(3, false);
                o8Var.f51654q0 = null;
                return;
            default:
                d8 d8Var = this.f51285b.X0;
                if (d8Var != null) {
                    d8Var.x(4, false);
                    return;
                }
                return;
        }
    }
}
