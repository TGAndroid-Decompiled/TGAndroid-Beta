package s4;

import android.os.Bundle;
public final class z {
    public final int f54836a;
    public final boolean f54837b;
    public final boolean f54838c;
    public final boolean d;
    public final Bundle f54839e;

    public z(y yVar) {
        Bundle bundle;
        this.f54836a = yVar.f54832a;
        this.f54837b = yVar.f54833b;
        this.f54838c = yVar.f54834c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54835e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54839e = bundle;
    }
}
