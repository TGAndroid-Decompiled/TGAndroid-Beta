package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class yr0 implements Utilities.Callback {
    public final int f46073a;
    public final hs0 f46074b;

    public yr0(hs0 hs0Var, int i10) {
        this.f46073a = i10;
        this.f46074b = hs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f46073a) {
            case 0:
                new org.telegram.ui.Components.wc(this.f46074b.f39958b.f35670e0, null).m(org.telegram.ui.Components.vc.f33667r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.wc(this.f46074b.f39958b.f35670e0, null).m(org.telegram.ui.Components.vc.f33667r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
