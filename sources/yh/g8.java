package yh;

import android.os.Bundle;
import org.telegram.ui.yn;
public final class g8 extends yn {
    public final boolean Kc;
    public final p8 Lc;

    public g8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Lc = p8Var;
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
