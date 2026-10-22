package p4;

import android.os.Bundle;
public final class z {
    public final int f44236a;
    public final boolean f44237b;
    public final boolean f44238c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44236a = yVar.f44233a;
        this.f44237b = yVar.f44234b;
        this.f44238c = yVar.f44235c;
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
