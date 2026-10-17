package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f40815a = 0;
    public final ey f40816b;
    public final ArrayList f40817c;
    public final int d;
    public final boolean e;
    public final HashSet f40818f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40816b = eyVar;
        this.d = i10;
        this.f40817c = arrayList;
        this.e = z10;
        this.f40818f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40815a) {
            case 0:
                ey.n0(this.f40816b, this.d, this.f40817c, this.e, this.f40818f);
                return;
            default:
                this.f40816b.p4(this.f40817c, this.d, false, this.e, this.f40818f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40816b = eyVar;
        this.f40817c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40818f = hashSet;
    }
}
