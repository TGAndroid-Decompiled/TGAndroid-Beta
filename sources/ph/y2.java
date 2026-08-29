package ph;

import android.os.Bundle;
import org.telegram.ui.tn;
public final class y2 extends tn {
    public final org.telegram.ui.ActionBar.f3 Mc;

    public y2(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Mc = f3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Mc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
