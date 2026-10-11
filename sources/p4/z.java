package p4;

import android.os.Bundle;
public final class z {
    public final int f45507a;
    public final boolean f45508b;
    public final boolean f45509c;
    public final boolean d;
    public final Bundle f45510e;

    public z(y yVar) {
        Bundle bundle;
        this.f45507a = yVar.f45503a;
        this.f45508b = yVar.f45504b;
        this.f45509c = yVar.f45505c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f45506e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45510e = bundle;
    }
}
