package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41522a;
    public final yr0 f41523b;
    public final boolean f41524c;

    public sr0(yr0 yr0Var, boolean z10, int i10) {
        this.f41522a = i10;
        this.f41523b = yr0Var;
        this.f41524c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41522a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f41523b.f43544b.f33279e0, this.f41524c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f41523b.f43544b.f33279e0, this.f41524c).j();
                return;
        }
    }
}
