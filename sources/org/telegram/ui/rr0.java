package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final int f40801a;
    public final as0 f40802b;

    public rr0(as0 as0Var, int i10) {
        this.f40801a = i10;
        this.f40802b = as0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40801a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f40802b.f35490b.f33266e0, null).m(org.telegram.ui.Components.wc.f32070r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f40802b.f35490b.f33266e0, null).m(org.telegram.ui.Components.wc.f32070r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
