package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xg implements Runnable {
    public final int f42723a;
    public final org.telegram.ui.ActionBar.b2[] f42724b;

    public xg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f42723a = i10;
        this.f42724b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f42723a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f42724b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f42724b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xg(this.f42724b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xg(this.f42724b, 5));
                return;
            case 4:
                this.f42724b[0].dismiss();
                return;
            default:
                this.f42724b[0].dismiss();
                return;
        }
    }
}
