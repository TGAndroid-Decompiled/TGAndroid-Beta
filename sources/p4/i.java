package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53305f;
    public static final String f53306g;
    public static final String h;
    public static final String f53307i;
    public static final String f53308j;
    public static final String f53309k;
    public final int f53310a;
    public final int f53311b;
    public final String f53312c;
    public final int d;
    public final Bundle f53313e;

    static {
        String str = h2.m0.f14112a;
        f53305f = Integer.toString(0, 36);
        f53306g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53307i = Integer.toString(3, 36);
        f53308j = Integer.toString(4, 36);
        f53309k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53310a = i7;
        this.f53311b = i10;
        this.f53312c = str;
        this.d = i11;
        this.f53313e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53305f, 0);
        int i10 = bundle.getInt(f53308j, 0);
        String string = bundle.getString(f53306g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53307i);
        int i12 = bundle.getInt(f53309k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
