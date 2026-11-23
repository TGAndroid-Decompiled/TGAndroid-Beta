package s4;

import android.os.Bundle;
public final class z {
    public final int f57193a;
    public final boolean f57194b;
    public final boolean f57195c;
    public final boolean d;
    public final Bundle f57196e;

    public z(y yVar) {
        Bundle bundle;
        this.f57193a = yVar.f57189a;
        this.f57194b = yVar.f57190b;
        this.f57195c = yVar.f57191c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f57192e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f57196e = bundle;
    }
}
