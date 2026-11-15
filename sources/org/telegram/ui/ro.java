package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ro implements Runnable {
    public final int f50985a;
    public final so f50986b;
    public final String f50987c;

    public ro(so soVar, String str, int i7) {
        this.f50985a = i7;
        this.f50986b = soVar;
        this.f50987c = str;
    }

    @Override
    public final void run() {
        switch (this.f50985a) {
            case 0:
                so soVar = this.f50986b;
                String str = this.f50987c;
                soVar.getClass();
                org.telegram.messenger.g0.h3(new ro(soVar, str, 1));
                return;
            default:
                so soVar2 = this.f50986b;
                String str2 = this.f50987c;
                soVar2.f51252f = null;
                Utilities.f22418g.c(new o1(soVar2, str2, new ArrayList(soVar2.h.f51625w), 28));
                return;
        }
    }
}
