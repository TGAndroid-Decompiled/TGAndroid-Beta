package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

public final class uv implements Runnable {

    public final int f43293a = 0;

    public final gy f43294b;

    public final ArrayList f43295c;
    public final int d;

    public final boolean f43296e;

    public final HashSet f43297f;

    public uv(gy gyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f43294b = gyVar;
        this.d = i10;
        this.f43295c = arrayList;
        this.f43296e = z10;
        this.f43297f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f43293a) {
            case 0:
                gy.o0(this.f43294b, this.d, this.f43295c, this.f43296e, this.f43297f);
                break;
            default:
                this.f43294b.r4(this.f43295c, this.d, false, this.f43296e, this.f43297f);
                break;
        }
    }

    public uv(gy gyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f43294b = gyVar;
        this.f43295c = arrayList;
        this.d = i10;
        this.f43296e = z10;
        this.f43297f = hashSet;
    }
}
