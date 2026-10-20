package p4;

import android.os.Bundle;
public final class z {
    public final int f44233a;
    public final boolean f44234b;
    public final boolean f44235c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44233a = yVar.f44230a;
        this.f44234b = yVar.f44231b;
        this.f44235c = yVar.f44232c;
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
