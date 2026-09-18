package pe;

import java.util.HashMap;
public final class c {
    public b f41019b;
    public final HashMap f41020c = new HashMap();
    public final boolean f41018a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f41020c) {
            try {
                b bVar = (b) this.f41020c.get(l4);
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
