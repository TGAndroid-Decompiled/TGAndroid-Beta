package se;

import java.util.HashMap;
public final class c {
    public b f48139b;
    public final HashMap f48140c = new HashMap();
    public final boolean f48138a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f48140c) {
            try {
                b bVar = (b) this.f48140c.get(l4);
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
