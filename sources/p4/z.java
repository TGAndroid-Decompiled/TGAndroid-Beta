package p4;

import android.os.Bundle;
public final class z {
    public final int f39813a;
    public final boolean f39814b;
    public final boolean f39815c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f39813a = yVar.f39810a;
        this.f39814b = yVar.f39811b;
        this.f39815c = yVar.f39812c;
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
