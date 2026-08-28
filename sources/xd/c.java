package xd;

import java.util.HashMap;
public final class c {
    public b f49115b;
    public final HashMap f49116c = new HashMap();
    public final boolean f49114a = true;

    public final boolean a(Long l10) {
        boolean z10;
        synchronized (this.f49116c) {
            try {
                b bVar = (b) this.f49116c.get(l10);
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
