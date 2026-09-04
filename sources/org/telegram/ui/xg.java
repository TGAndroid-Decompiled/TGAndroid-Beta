package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xg implements Runnable {
    public final int f42722a;
    public final org.telegram.ui.ActionBar.b2[] f42723b;

    public xg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f42722a = i10;
        this.f42723b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f42722a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f42723b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f42723b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xg(this.f42723b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xg(this.f42723b, 5));
                return;
            case 4:
                this.f42723b[0].dismiss();
                return;
            default:
                this.f42723b[0].dismiss();
                return;
        }
    }
}
