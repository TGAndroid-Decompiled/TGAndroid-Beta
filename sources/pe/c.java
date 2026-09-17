package pe;

import java.util.HashMap;
public final class c {
    public b f44065b;
    public final HashMap f44066c = new HashMap();
    public final boolean f44064a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f44066c) {
            try {
                b bVar = (b) this.f44066c.get(l4);
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
