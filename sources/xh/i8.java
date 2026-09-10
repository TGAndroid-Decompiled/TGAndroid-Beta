package xh;

import android.os.Bundle;
import org.telegram.ui.eo;
public final class i8 extends eo {
    public final boolean Qc;
    public final r8 Rc;

    public i8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = r8Var;
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
