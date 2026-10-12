package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u31 implements a41 {
    public final boolean[] f42360a;
    public final Utilities.Callback f42361b;
    public final org.telegram.ui.Components.zc f42362c;

    public u31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar) {
        this.f42360a = zArr;
        this.f42361b = callback;
        this.f42362c = zcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f42360a;
        if (!zArr[0] && (callback = this.f42361b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new pz0(this.f42362c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
