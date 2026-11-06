package org.telegram.ui;
public final class z60 implements Runnable {
    public final int f52493a;
    public final q10 f52494b;

    public z60(q10 q10Var, int i7) {
        this.f52493a = i7;
        this.f52494b = q10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f52493a;
        q10 q10Var = this.f52494b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    q10Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.B1;
                try {
                    q10Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.B1;
                try {
                    q10Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
