package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41526a;
    public final yr0 f41527b;
    public final boolean f41528c;

    public sr0(yr0 yr0Var, boolean z10, int i10) {
        this.f41526a = i10;
        this.f41527b = yr0Var;
        this.f41528c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41526a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f41527b.f43548b.f33283e0, this.f41528c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f41527b.f43548b.f33283e0, this.f41528c).j();
                return;
        }
    }
}
