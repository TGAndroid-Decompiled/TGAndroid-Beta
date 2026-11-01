package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class o8 extends ProfileActivity {
    public final boolean U6;
    public final y8 V6;

    public o8(y8 y8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.V6 = y8Var;
        this.U6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.U6) {
            this.V6.show();
        }
    }
}
