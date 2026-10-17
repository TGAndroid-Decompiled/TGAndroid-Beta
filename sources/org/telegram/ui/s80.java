package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class s80 implements Runnable {
    public final int f41036a;
    public final b80 f41037b;

    public s80(b80 b80Var, int i10) {
        this.f41036a = i10;
        this.f41037b = b80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41036a;
        b80 b80Var = this.f41037b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                try {
                    b80Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    b80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    b80Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
