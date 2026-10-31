package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class qv implements Runnable {
    public final int f41071a = 1;
    public final ay f41072b;
    public final int f41073c;
    public final ArrayList d;
    public final boolean e;
    public final HashSet f41074f;

    public qv(ay ayVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f41072b = ayVar;
        this.f41073c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f41074f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f41071a) {
            case 0:
                this.f41072b.C4(this.d, this.f41073c, false, this.e, this.f41074f);
                return;
            default:
                ay.q0(this.f41072b, this.f41073c, this.d, this.e, this.f41074f);
                return;
        }
    }

    public qv(ay ayVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f41072b = ayVar;
        this.d = arrayList;
        this.f41073c = i10;
        this.e = z10;
        this.f41074f = hashSet;
    }
}
