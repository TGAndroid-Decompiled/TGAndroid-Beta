package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class qu implements Runnable {
    public final int f49151a = 1;
    public final zw f49152b;
    public final int f49153c;
    public final ArrayList d;
    public final boolean f49154e;
    public final HashSet f49155f;

    public qu(zw zwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.f49152b = zwVar;
        this.f49153c = i7;
        this.d = arrayList;
        this.f49154e = z9;
        this.f49155f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f49151a) {
            case 0:
                this.f49152b.D4(this.d, this.f49153c, false, this.f49154e, this.f49155f);
                return;
            default:
                zw.r0(this.f49152b, this.f49153c, this.d, this.f49154e, this.f49155f);
                return;
        }
    }

    public qu(zw zwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.f49152b = zwVar;
        this.d = arrayList;
        this.f49153c = i7;
        this.f49154e = z9;
        this.f49155f = hashSet;
    }
}
