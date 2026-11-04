package wd;
public abstract class d0 {
    public static final g0 f57480a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i3 = be.u.f3286a;
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
            r02 = c0.f57476s;
        } else {
            de.e eVar = j0.f57503a;
            r02 = be.n.f3280a;
            xd.c cVar = r02.f58619e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = c0.f57476s;
            }
        }
        f57480a = r02;
    }
}
