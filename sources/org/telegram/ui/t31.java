package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t31 implements Runnable {
    public final int f40000a;
    public final boolean[] f40001b;
    public final Utilities.Callback f40002c;

    public t31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f40000a = i10;
        this.f40001b = zArr;
        this.f40002c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f40000a) {
            case 0:
                boolean[] zArr = this.f40001b;
                if (!zArr[0] && (callback = this.f40002c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new b31(2), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f40001b;
                if (!zArr2[0] && (callback2 = this.f40002c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f40001b;
                if (!zArr3[0] && (callback3 = this.f40002c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public t31(zh.n5 n5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f40000a = 2;
        this.f40001b = zArr;
        this.f40002c = callback;
    }
}
