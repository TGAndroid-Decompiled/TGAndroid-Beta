package p4;

import a8.ma;
import android.os.Bundle;
public final class i {
    public static final String f55403f;
    public static final String f55404g;
    public static final String h;
    public static final String f55405i;
    public static final String f55406j;
    public static final String f55407k;
    public final int f55408a;
    public final int f55409b;
    public final String f55410c;
    public final int d;
    public final Bundle f55411e;

    static {
        String str = h2.l0.f13778a;
        f55403f = Integer.toString(0, 36);
        f55404g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f55405i = Integer.toString(3, 36);
        f55406j = Integer.toString(4, 36);
        f55407k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f55408a = i7;
        this.f55409b = i10;
        this.f55410c = str;
        this.d = i11;
        this.f55411e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f55403f, 0);
        int i10 = bundle.getInt(f55406j, 0);
        String string = bundle.getString(f55404g);
        string.getClass();
        String str = h;
        ma.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f55405i);
        int i12 = bundle.getInt(f55407k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
