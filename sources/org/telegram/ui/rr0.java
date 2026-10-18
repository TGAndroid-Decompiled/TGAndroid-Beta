package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final int f40822a;
    public final as0 f40823b;

    public rr0(as0 as0Var, int i10) {
        this.f40822a = i10;
        this.f40823b = as0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40822a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f40823b.f35512b.f33273e0, null).m(org.telegram.ui.Components.wc.f32077r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f40823b.f35512b.f33273e0, null).m(org.telegram.ui.Components.wc.f32077r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
