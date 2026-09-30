package p4;

import android.os.Bundle;
public final class z {
    public final int f40957a;
    public final boolean f40958b;
    public final boolean f40959c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40957a = yVar.f40954a;
        this.f40958b = yVar.f40955b;
        this.f40959c = yVar.f40956c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
