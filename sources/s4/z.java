package s4;

import android.os.Bundle;
public final class z {
    public final int f57079a;
    public final boolean f57080b;
    public final boolean f57081c;
    public final boolean d;
    public final Bundle f57082e;

    public z(y yVar) {
        Bundle bundle;
        this.f57079a = yVar.f57075a;
        this.f57080b = yVar.f57076b;
        this.f57081c = yVar.f57077c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f57078e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f57082e = bundle;
    }
}
