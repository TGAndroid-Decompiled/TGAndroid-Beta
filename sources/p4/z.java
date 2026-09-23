package p4;

import android.os.Bundle;
public final class z {
    public final int f40639a;
    public final boolean f40640b;
    public final boolean f40641c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40639a = yVar.f40636a;
        this.f40640b = yVar.f40637b;
        this.f40641c = yVar.f40638c;
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
