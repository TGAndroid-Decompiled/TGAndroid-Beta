package org.telegram.ui;
public final class zn0 implements Runnable {
    public final int f40292a;
    public final long f40293b;

    public zn0(long j3, int i10) {
        this.f40292a = i10;
        this.f40293b = j3;
    }

    @Override
    public final void run() {
        switch (this.f40292a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(bo.R9(this.f40293b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.R9(this.f40293b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(bo.R9(this.f40293b));
                    return;
                }
                return;
        }
    }
}
