package p4;

import android.os.Bundle;
public final class z {
    public final int f45471a;
    public final boolean f45472b;
    public final boolean f45473c;
    public final boolean d;
    public final Bundle f45474e;

    public z(y yVar) {
        Bundle bundle;
        this.f45471a = yVar.f45467a;
        this.f45472b = yVar.f45468b;
        this.f45473c = yVar.f45469c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f45470e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45474e = bundle;
    }
}
