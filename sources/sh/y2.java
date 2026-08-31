package sh;

import android.os.Bundle;
import org.telegram.ui.xn;
public final class y2 extends xn {
    public final org.telegram.ui.ActionBar.h3 Nc;

    public y2(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.Nc = h3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.Nc;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
