package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class w80 implements Runnable {
    public final int f42960a;
    public final f80 f42961b;

    public w80(f80 f80Var, int i10) {
        this.f42960a = i10;
        this.f42961b = f80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42960a;
        f80 f80Var = this.f42961b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.E1;
                try {
                    f80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.E1;
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
