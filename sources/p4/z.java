package p4;

import android.os.Bundle;
public final class z {
    public final int f41054a;
    public final boolean f41055b;
    public final boolean f41056c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f41054a = yVar.f41051a;
        this.f41055b = yVar.f41052b;
        this.f41056c = yVar.f41053c;
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
