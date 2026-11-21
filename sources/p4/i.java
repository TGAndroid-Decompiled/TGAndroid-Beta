package p4;

import a8.la;
import android.os.Bundle;
public final class i {
    public static final String f55316f;
    public static final String f55317g;
    public static final String h;
    public static final String f55318i;
    public static final String f55319j;
    public static final String f55320k;
    public final int f55321a;
    public final int f55322b;
    public final String f55323c;
    public final int d;
    public final Bundle f55324e;

    static {
        String str = h2.l0.f13812a;
        f55316f = Integer.toString(0, 36);
        f55317g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f55318i = Integer.toString(3, 36);
        f55319j = Integer.toString(4, 36);
        f55320k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f55321a = i7;
        this.f55322b = i10;
        this.f55323c = str;
        this.d = i11;
        this.f55324e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f55316f, 0);
        int i10 = bundle.getInt(f55319j, 0);
        String string = bundle.getString(f55317g);
        string.getClass();
        String str = h;
        la.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f55318i);
        int i12 = bundle.getInt(f55320k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
