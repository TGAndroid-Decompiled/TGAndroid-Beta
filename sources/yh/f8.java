package yh;

import android.os.Bundle;
import org.telegram.ui.xn;
public final class f8 extends xn {
    public final boolean Pc;
    public final o8 Qc;

    public f8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = o8Var;
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
