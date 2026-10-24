package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f41237a = 0;
    public final ey f41238b;
    public final ArrayList f41239c;
    public final int d;
    public final boolean e;
    public final HashSet f41240f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f41238b = eyVar;
        this.d = i10;
        this.f41239c = arrayList;
        this.e = z10;
        this.f41240f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f41237a) {
            case 0:
                ey.n0(this.f41238b, this.d, this.f41239c, this.e, this.f41240f);
                return;
            default:
                this.f41238b.p4(this.f41239c, this.d, false, this.e, this.f41240f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f41238b = eyVar;
        this.f41239c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f41240f = hashSet;
    }
}
