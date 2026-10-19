package p4;

import android.os.Bundle;
public final class z {
    public final int f44223a;
    public final boolean f44224b;
    public final boolean f44225c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44223a = yVar.f44220a;
        this.f44224b = yVar.f44221b;
        this.f44225c = yVar.f44222c;
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
