package rh;

import android.content.DialogInterface;
public final class b2 implements DialogInterface.OnDismissListener {
    public final int f46669a;
    public final e4 f46670b;

    public b2(e4 e4Var, int i10) {
        this.f46669a = i10;
        this.f46670b = e4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46669a) {
            case 0:
                this.f46670b.f46815c2.setLoading(false);
                return;
            default:
                this.f46670b.f46815c2.setLoading(false);
                return;
        }
    }
}
