package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements y31 {
    public final boolean[] f37612a;
    public final Utilities.Callback f37613b;
    public final org.telegram.ui.Components.xc f37614c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f37612a = zArr;
        this.f37613b = callback;
        this.f37614c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37612a;
        if (!zArr[0] && (callback = this.f37613b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new e01(this.f37614c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
