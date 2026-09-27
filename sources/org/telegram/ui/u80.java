package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class u80 implements Runnable {
    public final int f38151a;
    public final ea0 f38152b;

    public u80(ea0 ea0Var, int i10) {
        this.f38151a = i10;
        this.f38152b = ea0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38151a;
        ea0 ea0Var = this.f38152b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    ea0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    ea0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    ea0Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
