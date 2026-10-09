package qe;

import java.util.HashMap;
public final class c {
    public b f46131b;
    public final HashMap f46132c = new HashMap();
    public final boolean f46130a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f46132c) {
            try {
                b bVar = (b) this.f46132c.get(l4);
                if (bVar != null && !bVar.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }
}
