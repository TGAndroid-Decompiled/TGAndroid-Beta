package pe;

import java.util.HashMap;
public final class c {
    public b f44393b;
    public final HashMap f44394c = new HashMap();
    public final boolean f44392a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f44394c) {
            try {
                b bVar = (b) this.f44394c.get(l4);
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
