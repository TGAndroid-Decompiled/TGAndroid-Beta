package p4;

import android.os.Bundle;
public final class z {
    public final int f44300a;
    public final boolean f44301b;
    public final boolean f44302c;
    public final boolean d;
    public final Bundle f44303e;

    public z(y yVar) {
        Bundle bundle;
        this.f44300a = yVar.f44296a;
        this.f44301b = yVar.f44297b;
        this.f44302c = yVar.f44298c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f44299e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f44303e = bundle;
    }
}
