package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f41250a = 0;
    public final ey f41251b;
    public final ArrayList f41252c;
    public final int d;
    public final boolean e;
    public final HashSet f41253f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f41251b = eyVar;
        this.d = i10;
        this.f41252c = arrayList;
        this.e = z10;
        this.f41253f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f41250a) {
            case 0:
                ey.n0(this.f41251b, this.d, this.f41252c, this.e, this.f41253f);
                return;
            default:
                this.f41251b.p4(this.f41252c, this.d, false, this.e, this.f41253f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f41251b = eyVar;
        this.f41252c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f41253f = hashSet;
    }
}
