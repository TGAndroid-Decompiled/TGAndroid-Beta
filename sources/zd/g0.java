package zd;
public abstract class g0 {
    public static final j0 f53228a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = ee.v.f8894a;
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
            r02 = f0.f53223s;
        } else {
            ge.e eVar = m0.f53243a;
            r02 = ee.o.f8890a;
            ae.e eVar2 = r02.f434e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = f0.f53223s;
            }
        }
        f53228a = r02;
    }
}
