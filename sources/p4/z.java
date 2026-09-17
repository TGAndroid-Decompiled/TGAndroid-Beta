package p4;

import android.os.Bundle;
public final class z {
    public final int f40710a;
    public final boolean f40711b;
    public final boolean f40712c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40710a = yVar.f40707a;
        this.f40711b = yVar.f40708b;
        this.f40712c = yVar.f40709c;
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
