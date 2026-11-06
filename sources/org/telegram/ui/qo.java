package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qo implements Runnable {
    public final int f49283a;
    public final ro f49284b;
    public final String f49285c;

    public qo(ro roVar, String str, int i7) {
        this.f49283a = i7;
        this.f49284b = roVar;
        this.f49285c = str;
    }

    @Override
    public final void run() {
        switch (this.f49283a) {
            case 0:
                ro roVar = this.f49284b;
                String str = this.f49285c;
                roVar.getClass();
                org.telegram.messenger.g0.h3(new qo(roVar, str, 1));
                return;
            default:
                ro roVar2 = this.f49284b;
                String str2 = this.f49285c;
                roVar2.f49542f = null;
                Utilities.f21335g.c(new o1(roVar2, str2, new ArrayList(roVar2.h.f49805w), 28));
                return;
        }
    }
}
