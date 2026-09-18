package yh;

import android.os.Bundle;
import org.telegram.ui.bo;
public final class h8 extends bo {
    public final boolean Pc;
    public final q8 Qc;

    public h8(q8 q8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = q8Var;
        this.Pc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Pc) {
            this.Qc.show();
        }
    }
}
