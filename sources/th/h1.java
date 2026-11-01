package th;

import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.z60;
public final class h1 implements View.OnLongClickListener {
    public final int f49025a;
    public final z2 f49026b;

    public h1(z2 z2Var, int i10) {
        this.f49025a = i10;
        this.f49026b = z2Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f49025a;
        boolean z10 = false;
        z2 z2Var = this.f49026b;
        switch (i10) {
            case 0:
                if (z2Var.B0(true)) {
                    return false;
                }
                z60 F = z60.F(z2Var.f49769s0.f49353w, z2Var.f49739k0, view);
                F.c(2131232115, dd.L0(2131748820, null), new i1(z2Var, 6), false);
                if (z2Var.f49780u3 > 0) {
                    z10 = true;
                }
                F.l(2131231785, dd.L0(2131748819, null), new i1(z2Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                z2Var.f49777u0.k(z2Var.B0(false));
                return true;
        }
    }
}
