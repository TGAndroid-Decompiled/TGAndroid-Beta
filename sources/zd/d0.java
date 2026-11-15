package zd;
public abstract class d0 {
    public static final g0 f61269a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i7 = ee.t.f10632a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z11 = false;
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            r02 = c0.f61265s;
        } else {
            ge.e eVar = j0.f61292a;
            r02 = ee.n.f10628a;
            ae.e eVar2 = r02.f1050e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = c0.f61265s;
            }
        }
        f61269a = r02;
    }
}
