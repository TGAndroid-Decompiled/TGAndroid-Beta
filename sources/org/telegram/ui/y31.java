package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y31 implements d41 {
    public final boolean[] f38889a;
    public final Utilities.Callback f38890b;
    public final org.telegram.ui.Components.wc f38891c;

    public y31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.f38889a = zArr;
        this.f38890b = callback;
        this.f38891c = wcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f38889a;
        if (!zArr[0] && (callback = this.f38890b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new k01(this.f38891c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
