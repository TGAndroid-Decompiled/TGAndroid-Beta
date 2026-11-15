package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ro implements Runnable {
    public final int f50981a;
    public final so f50982b;
    public final String f50983c;

    public ro(so soVar, String str, int i7) {
        this.f50981a = i7;
        this.f50982b = soVar;
        this.f50983c = str;
    }

    @Override
    public final void run() {
        switch (this.f50981a) {
            case 0:
                so soVar = this.f50982b;
                String str = this.f50983c;
                soVar.getClass();
                org.telegram.messenger.g0.h3(new ro(soVar, str, 1));
                return;
            default:
                so soVar2 = this.f50982b;
                String str2 = this.f50983c;
                soVar2.f51253f = null;
                Utilities.f22418g.c(new o1(soVar2, str2, new ArrayList(soVar2.h.f51626w), 28));
                return;
        }
    }
}
