package p4;

import android.os.Bundle;
public final class z {
    public final int f44652a;
    public final boolean f44653b;
    public final boolean f44654c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f44652a = yVar.f44649a;
        this.f44653b = yVar.f44650b;
        this.f44654c = yVar.f44651c;
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
