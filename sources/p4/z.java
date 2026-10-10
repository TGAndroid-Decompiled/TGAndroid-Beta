package p4;

import android.os.Bundle;
public final class z {
    public final int f45517a;
    public final boolean f45518b;
    public final boolean f45519c;
    public final boolean d;
    public final Bundle f45520e;

    public z(y yVar) {
        Bundle bundle;
        this.f45517a = yVar.f45513a;
        this.f45518b = yVar.f45514b;
        this.f45519c = yVar.f45515c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f45516e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45520e = bundle;
    }
}
