package p4;

import android.os.Bundle;
public final class z {
    public final int f44307a;
    public final boolean f44308b;
    public final boolean f44309c;
    public final boolean d;
    public final Bundle f44310e;

    public z(y yVar) {
        Bundle bundle;
        this.f44307a = yVar.f44303a;
        this.f44308b = yVar.f44304b;
        this.f44309c = yVar.f44305c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f44306e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f44310e = bundle;
    }
}
