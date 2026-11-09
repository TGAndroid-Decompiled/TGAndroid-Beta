package s4;

import android.os.Bundle;
public final class z {
    public final int f54940a;
    public final boolean f54941b;
    public final boolean f54942c;
    public final boolean d;
    public final Bundle f54943e;

    public z(y yVar) {
        Bundle bundle;
        this.f54940a = yVar.f54936a;
        this.f54941b = yVar.f54937b;
        this.f54942c = yVar.f54938c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54939e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54943e = bundle;
    }
}
