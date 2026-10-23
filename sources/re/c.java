package re;

import java.util.HashMap;
public final class c {
    public b f45660b;
    public final HashMap f45661c = new HashMap();
    public final boolean f45659a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45661c) {
            try {
                b bVar = (b) this.f45661c.get(l4);
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
