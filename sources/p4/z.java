package p4;

import android.os.Bundle;
public final class z {
    public final int f43952a;
    public final boolean f43953b;
    public final boolean f43954c;
    public final boolean d;
    public final Bundle f43955e;

    public z(y yVar) {
        Bundle bundle;
        this.f43952a = yVar.f43948a;
        this.f43953b = yVar.f43949b;
        this.f43954c = yVar.f43950c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f43951e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f43955e = bundle;
    }
}
