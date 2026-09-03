package rh;

import android.os.Bundle;
import org.telegram.ui.qy;
public final class c1 extends qy {
    public final kh.a0 f43543y4;
    public final e1 z4;

    public c1(e1 e1Var, Bundle bundle, kh.a0 a0Var) {
        super(bundle);
        this.z4 = e1Var;
        this.f43543y4 = a0Var;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e1 e1Var = this.z4;
        if (!e1Var.Z) {
            e1Var.Z = true;
            this.f43543y4.run("USER_DECLINED", null);
        }
    }
}
