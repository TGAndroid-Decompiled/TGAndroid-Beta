package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41517a;
    public final yr0 f41518b;
    public final boolean f41519c;

    public sr0(yr0 yr0Var, boolean z10, int i10) {
        this.f41517a = i10;
        this.f41518b = yr0Var;
        this.f41519c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41517a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f41518b.f43543b.f33272e0, this.f41519c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f41518b.f43543b.f33272e0, this.f41519c).j();
                return;
        }
    }
}
