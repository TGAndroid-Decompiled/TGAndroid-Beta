package yh;

import android.os.Bundle;
import org.telegram.ui.yn;
public final class i8 extends yn {
    public final boolean Kc;
    public final r8 Lc;

    public i8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Lc = r8Var;
        this.Kc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Kc) {
            this.Lc.show();
        }
    }
}
