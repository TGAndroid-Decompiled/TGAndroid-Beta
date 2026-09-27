package yh;

import android.os.Bundle;
import org.telegram.ui.xn;
public final class e8 extends xn {
    public final boolean Pc;
    public final n8 Qc;

    public e8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = n8Var;
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
