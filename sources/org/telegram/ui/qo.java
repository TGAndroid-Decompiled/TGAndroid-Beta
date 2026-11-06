package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qo implements Runnable {
    public final int f49282a;
    public final ro f49283b;
    public final String f49284c;

    public qo(ro roVar, String str, int i7) {
        this.f49282a = i7;
        this.f49283b = roVar;
        this.f49284c = str;
    }

    @Override
    public final void run() {
        switch (this.f49282a) {
            case 0:
                ro roVar = this.f49283b;
                String str = this.f49284c;
                roVar.getClass();
                org.telegram.messenger.g0.h3(new qo(roVar, str, 1));
                return;
            default:
                ro roVar2 = this.f49283b;
                String str2 = this.f49284c;
                roVar2.f49541f = null;
                Utilities.f21335g.c(new o1(roVar2, str2, new ArrayList(roVar2.h.f49804w), 28));
                return;
        }
    }
}
