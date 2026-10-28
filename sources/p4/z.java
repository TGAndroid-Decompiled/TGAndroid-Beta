package p4;

import android.os.Bundle;
public final class z {
    public final int f46829a;
    public final boolean f46830b;
    public final boolean f46831c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f46829a = yVar.f46826a;
        this.f46830b = yVar.f46827b;
        this.f46831c = yVar.f46828c;
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
