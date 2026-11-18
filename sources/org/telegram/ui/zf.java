package org.telegram.ui;
public final class zf implements Runnable {
    public final int f54494a;
    public final org.telegram.ui.ActionBar.u1[] f54495b;

    public zf(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f54494a = i7;
        this.f54495b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f54494a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f54495b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f54495b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.g3(new zf(this.f54495b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new zf(this.f54495b, 5));
                return;
            case 4:
                this.f54495b[0].dismiss();
                return;
            default:
                this.f54495b[0].dismiss();
                return;
        }
    }
}
