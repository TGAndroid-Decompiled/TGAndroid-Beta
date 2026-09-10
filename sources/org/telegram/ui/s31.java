package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s31 implements Runnable {
    public final int f36541a;
    public final boolean[] f36542b;
    public final Utilities.Callback f36543c;

    public s31(xh.v5 v5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f36541a = 2;
        this.f36542b = zArr;
        this.f36543c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f36541a) {
            case 0:
                boolean[] zArr = this.f36542b;
                if (!zArr[0] && (callback = this.f36543c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(24), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f36542b;
                if (!zArr2[0] && (callback2 = this.f36543c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f36542b;
                if (!zArr3[0] && (callback3 = this.f36543c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public s31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f36541a = i10;
        this.f36542b = zArr;
        this.f36543c = callback;
    }
}
