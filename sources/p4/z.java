package p4;

import android.os.Bundle;
public final class z {
    public final int f40941a;
    public final boolean f40942b;
    public final boolean f40943c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40941a = yVar.f40938a;
        this.f40942b = yVar.f40939b;
        this.f40943c = yVar.f40940c;
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
