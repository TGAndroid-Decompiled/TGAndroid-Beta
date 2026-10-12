package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z31 implements e41 {
    public final boolean[] f42473a;
    public final Utilities.Callback f42474b;
    public final org.telegram.ui.Components.zc f42475c;

    public z31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar) {
        this.f42473a = zArr;
        this.f42474b = callback;
        this.f42475c = zcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f42473a;
        if (!zArr[0] && (callback = this.f42474b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new uz0(this.f42475c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
