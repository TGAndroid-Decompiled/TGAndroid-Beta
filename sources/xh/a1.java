package xh;

import android.os.Bundle;
import org.telegram.ui.ay;
public final class a1 extends ay {
    public final org.telegram.tgnet.e B4;
    public final c1 C4;

    public a1(c1 c1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = c1Var;
        this.B4 = eVar;
    }

    @Override
    public final boolean T3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        c1 c1Var = this.C4;
        if (!c1Var.U1) {
            c1Var.U1 = true;
            this.B4.a("USER_DECLINED", null);
        }
    }
}
