package zd;
public abstract class d0 {
    public static final g0 f59961a;

    static {
        String str;
        boolean z9;
        ?? r02;
        int i7 = ee.t.f10796a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z10 = false;
        if (str != null) {
            z9 = Boolean.parseBoolean(str);
        } else {
            z9 = false;
        }
        if (!z9) {
            r02 = c0.f59957s;
        } else {
            ge.e eVar = j0.f59984a;
            r02 = ee.n.f10792a;
            ae.e eVar2 = r02.f1052e;
            if (r02 != 0) {
                z10 = true;
            }
            if (!z10) {
                r02 = c0.f59957s;
            }
        }
        f59961a = r02;
    }
}
