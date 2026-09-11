package zh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class d8 extends ProfileActivity {
    public final boolean f51802w6;
    public final n8 f51803x6;

    public d8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f51803x6 = n8Var;
        this.f51802w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f51802w6) {
            this.f51803x6.show();
        }
    }
}
