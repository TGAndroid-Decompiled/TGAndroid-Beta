package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class so implements Runnable {
    public final int f52119a;
    public final to f52120b;
    public final String f52121c;

    public so(to toVar, String str, int i7) {
        this.f52119a = i7;
        this.f52120b = toVar;
        this.f52121c = str;
    }

    @Override
    public final void run() {
        switch (this.f52119a) {
            case 0:
                to toVar = this.f52120b;
                String str = this.f52121c;
                toVar.getClass();
                org.telegram.messenger.g0.g3(new so(toVar, str, 1));
                return;
            default:
                to toVar2 = this.f52120b;
                String str2 = this.f52121c;
                toVar2.f52438f = null;
                Utilities.f22879g.c(new o1(toVar2, str2, new ArrayList(toVar2.h.f52704w), 28));
                return;
        }
    }
}
