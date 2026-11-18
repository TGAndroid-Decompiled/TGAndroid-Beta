package zd;
public abstract class d0 {
    public static final g0 f61833a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i7 = ee.u.f10952a;
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
            r02 = c0.f61829s;
        } else {
            ge.e eVar = j0.f61856a;
            r02 = ee.n.f10946a;
            ae.e eVar2 = r02.f1049e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = c0.f61829s;
            }
        }
        f61833a = r02;
    }
}
