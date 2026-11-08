package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qo implements Runnable {
    public final int f49285a;
    public final ro f49286b;
    public final String f49287c;

    public qo(ro roVar, String str, int i7) {
        this.f49285a = i7;
        this.f49286b = roVar;
        this.f49287c = str;
    }

    @Override
    public final void run() {
        switch (this.f49285a) {
            case 0:
                ro roVar = this.f49286b;
                String str = this.f49287c;
                roVar.getClass();
                org.telegram.messenger.g0.h3(new qo(roVar, str, 1));
                return;
            default:
                ro roVar2 = this.f49286b;
                String str2 = this.f49287c;
                roVar2.f49520f = null;
                Utilities.f21338g.c(new o1(roVar2, str2, new ArrayList(roVar2.h.f49795w), 28));
                return;
        }
    }
}
