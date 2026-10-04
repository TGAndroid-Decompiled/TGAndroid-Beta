package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class f8 extends ProfileActivity {
    public final boolean f51296w6;
    public final p8 f51297x6;

    public f8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f51297x6 = p8Var;
        this.f51296w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f51296w6) {
            this.f51297x6.show();
        }
    }
}
