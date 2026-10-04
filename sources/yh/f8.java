package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class f8 extends ProfileActivity {
    public final boolean f51302w6;
    public final p8 f51303x6;

    public f8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f51303x6 = p8Var;
        this.f51302w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f51302w6) {
            this.f51303x6.show();
        }
    }
}
