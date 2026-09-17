package zh;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f52818a;
    public final w3 f52819b;

    public x1(w3 w3Var, int i10) {
        this.f52818a = i10;
        this.f52819b = w3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52818a) {
            case 0:
                this.f52819b.f52774j0.setLoading(false);
                return;
            default:
                this.f52819b.f52774j0.setLoading(false);
                return;
        }
    }
}
