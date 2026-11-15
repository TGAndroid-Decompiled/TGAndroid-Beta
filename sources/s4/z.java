package s4;

import android.os.Bundle;
public final class z {
    public final int f56495a;
    public final boolean f56496b;
    public final boolean f56497c;
    public final boolean d;
    public final Bundle f56498e;

    public z(y yVar) {
        Bundle bundle;
        this.f56495a = yVar.f56491a;
        this.f56496b = yVar.f56492b;
        this.f56497c = yVar.f56493c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f56494e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f56498e = bundle;
    }
}
