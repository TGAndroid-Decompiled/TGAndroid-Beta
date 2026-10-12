package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ts0 implements Utilities.Callback {
    public final int f40480a;
    public final zs0 f40481b;
    public final boolean f40482c;

    public ts0(zs0 zs0Var, boolean z10, int i10) {
        this.f40480a = i10;
        this.f40481b = zs0Var;
        this.f40482c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40480a) {
            case 0:
                org.telegram.ui.Components.zc.F(this.f40481b.f42710b.f32226e0, this.f40482c).j();
                return;
            default:
                org.telegram.ui.Components.zc.F(this.f40481b.f42710b.f32226e0, this.f40482c).j();
                return;
        }
    }
}
