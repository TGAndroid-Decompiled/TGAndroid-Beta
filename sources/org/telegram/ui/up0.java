package org.telegram.ui;

import android.net.Uri;
public final class up0 implements org.telegram.messenger.q20 {
    public final int f42511a;
    public final aq0 f42512b;
    public final boolean f42513c;

    public up0(aq0 aq0Var, boolean z10, int i10) {
        this.f42511a = i10;
        this.f42512b = aq0Var;
        this.f42513c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42511a) {
            case 0:
                org.telegram.ui.Components.cc.F(this.f42512b.f35697b.f33470e0, this.f42513c).j();
                return;
            default:
                org.telegram.ui.Components.cc.F(this.f42512b.f35697b.f33470e0, this.f42513c).j();
                return;
        }
    }
}
