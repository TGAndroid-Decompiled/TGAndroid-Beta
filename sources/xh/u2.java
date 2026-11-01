package xh;

import android.os.Bundle;
import org.telegram.ui.un;
public final class u2 extends un {
    public final org.telegram.ui.ActionBar.z2 f54096kd;

    public u2(Bundle bundle, org.telegram.ui.ActionBar.z2 z2Var) {
        super(bundle);
        this.f54096kd = z2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.z2 z2Var = this.f54096kd;
        z2Var.a0(null);
        z2Var.show();
    }
}
