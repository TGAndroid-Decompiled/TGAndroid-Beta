package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53304f;
    public static final String f53305g;
    public static final String h;
    public static final String f53306i;
    public static final String f53307j;
    public static final String f53308k;
    public final int f53309a;
    public final int f53310b;
    public final String f53311c;
    public final int d;
    public final Bundle f53312e;

    static {
        String str = h2.m0.f14114a;
        f53304f = Integer.toString(0, 36);
        f53305g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53306i = Integer.toString(3, 36);
        f53307j = Integer.toString(4, 36);
        f53308k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53309a = i7;
        this.f53310b = i10;
        this.f53311c = str;
        this.d = i11;
        this.f53312e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53304f, 0);
        int i10 = bundle.getInt(f53307j, 0);
        String string = bundle.getString(f53305g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53306i);
        int i12 = bundle.getInt(f53308k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
