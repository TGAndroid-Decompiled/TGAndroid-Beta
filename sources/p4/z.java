package p4;

import android.os.Bundle;
public final class z {
    public final int f45541a;
    public final boolean f45542b;
    public final boolean f45543c;
    public final boolean d;
    public final Bundle f45544e;

    public z(y yVar) {
        Bundle bundle;
        this.f45541a = yVar.f45537a;
        this.f45542b = yVar.f45538b;
        this.f45543c = yVar.f45539c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f45540e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45544e = bundle;
    }
}
