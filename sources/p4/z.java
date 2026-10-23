package p4;

import android.os.Bundle;
public final class z {
    public final int f44237a;
    public final boolean f44238b;
    public final boolean f44239c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44237a = yVar.f44234a;
        this.f44238b = yVar.f44235b;
        this.f44239c = yVar.f44236c;
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
