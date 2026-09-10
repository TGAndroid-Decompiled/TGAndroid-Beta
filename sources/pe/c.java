package pe;

import java.util.HashMap;
public final class c {
    public b f39890b;
    public final HashMap f39891c = new HashMap();
    public final boolean f39889a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f39891c) {
            try {
                b bVar = (b) this.f39891c.get(l4);
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
