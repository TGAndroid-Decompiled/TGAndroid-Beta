package p4;

import android.os.Bundle;
public final class z {
    public final int f43979a;
    public final boolean f43980b;
    public final boolean f43981c;
    public final boolean d;
    public final Bundle f43982e;

    public z(y yVar) {
        Bundle bundle;
        this.f43979a = yVar.f43975a;
        this.f43980b = yVar.f43976b;
        this.f43981c = yVar.f43977c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f43978e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f43982e = bundle;
    }
}
