package p4;

import android.os.Bundle;
public final class z {
    public final int f44225a;
    public final boolean f44226b;
    public final boolean f44227c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44225a = yVar.f44222a;
        this.f44226b = yVar.f44223b;
        this.f44227c = yVar.f44224c;
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
