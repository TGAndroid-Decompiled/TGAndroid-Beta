package rh;

import android.content.DialogInterface;
public final class b2 implements DialogInterface.OnDismissListener {
    public final int f46674a;
    public final e4 f46675b;

    public b2(e4 e4Var, int i10) {
        this.f46674a = i10;
        this.f46675b = e4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46674a) {
            case 0:
                this.f46675b.f46801c2.setLoading(false);
                return;
            default:
                this.f46675b.f46801c2.setLoading(false);
                return;
        }
    }
}
