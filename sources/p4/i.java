package p4;

import a8.ia;
import android.os.Bundle;
public final class i {
    public static final String f53292f;
    public static final String f53293g;
    public static final String h;
    public static final String f53294i;
    public static final String f53295j;
    public static final String f53296k;
    public final int f53297a;
    public final int f53298b;
    public final String f53299c;
    public final int d;
    public final Bundle f53300e;

    static {
        String str = h2.m0.f14112a;
        f53292f = Integer.toString(0, 36);
        f53293g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f53294i = Integer.toString(3, 36);
        f53295j = Integer.toString(4, 36);
        f53296k = Integer.toString(5, 36);
    }

    public i(int i7, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f53297a = i7;
        this.f53298b = i10;
        this.f53299c = str;
        this.d = i11;
        this.f53300e = bundle;
    }

    public static i a(Bundle bundle) {
        int i7 = bundle.getInt(f53292f, 0);
        int i10 = bundle.getInt(f53295j, 0);
        String string = bundle.getString(f53293g);
        string.getClass();
        String str = h;
        ia.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f53294i);
        int i12 = bundle.getInt(f53296k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i7, i10, string, i11, bundle2, i12);
    }
}
