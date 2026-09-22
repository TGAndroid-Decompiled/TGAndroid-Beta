package p4;

import android.os.Bundle;
public final class z {
    public final int f41003a;
    public final boolean f41004b;
    public final boolean f41005c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f41003a = yVar.f41000a;
        this.f41004b = yVar.f41001b;
        this.f41005c = yVar.f41002c;
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
