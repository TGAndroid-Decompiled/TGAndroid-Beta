package p4;

import android.os.Bundle;
public final class z {
    public final int f46794a;
    public final boolean f46795b;
    public final boolean f46796c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f46794a = yVar.f46791a;
        this.f46795b = yVar.f46792b;
        this.f46796c = yVar.f46793c;
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
