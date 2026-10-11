package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s31 implements x31 {
    public final boolean[] f41610a;
    public final Utilities.Callback f41611b;
    public final org.telegram.ui.Components.ad f41612c;

    public s31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar) {
        this.f41610a = zArr;
        this.f41611b = callback;
        this.f41612c = adVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41610a;
        if (!zArr[0] && (callback = this.f41611b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new mz0(this.f41612c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
