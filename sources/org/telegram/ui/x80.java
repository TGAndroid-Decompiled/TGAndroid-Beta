package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class x80 implements Runnable {
    public final int f42615a;
    public final r80 f42616b;

    public x80(r80 r80Var, int i10) {
        this.f42615a = i10;
        this.f42616b = r80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42615a;
        r80 r80Var = this.f42616b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    r80Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    r80Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
