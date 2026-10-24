package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f42479a;
    public final as0 f42480b;
    public final boolean f42481c;

    public ur0(as0 as0Var, boolean z10, int i10) {
        this.f42479a = i10;
        this.f42480b = as0Var;
        this.f42481c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42479a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.f42480b.f35833b.f33582e0, this.f42481c).j();
                return;
            default:
                org.telegram.ui.Components.vc.F(this.f42480b.f35833b.f33582e0, this.f42481c).j();
                return;
        }
    }
}
