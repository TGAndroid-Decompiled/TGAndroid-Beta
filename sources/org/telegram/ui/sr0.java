package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41525a;
    public final yr0 f41526b;
    public final boolean f41527c;

    public sr0(yr0 yr0Var, boolean z10, int i10) {
        this.f41525a = i10;
        this.f41526b = yr0Var;
        this.f41527c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41525a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f41526b.f43547b.f33282e0, this.f41527c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f41526b.f43547b.f33282e0, this.f41527c).j();
                return;
        }
    }
}
