package p4;

import android.os.Bundle;
public final class z {
    public final int f43978a;
    public final boolean f43979b;
    public final boolean f43980c;
    public final boolean d;
    public final Bundle f43981e;

    public z(y yVar) {
        Bundle bundle;
        this.f43978a = yVar.f43974a;
        this.f43979b = yVar.f43975b;
        this.f43980c = yVar.f43976c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f43977e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f43981e = bundle;
    }
}
