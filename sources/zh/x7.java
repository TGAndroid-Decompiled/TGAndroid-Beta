package zh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class x7 extends ProfileActivity {
    public final boolean f51314w6;
    public final h8 f51315x6;

    public x7(h8 h8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f51315x6 = h8Var;
        this.f51314w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f51314w6) {
            this.f51315x6.show();
        }
    }
}
