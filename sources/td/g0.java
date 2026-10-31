package td;
public abstract class g0 {
    public static final j0 f48629a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = yd.v.f54421a;
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
            r02 = f0.f48624s;
        } else {
            ae.e eVar = m0.f48641a;
            r02 = yd.o.f54417a;
            ud.d dVar = r02.e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = f0.f48624s;
            }
        }
        f48629a = r02;
    }
}
