package yh;

import android.os.Bundle;
import org.telegram.ui.bo;
public final class g8 extends bo {
    public final boolean Pc;
    public final p8 Qc;

    public g8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = p8Var;
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
