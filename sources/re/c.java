package re;

import java.util.HashMap;
public final class c {
    public b f43906b;
    public final HashMap f43907c = new HashMap();
    public final boolean f43905a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f43907c) {
            try {
                b bVar = (b) this.f43907c.get(l4);
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
