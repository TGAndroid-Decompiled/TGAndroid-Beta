package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53201f;
    public static final String f53202g;
    public static final String h;
    public static final String f53203i;
    public static final String f53204j;
    public static final String f53205k;
    public final int f53206a;
    public final int f53207b;
    public final String f53208c;
    public final int d;
    public final Bundle f53209e;

    static {
        String str = h2.m0.f14112a;
        f53201f = Integer.toString(0, 36);
        f53202g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53203i = Integer.toString(3, 36);
        f53204j = Integer.toString(4, 36);
        f53205k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53206a = i7;
        this.f53207b = i10;
        this.f53208c = str;
        this.d = i11;
        this.f53209e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53201f, 0);
        int i10 = bundle.getInt(f53204j, 0);
        String string = bundle.getString(f53202g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53203i);
        int i12 = bundle.getInt(f53205k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
