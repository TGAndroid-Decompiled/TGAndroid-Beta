package p4;

import android.os.Bundle;
public final class z {
    public final int f44228a;
    public final boolean f44229b;
    public final boolean f44230c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44228a = yVar.f44225a;
        this.f44229b = yVar.f44226b;
        this.f44230c = yVar.f44227c;
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
