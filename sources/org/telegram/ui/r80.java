package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class r80 implements Utilities.Callback {
    public final int f41998a;
    public final Runnable f41999b;

    public r80(ih.u5 u5Var, int i10) {
        this.f41998a = i10;
        this.f41999b = u5Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f41998a;
        Runnable runnable = this.f41999b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
