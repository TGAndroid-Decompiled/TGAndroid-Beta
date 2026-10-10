package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements y31 {
    public final boolean[] f41879a;
    public final Utilities.Callback f41880b;
    public final org.telegram.ui.Components.ad f41881c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar) {
        this.f41879a = zArr;
        this.f41880b = callback;
        this.f41881c = adVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41879a;
        if (!zArr[0] && (callback = this.f41880b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new nz0(this.f41881c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
