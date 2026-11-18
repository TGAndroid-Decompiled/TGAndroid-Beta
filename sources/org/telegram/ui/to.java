package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class to implements Runnable {
    public final int f52313a;
    public final uo f52314b;
    public final String f52315c;

    public to(uo uoVar, String str, int i7) {
        this.f52313a = i7;
        this.f52314b = uoVar;
        this.f52315c = str;
    }

    @Override
    public final void run() {
        switch (this.f52313a) {
            case 0:
                uo uoVar = this.f52314b;
                String str = this.f52315c;
                uoVar.getClass();
                org.telegram.messenger.g0.g3(new to(uoVar, str, 1));
                return;
            default:
                uo uoVar2 = this.f52314b;
                String str2 = this.f52315c;
                uoVar2.f52593f = null;
                Utilities.f22781g.c(new o1(uoVar2, str2, new ArrayList(uoVar2.h.f52821w), 28));
                return;
        }
    }
}
