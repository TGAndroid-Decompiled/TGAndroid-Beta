package org.telegram.ui;
public final class z60 implements Runnable {
    public final int f54444a;
    public final n60 f54445b;

    public z60(n60 n60Var, int i7) {
        this.f54444a = i7;
        this.f54445b = n60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f54444a;
        n60 n60Var = this.f54445b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    n60Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    n60Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    n60Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
