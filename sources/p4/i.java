package p4;

import a8.la;
import android.os.Bundle;
public final class i {
    public static final String f55320f;
    public static final String f55321g;
    public static final String h;
    public static final String f55322i;
    public static final String f55323j;
    public static final String f55324k;
    public final int f55325a;
    public final int f55326b;
    public final String f55327c;
    public final int d;
    public final Bundle f55328e;

    static {
        String str = h2.l0.f13815a;
        f55320f = Integer.toString(0, 36);
        f55321g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f55322i = Integer.toString(3, 36);
        f55323j = Integer.toString(4, 36);
        f55324k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f55325a = i7;
        this.f55326b = i10;
        this.f55327c = str;
        this.d = i11;
        this.f55328e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f55320f, 0);
        int i10 = bundle.getInt(f55323j, 0);
        String string = bundle.getString(f55321g);
        string.getClass();
        String str = h;
        la.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f55322i);
        int i12 = bundle.getInt(f55324k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
