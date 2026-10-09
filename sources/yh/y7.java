package yh;

import android.os.Bundle;
import org.telegram.ui.zn;
public final class y7 extends zn {
    public final boolean Qc;
    public final h8 Rc;

    public y7(h8 h8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = h8Var;
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
