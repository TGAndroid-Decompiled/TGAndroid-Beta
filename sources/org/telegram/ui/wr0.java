package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class wr0 implements Utilities.Callback {
    public final int f45545a;
    public final fs0 f45546b;

    public wr0(fs0 fs0Var, int i10) {
        this.f45545a = i10;
        this.f45546b = fs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f45545a) {
            case 0:
                new org.telegram.ui.Components.wc(this.f45546b.f39443b.f35646e0, null).m(org.telegram.ui.Components.vc.f33630r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.wc(this.f45546b.f39443b.f35646e0, null).m(org.telegram.ui.Components.vc.f33630r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
