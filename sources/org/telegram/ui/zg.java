package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zg implements Runnable {
    public final int f40253a;
    public final org.telegram.ui.ActionBar.c2[] f40254b;

    public zg(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f40253a = i10;
        this.f40254b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40253a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f40254b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f40254b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zg(this.f40254b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zg(this.f40254b, 5));
                return;
            case 4:
                this.f40254b[0].dismiss();
                return;
            default:
                this.f40254b[0].dismiss();
                return;
        }
    }
}
