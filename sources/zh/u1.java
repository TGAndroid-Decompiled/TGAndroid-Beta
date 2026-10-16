package zh;

import android.content.DialogInterface;
public final class u1 implements DialogInterface.OnDismissListener {
    public final int f51211a;
    public final r3 f51212b;

    public u1(r3 r3Var, int i10) {
        this.f51211a = i10;
        this.f51212b = r3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51211a) {
            case 0:
                this.f51212b.f51089k0.setLoading(false);
                return;
            default:
                this.f51212b.f51089k0.setLoading(false);
                return;
        }
    }
}
