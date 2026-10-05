package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class h8 extends ProfileActivity {
    public final boolean f51441w6;
    public final r8 f51442x6;

    public h8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f51442x6 = r8Var;
        this.f51441w6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f51441w6) {
            this.f51442x6.show();
        }
    }
}
