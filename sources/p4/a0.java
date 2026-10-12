package p4;

import android.os.Bundle;
public final class a0 {
    public final int f42997a;
    public final boolean f42998b;
    public final boolean f42999c;
    public final boolean d;
    public final Bundle e;

    public a0(z zVar) {
        Bundle bundle;
        this.f42997a = zVar.f43142a;
        this.f42998b = zVar.f43143b;
        this.f42999c = zVar.f43144c;
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
