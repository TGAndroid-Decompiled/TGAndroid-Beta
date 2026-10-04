package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class v80 implements Runnable {
    public final int f41603a;
    public final h90 f41604b;

    public v80(h90 h90Var, int i10) {
        this.f41603a = i10;
        this.f41604b = h90Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41603a;
        h90 h90Var = this.f41604b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
