package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class zr0 implements Utilities.Callback {
    public final int f46351a;
    public final fs0 f46352b;
    public final boolean f46353c;

    public zr0(fs0 fs0Var, boolean z10, int i10) {
        this.f46351a = i10;
        this.f46352b = fs0Var;
        this.f46353c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f46351a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.f46352b.f39440b.f35643e0, this.f46353c).j();
                return;
            default:
                org.telegram.ui.Components.wc.F(this.f46352b.f39440b.f35643e0, this.f46353c).j();
                return;
        }
    }
}
