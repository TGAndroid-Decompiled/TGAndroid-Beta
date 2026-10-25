package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class wr0 implements Utilities.Callback {
    public final int f45542a;
    public final fs0 f45543b;

    public wr0(fs0 fs0Var, int i10) {
        this.f45542a = i10;
        this.f45543b = fs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f45542a) {
            case 0:
                new org.telegram.ui.Components.wc(this.f45543b.f39440b.f35643e0, null).m(org.telegram.ui.Components.vc.f33627r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.wc(this.f45543b.f39440b.f35643e0, null).m(org.telegram.ui.Components.vc.f33627r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
