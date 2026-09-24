package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class e8 extends ProfileActivity {
    public final boolean f47336w6;
    public final o8 f47337x6;

    public e8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f47337x6 = o8Var;
        this.f47336w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47336w6) {
            this.f47337x6.show();
        }
    }
}
