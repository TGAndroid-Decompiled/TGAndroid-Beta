package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f40798a = 0;
    public final ey f40799b;
    public final ArrayList f40800c;
    public final int d;
    public final boolean e;
    public final HashSet f40801f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40799b = eyVar;
        this.d = i10;
        this.f40800c = arrayList;
        this.e = z10;
        this.f40801f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40798a) {
            case 0:
                ey.n0(this.f40799b, this.d, this.f40800c, this.e, this.f40801f);
                return;
            default:
                this.f40799b.p4(this.f40800c, this.d, false, this.e, this.f40801f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40799b = eyVar;
        this.f40800c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40801f = hashSet;
    }
}
