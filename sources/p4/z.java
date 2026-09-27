package p4;

import android.os.Bundle;
public final class z {
    public final int f40953a;
    public final boolean f40954b;
    public final boolean f40955c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40953a = yVar.f40950a;
        this.f40954b = yVar.f40951b;
        this.f40955c = yVar.f40952c;
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
