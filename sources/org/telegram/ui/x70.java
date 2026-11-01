package org.telegram.ui;

import java.util.regex.Pattern;
public final class x70 implements Runnable {
    public final int f43276a;
    public final y60 f43277b;

    public x70(y60 y60Var, int i10) {
        this.f43276a = i10;
        this.f43277b = y60Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43276a;
        y60 y60Var = this.f43277b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    y60Var.run();
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    y60Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
        }
    }
}
