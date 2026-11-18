package s4;

import android.os.Bundle;
public final class z {
    public final int f57069a;
    public final boolean f57070b;
    public final boolean f57071c;
    public final boolean d;
    public final Bundle f57072e;

    public z(y yVar) {
        Bundle bundle;
        this.f57069a = yVar.f57065a;
        this.f57070b = yVar.f57066b;
        this.f57071c = yVar.f57067c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f57068e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f57072e = bundle;
    }
}
