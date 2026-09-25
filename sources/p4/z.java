package p4;

import android.os.Bundle;
public final class z {
    public final int f40956a;
    public final boolean f40957b;
    public final boolean f40958c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40956a = yVar.f40953a;
        this.f40957b = yVar.f40954b;
        this.f40958c = yVar.f40955c;
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
