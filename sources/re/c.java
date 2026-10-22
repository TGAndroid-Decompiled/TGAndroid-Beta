package re;

import java.util.HashMap;
public final class c {
    public b f45247b;
    public final HashMap f45248c = new HashMap();
    public final boolean f45246a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45248c) {
            try {
                b bVar = (b) this.f45248c.get(l4);
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
