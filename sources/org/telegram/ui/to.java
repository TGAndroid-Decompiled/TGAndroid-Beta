package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class to implements Runnable {
    public final int f52363a;
    public final uo f52364b;
    public final String f52365c;

    public to(uo uoVar, String str, int i7) {
        this.f52363a = i7;
        this.f52364b = uoVar;
        this.f52365c = str;
    }

    @Override
    public final void run() {
        switch (this.f52363a) {
            case 0:
                uo uoVar = this.f52364b;
                String str = this.f52365c;
                uoVar.getClass();
                org.telegram.messenger.g0.g3(new to(uoVar, str, 1));
                return;
            default:
                uo uoVar2 = this.f52364b;
                String str2 = this.f52365c;
                uoVar2.f52614f = null;
                Utilities.f22812g.c(new o1(uoVar2, str2, new ArrayList(uoVar2.h.f52867w), 28));
                return;
        }
    }
}
