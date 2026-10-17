package p4;

import android.os.Bundle;
public final class z {
    public final int f44253a;
    public final boolean f44254b;
    public final boolean f44255c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44253a = yVar.f44250a;
        this.f44254b = yVar.f44251b;
        this.f44255c = yVar.f44252c;
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
