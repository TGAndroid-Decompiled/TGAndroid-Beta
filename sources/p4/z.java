package p4;

import android.os.Bundle;
public final class z {
    public final int f40954a;
    public final boolean f40955b;
    public final boolean f40956c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40954a = yVar.f40951a;
        this.f40955b = yVar.f40952b;
        this.f40956c = yVar.f40953c;
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
