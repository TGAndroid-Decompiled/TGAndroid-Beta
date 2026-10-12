package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements Runnable {
    public final int f40285a;
    public final boolean[] f40286b;
    public final Utilities.Callback f40287c;

    public t31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f40285a = i10;
        this.f40286b = zArr;
        this.f40287c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f40285a) {
            case 0:
                boolean[] zArr = this.f40286b;
                if (!zArr[0] && (callback = this.f40287c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new b31(2), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f40286b;
                if (!zArr2[0] && (callback2 = this.f40287c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f40286b;
                if (!zArr3[0] && (callback3 = this.f40287c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public t31(zh.n5 n5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f40285a = 2;
        this.f40286b = zArr;
        this.f40287c = callback;
    }
}
