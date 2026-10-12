package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zg implements Runnable {
    public final int f44839a;
    public final org.telegram.ui.ActionBar.a2[] f44840b;

    public zg(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f44839a = i10;
        this.f44840b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f44839a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f44840b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f44840b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zg(this.f44840b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zg(this.f44840b, 5));
                return;
            case 4:
                this.f44840b[0].dismiss();
                return;
            default:
                this.f44840b[0].dismiss();
                return;
        }
    }
}
