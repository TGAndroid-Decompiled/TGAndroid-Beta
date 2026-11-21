package org.telegram.ui;
public final class zf implements Runnable {
    public final int f54537a;
    public final org.telegram.ui.ActionBar.t1[] f54538b;

    public zf(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f54537a = i7;
        this.f54538b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f54537a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f54538b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f54538b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.g3(new zf(this.f54538b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new zf(this.f54538b, 5));
                return;
            case 4:
                this.f54538b[0].dismiss();
                return;
            default:
                this.f54538b[0].dismiss();
                return;
        }
    }
}
