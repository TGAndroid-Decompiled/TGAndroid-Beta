package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f42495a = 0;
    public final dy f42496b;
    public final ArrayList f42497c;
    public final int d;
    public final boolean f42498e;
    public final HashSet f42499f;

    public rv(dy dyVar, int i9, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f42496b = dyVar;
        this.d = i9;
        this.f42497c = arrayList;
        this.f42498e = z10;
        this.f42499f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f42495a) {
            case 0:
                dy.n0(this.f42496b, this.d, this.f42497c, this.f42498e, this.f42499f);
                return;
            default:
                this.f42496b.r4(this.f42497c, this.d, false, this.f42498e, this.f42499f);
                return;
        }
    }

    public rv(dy dyVar, ArrayList arrayList, int i9, boolean z10, HashSet hashSet) {
        this.f42496b = dyVar;
        this.f42497c = arrayList;
        this.d = i9;
        this.f42498e = z10;
        this.f42499f = hashSet;
    }
}
