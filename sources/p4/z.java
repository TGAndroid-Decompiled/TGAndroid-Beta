package p4;

import android.os.Bundle;
public final class z {
    public final int f45473a;
    public final boolean f45474b;
    public final boolean f45475c;
    public final boolean d;
    public final Bundle f45476e;

    public z(y yVar) {
        Bundle bundle;
        this.f45473a = yVar.f45469a;
        this.f45474b = yVar.f45470b;
        this.f45475c = yVar.f45471c;
        this.d = yVar.d;
        Bundle bundle2 = yVar.f45472e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f45476e = bundle;
    }
}
