package p4;

import a8.la;
import android.os.Bundle;
public final class i {
    public static final String f55275f;
    public static final String f55276g;
    public static final String h;
    public static final String f55277i;
    public static final String f55278j;
    public static final String f55279k;
    public final int f55280a;
    public final int f55281b;
    public final String f55282c;
    public final int d;
    public final Bundle f55283e;

    static {
        String str = h2.l0.f13786a;
        f55275f = Integer.toString(0, 36);
        f55276g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f55277i = Integer.toString(3, 36);
        f55278j = Integer.toString(4, 36);
        f55279k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f55280a = i7;
        this.f55281b = i10;
        this.f55282c = str;
        this.d = i11;
        this.f55283e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f55275f, 0);
        int i10 = bundle.getInt(f55278j, 0);
        String string = bundle.getString(f55276g);
        string.getClass();
        String str = h;
        la.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f55277i);
        int i12 = bundle.getInt(f55279k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
