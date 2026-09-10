package xh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class h8 extends ProfileActivity {
    public final boolean f45519w6;
    public final r8 f45520x6;

    public h8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f45520x6 = r8Var;
        this.f45519w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f45519w6) {
            this.f45520x6.show();
        }
    }
}
