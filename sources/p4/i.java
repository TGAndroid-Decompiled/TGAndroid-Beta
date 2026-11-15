package p4;

import a8.ja;
import android.os.Bundle;
public final class i {
    public static final String f54710f;
    public static final String f54711g;
    public static final String h;
    public static final String f54712i;
    public static final String f54713j;
    public static final String f54714k;
    public final int f54715a;
    public final int f54716b;
    public final String f54717c;
    public final int d;
    public final Bundle f54718e;

    static {
        String str = h2.l0.f13471a;
        f54710f = Integer.toString(0, 36);
        f54711g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f54712i = Integer.toString(3, 36);
        f54713j = Integer.toString(4, 36);
        f54714k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f54715a = i7;
        this.f54716b = i10;
        this.f54717c = str;
        this.d = i11;
        this.f54718e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f54710f, 0);
        int i10 = bundle.getInt(f54713j, 0);
        String string = bundle.getString(f54711g);
        string.getClass();
        String str = h;
        ja.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f54712i);
        int i12 = bundle.getInt(f54714k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
