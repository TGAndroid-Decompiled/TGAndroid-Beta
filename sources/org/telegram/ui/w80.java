package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class w80 implements Runnable {
    public final int f37746a;
    public final h90 f37747b;

    public w80(h90 h90Var, int i10) {
        this.f37746a = i10;
        this.f37747b = h90Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37746a;
        h90 h90Var = this.f37747b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
