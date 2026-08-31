package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final int f41357a;
    public final yr0 f41358b;
    public final boolean f41359c;

    public sr0(yr0 yr0Var, boolean z4, int i10) {
        this.f41357a = i10;
        this.f41358b = yr0Var;
        this.f41359c = z4;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41357a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.f41358b.f43699b.f34230b0, this.f41359c).j();
                return;
            default:
                org.telegram.ui.Components.qc.F(this.f41358b.f43699b.f34230b0, this.f41359c).j();
                return;
        }
    }
}
