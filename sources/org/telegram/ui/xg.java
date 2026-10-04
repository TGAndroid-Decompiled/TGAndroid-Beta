package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xg implements Runnable {
    public final int f42887a;
    public final org.telegram.ui.ActionBar.b2[] f42888b;

    public xg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f42887a = i10;
        this.f42888b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f42887a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f42888b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f42888b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xg(this.f42888b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xg(this.f42888b, 5));
                return;
            case 4:
                this.f42888b[0].dismiss();
                return;
            default:
                this.f42888b[0].dismiss();
                return;
        }
    }
}
