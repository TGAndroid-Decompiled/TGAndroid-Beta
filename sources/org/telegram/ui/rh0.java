package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rh0 implements Runnable {
    public final int f51577a;
    public final sh0 f51578b;
    public final String f51579c;

    public rh0(sh0 sh0Var, String str, int i7) {
        this.f51577a = i7;
        this.f51578b = sh0Var;
        this.f51579c = str;
    }

    @Override
    public final void run() {
        switch (this.f51577a) {
            case 0:
                sh0 sh0Var = this.f51578b;
                String str = this.f51579c;
                sh0Var.getClass();
                org.telegram.messenger.g0.g3(new rh0(sh0Var, str, 1));
                return;
            default:
                sh0 sh0Var2 = this.f51578b;
                String str2 = this.f51579c;
                jg.z1 z1Var = sh0Var2.h;
                int i7 = sh0Var2.f52044n.f43164s;
                boolean z10 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f22809g.c(new mc0(sh0Var2, str2, new ArrayList(sh0Var2.f52044n.f43166x), 10));
                return;
        }
    }
}
