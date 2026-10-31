package p4;

import android.os.Bundle;
public final class a0 {
    public final int f44699a;
    public final boolean f44700b;
    public final boolean f44701c;
    public final boolean d;
    public final Bundle e;

    public a0(z zVar) {
        Bundle bundle;
        this.f44699a = zVar.f44845a;
        this.f44700b = zVar.f44846b;
        this.f44701c = zVar.f44847c;
        this.d = zVar.d;
        Bundle bundle2 = zVar.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
