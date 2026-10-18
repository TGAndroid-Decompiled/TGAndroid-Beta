package p4;

import android.os.Bundle;
public final class z {
    public final int f44273a;
    public final boolean f44274b;
    public final boolean f44275c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44273a = yVar.f44270a;
        this.f44274b = yVar.f44271b;
        this.f44275c = yVar.f44272c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
