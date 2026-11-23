package org.telegram.ui;
public final class z60 implements Runnable {
    public final int f54538a;
    public final i50 f54539b;

    public z60(i50 i50Var, int i7) {
        this.f54538a = i7;
        this.f54539b = i50Var;
    }

    @Override
    public final void run() {
        int i7 = this.f54538a;
        i50 i50Var = this.f54539b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    i50Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    i50Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    i50Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
