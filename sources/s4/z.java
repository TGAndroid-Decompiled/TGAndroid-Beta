package s4;

import android.os.Bundle;
public final class z {
    public final int f54927a;
    public final boolean f54928b;
    public final boolean f54929c;
    public final boolean d;
    public final Bundle f54930e;

    public z(y yVar) {
        Bundle bundle;
        this.f54927a = yVar.f54923a;
        this.f54928b = yVar.f54924b;
        this.f54929c = yVar.f54925c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54926e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54930e = bundle;
    }
}
