package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements y31 {
    public final boolean[] f37636a;
    public final Utilities.Callback f37637b;
    public final org.telegram.ui.Components.xc f37638c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f37636a = zArr;
        this.f37637b = callback;
        this.f37638c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37636a;
        if (!zArr[0] && (callback = this.f37637b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new e01(this.f37638c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
