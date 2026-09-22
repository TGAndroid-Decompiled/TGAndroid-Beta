package p4;

import android.os.Bundle;
public final class z {
    public final int f40684a;
    public final boolean f40685b;
    public final boolean f40686c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40684a = yVar.f40681a;
        this.f40685b = yVar.f40682b;
        this.f40686c = yVar.f40683c;
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
