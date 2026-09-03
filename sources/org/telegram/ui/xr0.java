package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class xr0 implements Utilities.Callback {
    public final int f43441a;
    public final ds0 f43442b;
    public final boolean f43443c;

    public xr0(ds0 ds0Var, boolean z4, int i10) {
        this.f43441a = i10;
        this.f43442b = ds0Var;
        this.f43443c = z4;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f43441a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.f43442b.f36251b.f34230b0, this.f43443c).j();
                return;
            default:
                org.telegram.ui.Components.qc.F(this.f43442b.f36251b.f34230b0, this.f43443c).j();
                return;
        }
    }
}
