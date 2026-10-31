package org.telegram.ui;

import java.util.regex.Pattern;
public final class y70 implements Runnable {
    public final int f43749a;
    public final f70 f43750b;

    public y70(f70 f70Var, int i10) {
        this.f43749a = i10;
        this.f43750b = f70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43749a;
        f70 f70Var = this.f43750b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var.run();
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    f70Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
        }
    }
}
