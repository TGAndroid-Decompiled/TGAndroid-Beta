package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class zr0 implements Utilities.Callback {
    public final int f46354a;
    public final fs0 f46355b;
    public final boolean f46356c;

    public zr0(fs0 fs0Var, boolean z10, int i10) {
        this.f46354a = i10;
        this.f46355b = fs0Var;
        this.f46356c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f46354a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.f46355b.f39443b.f35646e0, this.f46356c).j();
                return;
            default:
                org.telegram.ui.Components.wc.F(this.f46355b.f39443b.f35646e0, this.f46356c).j();
                return;
        }
    }
}
