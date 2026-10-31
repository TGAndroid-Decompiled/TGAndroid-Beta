package rh;

import android.os.Bundle;
import org.telegram.ui.un;
public final class p8 extends un {
    public final boolean f47329jd;
    public final y8 f47330kd;

    public p8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.f47330kd = y8Var;
        this.f47329jd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47329jd) {
            this.f47330kd.show();
        }
    }
}
