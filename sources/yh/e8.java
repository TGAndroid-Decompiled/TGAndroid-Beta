package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class e8 extends ProfileActivity {
    public final boolean f47346w6;
    public final o8 f47347x6;

    public e8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f47347x6 = o8Var;
        this.f47346w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47346w6) {
            this.f47347x6.show();
        }
    }
}
