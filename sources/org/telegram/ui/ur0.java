package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f42057a;
    public final as0 f42058b;
    public final boolean f42059c;

    public ur0(as0 as0Var, boolean z10, int i10) {
        this.f42057a = i10;
        this.f42058b = as0Var;
        this.f42059c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42057a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f42058b.f35512b.f33273e0, this.f42059c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f42058b.f35512b.f33273e0, this.f42059c).j();
                return;
        }
    }
}
