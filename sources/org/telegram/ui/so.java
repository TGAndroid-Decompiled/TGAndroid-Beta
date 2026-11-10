package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class so implements Runnable {
    public final int f49902a;
    public final to f49903b;
    public final String f49904c;

    public so(to toVar, String str, int i7) {
        this.f49902a = i7;
        this.f49903b = toVar;
        this.f49904c = str;
    }

    @Override
    public final void run() {
        switch (this.f49902a) {
            case 0:
                to toVar = this.f49903b;
                String str = this.f49904c;
                toVar.getClass();
                org.telegram.messenger.g0.h3(new so(toVar, str, 1));
                return;
            default:
                to toVar2 = this.f49903b;
                String str2 = this.f49904c;
                toVar2.f50314f = null;
                Utilities.f21343g.c(new o1(toVar2, str2, new ArrayList(toVar2.h.f50535w), 28));
                return;
        }
    }
}
