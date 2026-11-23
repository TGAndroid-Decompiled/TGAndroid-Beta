package p4;

import a8.ma;
import android.os.Bundle;
public final class i {
    public static final String f55285f;
    public static final String f55286g;
    public static final String h;
    public static final String f55287i;
    public static final String f55288j;
    public static final String f55289k;
    public final int f55290a;
    public final int f55291b;
    public final String f55292c;
    public final int d;
    public final Bundle f55293e;

    static {
        String str = h2.l0.f13778a;
        f55285f = Integer.toString(0, 36);
        f55286g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f55287i = Integer.toString(3, 36);
        f55288j = Integer.toString(4, 36);
        f55289k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f55290a = i7;
        this.f55291b = i10;
        this.f55292c = str;
        this.d = i11;
        this.f55293e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f55285f, 0);
        int i10 = bundle.getInt(f55288j, 0);
        String string = bundle.getString(f55286g);
        string.getClass();
        String str = h;
        ma.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f55287i);
        int i12 = bundle.getInt(f55289k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
