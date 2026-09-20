package p4;

import android.os.Bundle;
public final class z {
    public final int f40982a;
    public final boolean f40983b;
    public final boolean f40984c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40982a = yVar.f40979a;
        this.f40983b = yVar.f40980b;
        this.f40984c = yVar.f40981c;
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
