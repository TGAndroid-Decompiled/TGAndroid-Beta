package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

public final class s80 implements Utilities.Callback {

    public final int f42552a;

    public final Runnable f42553b;

    public s80(gh.b6 b6Var, int i10) {
        this.f42552a = i10;
        this.f42553b = b6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42552a;
        Runnable runnable = this.f42553b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
