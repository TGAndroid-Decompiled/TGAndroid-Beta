package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41516a;
    public final yr0 f41517b;
    public final boolean f41518c;

    public sr0(yr0 yr0Var, boolean z10, int i10) {
        this.f41516a = i10;
        this.f41517b = yr0Var;
        this.f41518c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41516a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f41517b.f43538b.f33272e0, this.f41518c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f41517b.f43538b.f33272e0, this.f41518c).j();
                return;
        }
    }
}
