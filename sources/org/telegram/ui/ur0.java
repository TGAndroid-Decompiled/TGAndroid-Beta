package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f38907a;
    public final ds0 f38908b;

    public ur0(ds0 ds0Var, int i10) {
        this.f38907a = i10;
        this.f38908b = ds0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38907a) {
            case 0:
                new org.telegram.ui.Components.qc(this.f38908b.f33528b.f31679b0, null).m(org.telegram.ui.Components.pc.f27820r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.qc(this.f38908b.f33528b.f31679b0, null).m(org.telegram.ui.Components.pc.f27820r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
