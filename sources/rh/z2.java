package rh;

import android.os.Bundle;
import org.telegram.ui.xn;
public final class z2 extends xn {
    public final org.telegram.ui.ActionBar.g3 Nc;

    public z2(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
        super(bundle);
        this.Nc = g3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.g3 g3Var = this.Nc;
        g3Var.makeAttached(null);
        g3Var.show();
    }
}
