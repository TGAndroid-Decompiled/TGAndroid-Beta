package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final int f41215a;
    public final as0 f41216b;

    public rr0(as0 as0Var, int i10) {
        this.f41215a = i10;
        this.f41216b = as0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41215a) {
            case 0:
                new org.telegram.ui.Components.vc(this.f41216b.f35833b.f33582e0, null).m(org.telegram.ui.Components.uc.f31083r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.vc(this.f41216b.f35833b.f33582e0, null).m(org.telegram.ui.Components.uc.f31083r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
