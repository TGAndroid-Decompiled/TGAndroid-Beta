package rh;

import android.os.Bundle;
import org.telegram.ui.un;
public final class p8 extends un {
    public final boolean f47343kd;
    public final y8 f47344ld;

    public p8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.f47344ld = y8Var;
        this.f47343kd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47343kd) {
            this.f47344ld.show();
        }
    }
}
