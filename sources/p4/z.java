package p4;

import android.os.Bundle;
public final class z {
    public final int f46791a;
    public final boolean f46792b;
    public final boolean f46793c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f46791a = yVar.f46788a;
        this.f46792b = yVar.f46789b;
        this.f46793c = yVar.f46790c;
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
