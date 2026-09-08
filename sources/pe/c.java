package pe;

import java.util.HashMap;
public final class c {
    public b f44064b;
    public final HashMap f44065c = new HashMap();
    public final boolean f44063a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f44065c) {
            try {
                b bVar = (b) this.f44065c.get(l4);
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
