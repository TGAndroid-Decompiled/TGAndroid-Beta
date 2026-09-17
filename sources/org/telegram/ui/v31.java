package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v31 implements a41 {
    public final boolean[] f41406a;
    public final Utilities.Callback f41407b;
    public final org.telegram.ui.Components.yc f41408c;

    public v31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.f41406a = zArr;
        this.f41407b = callback;
        this.f41408c = ycVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41406a;
        if (!zArr[0] && (callback = this.f41407b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new f01(this.f41408c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
