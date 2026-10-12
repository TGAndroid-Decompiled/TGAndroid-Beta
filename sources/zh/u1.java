package zh;

import android.content.DialogInterface;
public final class u1 implements DialogInterface.OnDismissListener {
    public final int f51210a;
    public final r3 f51211b;

    public u1(r3 r3Var, int i10) {
        this.f51210a = i10;
        this.f51211b = r3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51210a) {
            case 0:
                this.f51211b.f51088k0.setLoading(false);
                return;
            default:
                this.f51211b.f51088k0.setLoading(false);
                return;
        }
    }
}
