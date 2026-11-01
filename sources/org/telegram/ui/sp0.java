package org.telegram.ui;

import android.net.Uri;
public final class sp0 implements org.telegram.messenger.r20 {
    public final int f41430a;
    public final yp0 f41431b;
    public final boolean f41432c;

    public sp0(yp0 yp0Var, boolean z10, int i10) {
        this.f41430a = i10;
        this.f41431b = yp0Var;
        this.f41432c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41430a) {
            case 0:
                org.telegram.ui.Components.cc.F(this.f41431b.f43706b.f33477e0, this.f41432c).j();
                return;
            default:
                org.telegram.ui.Components.cc.F(this.f41431b.f43706b.f33477e0, this.f41432c).j();
                return;
        }
    }
}
