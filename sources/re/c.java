package re;

import java.util.HashMap;
public final class c {
    public b f44147b;
    public final HashMap f44148c = new HashMap();
    public final boolean f44146a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.f44148c) {
            try {
                b bVar = (b) this.f44148c.get(l4);
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
