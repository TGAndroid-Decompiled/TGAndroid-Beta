package sh;

import android.os.Bundle;
import org.telegram.ui.py;
public final class c1 extends py {
    public final eh.w f47375y4;
    public final e1 z4;

    public c1(e1 e1Var, Bundle bundle, eh.w wVar) {
        super(bundle);
        this.z4 = e1Var;
        this.f47375y4 = wVar;
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
            this.f47375y4.run("USER_DECLINED", null);
        }
    }
}
