package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53199f;
    public static final String f53200g;
    public static final String h;
    public static final String f53201i;
    public static final String f53202j;
    public static final String f53203k;
    public final int f53204a;
    public final int f53205b;
    public final String f53206c;
    public final int d;
    public final Bundle f53207e;

    static {
        String str = h2.m0.f14112a;
        f53199f = Integer.toString(0, 36);
        f53200g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53201i = Integer.toString(3, 36);
        f53202j = Integer.toString(4, 36);
        f53203k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53204a = i7;
        this.f53205b = i10;
        this.f53206c = str;
        this.d = i11;
        this.f53207e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53199f, 0);
        int i10 = bundle.getInt(f53202j, 0);
        String string = bundle.getString(f53200g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53201i);
        int i12 = bundle.getInt(f53203k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
