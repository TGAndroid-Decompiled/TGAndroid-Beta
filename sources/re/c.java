package re;

import java.util.HashMap;
public final class c {
    public b f45244b;
    public final HashMap f45245c = new HashMap();
    public final boolean f45243a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45245c) {
            try {
                b bVar = (b) this.f45245c.get(l4);
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
