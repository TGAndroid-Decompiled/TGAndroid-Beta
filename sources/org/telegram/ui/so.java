package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class so implements Runnable {
    public final int f49963a;
    public final to f49964b;
    public final String f49965c;

    public so(to toVar, String str, int i7) {
        this.f49963a = i7;
        this.f49964b = toVar;
        this.f49965c = str;
    }

    @Override
    public final void run() {
        switch (this.f49963a) {
            case 0:
                to toVar = this.f49964b;
                String str = this.f49965c;
                toVar.getClass();
                org.telegram.messenger.g0.h3(new so(toVar, str, 1));
                return;
            default:
                to toVar2 = this.f49964b;
                String str2 = this.f49965c;
                toVar2.f50210f = null;
                Utilities.f21338g.c(new o1(toVar2, str2, new ArrayList(toVar2.h.f50439w), 28));
                return;
        }
    }
}
