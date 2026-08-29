package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class sv implements Runnable {
    public final int f42466a = 0;
    public final fy f42467b;
    public final ArrayList f42468c;
    public final int d;
    public final boolean f42469e;
    public final HashSet f42470f;

    public sv(fy fyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f42467b = fyVar;
        this.d = i10;
        this.f42468c = arrayList;
        this.f42469e = z10;
        this.f42470f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f42466a) {
            case 0:
                fy.o0(this.f42467b, this.d, this.f42468c, this.f42469e, this.f42470f);
                return;
            default:
                this.f42467b.r4(this.f42468c, this.d, false, this.f42469e, this.f42470f);
                return;
        }
    }

    public sv(fy fyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f42467b = fyVar;
        this.f42468c = arrayList;
        this.d = i10;
        this.f42469e = z10;
        this.f42470f = hashSet;
    }
}
