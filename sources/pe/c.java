package pe;

import java.util.HashMap;
public final class c {
    public b f40760b;
    public final HashMap f40761c = new HashMap();
    public final boolean f40759a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f40761c) {
            try {
                b bVar = (b) this.f40761c.get(l4);
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
