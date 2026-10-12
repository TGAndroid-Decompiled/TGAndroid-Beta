package p4;

import android.os.Bundle;
public final class a0 {
    public final int f45202a;
    public final boolean f45203b;
    public final boolean f45204c;
    public final boolean d;
    public final Bundle f45205e;

    public a0(z zVar) {
        Bundle bundle;
        this.f45202a = zVar.f45359a;
        this.f45203b = zVar.f45360b;
        this.f45204c = zVar.f45361c;
        this.d = zVar.d;
        Bundle bundle2 = zVar.f45362e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45205e = bundle;
    }
}
