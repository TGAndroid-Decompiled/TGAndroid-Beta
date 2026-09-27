package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class d8 extends ProfileActivity {
    public final boolean f47359w6;
    public final n8 f47360x6;

    public d8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f47360x6 = n8Var;
        this.f47359w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47359w6) {
            this.f47360x6.show();
        }
    }
}
