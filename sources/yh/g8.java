package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class g8 extends ProfileActivity {
    public final boolean f47258w6;
    public final q8 f47259x6;

    public g8(q8 q8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f47259x6 = q8Var;
        this.f47258w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47258w6) {
            this.f47259x6.show();
        }
    }
}
