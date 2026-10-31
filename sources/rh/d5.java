package rh;

import android.content.DialogInterface;
import org.telegram.messenger.j20;
public final class d5 implements DialogInterface.OnDismissListener {
    public final int f46759a;
    public final j20 f46760b;
    public final boolean[] f46761c;

    public d5(j20 j20Var, boolean[] zArr, int i10) {
        this.f46759a = i10;
        this.f46760b = j20Var;
        this.f46761c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46759a) {
            case 0:
                j20 j20Var = this.f46760b;
                if (j20Var != null && !this.f46761c[0]) {
                    j20Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                j20 j20Var2 = this.f46760b;
                if (j20Var2 != null && !this.f46761c[0]) {
                    j20Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                j20 j20Var3 = this.f46760b;
                if (j20Var3 != null && !this.f46761c[0]) {
                    j20Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
