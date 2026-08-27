package yd;

import java.util.HashMap;

public final class c {

    public b f49831b;

    public final HashMap f49832c = new HashMap();

    public final boolean f49830a = true;

    public final boolean a(Long l10) {
        boolean z10;
        synchronized (this.f49832c) {
            try {
                b bVar = (b) this.f49832c.get(l10);
                z10 = (bVar == null || bVar.isEmpty()) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
