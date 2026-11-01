package td;
public abstract class g0 {
    public static final j0 f48640a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = yd.v.f54442a;
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
            r02 = f0.f48635s;
        } else {
            ae.e eVar = m0.f48652a;
            r02 = yd.o.f54438a;
            ud.d dVar = r02.e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = f0.f48635s;
            }
        }
        f48640a = r02;
    }
}
