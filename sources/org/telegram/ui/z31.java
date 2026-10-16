package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z31 implements e41 {
    public final boolean[] f42147a;
    public final Utilities.Callback f42148b;
    public final org.telegram.ui.Components.zc f42149c;

    public z31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar) {
        this.f42147a = zArr;
        this.f42148b = callback;
        this.f42149c = zcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f42147a;
        if (!zArr[0] && (callback = this.f42148b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new tz0(this.f42149c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
