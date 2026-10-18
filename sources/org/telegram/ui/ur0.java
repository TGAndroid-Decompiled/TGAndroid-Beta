package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f42015a;
    public final as0 f42016b;
    public final boolean f42017c;

    public ur0(as0 as0Var, boolean z10, int i10) {
        this.f42015a = i10;
        this.f42016b = as0Var;
        this.f42017c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f42015a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f42016b.f35473b.f33266e0, this.f42017c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f42016b.f35473b.f33266e0, this.f42017c).j();
                return;
        }
    }
}
