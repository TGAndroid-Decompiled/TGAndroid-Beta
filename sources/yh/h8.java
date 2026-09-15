package yh;

import android.os.Bundle;
import org.telegram.ui.bo;
public final class h8 extends bo {
    public final boolean Qc;
    public final q8 Rc;

    public h8(q8 q8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = q8Var;
        this.Qc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Qc) {
            this.Rc.show();
        }
    }
}
