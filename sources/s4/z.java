package s4;

import android.os.Bundle;
public final class z {
    public final int f54928a;
    public final boolean f54929b;
    public final boolean f54930c;
    public final boolean d;
    public final Bundle f54931e;

    public z(y yVar) {
        Bundle bundle;
        this.f54928a = yVar.f54924a;
        this.f54929b = yVar.f54925b;
        this.f54930c = yVar.f54926c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54927e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54931e = bundle;
    }
}
