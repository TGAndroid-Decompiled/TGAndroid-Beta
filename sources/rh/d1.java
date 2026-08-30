package rh;

import android.os.Bundle;
import org.telegram.ui.oy;
public final class d1 extends oy {
    public final dh.v f43491y4;
    public final f1 z4;

    public d1(f1 f1Var, Bundle bundle, dh.v vVar) {
        super(bundle);
        this.z4 = f1Var;
        this.f43491y4 = vVar;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        f1 f1Var = this.z4;
        if (!f1Var.Z) {
            f1Var.Z = true;
            this.f43491y4.run("USER_DECLINED", null);
        }
    }
}
