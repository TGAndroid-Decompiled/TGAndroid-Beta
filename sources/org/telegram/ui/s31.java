package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s31 implements x31 {
    public final boolean[] f37246a;
    public final Utilities.Callback f37247b;
    public final org.telegram.ui.Components.vc f37248c;

    public s31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.f37246a = zArr;
        this.f37247b = callback;
        this.f37248c = vcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37246a;
        if (!zArr[0] && (callback = this.f37247b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new e01(this.f37248c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
