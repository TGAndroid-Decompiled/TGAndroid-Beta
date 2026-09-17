package pe;

import java.util.HashMap;
public final class c {
    public b f40786b;
    public final HashMap f40787c = new HashMap();
    public final boolean f40785a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f40787c) {
            try {
                b bVar = (b) this.f40787c.get(l4);
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
