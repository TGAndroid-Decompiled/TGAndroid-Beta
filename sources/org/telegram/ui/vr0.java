package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class vr0 implements Utilities.Callback {
    public final int f42828a;
    public final bs0 f42829b;
    public final boolean f42830c;

    public vr0(bs0 bs0Var, boolean z10, int i10) {
        this.f42828a = i10;
        this.f42829b = bs0Var;
        this.f42830c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42828a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f42829b.f36162b.f33580e0, this.f42830c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f42829b.f36162b.f33580e0, this.f42830c).j();
                return;
        }
    }
}
