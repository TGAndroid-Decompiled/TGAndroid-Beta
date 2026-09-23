package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class t80 implements Runnable {
    public final int f37558a;
    public final ia0 f37559b;

    public t80(ia0 ia0Var, int i10) {
        this.f37558a = i10;
        this.f37559b = ia0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37558a;
        ia0 ia0Var = this.f37559b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    ia0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    ia0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    ia0Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
