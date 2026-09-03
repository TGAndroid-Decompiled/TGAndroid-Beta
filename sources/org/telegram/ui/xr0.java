package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class xr0 implements Utilities.Callback {
    public final int f40060a;
    public final ds0 f40061b;
    public final boolean f40062c;

    public xr0(ds0 ds0Var, boolean z4, int i10) {
        this.f40060a = i10;
        this.f40061b = ds0Var;
        this.f40062c = z4;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40060a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.f40061b.f33528b.f31679b0, this.f40062c).j();
                return;
            default:
                org.telegram.ui.Components.qc.F(this.f40061b.f33528b.f31679b0, this.f40062c).j();
                return;
        }
    }
}
