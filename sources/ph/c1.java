package ph;

import android.os.Bundle;
import org.telegram.ui.fy;
public final class c1 extends fy {
    public final bh.v x4;
    public final e1 f45752y4;

    public c1(e1 e1Var, Bundle bundle, bh.v vVar) {
        super(bundle);
        this.f45752y4 = e1Var;
        this.x4 = vVar;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e1 e1Var = this.f45752y4;
        if (!e1Var.Y) {
            e1Var.Y = true;
            this.x4.run("USER_DECLINED", null);
        }
    }
}
