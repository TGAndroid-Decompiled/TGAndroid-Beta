package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class so implements Runnable {
    public final int f52059a;
    public final to f52060b;
    public final String f52061c;

    public so(to toVar, String str, int i7) {
        this.f52059a = i7;
        this.f52060b = toVar;
        this.f52061c = str;
    }

    @Override
    public final void run() {
        switch (this.f52059a) {
            case 0:
                to toVar = this.f52060b;
                String str = this.f52061c;
                toVar.getClass();
                org.telegram.messenger.g0.g3(new so(toVar, str, 1));
                return;
            default:
                to toVar2 = this.f52060b;
                String str2 = this.f52061c;
                toVar2.f52311f = null;
                Utilities.f22776g.c(new o1(toVar2, str2, new ArrayList(toVar2.h.f52605w), 28));
                return;
        }
    }
}
