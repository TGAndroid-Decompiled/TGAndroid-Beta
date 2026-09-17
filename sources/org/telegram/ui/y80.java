package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class y80 implements Runnable {
    public final int f39810a;
    public final oa0 f39811b;

    public y80(oa0 oa0Var, int i10) {
        this.f39810a = i10;
        this.f39811b = oa0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39810a;
        oa0 oa0Var = this.f39811b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
