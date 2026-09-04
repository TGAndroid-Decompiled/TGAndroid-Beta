package zh;

import android.os.Bundle;
import org.telegram.ui.co;
public final class e8 extends co {
    public final boolean Qc;
    public final n8 Rc;

    public e8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = n8Var;
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
