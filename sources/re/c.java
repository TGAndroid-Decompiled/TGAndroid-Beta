package re;

import java.util.HashMap;
public final class c {
    public b f45234b;
    public final HashMap f45235c = new HashMap();
    public final boolean f45233a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45235c) {
            try {
                b bVar = (b) this.f45235c.get(l4);
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
