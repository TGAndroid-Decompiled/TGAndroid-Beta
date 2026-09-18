package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u31 implements z31 {
    public final boolean[] f37935a;
    public final Utilities.Callback f37936b;
    public final org.telegram.ui.Components.vc f37937c;

    public u31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.f37935a = zArr;
        this.f37936b = callback;
        this.f37937c = vcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37935a;
        if (!zArr[0] && (callback = this.f37936b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new g01(this.f37937c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
