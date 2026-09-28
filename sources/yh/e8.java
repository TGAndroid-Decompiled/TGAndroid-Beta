package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class e8 extends ProfileActivity {
    public final boolean f47347w6;
    public final o8 f47348x6;

    public e8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f47348x6 = o8Var;
        this.f47347w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47347w6) {
            this.f47348x6.show();
        }
    }
}
