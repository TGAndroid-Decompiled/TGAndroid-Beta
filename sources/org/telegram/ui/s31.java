package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s31 implements x31 {
    public final boolean[] f37192a;
    public final Utilities.Callback f37193b;
    public final org.telegram.ui.Components.xc f37194c;

    public s31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f37192a = zArr;
        this.f37193b = callback;
        this.f37194c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37192a;
        if (!zArr[0] && (callback = this.f37193b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new e01(this.f37194c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
