package p4;

import android.os.Bundle;
public final class z {
    public final int f40715a;
    public final boolean f40716b;
    public final boolean f40717c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40715a = yVar.f40712a;
        this.f40716b = yVar.f40713b;
        this.f40717c = yVar.f40714c;
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
