package re;

import java.util.HashMap;
public final class c {
    public b f45236b;
    public final HashMap f45237c = new HashMap();
    public final boolean f45235a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45237c) {
            try {
                b bVar = (b) this.f45237c.get(l4);
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
