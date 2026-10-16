package p4;

import android.os.Bundle;
public final class z {
    public final int f42843a;
    public final boolean f42844b;
    public final boolean f42845c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f42843a = yVar.f42840a;
        this.f42844b = yVar.f42841b;
        this.f42845c = yVar.f42842c;
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
