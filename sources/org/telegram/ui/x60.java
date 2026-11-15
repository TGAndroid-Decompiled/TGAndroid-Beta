package org.telegram.ui;
public final class x60 implements Runnable {
    public final int f53112a;
    public final g50 f53113b;

    public x60(g50 g50Var, int i7) {
        this.f53112a = i7;
        this.f53113b = g50Var;
    }

    @Override
    public final void run() {
        int i7 = this.f53112a;
        g50 g50Var = this.f53113b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    g50Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
