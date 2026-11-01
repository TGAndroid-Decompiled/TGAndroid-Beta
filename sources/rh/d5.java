package rh;

import android.content.DialogInterface;
import org.telegram.messenger.k20;
public final class d5 implements DialogInterface.OnDismissListener {
    public final int f46773a;
    public final k20 f46774b;
    public final boolean[] f46775c;

    public d5(k20 k20Var, boolean[] zArr, int i10) {
        this.f46773a = i10;
        this.f46774b = k20Var;
        this.f46775c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46773a) {
            case 0:
                k20 k20Var = this.f46774b;
                if (k20Var != null && !this.f46775c[0]) {
                    k20Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                k20 k20Var2 = this.f46774b;
                if (k20Var2 != null && !this.f46775c[0]) {
                    k20Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                k20 k20Var3 = this.f46774b;
                if (k20Var3 != null && !this.f46775c[0]) {
                    k20Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
