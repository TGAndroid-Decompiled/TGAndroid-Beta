package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41794a;
    public final bs0 f41795b;

    public sr0(bs0 bs0Var, int i10) {
        this.f41794a = i10;
        this.f41795b = bs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41794a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f41795b.f36162b.f33580e0, null).m(org.telegram.ui.Components.wc.f32214r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f41795b.f36162b.f33580e0, null).m(org.telegram.ui.Components.wc.f32214r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
