package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class w80 implements Runnable {
    public final int f42946a;
    public final f80 f42947b;

    public w80(f80 f80Var, int i10) {
        this.f42946a = i10;
        this.f42947b = f80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42946a;
        f80 f80Var = this.f42947b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    f80Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    f80Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
