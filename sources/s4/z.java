package s4;

import android.os.Bundle;
public final class z {
    public final int f54835a;
    public final boolean f54836b;
    public final boolean f54837c;
    public final boolean d;
    public final Bundle f54838e;

    public z(y yVar) {
        Bundle bundle;
        this.f54835a = yVar.f54831a;
        this.f54836b = yVar.f54832b;
        this.f54837c = yVar.f54833c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54834e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54838e = bundle;
    }
}
