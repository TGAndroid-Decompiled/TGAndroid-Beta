package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f40836a = 0;
    public final ey f40837b;
    public final ArrayList f40838c;
    public final int d;
    public final boolean e;
    public final HashSet f40839f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f40837b = eyVar;
        this.d = i10;
        this.f40838c = arrayList;
        this.e = z10;
        this.f40839f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f40836a) {
            case 0:
                ey.n0(this.f40837b, this.d, this.f40838c, this.e, this.f40839f);
                return;
            default:
                this.f40837b.p4(this.f40838c, this.d, false, this.e, this.f40839f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f40837b = eyVar;
        this.f40838c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f40839f = hashSet;
    }
}
