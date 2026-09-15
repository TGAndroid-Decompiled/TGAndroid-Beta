package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class w80 implements Runnable {
    public final int f38796a;
    public final ma0 f38797b;

    public w80(ma0 ma0Var, int i10) {
        this.f38796a = i10;
        this.f38797b = ma0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38796a;
        ma0 ma0Var = this.f38797b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
