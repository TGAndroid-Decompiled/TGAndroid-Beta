package s4;

import android.os.Bundle;
public final class z {
    public final int f57114a;
    public final boolean f57115b;
    public final boolean f57116c;
    public final boolean d;
    public final Bundle f57117e;

    public z(y yVar) {
        Bundle bundle;
        this.f57114a = yVar.f57110a;
        this.f57115b = yVar.f57111b;
        this.f57116c = yVar.f57112c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f57113e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f57117e = bundle;
    }
}
