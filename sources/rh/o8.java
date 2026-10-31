package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class o8 extends ProfileActivity {
    public final boolean T6;
    public final y8 U6;

    public o8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.U6 = y8Var;
        this.T6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.T6) {
            this.U6.show();
        }
    }
}
