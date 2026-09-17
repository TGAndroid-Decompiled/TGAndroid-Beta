package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u31 implements z31 {
    public final boolean[] f37930a;
    public final Utilities.Callback f37931b;
    public final org.telegram.ui.Components.vc f37932c;

    public u31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.f37930a = zArr;
        this.f37931b = callback;
        this.f37932c = vcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37930a;
        if (!zArr[0] && (callback = this.f37931b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new g01(this.f37932c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
