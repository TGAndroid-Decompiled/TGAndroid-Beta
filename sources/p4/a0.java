package p4;

import android.os.Bundle;
public final class a0 {
    public final int f44710a;
    public final boolean f44711b;
    public final boolean f44712c;
    public final boolean d;
    public final Bundle e;

    public a0(z zVar) {
        Bundle bundle;
        this.f44710a = zVar.f44856a;
        this.f44711b = zVar.f44857b;
        this.f44712c = zVar.f44858c;
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
