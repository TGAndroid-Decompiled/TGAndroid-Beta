package p4;

import android.os.Bundle;
public final class z {
    public final int f44292a;
    public final boolean f44293b;
    public final boolean f44294c;
    public final boolean d;
    public final Bundle f44295e;

    public z(y yVar) {
        Bundle bundle;
        this.f44292a = yVar.f44288a;
        this.f44293b = yVar.f44289b;
        this.f44294c = yVar.f44290c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f44291e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f44295e = bundle;
    }
}
