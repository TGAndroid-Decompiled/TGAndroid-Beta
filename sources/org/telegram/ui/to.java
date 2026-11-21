package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class to implements Runnable {
    public final int f52359a;
    public final uo f52360b;
    public final String f52361c;

    public to(uo uoVar, String str, int i7) {
        this.f52359a = i7;
        this.f52360b = uoVar;
        this.f52361c = str;
    }

    @Override
    public final void run() {
        switch (this.f52359a) {
            case 0:
                uo uoVar = this.f52360b;
                String str = this.f52361c;
                uoVar.getClass();
                org.telegram.messenger.g0.g3(new to(uoVar, str, 1));
                return;
            default:
                uo uoVar2 = this.f52360b;
                String str2 = this.f52361c;
                uoVar2.f52610f = null;
                Utilities.f22809g.c(new o1(uoVar2, str2, new ArrayList(uoVar2.h.f52863w), 28));
                return;
        }
    }
}
