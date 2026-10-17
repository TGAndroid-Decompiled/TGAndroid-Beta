package re;

import java.util.HashMap;
public final class c {
    public b f45262b;
    public final HashMap f45263c = new HashMap();
    public final boolean f45261a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f45263c) {
            try {
                b bVar = (b) this.f45263c.get(l4);
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
