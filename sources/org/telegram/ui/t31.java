package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements y31 {
    public final boolean[] f41835a;
    public final Utilities.Callback f41836b;
    public final org.telegram.ui.Components.ad f41837c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar) {
        this.f41835a = zArr;
        this.f41836b = callback;
        this.f41837c = adVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41835a;
        if (!zArr[0] && (callback = this.f41836b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new nz0(this.f41837c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
