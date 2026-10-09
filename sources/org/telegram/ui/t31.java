package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements y31 {
    public final boolean[] f41833a;
    public final Utilities.Callback f41834b;
    public final org.telegram.ui.Components.ad f41835c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar) {
        this.f41833a = zArr;
        this.f41834b = callback;
        this.f41835c = adVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41833a;
        if (!zArr[0] && (callback = this.f41834b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new nz0(this.f41835c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
