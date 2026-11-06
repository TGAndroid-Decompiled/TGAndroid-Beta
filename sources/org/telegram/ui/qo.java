package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qo implements Runnable {
    public final int f49256a;
    public final ro f49257b;
    public final String f49258c;

    public qo(ro roVar, String str, int i7) {
        this.f49256a = i7;
        this.f49257b = roVar;
        this.f49258c = str;
    }

    @Override
    public final void run() {
        switch (this.f49256a) {
            case 0:
                ro roVar = this.f49257b;
                String str = this.f49258c;
                roVar.getClass();
                org.telegram.messenger.g0.h3(new qo(roVar, str, 1));
                return;
            default:
                ro roVar2 = this.f49257b;
                String str2 = this.f49258c;
                roVar2.f49522f = null;
                Utilities.f21335g.c(new o1(roVar2, str2, new ArrayList(roVar2.h.f49784w), 28));
                return;
        }
    }
}
