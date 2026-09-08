package zd;
public abstract class g0 {
    public static final j0 f51586a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = ee.v.f9122a;
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
            r02 = f0.f51581s;
        } else {
            ge.e eVar = m0.f51601a;
            r02 = ee.o.f9118a;
            ae.e eVar2 = r02.f431e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = f0.f51581s;
            }
        }
        f51586a = r02;
    }
}
