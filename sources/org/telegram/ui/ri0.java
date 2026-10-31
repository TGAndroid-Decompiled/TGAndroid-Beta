package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ri0 implements Runnable {
    public final int f41236a;
    public final si0 f41237b;
    public final String f41238c;

    public ri0(si0 si0Var, String str, int i10) {
        this.f41236a = i10;
        this.f41237b = si0Var;
        this.f41238c = str;
    }

    @Override
    public final void run() {
        switch (this.f41236a) {
            case 0:
                si0 si0Var = this.f41237b;
                String str = this.f41238c;
                si0Var.getClass();
                org.telegram.messenger.i0.g3(new ri0(si0Var, str, 1));
                return;
            default:
                si0 si0Var2 = this.f41237b;
                String str2 = this.f41238c;
                zf.m1 m1Var = si0Var2.h;
                int i10 = si0Var2.f41529n.f33403s;
                boolean z10 = true;
                m1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f14522g.c(new qd0(si0Var2, str2, new ArrayList(si0Var2.f41529n.f33405x), 11));
                return;
        }
    }
}
