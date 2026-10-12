package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class y80 implements Runnable {
    public final int f44327a;
    public final q70 f44328b;

    public y80(q70 q70Var, int i10) {
        this.f44327a = i10;
        this.f44328b = q70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f44327a;
        q70 q70Var = this.f44328b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    q70Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    q70Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    q70Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
