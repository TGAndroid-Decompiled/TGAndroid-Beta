package p4;

import android.os.Bundle;
public final class z {
    public final int f40688a;
    public final boolean f40689b;
    public final boolean f40690c;
    public final boolean d;
    public final Bundle e;

    public z(y yVar) {
        Bundle bundle;
        this.f40688a = yVar.f40685a;
        this.f40689b = yVar.f40686b;
        this.f40690c = yVar.f40687c;
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
