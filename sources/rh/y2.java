package rh;

import android.os.Bundle;
import org.telegram.ui.zn;
public final class y2 extends zn {
    public final org.telegram.ui.ActionBar.g3 Nc;

    public y2(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
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
