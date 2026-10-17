package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f42040a;
    public final as0 f42041b;
    public final boolean f42042c;

    public ur0(as0 as0Var, boolean z10, int i10) {
        this.f42040a = i10;
        this.f42041b = as0Var;
        this.f42042c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42040a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f42041b.f35490b.f33266e0, this.f42042c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f42041b.f35490b.f33266e0, this.f42042c).j();
                return;
        }
    }
}
