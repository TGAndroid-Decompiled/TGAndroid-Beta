package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class rv implements Runnable {
    public final int f43174a = 0;
    public final ey f43175b;
    public final ArrayList f43176c;
    public final int d;
    public final boolean e;
    public final HashSet f43177f;

    public rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f43175b = eyVar;
        this.d = i10;
        this.f43176c = arrayList;
        this.e = z10;
        this.f43177f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f43174a) {
            case 0:
                ey.n0(this.f43175b, this.d, this.f43176c, this.e, this.f43177f);
                return;
            default:
                this.f43175b.z4(this.f43176c, this.d, false, this.e, this.f43177f);
                return;
        }
    }

    public rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f43175b = eyVar;
        this.f43176c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f43177f = hashSet;
    }
}
