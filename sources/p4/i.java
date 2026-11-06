package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53175f;
    public static final String f53176g;
    public static final String h;
    public static final String f53177i;
    public static final String f53178j;
    public static final String f53179k;
    public final int f53180a;
    public final int f53181b;
    public final String f53182c;
    public final int d;
    public final Bundle f53183e;

    static {
        String str = h2.m0.f14112a;
        f53175f = Integer.toString(0, 36);
        f53176g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53177i = Integer.toString(3, 36);
        f53178j = Integer.toString(4, 36);
        f53179k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53180a = i7;
        this.f53181b = i10;
        this.f53182c = str;
        this.d = i11;
        this.f53183e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53175f, 0);
        int i10 = bundle.getInt(f53178j, 0);
        String string = bundle.getString(f53176g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53177i);
        int i12 = bundle.getInt(f53179k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
