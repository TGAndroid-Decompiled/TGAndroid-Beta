package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class to implements Runnable {
    public final int f52318a;
    public final uo f52319b;
    public final String f52320c;

    public to(uo uoVar, String str, int i7) {
        this.f52318a = i7;
        this.f52319b = uoVar;
        this.f52320c = str;
    }

    @Override
    public final void run() {
        switch (this.f52318a) {
            case 0:
                uo uoVar = this.f52319b;
                String str = this.f52320c;
                uoVar.getClass();
                org.telegram.messenger.g0.g3(new to(uoVar, str, 1));
                return;
            default:
                uo uoVar2 = this.f52319b;
                String str2 = this.f52320c;
                uoVar2.f52608f = null;
                Utilities.f22784g.c(new o1(uoVar2, str2, new ArrayList(uoVar2.h.f52831w), 28));
                return;
        }
    }
}
