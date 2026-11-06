package s4;

import android.os.Bundle;
public final class z {
    public final int f54811a;
    public final boolean f54812b;
    public final boolean f54813c;
    public final boolean d;
    public final Bundle f54814e;

    public z(y yVar) {
        Bundle bundle;
        this.f54811a = yVar.f54807a;
        this.f54812b = yVar.f54808b;
        this.f54813c = yVar.f54809c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f54810e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f54814e = bundle;
    }
}
