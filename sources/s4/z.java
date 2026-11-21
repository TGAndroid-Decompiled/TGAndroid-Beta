package s4;

import android.os.Bundle;
public final class z {
    public final int f57110a;
    public final boolean f57111b;
    public final boolean f57112c;
    public final boolean d;
    public final Bundle f57113e;

    public z(y yVar) {
        Bundle bundle;
        this.f57110a = yVar.f57106a;
        this.f57111b = yVar.f57107b;
        this.f57112c = yVar.f57108c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f57109e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f57113e = bundle;
    }
}
