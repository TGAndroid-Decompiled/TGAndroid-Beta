package p4;

import android.os.Bundle;
public final class z {
    public final int f44293a;
    public final boolean f44294b;
    public final boolean f44295c;
    public final boolean d;
    public final Bundle f44296e;

    public z(y yVar) {
        Bundle bundle;
        this.f44293a = yVar.f44289a;
        this.f44294b = yVar.f44290b;
        this.f44295c = yVar.f44291c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f44292e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f44296e = bundle;
    }
}
