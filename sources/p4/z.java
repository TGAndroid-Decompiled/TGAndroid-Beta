package p4;

import android.os.Bundle;
public final class z {
    public final int f44651a;
    public final boolean f44652b;
    public final boolean f44653c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44651a = yVar.f44648a;
        this.f44652b = yVar.f44649b;
        this.f44653c = yVar.f44650c;
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
