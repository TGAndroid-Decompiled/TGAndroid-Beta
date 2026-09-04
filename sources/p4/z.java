package p4;

import android.os.Bundle;
public final class z {
    public final int f43951a;
    public final boolean f43952b;
    public final boolean f43953c;
    public final boolean d;
    public final Bundle f43954e;

    public z(y yVar) {
        Bundle bundle;
        this.f43951a = yVar.f43947a;
        this.f43952b = yVar.f43948b;
        this.f43953c = yVar.f43949c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f43950e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f43954e = bundle;
    }
}
