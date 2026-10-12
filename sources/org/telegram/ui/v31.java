package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v31 implements a41 {
    public final boolean[] f42665a;
    public final Utilities.Callback f42666b;
    public final org.telegram.ui.Components.zc f42667c;

    public v31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar) {
        this.f42665a = zArr;
        this.f42666b = callback;
        this.f42667c = zcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f42665a;
        if (!zArr[0] && (callback = this.f42666b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new pz0(this.f42667c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
