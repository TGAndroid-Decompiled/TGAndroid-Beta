package p4;

import android.os.Bundle;
public final class z {
    public final int f40955a;
    public final boolean f40956b;
    public final boolean f40957c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40955a = yVar.f40952a;
        this.f40956b = yVar.f40953b;
        this.f40957c = yVar.f40954c;
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
