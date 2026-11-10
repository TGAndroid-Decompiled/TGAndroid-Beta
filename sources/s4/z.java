package s4;

import android.os.Bundle;
public final class z {
    public final int f54939a;
    public final boolean f54940b;
    public final boolean f54941c;
    public final boolean d;
    public final Bundle f54942e;

    public z(y yVar) {
        Bundle bundle;
        this.f54939a = yVar.f54935a;
        this.f54940b = yVar.f54936b;
        this.f54941c = yVar.f54937c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54938e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54942e = bundle;
    }
}
